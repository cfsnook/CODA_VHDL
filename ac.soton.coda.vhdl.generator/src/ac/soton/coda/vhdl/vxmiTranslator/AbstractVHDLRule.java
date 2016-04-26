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

package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLCaseStatement;
import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.IVHDLFactory;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;

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
public abstract class AbstractVHDLRule extends AbstractRule implements IRule {

	protected IVHDLFactory vhdlFactory = IVHDLFactory.eINSTANCE;

	protected ITranslatorStorage storage = TranslatorStorage.getDefault();
	
	/**
	 * @param translatedElements
	 * @return
	 */
	protected final IVHDLDesignFile getDesignFile(
			List<TranslationDescriptor> translatedElements) {
		for (TranslationDescriptor translatedElement : translatedElements) {
			if (translatedElement.value instanceof IVHDLDesignFile) {
				return (IVHDLDesignFile) translatedElement.value;
			}
		}
		return null;
	}

	/**
	 * @param translatedElements
	 * @return
	 */
	protected final IVHDLEntityDeclaration getEntityDeclaration(
			List<TranslationDescriptor> translatedElements) {
		for (TranslationDescriptor translatedElement : translatedElements) {
			if (translatedElement.value instanceof IVHDLEntityDeclaration) {
				return (IVHDLEntityDeclaration) translatedElement.value;
			}
		}
		return null;
	}

	/**
	 * @param translatedElements
	 * @return
	 */
	protected final IVHDLArchitectureBody getArchitectureBody(
			List<TranslationDescriptor> translatedElements) {
		for (TranslationDescriptor translatedElement : translatedElements) {
			if (translatedElement.value instanceof IVHDLArchitectureBody) {
				return (IVHDLArchitectureBody) translatedElement.value;
			}
		}
		return null;
	}
	/**
	 * @param sourceElement
	 * @return
	 */
	protected final IVHDLCaseStatementAlternative getCaseStatementAlterative(
			List<TranslationDescriptor> translatedElements,
			Statemachine statemachine) {

		EObject parent = statemachine.eContainer();
		if (parent instanceof State)
			return getCaseStatementAlterative(translatedElements,
					(State) parent);

		return null;
	}

	/**
	 * @param translatedElements
	 * @param parent
	 * @return
	 */
	protected final IVHDLCaseStatementAlternative getCaseStatementAlterative(
			List<TranslationDescriptor> translatedElements, State state) {
		String name = state.getName();
		EObject parent = state.eContainer();
		if (parent instanceof Statemachine) {
			IVHDLCaseStatement caseStatement = getCaseStatement(
					translatedElements, (Statemachine) parent);
			if (caseStatement != null) {
				EList<IVHDLCaseStatementAlternative> caseStatementAlternatives = caseStatement
					.getCaseStatementAlternatives();
				for (IVHDLCaseStatementAlternative caseStatementAlternative : caseStatementAlternatives) {
					if (name.equals(caseStatementAlternative.getLabel())) {
						return caseStatementAlternative;
					}
				}
			} else {
				return null;
			}
		}
		return null;
	}

	/**
	 * @param translatedElements
	 * @param parent
	 * @return
	 */
	private final IVHDLCaseStatement getCaseStatement(
			List<TranslationDescriptor> translatedElements, Statemachine statemachine) {
		for (TranslationDescriptor translatedElement : translatedElements) {
			if (translatedElement.value instanceof IVHDLCaseStatement) {
				IVHDLCaseStatement caseStatement = (IVHDLCaseStatement) translatedElement.value;
				String expression = caseStatement.getExpression();
				if (("current_" + statemachine.getName()).equals(expression)) {
					return caseStatement;
				}
			}
		}		
		return null;
	}

}
