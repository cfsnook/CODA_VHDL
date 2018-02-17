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
package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesUtils;

public class Statemachine_StatesAsAnEnumerationTypeRule extends
		AbstractVHDLRule implements IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ac.soton.eventb.emf.diagrams.importExport.AbstractRule#fire(org.eclipse
	 * .emf.ecore.EObject, java.util.List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Statemachine;
		Statemachine statemachine = (Statemachine) sourceElement;

		// Get the entity declaration.
		IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) storage
				.fetch("Entity Declaration");
		if (entityDeclaration == null)
			throw new Exception("Dependency KO");

		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils
					.debug("Statemachine: states as an enumeration type");

		// Collect all the state names of the statemachine.
		EList<AbstractNode> nodes = statemachine.getNodes();
		Collection<String> stateNames = new ArrayList<String>();
		for (AbstractNode node : nodes) {
			if (node instanceof State) {
				State state = (State) node;
				stateNames.add(state.getName());
			}
		}

		// If the statemachine is not top-level (i.e., a nested statemachine),
		// then add the "_NULL" state name.
		String name = statemachine.getName();
		if (!StatemachinesUtils.isTopLevel(statemachine)) {
			stateNames.add(name + "_NULL");
		}

		// Create the declaration of the enumeration type
		VHDLUtils.createEnumerationTypeDeclaration(entityDeclaration, name
				+ "_STATES", stateNames.toArray(new String[stateNames.size()]));

		return new ArrayList<TranslationDescriptor>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#dependenciesOK (EObject, List)
	 */
	@Override
	public boolean dependenciesOK(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) storage
				.fetch("Entity Declaration");
		if (entityDeclaration == null)
			return false;
		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
