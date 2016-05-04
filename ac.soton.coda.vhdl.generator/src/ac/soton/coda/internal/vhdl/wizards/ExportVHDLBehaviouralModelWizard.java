package ac.soton.coda.internal.vhdl.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;

import ac.soton.coda.internal.eventB2vxmi.EventB2VXMIUtils;
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
						e.printStackTrace();
					}
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
