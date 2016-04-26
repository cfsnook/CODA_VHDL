package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLCaseStatement;
import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatementsElement;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesUtils;

public class Statemachine_StatesAsCaseStatementRule extends AbstractVHDLRule
		implements IRule {

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
		Statemachine statemachine = (Statemachine) sourceElement;

		IVHDLSequentialStatementsElement sequentialStatementsElement;
		if (StatemachinesUtils.isTopLevel(statemachine)) {
			// For top-level statemachine, get the process statement
			// corresponding to that statemachine.
			sequentialStatementsElement = (IVHDLProcessStatement) storage
				.fetch("Process Statement " + statemachine.getName());
		} else {
			// For nested statemachine, get the containing state and find the
			// case alternative corresponding to that state.
			State state = (State) statemachine.eContainer();
			sequentialStatementsElement = (IVHDLCaseStatementAlternative) storage
					.fetch("Case Statement Alternative " + state.getName());
		}
		
		if (sequentialStatementsElement == null)
			throw new Exception("Dependency KO");

		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Statemachine: Top Level Case Statement");

		IVHDLCaseStatement caseStatement = VHDLUtils.createCaseStatement(
				sequentialStatementsElement, "current_" + statemachine.getName());

		EList<AbstractNode> nodes = statemachine.getNodes();
		for (AbstractNode node : nodes) {
			if (node instanceof State) {
				State state = (State) node;
				String name = state.getName();
				IVHDLCaseStatementAlternative caseStatementAlternative = VHDLUtils
						.addCaseStatementAlternative(caseStatement, name);
				storage.stash("Case Statement Alternative " + name,
						caseStatementAlternative);
			}
		}

		return new ArrayList<TranslationDescriptor>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ac.soton.eventb.emf.diagrams.importExport.AbstractRule#dependenciesOK
	 * (org.eclipse.emf.ecore.EObject, java.util.List)
	 */
	@Override
	public boolean dependenciesOK(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Statemachine;
		Statemachine statemachine = (Statemachine) sourceElement;

		if (StatemachinesUtils.isTopLevel(statemachine)) {
			// For top-level statemachine, get the process statement
			// corresponding to that statemachine.
			Object processStatement = storage
					.fetch("Process Statement " + statemachine.getName());
			if (processStatement == null)
				return false;
			else
				return true;
		} else {
			// For nested statemachine, get the containing state and find the
			// case alternative corresponding to that state.
			State state = (State) statemachine.eContainer();
			Object caseStatementAlternative = storage
					.fetch("Case Statement Alternative " + state.getName());
			if (caseStatementAlternative == null)
				return false;
			else
				return true;
		}
	}
}
