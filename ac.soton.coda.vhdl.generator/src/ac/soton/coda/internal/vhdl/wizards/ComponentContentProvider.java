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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Machine;

import ac.soton.eventb.emf.components.Component;

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
public class ComponentContentProvider implements ITreeContentProvider {

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
	 * @see ITreeContentProvider#getElements(Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ITreeContentProvider#getChildren(Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Machine) {
			Machine mch = (Machine) parentElement;
			EList<AbstractExtension> extensions = mch.getExtensions();
			Collection<Component> result = new ArrayList<Component>();
			for (AbstractExtension extension : extensions) {
				if (extension instanceof Component) {
					Component component = (Component) extension;
					result.addAll(component.getComponents());
				}
			}
			return result.toArray(new Component[result.size()]);
		}
		return new Object[0];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ITreeContentProvider#getParent(Object)
	 */
	@Override
	public Object getParent(Object element) {
		if (element instanceof Component) {
			return ((Component) element).eContainer();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ITreeContentProvider#hasChildren(Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length != 0;
	}

}
