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

package ac.soton.coda.internal.vxmi2vhdl;

/**
 * <p>
 * A common interface representing a VHDL library. Each VHDL library has a name
 * and a list of packages.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see VHDLLibrary
 * @since 0.0.2
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IVHDLLibrary {

	/**
	 * Returns the name of the library.
	 * 
	 * @return the name of the library.
	 */
	public String getName();

	/**
	 * Returns the list of packages of the library.
	 * 
	 * @return the list of packages of the library
	 * @postcondition the returned value is not <code>null</code>
	 */
	public String[] getPackages();

}
