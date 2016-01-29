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

package ac.soton.coda.internal.vhdl.wizards;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.RodinCore;

import ac.soton.eventb.emf.components.Component;
import ch.ethz.eventb.ui.utils.EventBContentProvider;
import ch.ethz.eventb.ui.utils.EventBLabelProvider;
import ch.ethz.eventb.ui.utils.EventBViewerFilter;

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
public class ComponentAndOracleSelectionPage extends WizardPage implements
		IWizardPage {

	// The current selection used for initialising the page.
	private ISelection initSelection;

	// The table viewer for selecting an oracle.
	private TableViewer oracleSelector;

	// The tree viewer for selecting a component.
	private TreeViewer componentSelector;

	private TreeViewer machineSelector;

	/**
	 * @param wizard
	 * @param pageName
	 * @param title
	 * @param titleImage
	 */
	protected ComponentAndOracleSelectionPage(ISelection selection) {
		super("Component and Oracle Selection Page",
				"Component and Oracle Selection", null);
		setDescription("Please select the component and the oracle for generating VHDL test bench");
		this.initSelection = selection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IDialogPage#createControl(Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);

		GridLayout layout = new GridLayout(2, true);
		composite.setLayout(layout);

		this.setControl(composite);

		// Create the machine selector
		machineSelector = new TreeViewer(composite);
		machineSelector.setContentProvider(new EventBContentProvider());
		machineSelector.setLabelProvider(new EventBLabelProvider());
		machineSelector.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		@SuppressWarnings("unchecked")
		EventBViewerFilter filter = new EventBViewerFilter(
				IMachineRoot.ELEMENT_TYPE);
		machineSelector.addFilter(filter);
		machineSelector.setInput(RodinCore.getRodinDB());

		// Create the component selector.
		componentSelector = new TreeViewer(composite);
		componentSelector.setContentProvider(new ComponentContentProvider());
		componentSelector.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Component) {
					return ((Component) element).getName();
				}
				return null;
			}
		});
		componentSelector.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		ExportVHDLTestBenchWizard wizard = (ExportVHDLTestBenchWizard) this
				.getWizard();
		final EMFRodinDB emfRodinDB = wizard.getEMFRodinDB();
		TransactionalEditingDomain editingDomain = emfRodinDB
				.getEditingDomain();
		oracleSelector = new TableViewer(composite);
		oracleSelector.setContentProvider(new OracleContentProvider(
				editingDomain));
		oracleSelector.setLabelProvider(new LabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof Resource) {
					return ((Resource) element).getURI().lastSegment();
				}
				return null;
			}

		});
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 2;
		oracleSelector.getControl().setLayoutData(gridData);

		machineSelector
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						ISelection sel = event.getSelection();
						if (sel instanceof IStructuredSelection) {
							IStructuredSelection ssel = (IStructuredSelection) sel;
							Object element = ssel.getFirstElement();

							if (element instanceof IMachineRoot) {
								oracleSelector.setInput(element);
								Machine mch = (Machine) emfRodinDB
										.loadEventBComponent((IMachineRoot) element);
								componentSelector.setInput(mch);
							} else {
								componentSelector.setInput(null);
								oracleSelector.setInput(null);
							}
						}
					}
				});

		machineSelector.setSelection(initSelection);

		ISelectionChangedListener updateWizardListener = new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				getWizard().getContainer().updateButtons();
			}
		};
		componentSelector.addSelectionChangedListener(updateWizardListener);
		oracleSelector.addSelectionChangedListener(updateWizardListener);

	}

	/**
	 * @return
	 */
	public Resource getOracleFile() {
		ISelection sel = oracleSelector.getSelection();
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) sel;
			Object element = ssel.getFirstElement();
			return (Resource) element;
		}
		return null;
	}

	/**
	 * @return
	 */
	public Component getComponent() {
		ISelection sel = componentSelector.getSelection();
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) sel;
			Object element = ssel.getFirstElement();
			return (Component) element;
		}
		return null;
	}

	/**
	 * @return
	 */
	public Machine getMachine() {
		ISelection sel = machineSelector.getSelection();
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) sel;
			Object element = ssel.getFirstElement();
			if (element instanceof IMachineRoot) {
				IMachineRoot mchRoot = (IMachineRoot) element;
				ExportVHDLTestBenchWizard wizard = (ExportVHDLTestBenchWizard) getWizard();
				EMFRodinDB emfRodinDB = wizard.getEMFRodinDB();
				return (Machine) emfRodinDB.loadEventBComponent(mchRoot);
			}
		}
		return null;
	}

}
