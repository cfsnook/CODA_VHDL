/*******************************************************************************
 * Copyright (c) 2015 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.coda.internal.vhdl.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eventb.emf.core.machine.Machine;

import ac.soton.coda.internal.vxmi2vhdl.IVHDLLibrary;
import ac.soton.coda.internal.vxmi2vhdl.VHDLLibrary;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.util.ComponentsUtils;

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
public class VHDLBehaviouralModelGeneratorUtils {

	/**
	 * @param component
	 * @param monitor
	 * @throws CoreException
	 */
	public static void perform(Machine mch, Component component,
			IProgressMonitor monitor) throws CoreException {
		// Split the progress monitor to 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		// 1. Get the input/output connectors (5%)
		Connector[] connectors = ComponentsUtils.getConnectors(mch);
		Connector[] inputConnectors = ComponentsUtils.getInputConnector(
				component, connectors);
		Connector[] outputConnectors = ComponentsUtils.getOutputConnector(
				component, connectors);
		subMonitor.worked(5);

		// 2. Use the remaining 95% on generating the VHDL test bench.
		String fileName = mch.getName();
		generate(mch, component, inputConnectors, outputConnectors, fileName,
				subMonitor.newChild(90));
	}

	/**
	 * @param mch
	 * @param component
	 * @param inputConnectors
	 * @param outputConnectors
	 * @param fileName
	 * @param newChild
	 * @throws CoreException
	 */
	private static void generate(Machine mch, Component component,
			Connector[] inputConnectors, Connector[] outputConnectors,
			String fileName, IProgressMonitor monitor) throws CoreException {
		StringBuffer sb = new StringBuffer();
		String entityName = component.getName();

		// Split the progress monitor into 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				"Generate VHDL Behavioural Model", 100);

		// 1. Generate VHDL header (10%)
		subMonitor.subTask("Creating VHDL header");
		IVHDLLibrary ieeeLib = new VHDLLibrary("ieee",
				"ieee.std_logic_1164.ALL", "ieee.std_logic_unsigned.all");
		VHDLResourceUtils.generateVHDLHeader(sb, subMonitor.newChild(10), ieeeLib);
		sb = sb.append("\n");

		// 2. Generate entity declaration (10%)
		subMonitor.subTask("Generating entity declaration");
		generateEntityDeclaration(sb, entityName, inputConnectors,
				outputConnectors, subMonitor.newChild(10));
		sb = sb.append("\n");

		// 3. Generate entity architecture (60%)
		subMonitor.subTask("Generating entity architecture");
		generateEntityArchitecture(sb, entityName, subMonitor.newChild(60));
		sb = sb.append("\n");
		
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
	 * @param sb
	 * @param entityName
	 * @param outputConnectors
	 * @param inputConnectors
	 * @param newChild
	 */
	private static void generateEntityDeclaration(StringBuffer sb,
			String entityName, Connector[] inputConnectors,
			Connector[] outputConnectors, IProgressMonitor monitor) {
		int works = 2 + inputConnectors.length + outputConnectors.length + 2;

		// Split the progress monitor into 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				"Generate VHDL Test bench", works);

		// 1. Begin declaration (2 works)
		sb.append("ENTITY " + entityName + " IS\n");
		sb.append("PORT(\n");
		subMonitor.worked(2);

		// 2. Generate input declaration (1 work/input)
		for (Connector inputConnector : inputConnectors) {
			String name = inputConnector.getName();
			String type = inputConnector.getType();
			VHDLResourceUtils.generatePortDeclaration(sb, name,
					type, "IN", subMonitor.newChild(1));
		}

		// 3. Generate output declaration (1 work/output)
		for (Connector outputConnector : outputConnectors) {
			String name = outputConnector.getName();
			String type = outputConnector.getType();
			VHDLResourceUtils.generatePortDeclaration(sb, name,
					type, "OUT", subMonitor.newChild(1));
		}

		// 4. End declaration (2 works)
		sb.append("  );\n");
		sb.append("END " + entityName + ";\n");
		subMonitor.worked(2);
	}

	/**
	 * @param sb
	 * @param entityName
	 * @param monitor
	 */
	private static void generateEntityArchitecture(StringBuffer sb,
			String entityName, IProgressMonitor monitor) {
		sb.append("ARCHITECTURE behaviour OF " + entityName + " IS\n");
		sb.append("END behaviour;\n");
		
	}

}
