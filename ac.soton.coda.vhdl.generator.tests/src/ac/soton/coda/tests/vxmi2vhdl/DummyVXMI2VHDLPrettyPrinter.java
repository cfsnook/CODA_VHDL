/*******************************************************************************
 * (c) Crown owned copyright (2017) (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      University of Southampton - Initial API and implementation
 *******************************************************************************/

package ac.soton.coda.tests.vxmi2vhdl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.internal.vxmi2vhdl.IVXMI2VHDLPrettyPrinter;
import ac.soton.coda.internal.vxmi2vhdl.VXMI2VHDLPrettyPrinter;
import ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLConcurrentStatement;
import ac.soton.coda.vhdl.IVHDLContextItem;
import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLElseClause;
import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLInterfaceElement;
import ac.soton.coda.vhdl.IVHDLLibraryUnit;
import ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLSequentialStatement;

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
public class DummyVXMI2VHDLPrettyPrinter extends VXMI2VHDLPrettyPrinter
		implements IVXMI2VHDLPrettyPrinter {

	public DummyVXMI2VHDLPrettyPrinter() {
		super("Testing");
	}

	// Boolean flags to control which part is pretty print, which part is dummy
	// print. By default, everything is turned off, hence the dummy pretty print
	// is used.
	boolean ppDesignFile = false;

	boolean ppDesignUnit = false;

	boolean ppContextClause = false;

	boolean ppLibraryUnit = false;

	boolean ppContextItem = false;

	boolean ppInterfaceElement = false;

	boolean ppEntityDeclarativeItem = false;

	boolean ppBlockDeclarativeItem = false;

	boolean ppConcurrentStatement = false;

	boolean ppProcessDeclarativeItem = false;

	boolean ppSequentialStatement = false;

	boolean ppCaseStatementAlternative = false;

	boolean ppIfClause = false;

	boolean ppElsifClause = false;

	/**
	 * Utility method for dummy print.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param object
	 *            the print object
	 * @param indentLevel
	 *            the indent level.
	 */
	private void prettyPrintDummy(StringBuffer sb, EObject object,
			int indentLevel) {
		sb.append(object.getClass() + " indented by " + indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see VXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLDesignFile,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLDesignFile designFile,
			int indentLevel, IProgressMonitor monitor) {
		if (ppDesignFile)
			super.prettyPrint(sb, designFile, indentLevel, monitor);
		else
			prettyPrintDummy(sb, designFile, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see VXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLDesignUnit,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLDesignUnit designUnit,
			int indentLevel, IProgressMonitor monitor) {
		if (ppDesignUnit)
			super.prettyPrint(sb, designUnit, indentLevel, monitor);
		else
			prettyPrintDummy(sb, designUnit, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see VXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLContextItem,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLContextItem contextItem,
			int indentLevel, IProgressMonitor monitor) {
		if (ppContextItem)
			super.prettyPrint(sb, contextItem, indentLevel, monitor);
		else
			prettyPrintDummy(sb, contextItem, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see VXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLLibraryUnit,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLLibraryUnit libraryUnit,
			int indentLevel, IProgressMonitor monitor) {
		if (ppLibraryUnit)
			super.prettyPrint(sb, libraryUnit, indentLevel, monitor);
		else
			prettyPrintDummy(sb, libraryUnit, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLInterfaceElement, int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb,
			IVHDLInterfaceElement interfaceElement, int indentLevel,
			IProgressMonitor monitor) {
		if (ppInterfaceElement)
			super.prettyPrint(sb, interfaceElement, indentLevel, monitor);
		else
			prettyPrintDummy(sb, interfaceElement, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLEntityDeclarativeItem, int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb,
			IVHDLEntityDeclarativeItem entityDeclarativeItem, int indentLevel,
			IProgressMonitor monitor) {
		if (ppEntityDeclarativeItem)
			super.prettyPrint(sb, entityDeclarativeItem, indentLevel, monitor);
		else
			prettyPrintDummy(sb, entityDeclarativeItem, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLBlockDeclarativeItem, int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb,
			IVHDLBlockDeclarativeItem blockDeclarativeItem, int indentLevel,
			IProgressMonitor monitor) {
		if (ppBlockDeclarativeItem)
			super.prettyPrint(sb, blockDeclarativeItem, indentLevel, monitor);
		else
			prettyPrintDummy(sb, blockDeclarativeItem, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLConcurrentStatement, int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb,
			IVHDLConcurrentStatement concurrentStatement, int indentLevel,
			IProgressMonitor monitor) {
		if (ppConcurrentStatement)
			super.prettyPrint(sb, concurrentStatement, indentLevel, monitor);
		else
			prettyPrintDummy(sb, concurrentStatement, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLProcessDeclarativeItem, int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb,
			IVHDLProcessDeclarativeItem processDeclarativeItem,
			int indentLevel, IProgressMonitor monitor) {
		if (ppProcessDeclarativeItem)
			super.prettyPrint(sb, processDeclarativeItem, indentLevel, monitor);
		else
			prettyPrintDummy(sb, processDeclarativeItem, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLSequentialStatement, int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb,
			IVHDLSequentialStatement sequentialStatement, int indentLevel,
			IProgressMonitor monitor) {
		if (ppSequentialStatement)
			super.prettyPrint(sb, sequentialStatement, indentLevel, monitor);
		else
			prettyPrintDummy(sb, sequentialStatement, indentLevel);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLCaseStatementAlternative, int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb,
			IVHDLCaseStatementAlternative caseStatementAlternative,
			int indentLevel, IProgressMonitor monitor) {
		if (ppCaseStatementAlternative)
			super.prettyPrint(sb, caseStatementAlternative, indentLevel,
					monitor);
		else
			prettyPrintDummy(sb, caseStatementAlternative, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLIfClause,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLIfClause ifClause,
			int indentLevel, IProgressMonitor monitor) {
		if (ppIfClause)
			super.prettyPrint(sb, ifClause, indentLevel, monitor);
		else
			prettyPrintDummy(sb, ifClause, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLElsifClause,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLElsifClause elsifClause,
			int indentLevel, IProgressMonitor monitor) {
		if (ppElsifClause)
			super.prettyPrint(sb, elsifClause, indentLevel, monitor);
		else
			prettyPrintDummy(sb, elsifClause, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLElseClause,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLElseClause elseClause,
			int indentLevel, IProgressMonitor monitor) {
		if (ppLibraryUnit)
			super.prettyPrint(sb, elseClause, indentLevel, monitor);
		else
			prettyPrintDummy(sb, elseClause, indentLevel);
	}

}
