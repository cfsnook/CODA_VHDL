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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLIfStatement;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.emf.components.Component;

public class Component_ClockProcessRule extends AbstractVHDLRule implements IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#fire(EObject, List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Component;
		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Component - Clock process");

		IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) storage
				.fetch("Architecture Body");
		if (architectureBody == null)
			throw new Exception("Dependency KO");

		// Create the clock process
		IVHDLProcessStatement processStatement = VHDLUtils
				.createProcessStatement(architectureBody, "clk", "reset");
		IVHDLIfStatement ifStatement = VHDLUtils
				.createIfStatement(processStatement);
		IVHDLIfClause ifClause = VHDLUtils.createIfClause(ifStatement,
				"(reset = '1')");
		storage.stash("@Initial", ifClause);

		IVHDLElsifClause elsifClause = VHDLUtils.createElsifClause(ifStatement,
				"(rising_edge(clk))");
		storage.stash("@RisingEdge", elsifClause);

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
		IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) storage
				.fetch("Architecture Body");
		if (architectureBody == null)
			return false;

		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
