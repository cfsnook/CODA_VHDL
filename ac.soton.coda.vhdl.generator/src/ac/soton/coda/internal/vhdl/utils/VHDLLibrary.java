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
 *
 * </p>
 *
 * @author htson
 * @version
 * @see
 * @since
 */
public class VHDLLibrary implements IVHDLLibrary {

	private String library;

	private String[] packages;

	/**
	 * @param string
	 */
	public VHDLLibrary(String library, String... packages) {
		this.library = library;
		this.packages = packages;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see VHDLTestBenchGenerator.IVHDLLibrary#getLibrary()
	 */
	@Override
	public String getLibrary() {
		return library;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see VHDLTestBenchGenerator.IVHDLLibrary#getPackages()
	 */
	@Override
	public String[] getPackages() {
		return packages;
	}

}
