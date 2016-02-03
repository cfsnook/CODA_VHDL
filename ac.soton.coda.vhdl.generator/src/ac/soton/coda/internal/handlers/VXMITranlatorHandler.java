package ac.soton.coda.internal.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eventb.emf.persistence.EMFRodinDB;

import ac.soton.emf.translator.Activator;
import ac.soton.emf.translator.command.TranslateCommand;
import ac.soton.emf.translator.impl.Messages;
import ac.soton.emf.translator.impl.TranslatorFactory;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.core.extension.navigator.provider.ExtensionNavigatorItem;

public class VXMITranlatorHandler extends AbstractHandler implements IHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
	 * ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the current selection
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);

		// Get the selected component
		Component component = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() == 1) {
				Object obj = ssel.getFirstElement();
				if (obj instanceof ExtensionNavigatorItem) {
					EObject eObject = ((ExtensionNavigatorItem) obj).getEObject();
					if (eObject instanceof Component) {
						component = (Component) eObject;
					}
				}
			}
		}

		if (component == null)
			return null;

		if (TranslatorFactory.getFactory().canTranslate(component.eClass())) {
			EMFRodinDB erd = new EMFRodinDB();
			final TranslateCommand translateCommand = new TranslateCommand(
					erd.getEditingDomain(), component);

			if (translateCommand.canExecute()) {
				IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
						.getActiveWorkbenchWindow(event);

				// run with progress
				final Shell shell = activeWorkbenchWindow.getShell();
				ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
				try {
					dialog.run(false, true, new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor) {
							monitor.beginTask(Messages.TRANSLATOR_MSG_05,
									IProgressMonitor.UNKNOWN);
							try {
								if (!translateCommand.execute(monitor, null)
										.isOK()) {
									MessageDialog.openError(shell,
											Messages.TRANSLATOR_MSG_09,
											Messages.TRANSLATOR_MSG_10);
								}
							} catch (ExecutionException e) {
								Activator.logError(Messages.TRANSLATOR_MSG_06,
										e);
							}
							monitor.done();
						}
					});
				} catch (InvocationTargetException e) {
					Activator.logError(Messages.TRANSLATOR_MSG_07, e);
					return null;
				} catch (InterruptedException e) {
					Activator.logError(Messages.TRANSLATOR_MSG_08, e);
					return null;
				}

			}
		}
		return null;
	}

}