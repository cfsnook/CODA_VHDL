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

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eventb.core.IMachineRoot;
import org.rodinp.core.IRodinProject;

import ac.soton.eventb.emf.oracle.util.OracleUtils;

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
public class OracleContentProvider implements IStructuredContentProvider {

	private TransactionalEditingDomain editingDomain;

	/**
	 * 
	 */
	public OracleContentProvider(TransactionalEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		// Do nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IContentProvider#inputChanged(Viewer, Object, Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Do nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IStructuredContentProvider#getElements(Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IMachineRoot) {
			IMachineRoot mchRoot = (IMachineRoot) inputElement;
			IRodinProject rodinProject = ((IMachineRoot) mchRoot).getRodinProject();
			IProject project = (IProject) rodinProject.getCorrespondingResource();

			Resource[] oracles = OracleUtils.getOracles(project, mchRoot.getElementName(), editingDomain);
			return oracles;
		}
		return new Object[0];
	}

}
