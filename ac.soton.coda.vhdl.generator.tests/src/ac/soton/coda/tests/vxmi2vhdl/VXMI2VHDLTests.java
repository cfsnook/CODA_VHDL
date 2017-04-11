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

package ac.soton.coda.tests.vxmi2vhdl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import junit.framework.TestCase;
import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;

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
public class VXMI2VHDLTests extends TestCase {

	private IProgressMonitor nullProgressMonitor = new NullProgressMonitor();
	
	public void testPrettyPrintDesignFile() {
		VXMISetup vxmiSetup = VXMISetup.getDefault();

		DummyVXMI2VHDLPrettyPrinter prettyPrinter = new DummyVXMI2VHDLPrettyPrinter();
		prettyPrinter.ppDesignFile = true;
		StringBuffer sb;

		IVHDLDesignFile designFile = vxmiSetup.getDesignFile();

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designFile, 0, nullProgressMonitor);
		assertEquals(
				"class ac.soton.coda.vhdl.impl.VHDLDesignUnit indented by 0\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLDesignUnit indented by 0",
				sb.toString());

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designFile, 1, nullProgressMonitor);
		assertEquals(
				"class ac.soton.coda.vhdl.impl.VHDLDesignUnit indented by 1\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLDesignUnit indented by 1",
				sb.toString());

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designFile, 2, nullProgressMonitor);
		assertEquals(
				"class ac.soton.coda.vhdl.impl.VHDLDesignUnit indented by 2\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLDesignUnit indented by 2",
				sb.toString());
	}

	public void testPrettyPrintDesignUnit() {
		VXMISetup vxmiSetup = VXMISetup.getDefault();

		DummyVXMI2VHDLPrettyPrinter prettyPrinter = new DummyVXMI2VHDLPrettyPrinter();
		prettyPrinter.ppDesignUnit = true;
		StringBuffer sb;

		IVHDLDesignUnit designUnit1 = vxmiSetup.getDesignUnit1();

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designUnit1, 0, nullProgressMonitor);
		assertEquals(
				"class ac.soton.coda.vhdl.impl.VHDLLibraryClause indented by 0\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLUseClause indented by 0\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLUseClause indented by 0\n"
						+ "\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLEntityDeclaration indented by 0",
				sb.toString());

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designUnit1, 1, nullProgressMonitor);
		assertEquals(
				"class ac.soton.coda.vhdl.impl.VHDLLibraryClause indented by 1\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLUseClause indented by 1\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLUseClause indented by 1\n"
						+ "\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLEntityDeclaration indented by 1",
				sb.toString());

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designUnit1, 2, nullProgressMonitor);
		assertEquals(
				"class ac.soton.coda.vhdl.impl.VHDLLibraryClause indented by 2\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLUseClause indented by 2\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLUseClause indented by 2\n"
						+ "\n"
						+ "class ac.soton.coda.vhdl.impl.VHDLEntityDeclaration indented by 2",
				sb.toString());

		IVHDLDesignUnit designUnit2 = vxmiSetup.getDesignUnit2();

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designUnit2, 0, nullProgressMonitor);
		assertEquals(
				"\n" +
				"\n" +
				"class ac.soton.coda.vhdl.impl.VHDLArchitectureBody indented by 0",
				sb.toString());

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designUnit2, 1, nullProgressMonitor);
		assertEquals(
				"\n" +
				"\n" +
				"class ac.soton.coda.vhdl.impl.VHDLArchitectureBody indented by 1",
				sb.toString());

		sb = new StringBuffer();
		prettyPrinter.prettyPrint(sb, designUnit2, 2, nullProgressMonitor);
		assertEquals(
				"\n" +
				"\n" +
				"class ac.soton.coda.vhdl.impl.VHDLArchitectureBody indented by 2",
				sb.toString());
	}
}
