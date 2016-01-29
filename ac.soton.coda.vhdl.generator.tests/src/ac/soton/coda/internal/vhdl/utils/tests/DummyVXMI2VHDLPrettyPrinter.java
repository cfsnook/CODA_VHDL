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

package ac.soton.coda.internal.vhdl.utils.tests;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.internal.vhdl.utils.IVXMI2VHDLPrettyPrinter;
import ac.soton.coda.internal.vhdl.utils.VXMI2VHDLPrettyPrinter;
import ac.soton.coda.vhdl.IVHDLContextItem;
import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLLibraryUnit;

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

	boolean ppDesignFile = false;
	
	boolean ppDesignUnit = false;
	
	boolean ppContextClause = false;

	boolean ppLibraryUnit = false;
	
	boolean ppContextItem = false;
	
	private void prettyPrintDummy(StringBuffer sb, EObject object, int indentLevel) {
		sb.append(object.getClass() + " indented by " + indentLevel);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ac.soton.coda.internal.vhdl.utils.IVXMI2VHDLPrettyPrinter#prettyPrint
	 * (java.lang.StringBuffer, ac.soton.coda.vhdl.IVHDLDesignFile, int)
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
	 * @see
	 * ac.soton.coda.internal.vhdl.utils.IVXMI2VHDLPrettyPrinter#prettyPrint
	 * (java.lang.StringBuffer, ac.soton.coda.vhdl.IVHDLDesignUnit, int)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLDesignUnit designUnit,
			int indentLevel) {
		if (ppDesignUnit)
			super.prettyPrint(sb, designUnit, indentLevel);
		else
			prettyPrintDummy(sb, designUnit, indentLevel);
	}
	
	/* (non-Javadoc)
	 * @see ac.soton.coda.internal.vhdl.utils.VXMI2VHDLPrettyPrinter#prettyPrint(java.lang.StringBuffer, ac.soton.coda.vhdl.IVHDLContextItem, int)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLContextItem contextItem,
			int indentLevel) {
		if (ppContextItem)
			super.prettyPrint(sb, contextItem, indentLevel);
		else
			prettyPrintDummy(sb, contextItem, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ac.soton.coda.internal.vhdl.utils.IVXMI2VHDLPrettyPrinter#prettyPrint
	 * (java.lang.StringBuffer, ac.soton.coda.vhdl.IVHDLLibraryUnit, int)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLLibraryUnit libraryUnit,
			int indentLevel) {
		if (ppLibraryUnit)
			super.prettyPrint(sb, libraryUnit, indentLevel);
		else
			prettyPrintDummy(sb, libraryUnit, indentLevel);
	}

}
