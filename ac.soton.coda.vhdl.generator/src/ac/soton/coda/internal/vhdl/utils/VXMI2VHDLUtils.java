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
 * This class contains utility methods for translating from VXMI to VHDL.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see
 * @since 0.0.2
 */
public class VXMI2VHDLUtils {

	/**
	 * @param designFile
	 * @param monitor
	 * @throws CoreException
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
		
		// 1. Pretty print the design file to a string buffer (80%)
		StringBuffer sb = new StringBuffer();
		VXMI2VHDLPrettyPrinter prettyPrinter = new VXMI2VHDLPrettyPrinter();
		prettyPrinter.prettyPrint(sb, designFile, 0, subMonitor.newChild(80));

		// 2. Get the VHDL folder
		URI uri = resource.getURI();
		uri = uri.trimFileExtension();
		int segmentCount = uri.segmentCount();
		String filename = uri.segment(segmentCount - 1);
		uri = uri.trimSegments(1);
		IPath folderPath = new Path(uri.toPlatformString(true));
		folderPath = folderPath.makeAbsolute();
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(folderPath);

		// 5. Create the VHDL output file (10%)
		IFile file = folder.getFile(filename + ".vhdl");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		if (!file.exists()) {
			file.create(source, true, subMonitor.newChild(20));
		} else {
			file.setContents(source, true, true, subMonitor.newChild(20));
		}

	}

}
