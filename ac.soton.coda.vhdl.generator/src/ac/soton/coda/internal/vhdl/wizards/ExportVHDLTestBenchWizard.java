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
package ac.soton.coda.internal.vhdl.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.RodinDBException;

import ac.soton.coda.internal.vhdl.utils.VHDLTestBenchGeneratorUtils;
import ac.soton.eventb.emf.components.Component;

public class ExportVHDLTestBenchWizard extends Wizard implements IExportWizard {

	private ComponentAndOracleSelectionPage page;

	private EMFRodinDB emfRodinDB;

	public ExportVHDLTestBenchWizard() {
		emfRodinDB = new EMFRodinDB();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page = new ComponentAndOracleSelectionPage(selection);
		addPage(page);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Wizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		Resource oracleFile = page.getOracleFile();
		if (oracleFile == null)
			return false;

		Component component = page.getComponent();
		if (component == null)
			return false;
		return super.canFinish();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		final Machine mch = page.getMachine();
		final Resource oracleFile = page.getOracleFile();
		final Component component = page.getComponent();

		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						VHDLTestBenchGeneratorUtils.perform(monitor, mch,
								component, oracleFile);
					} catch (IOException e) {
						e.printStackTrace();
						return;
					} catch (RodinDBException e) {
						e.printStackTrace();
						return;
					} catch (CoreException e) {
						e.printStackTrace();
						return;
					} finally { // Call done() on the input progress monitor.
						if (monitor != null) {
							monitor.done();
						}
					}
				}
			});
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
