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

package ac.soton.coda.internal.vxmi2vhdl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import ac.soton.coda.vhdl.IVHDLDesignFile;

/**
 * <p>
 * This class contains utility methods for translating from VXMI to VHDL. In
 * particular, it use the pretty printer {@link VXMI2VHDLPrettyPrinter} to
 * translate from VXMI to VHDL.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see IVXMI2VHDLPrettyPrinter
 * @since 0.0.2
 */
public class VXMI2VHDLUtils {

	/**
	 * Utility method for pretty print a VXMI to VHDL
	 * 
	 * @param resource
	 *            the resource containing the VXMI.
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user. It is the caller's responsibility to call done() on the
	 *            given monitor. Accepts <code>null</code>, indicating that no
	 *            progress should be reported and that the operation cannot be
	 *            cancelled.
	 * @throws CoreException
	 *             if unexpected error occurs during the translation.
	 */
	public static void prettyPrintVXMI2VHDL(Resource resource,
			IProgressMonitor monitor) throws CoreException {
		// Split the progress monitor to 100%
		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		// 1. Get the design file from the resource (10%)
		IVHDLDesignFile designFile = null;
		EList<EObject> contents = resource.getContents();
		if (contents.size() != 0) {
			EObject eObject = contents.get(0);
			if (eObject instanceof IVHDLDesignFile) {
				designFile = (IVHDLDesignFile) eObject;
			}
		}
		if (designFile == null)
			return;
		
		// 1. (80%) Pretty print the design file to a string buffer
		StringBuffer sb = new StringBuffer();
		IVXMI2VHDLPrettyPrinter prettyPrinter = VXMI2VHDLPrettyPrinter
				.getDefault();
		prettyPrinter.prettyPrint(sb, designFile, 0, subMonitor.newChild(80));

		// 2. (5%) Get the VHDL folder
		URI uri = resource.getURI();
		uri = uri.trimFileExtension();
		int segmentCount = uri.segmentCount();
		String filename = uri.segment(segmentCount - 1);
		uri = uri.trimSegments(1);
		IPath folderPath = new Path(uri.toPlatformString(true));
		folderPath = folderPath.makeAbsolute();
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(folderPath);
		subMonitor.worked(5);

		// 3. (15%) Create the VHDL output file
		IFile file = folder.getFile(filename + ".vhd"); // Feature Request #8: Use .vhd instead of .vhdl
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		if (!file.exists()) {
			file.create(source, true, subMonitor.newChild(15));
		} else {
			file.setContents(source, true, true, subMonitor.newChild(15));
		}

	}

}
