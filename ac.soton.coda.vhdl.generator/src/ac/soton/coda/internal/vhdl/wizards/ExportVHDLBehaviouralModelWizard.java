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
package ac.soton.coda.internal.vhdl.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;

import ac.soton.coda.internal.eventB2vxmi.EventB2VXMIUtils;
import ac.soton.coda.internal.vhdl.utils.VHDLGeneratorUtils;
import ac.soton.eventb.emf.components.Component;

public class ExportVHDLBehaviouralModelWizard extends Wizard implements IExportWizard {

	private ComponentSelectionPage page;

	private EMFRodinDB emfRodinDB;

	public ExportVHDLBehaviouralModelWizard() {
		emfRodinDB = new EMFRodinDB();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page = new ComponentSelectionPage(selection);
		addPage(page);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Wizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		Component component = page.getComponent();
		if (component == null)
			return false;
		return super.canFinish();
	}

	@Override
	public boolean performFinish() {
		final Machine mch = page.getMachine();
		final Component component = page.getComponent();
		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						EventB2VXMIUtils
								.perform(mch, component, monitor);
					} catch (CoreException e) {
						VHDLGeneratorUtils.log(e.getStatus().getSeverity(),
								"Error translating Event-B Component to VXMI", e);
					}
				}
			});
		} catch (InvocationTargetException e) {
			// Invocation exception is displayed in an error dialog.
			Throwable cause = e.getCause();
			MessageDialog.openError(
					this.getShell(),
					"Invocation Target Exception",
					"Translating Event-B Component to VXMI because of: "
							+ cause.getMessage());
		} catch (InterruptedException e) {
			// Interrupted exception is displayed in an information dialog.
			Thread.currentThread().interrupt();
			MessageDialog.openInformation(this.getShell(), "Interrupted",
					"Translating Event-B Component to VXMI is interupted");
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Wizard#needsProgressMonitor()
	 */
	@Override
	public boolean needsProgressMonitor() {
		return true;
	}

	/**
	 * @return
	 */
	public EMFRodinDB getEMFRodinDB() {
		return emfRodinDB;
	}

}
