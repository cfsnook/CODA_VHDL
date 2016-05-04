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

/**
 * <p>
 * An implementation representing a VHDL library.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see VXMI2VHDLPrettyPrinter
 * @since 0.0.2
 * @noextend This class is not intended to be subclassed by clients.
 */
public class VHDLLibrary implements IVHDLLibrary {

	// The name of the library
	private String name;

	// The list of packages of the library. This must not be null
	private String[] packages;

	/**
	 * Constructor to construct a VHDL library with a given name and a list of
	 * packages.
	 * 
	 * @param name
	 *            the name of the library
	 * @param packages
	 *            the list of packages.
	 */
	public VHDLLibrary(String name, String... packages) {
		this.name = name;
		this.packages = packages;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVHDLLibrary#getLibrary()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVHDLLibrary#getPackages()
	 */
	@Override
	public String[] getPackages() {
		return packages;
	}

}
