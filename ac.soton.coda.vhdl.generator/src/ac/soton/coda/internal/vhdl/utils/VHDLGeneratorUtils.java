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

package ac.soton.coda.internal.vhdl.utils;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import ac.soton.coda.vhdl.generator.VHDLGeneratorPlugin;


/**
 * <p>
 * This class contains utility methods for translating from VXMI to VHDL.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see
 * @since 0.0.3
 */
public class VHDLGeneratorUtils {

	/**
	 * The debug flag. This is set by the option when the platform is launched.
	 * Client should not try to reset this flag.
	 */
	public static boolean DEBUG = false;

	/**
	 * Utility method to log an exception to the VHDLGenerator plug-in log.
	 * 
	 * @param severity
	 *            the severity
	 * @param message
	 *            the message for logging exception
	 * @param exception
	 *            the exception
	 */
	public static void log(int severity, String message, Exception exception) {
		IStatus result = new Status(severity, VHDLGeneratorPlugin.PLUGIN_ID,
				message, exception);
		VHDLGeneratorPlugin.getDefault().getLog().log(result);
	}

}
