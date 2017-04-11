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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;

public class Component_ContextItemsRule extends AbstractVHDLRule implements
		IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#fire(EObject, List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		IVHDLDesignUnit designUnit1 = (IVHDLDesignUnit) storage
				.fetch("Design Unit 1");
		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Component - Context items");
		if (designUnit1 == null)
			throw new Exception("Dependency KO");
		// Added the context items to designUnit1
		VHDLUtils.createLibraryClause(designUnit1, "ieee");
		VHDLUtils.createUseClause(designUnit1, "ieee", "std_logic_1164", "all");
		VHDLUtils.createUseClause(designUnit1, "ieee", "std_logic_unsigned",
				"all");

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
		IVHDLDesignUnit designUnit1 = (IVHDLDesignUnit) storage
				.fetch("Design Unit 1");
		if (designUnit1 == null)
			return false;

		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
