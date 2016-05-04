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

import org.eclipse.core.runtime.IProgressMonitor;

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
 * A common interface for VXMI to VHDL pretty printer.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see VXMI2VHDLPrettyPrinter
 * @since 0.0.2
 */
public interface IVXMI2VHDLPrettyPrinter {

	/**
	 * Pretty print a VHDL design file and its contents. The result is appended
	 * to the input string buffer.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param designFile
	 *            the input VHDL design file.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 */
	public void prettyPrint(StringBuffer sb, IVHDLDesignFile designFile,
			int indentLevel, IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL design unit and its contents. The result is appended
	 * to the input string buffer. This method is called as a part of pretty
	 * print the full VHDL design file. This method is <code>public</code> for
	 * testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param designUnit
	 *            the input VHDL design unit.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLDesignUnit designUnit,
			int indentLevel, IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL context item and its contents. The result is appended
	 * to the input string buffer. This method is called as a part of pretty
	 * print the full VHDL design file. This method is <code>public</code> for
	 * testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param contextItem
	 *            the input VHDL context item.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLContextItem contextItem,
			int indentLevel, IProgressMonitor monitor);
	
	/**
	 * Pretty print a VHDL library unit and its contents. The result is appended
	 * to the input string buffer. This method is called as a part of pretty
	 * print the full VHDL design file. This method is <code>public</code> for
	 * testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param libraryUnit
	 *            the input VHDL library unit.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLLibraryUnit libraryUnit,
			int indentLevel, IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL interface element and its contents. The result is appended
	 * to the input string buffer. This method is called as a part of pretty
	 * print the full VHDL design file. This method is <code>public</code> for
	 * testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param interfaceElement
	 *            the input VHDL interface element.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLInterfaceElement interfaceElement, int indentLevel,
			IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL entity declarative item and its contents. The result
	 * is appended to the input string buffer. This method is called as a part
	 * of pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param entityDeclarativeItem
	 *            the input VHDL entity declarative item.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLEntityDeclarativeItem entityDeclarativeItem, int indentLevel,
			IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL block declarative item and its contents. The result
	 * is appended to the input string buffer. This method is called as a part
	 * of pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param blockDeclarativeItem
	 *            the input VHDL block declarative item.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLBlockDeclarativeItem blockDeclarativeItem, int indentLevel,
			IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL concurrent statement and its contents. The result is
	 * appended to the input string buffer. This method is called as a part of
	 * pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param concurrentStatement
	 *            the input VHDL concurrent statement.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLConcurrentStatement concurrentStatement, int indentLevel,
			IProgressMonitor monitor);
			
	/**
	 * Pretty print a VHDL process declarative item and its contents. The result
	 * is appended to the input string buffer. This method is called as a part
	 * of pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param processDeclarativeItem
	 *            the input VHDL process declarative item.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLProcessDeclarativeItem processDeclarativeItem,
			int indentLevel, IProgressMonitor monitor);
	
	/**
	 * Pretty print a VHDL sequential statement and its contents. The result is
	 * appended to the input string buffer. This method is called as a part of
	 * pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param sequentialStatement
	 *            the input VHDL sequential statement.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLSequentialStatement sequentialStatement, int indentLevel,
			IProgressMonitor monitor);
	
	/**
	 * Pretty print a VHDL case statement alternative and its contents. The
	 * result is appended to the input string buffer. This method is called as a
	 * part of pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param caseStatementAlternative
	 *            the input VHDL case statement alternative.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLCaseStatementAlternative caseStatementAlternative,
			int indentLevel, IProgressMonitor monitor);
	
	/**
	 * Pretty print a VHDL IF clause and its contents. The
	 * result is appended to the input string buffer. This method is called as a
	 * part of pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param ifClause
	 *            the input VHDL IF clause.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLIfClause ifClause,
			int indentLevel, IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL ELSIF clause and its contents. The
	 * result is appended to the input string buffer. This method is called as a
	 * part of pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param elsifClause
	 *            the input VHDL ELSIF clause.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLElsifClause elsifClause,
			int indentLevel, IProgressMonitor monitor);

	/**
	 * Pretty print a VHDL ELSE clause and its contents. The
	 * result is appended to the input string buffer. This method is called as a
	 * part of pretty print the full VHDL design file. This method is
	 * <code>public</code> for testing purpose only.
	 * 
	 * @param sb
	 *            the input string buffer
	 * @param elseClause
	 *            the input VHDL ELSE clause.
	 * @param indentLevel
	 *            the indent level for pretty print result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @see #prettyPrint(StringBuffer, IVHDLDesignFile, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLElseClause elseClause,
			int indentLevel, IProgressMonitor monitor);

}