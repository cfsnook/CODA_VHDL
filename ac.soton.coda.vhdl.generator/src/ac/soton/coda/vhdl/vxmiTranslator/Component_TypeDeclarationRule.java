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
package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ast.Expression;
import org.eventb.core.ast.FormulaFactory;
import org.eventb.core.ast.MultiplePredicate;
import org.eventb.core.ast.Predicate;
import org.eventb.core.ast.SetExtension;
import org.eventb.core.seqprover.eventbExtensions.DLib;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.persistence.EventBEMFUtils;

import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.emf.components.Component;
import ch.ethz.eventb.utils.EventBSCUtils;

public class Component_TypeDeclarationRule extends AbstractVHDLRule implements
		IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#fire(EObject, List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Component;
		Component component = (Component) sourceElement;
		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Component - Type declaration");

		IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) storage
				.fetch("Entity Declaration");
		if (entityDeclaration == null)
			throw new Exception("Dependency KO");

		// Add the type declaration
		VHDLUtils.createEnumerationTypeDeclaration(entityDeclaration, "BOOL",
				"TRUE", "FALSE");

		// TODO Add user-defined types
		Machine mch = (Machine) component
				.getContaining(MachinePackage.Literals.MACHINE);
		IMachineRoot mchRoot = EventBEMFUtils.getRoot(mch);
		Map<String, String> scSeenAxioms = EventBSCUtils.getSCSeenAxioms(
				mchRoot, false);

		Collection<String> usedTypes = (Collection<String>) storage
				.fetch("@Used Types");
		for (String usedType : usedTypes) {
			String[] elements = extractEnumeratedSet(usedType, scSeenAxioms,
					mchRoot.getFormulaFactory());
			if (elements != null) {
				VHDLUtils.createEnumerationTypeDeclaration(entityDeclaration,
						usedType, elements);
			}
		}

		return super.fire(sourceElement, translatedElements);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#dependenciesOK(EObject, List)
	 */
	@Override
	public boolean dependenciesOK(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) storage
				.fetch("Entity Declaration");
		if (entityDeclaration == null)
			return false;

		if (storage.fetch("@Variables") == null) {
			return false;
		}

		if (storage.fetch("@Port Declaration") == null) {
			return false;
		}
		return super.dependenciesOK(sourceElement, translatedElements);
	}

	/**
	 * @param setName
	 * @param scSeenAxioms
	 * @return
	 */
	private String[] extractEnumeratedSet(String setName,
			Map<String, String> scSeenAxioms, FormulaFactory ff) {

		Set<String> keySet = scSeenAxioms.keySet();
		for (String key : keySet) {
			String predicate = scSeenAxioms.get(key);
			Predicate parsePredicate = DLib.parsePredicate(ff, predicate);
			if (parsePredicate.getTag() == Predicate.FIRST_MULTIPLE_PREDICATE) {
				MultiplePredicate multiplePredicate = (MultiplePredicate) parsePredicate;
				Expression[] children = multiplePredicate.getChildren();
				if (setName.equals(children[0].toString())) {
					List<String> result = new ArrayList<String>(
							children.length - 1);
					for (int i = 1; i < children.length; i++) {
						Expression expression = children[i];
						if (expression.getTag() == Expression.SETEXT) {
							SetExtension setExtension = (SetExtension) expression;
							Expression[] members = setExtension.getMembers();
							result.add(members[0].toString());
						}
					}
					return result.toArray(new String[result.size()]);
				}
			}

		}
		return null;
	}

}
