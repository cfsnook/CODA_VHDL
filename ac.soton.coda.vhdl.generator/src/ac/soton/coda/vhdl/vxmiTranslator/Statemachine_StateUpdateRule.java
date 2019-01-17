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
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.statemachines.Statemachine;

public class Statemachine_StateUpdateRule extends AbstractVHDLRule implements IRule {

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.importExport.AbstractRule#fire(org.eclipse.emf.ecore.EObject, java.util.List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		IVHDLElsifClause elsifClause = (IVHDLElsifClause) storage.fetch("@RisingEdge");
		if (elsifClause == null) {
			throw new Exception("Dependency KO");
		}
		
		Statemachine statemachine = (Statemachine) sourceElement;
		String name = statemachine.getName();
		VHDLUtils.createSignalAssignmentStatement(elsifClause, "current_"
				+ name, "next_" + name);
		return new ArrayList<TranslationDescriptor>();
	}

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.importExport.AbstractRule#dependenciesOK(org.eclipse.emf.ecore.EObject, java.util.List)
	 */
	@Override
	public boolean dependenciesOK(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		Object fetch = storage.fetch("@RisingEdge");
		if (fetch == null)
			return false;
		return true;
	}

}
