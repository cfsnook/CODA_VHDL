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
 *
 * </p>
 *
 * @author htson
 * @version
 * @see
 * @since
 */
public interface IVXMI2VHDLPrettyPrinter {

	public void prettyPrint(StringBuffer sb, IVHDLDesignFile designFile,
			int indentLevel, IProgressMonitor monitor);

	public void prettyPrint(StringBuffer sb, IVHDLDesignUnit designUnit,
			int indentLevel);

	/**
	 * @param sb
	 * @param contextItem
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb, IVHDLContextItem contextItem,
			int indentLevel);
	
	public void prettyPrint(StringBuffer sb, IVHDLLibraryUnit libraryUnit,
			int indentLevel);

	public void prettyPrint(StringBuffer sb,
			IVHDLInterfaceElement interfaceElement, int indentLevel);

	public void prettyPrint(StringBuffer sb,
			IVHDLEntityDeclarativeItem entityDeclarativeItem, int indentLevel);

	public void prettyPrint(StringBuffer sb,
			IVHDLBlockDeclarativeItem blocDeclarativeItem, int indentLevel);

	public void prettyPrint(StringBuffer sb,
			IVHDLConcurrentStatement concurrentStatement, int indentLevel);
			
	public void prettyPrint(StringBuffer sb,
			IVHDLProcessDeclarativeItem processDeclarativeItem, int indentLevel);
	
	public void prettyPrint(StringBuffer sb,
			IVHDLSequentialStatement sequentialStatement, int indentLevel);
	
	public void prettyPrint(StringBuffer sb,
			IVHDLCaseStatementAlternative caseStatementAlternative,
			int indentLevel);
	
	public void prettyPrint(StringBuffer sb, IVHDLIfClause ifClause,
			int indentLevel);

	public void prettyPrint(StringBuffer sb, IVHDLElsifClause elsifClause,
			int indentLevel);

	public void prettyPrint(StringBuffer sb, IVHDLElseClause elseClause,
			int indentLevel);
}