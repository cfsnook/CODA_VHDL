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

import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.custom.VHDLUtils;

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
public class VXMISetup {

	private static VXMISetup instance;

	private static IVHDLDesignFile designFile;
	
	private static IVHDLDesignUnit designUnit1;

	private static IVHDLDesignUnit designUnit2;

	private VXMISetup() {
		// Singleton with private default constructor
	}

	public static VXMISetup getDefault() {
		if (instance == null) {
			instance = new VXMISetup();
			setup();
		}
		return instance;
	}

	/**
	 * 
	 */
	private static void setup() {
		designFile = VHDLUtils.createDesignFile("m3"); 
				
		designUnit1 = VHDLUtils.createDesignUnit(designFile);
		VHDLUtils.createLibraryClause(designUnit1, "ieee");
		VHDLUtils.createUseClause(designUnit1, "ieee", "std_logic_1164", "all");
		VHDLUtils.createUseClause(designUnit1, "ieee", "std_logic_unsigned", "all");
		VHDLUtils.createEntityDeclaration(designUnit1, "WM");
		
		designUnit2 = VHDLUtils.createDesignUnit(designFile);

		VHDLUtils.createArchitectureBody(designUnit2, "behaviour", "WM");
	}

	/**
	 * @return
	 */
	public IVHDLDesignFile getDesignFile() {
		return designFile;
	}

	/**
	 * @return
	 */
	public IVHDLDesignUnit getDesignUnit1() {
		return designUnit1;
	}

	/**
	 * @return
	 */
	public IVHDLDesignUnit getDesignUnit2() {
		return designUnit2;
	}

}
