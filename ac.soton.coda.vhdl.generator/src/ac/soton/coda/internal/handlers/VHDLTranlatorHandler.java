/*******************************************************************************
 * Copyright (c) 2015,2016 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.coda.internal.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import ac.soton.coda.internal.vhdl.utils.VHDLGeneratorUtils;
import ac.soton.coda.internal.vhdl.utils.VXMI2VHDLPrettyPrinter;
import ac.soton.coda.internal.vhdl.utils.VXMI2VHDLUtils;

/**
 * <p>
 * An implementation for handler that will be used when for generating VHDL from
 * VXMI.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see VXMI2VHDLPrettyPrinter
 * @since 0.0.1
 */
public class VHDLTranlatorHandler extends AbstractHandler implements IHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see IHandler#execute(ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the current selection
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);

		// Get the selected top-lelel design file from the current selection
		final Resource resource = getDesignFile(selection);

		if (resource == null)
			return null;

		// run with progress
		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindow(event);
		final Shell shell = activeWorkbenchWindow.getShell();
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
		try {
			dialog.run(false, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						VXMI2VHDLUtils.prettyPrintVXMI2VHDL(resource, monitor);
					} catch (CoreException e) {
						VHDLGeneratorUtils.log(e.getStatus().getSeverity(),
								"Error translating VXML to VHDL", e);
					}
				}
			});
		} catch (InvocationTargetException e) {
			// Invocation exception is displayed in an error dialog.
			Throwable cause = e.getCause();
			MessageDialog.openError(
					shell,
					"Invocation Target Exception",
					"Translating VXML to VHDL because of: "
							+ cause.getMessage());
		} catch (InterruptedException e) {
			// Interrupted exception is displayed in an information dialog.
			Thread.currentThread().interrupt();
			MessageDialog.openInformation(shell, "Interrupted",
					"Translating VXMI to VHDL is interupted");
		}

		return null;
	}

	/**
	 * @param selection
	 * @return
	 */
	private Resource getDesignFile(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() == 1) {
				Object obj = ssel.getFirstElement();
				if (obj instanceof IFile) {
					IFile file = (IFile) obj;
					ResourceSet resourceSet = new ResourceSetImpl();
					URI uri = URI.createPlatformResourceURI(file.getFullPath()
							.toString(), true);
					Resource resource = resourceSet.getResource(uri, true);
					return resource;
				}
			}
		}

		return null;
	}

}