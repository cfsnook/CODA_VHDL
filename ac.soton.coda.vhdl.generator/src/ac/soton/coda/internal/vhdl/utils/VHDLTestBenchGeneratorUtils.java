/*******************************************************************************
 * (c) Crown owned copyright 2015, 2017 (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials  are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This is to identify the UK Ministry of Defence as owners along with the
 * license rights provided.
 *
 * Contributors:
 *     University of Southampton - Initial API and implementation
 *******************************************************************************/

package ac.soton.coda.internal.vhdl.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eventb.emf.core.machine.Machine;
import org.rodinp.core.RodinDBException;

import ac.soton.coda.internal.vxmi2vhdl.IVHDLLibrary;
import ac.soton.coda.internal.vxmi2vhdl.VHDLLibrary;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.oracle.Entry;
import ac.soton.eventb.emf.oracle.Run;
import ac.soton.eventb.emf.oracle.Snapshot;
import ac.soton.eventb.emf.oracle.Step;
import ac.soton.eventb.emf.oracle.util.OracleUtils;

/**
 * <p>
 *
 * </p>
 *
 * @author htson
 * @version
 * @see
 * @since
 */
public class VHDLTestBenchGeneratorUtils {

	/**
	 * @throws IOException
	 * @throws CoreException
	 * @throws RodinDBException
	 * 
	 */
	public static void perform(IProgressMonitor monitor, Machine mch,
			Component component, Resource oracleFile) throws IOException,
			RodinDBException, CoreException {
		// Split the progress monitor to 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		// 1. Load the run from the oracle file (10%)
		Run run;
		run = OracleUtils.loadRun(oracleFile);
		subMonitor.worked(10);

		// 2. Get the input/output connectors (5%)
		Connector[] connectors = ComponentsUtils.getConnectors(mch);
		Connector[] inputConnectors = ComponentsUtils.getInputConnector(
				component, connectors);
		Connector[] outputConnectors = ComponentsUtils.getOutputConnector(
				component, connectors);
		subMonitor.worked(5);

		// Use the remaining 85% on generating the VHDL test bench.
		URI uri = oracleFile.getURI();
		int segCnt = uri.segmentCount();
		String fileName = uri.segment(segCnt - 1);
		generate(mch, component, run, inputConnectors, outputConnectors,
				fileName, subMonitor.newChild(90));

	}

	/**
	 * @param mch
	 * @param uutName
	 * @param run
	 * @param outputConnectors
	 * @param inputConnectors
	 * @param fileName
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * 
	 * @throws CoreException
	 */
	public static void generate(Machine mch, Component component, Run run,
			Connector[] inputConnectors, Connector[] outputConnectors,
			String fileName, IProgressMonitor monitor) throws RodinDBException,
			CoreException {

		String uutName = component.getName();
		String tbName = uutName + "_tb";

		StringBuffer sb = new StringBuffer();

		// Split the progress monitor into 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				"Generate VHDL Test bench", 100);

		// 1. Generate VHDL header (10%)
		subMonitor.subTask("Creating VHDL header");
		IVHDLLibrary ieeeLib = new VHDLLibrary("ieee",
				"ieee.std_logic_1164.ALL", "ieee.std_logic_unsigned.all");
		VHDLResourceUtils.generateVHDLHeader(sb, subMonitor.newChild(10), ieeeLib);
		sb = sb.append("\n");

		// 2. Generate test bench declaration (10%)
		subMonitor.subTask("Creating testbench declaration");
		generateTestBenchDeclaration(sb, tbName);
		sb = sb.append("\n");
		subMonitor.worked(10);

		// 3. Generate the architecture behaviour of the test bench (60%)
		generateTestBenchArchitecture(sb, mch, tbName, uutName,
				inputConnectors, outputConnectors, run, subMonitor.newChild(50));

		// 4. Get the VHDL folder (10%)
		IFolder folder = VHDLResourceUtils.getVHDLFolder(mch, subMonitor.newChild(10));

		// 5. Create the VHDL output file (10%)
		IFile file = folder.getFile(fileName + "." + component.getName()
				+ ".vhdl");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		if (!file.exists()) {
			file.create(source, true, subMonitor.newChild(20));
		} else {
			file.setContents(source, true, true, subMonitor.newChild(20));
		}
	}

	/**
	 * @param outputConnectors
	 * @param inputConnectors
	 * @return
	 */
	private static void generateTestBenchDeclaration(StringBuffer sb,
			String tbName) {
		sb.append("-- entity declaration for your testbench. Do not declare any ports here\n");
		sb.append("ENTITY " + tbName + " IS\n");
		sb.append("END " + tbName + ";\n");
	}

	/**
	 * @param mch
	 * @param outputConnectors
	 * @param inputConnectors
	 * @param newChild
	 * @return
	 * @throws RodinDBException
	 */
	private static void generateTestBenchArchitecture(StringBuffer sb,
			Machine mch, String tbName, String uutName,
			Connector[] inputConnectors, Connector[] outputConnectors, Run run,
			IProgressMonitor monitor) throws RodinDBException, CoreException {
		// Split the progress monitor into 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		// 1. Architecture header (5%)
		sb.append("ARCHITECTURE behavior OF " + tbName + " IS\n");
		subMonitor.worked(5);

		// 2. Generate component declaration for Unit-Under-Test (20%)
		generateComponentDeclaration(sb, uutName, inputConnectors,
				outputConnectors, subMonitor.newChild(20));

		// 3. Generate input declaration and initialisation (5%)
		generateInputDeclaration(sb, inputConnectors, subMonitor.newChild(5));

		// 4. Generate output declaration (5%)
		generateOutputDeclaration(sb, outputConnectors, subMonitor.newChild(5));

		// 5. Generate clock period definition (5%)
		sb.append("    -- Clock period definitions\n");
		sb.append("    constant clk_period : time := 1 ns;\n");
		subMonitor.worked(5);

		// 6. Generate Architecture body (60%)
		generateArchitectureBody(sb, inputConnectors, outputConnectors, run,
				subMonitor.newChild(60));

	}

	/**
	 * @param outputConnectors
	 * @param inputConnectors
	 * @param mch
	 * @param name
	 * @param newChild
	 * @return
	 * @throws RodinDBException
	 */
	private static void generateComponentDeclaration(StringBuffer sb,
			String uut, Connector[] inputConnectors,
			Connector[] outputConnectors, IProgressMonitor monitor)
			throws RodinDBException, CoreException {
		int works = 4 + inputConnectors.length + outputConnectors.length + 2;

		// Split the progress monitor into 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor, works);

		// 1. Create the declaration (4 works)
		sb.append("-- Component Declaration for the Unit Under Test (UUT)\n");
		sb.append("COMPONENT " + uut + "  --'" + uut
				+ "' is the name of the module needed to be tested.\n");
		sb.append("--just copy and paste the input and output ports of your module as such.\n");
		sb.append("PORT(\n");
		subMonitor.worked(4);

		// 2. Create the input port declaration (1 work/port).
		for (Connector inputConnector : inputConnectors) {
			String type = inputConnector.getType();
			VHDLResourceUtils.generatePortDeclaration(sb, inputConnector.getName(),
					type, "IN", subMonitor.newChild(1));
		}

		// 2. Create the output port declaration (1 work/port).
		for (Connector outputConnector : outputConnectors) {
			String type = outputConnector.getType();
			VHDLResourceUtils.generatePortDeclaration(sb, outputConnector.getName(),
					type, "OUT", subMonitor.newChild(1));
		}

		sb.append("  );\n");
		sb.append("END COMPONENT;\n");
		subMonitor.worked(2);
	}

	/**
	 * @param sb
	 * @param inputConnectors
	 * @param newChild
	 */
	private static void generateInputDeclaration(StringBuffer sb,
			Connector[] inputConnectors, IProgressMonitor monitor) {
		sb.append("--declare inputs and initialise them\n");

		for (Connector inputConnector : inputConnectors) {
			sb.append("    " + inputConnector.getName() + " : "
					+ inputConnector.getType() + " := "
					+ inputConnector.getInitialValue() + ";\n");
		}
	}

	/**
	 * @param sb
	 * @param outputConnectors
	 * @param newChild
	 */
	private static void generateOutputDeclaration(StringBuffer sb,
			Connector[] outputConnectors, IProgressMonitor monitor) {
		sb.append("--declare outputs and initialise them\n");

		for (Connector outputConnector : outputConnectors) {
			sb.append("    " + outputConnector.getName() + " : "
					+ outputConnector.getType() + " := "
					+ outputConnector.getInitialValue() + ";\n");
		}

	}

	/**
	 * @param sb
	 * @param outputConnectors
	 * @param inputConnectors
	 * @param newChild
	 */
	private static void generateArchitectureBody(StringBuffer sb,
			Connector[] inputConnectors, Connector[] outputConnectors, Run run,
			IProgressMonitor monitor) {
		sb.append("BEGIN\n");

		// Split the progress monitor into 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		// 1. Generate instantiation of UUT (30%)
		generateUUTInstantiation(sb, inputConnectors, outputConnectors,
				subMonitor.newChild(30));

		// 2. Generate clock process definition (30%)
		generateClockProcessDefinition(sb, subMonitor.newChild(30));

		// 3. Generate stimulus process
		generateStimulusProcess(sb, inputConnectors, outputConnectors, run,
				subMonitor.newChild(40));

		sb.append("END;\n");
	}

	/**
	 * @param sb
	 * @param outputConnectors
	 * @param inputConnectors
	 * @param newChild
	 */
	private static void generateUUTInstantiation(StringBuffer sb,
			Connector[] inputConnectors, Connector[] outputConnectors,
			IProgressMonitor monitor) {
		sb.append("-- Instantiate the Unit Under Test (UUT)\n");
		sb.append("   uut: test PORT MAP (\n");
		boolean first = true;
		for (Connector inputConnector : inputConnectors) {
			String name = inputConnector.getName();
			if (first) {
				first = false;
			} else {
				sb.append(",\n");
			}
			sb.append("      " + name + " => " + name);
		}

		for (Connector outputConnector : outputConnectors) {
			String name = outputConnector.getName();
			if (first) {
				sb.append("\n");
				first = false;
			} else {
				sb.append(",\n");
			}
			sb.append("      " + name + " => " + name);
		}

		sb.append("\n   );\n");
	}

	/**
	 * @param sb
	 * @param newChild
	 */
	private static void generateClockProcessDefinition(StringBuffer sb,
			SubMonitor newChild) {
		sb.append("    -- Clock process definitions( clock with 50% duty cycle is generated here.\n");
		sb.append("    clk_process :process\n");
		sb.append("	   begin\n");
		sb.append("	       clk <= '0';\n");
		sb.append("	       wait for clk_period/2;  --for 0.5 ns signal is '0'.\n");
		sb.append("	       clk <= '1';\n");
		sb.append("	       wait for clk_period/2;  --for next 0.5 ns signal is '1'.\n");
		sb.append("	   end process;\n");
	}

	/**
	 * @param sb
	 * @param outputConnectors
	 * @param inputConnectors
	 * @param newChild
	 */
	private static void generateStimulusProcess(StringBuffer sb,
			Connector[] inputConnectors, Connector[] outputConnectors, Run run,
			SubMonitor newChild) {
		sb.append("-- Stimulus process\n");
		sb.append("  stim_proc: process\n");
		sb.append("   begin\n");
		EList<Entry> entries = run.getEntries();
		for (Entry entry : entries) {
			// Only process Snapshot for input setting and output assertions
			if (entry instanceof Snapshot) {
				Snapshot snapshot = (Snapshot) entry;
				EMap<String, String> values = snapshot.getValues();

				for (Connector inputConnector : inputConnectors) {
					String name = inputConnector.getName();
					String value = values.get(name);
					if (value != null) {
						sb.append("     " + name + " <= " + value + ";\n");
					}
				}

				for (Connector outputConnector : outputConnectors) {
					String name = outputConnector.getName();
					String value = values.get(name);
					if (value != null) {
						sb.append("     assert (" + name + " = " + value
								+ ");\n");
					}
				}

			} else { // This must be a step
				Step step = (Step) entry;
				String name = step.getName();
				if ("Timer".equals(name)) {
					sb.append("     wait for 1 ns\n");
				}
			}
		}
		// wait for 7 ns;
		// reset <='1';
		// wait for 3 ns;
		// reset <='0';
		// wait for 17 ns;
		// reset <= '1';
		// wait for 1 ns;
		// reset <= '0';
		// wait;
		sb.append("   end process;\n");
	}

}
