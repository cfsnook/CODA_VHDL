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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.machine.Machine;

import ac.soton.coda.internal.vxmi2vhdl.IVHDLLibrary;

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
public class VHDLResourceUtils {

	/**
	 * @param mch
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user, or <code>null</code> indicating that no progress should
	 *            be reported and the operation cannot be cancelled.
	 * @return
	 * @throws CoreException
	 */
	public static IFolder getVHDLFolder(Machine mch, IProgressMonitor monitor)
			throws CoreException {
		URI uri = EcoreUtil.getURI(mch);
		uri = uri.trimFileExtension();
		uri = uri.trimSegments(1);
		uri = uri.appendSegment("VHDL");
		IPath folderPath = new Path(uri.toPlatformString(true));
		folderPath = folderPath.makeAbsolute();
		IFolder oracleFolder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(folderPath);
		if (!oracleFolder.exists()) {
			oracleFolder.create(false, true, monitor);
		}
		return oracleFolder;
	}

	/**
	 * Generate VHDL header for a given set of VHDL libraries. The result is
	 * appended to an input string buffer.
	 * 
	 * @param sb
	 *            The input string buffer to store the result.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @param libraries
	 *            the set of libraries going to be used.
	 */
	public static void generateVHDLHeader(StringBuffer sb,
			IProgressMonitor monitor, IVHDLLibrary... libraries) {
		int noLibraries = libraries.length;
		if (noLibraries != 0) {
			// Split the monitor according to the number of library input.
			SubMonitor subMonitor = SubMonitor.convert(monitor, noLibraries);
			for (IVHDLLibrary library : libraries) {
				sb.append("LIBRARY " + library.getName() + ";\n");
				String[] packages = library.getPackages();
				for (String pk : packages) {
					sb.append("USE " + pk + ";\n");
				}
				subMonitor.worked(1);
			}
		}
	}

	/**
	 * @param sb
	 *            The input string buffer to store the result.
	 * @param name The name of the port
	 * @param type The type for the port value
	 * @param portType The port type, i.e., IN or OUT
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 */
	public static void generatePortDeclaration(StringBuffer sb, String name,
			String type, String portType, IProgressMonitor monitor) {
		sb.append("    " + name + " : " + portType + " " + type + ";\n");
	}

}
