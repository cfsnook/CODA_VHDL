package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;

import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLIfStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatementsElement;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.IRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesUtils;
import ac.soton.eventb.statemachines.Transition;

public class Statemachine_TransitionAsAssignmentsRule extends AbstractVHDLRule
		implements IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ac.soton.eventb.emf.diagrams.importExport.AbstractRule#enabled(org.eclipse
	 * .emf.ecore.EObject)
	 */
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		assert sourceElement instanceof Transition;
		Transition transition = (Transition) sourceElement;
		AbstractNode source = transition.getSource();
		AbstractNode target = transition.getTarget();
		if (source instanceof State && target instanceof State) {
			return true;
		} else {
			return false;
		}
	}

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
		assert sourceElement instanceof Transition;
		Transition transition = (Transition) sourceElement;
		EList<Guard> guards = transition.getGuards();
		String booleanExpression = VXMITranslatorUtils
				.eventBGuardsToVHDLBooleanExpression(guards);
		EList<Action> actions = transition.getActions();

		AbstractNode source = transition.getSource();
		State sourceState = (State) source;
		AbstractNode target = transition.getTarget();
		State targetState = (State) target;

		if (VXMITranslatorUtils.DEBUG) {
			Event event = transition.getElaborates().get(0);
			VXMITranslatorUtils.debug("Transition " + event);
		}
			
		// Get the case statement alternative corresponding to the source state.
		IVHDLCaseStatementAlternative caseStatementAlterative = (IVHDLCaseStatementAlternative) storage
				.fetch("Case Statement Alternative " + sourceState.getName());
		if (caseStatementAlterative == null)
			throw new Exception("Dependency KO");

		EList<IVHDLSequentialStatement> sequentialStatements = caseStatementAlterative
				.getSequentialStatements();

		EList<Event> elaborates = transition.getElaborates();
		Event event = elaborates.get(0);
		IVHDLSequentialStatementsElement sequentialStatementsElement;
		
		if (sequentialStatements.size() == 0) {
			// If there is no sequential statements for the case alternative
			// then create an if statement with an if clause correspond for the
			// transition.
			IVHDLIfStatement ifStatement = VHDLUtils
					.createIfStatement(caseStatementAlterative);
			sequentialStatementsElement = VHDLUtils.createIfClause(ifStatement,
					booleanExpression);
		} else {
			// Otherwise, if there is already a sequential statement for the
			// case alternative, it must be an if statement.
			IVHDLIfStatement ifStatement = (IVHDLIfStatement) sequentialStatements
					.get(0);
			sequentialStatementsElement = VHDLUtils.createElsifClause(
					ifStatement, booleanExpression);
		}
		storage.stash(event.getName(), sequentialStatementsElement);

		// Append the actions
		for (Action action : actions) {
			String assignment = action.getAction();
			String signalAssignment = VXMITranslatorUtils
					.eventBAssignmentToVHDLSignalAssignment(assignment);
			String[] split = signalAssignment.split("<=");
			VHDLUtils.createSignalAssignmentStatement(
					sequentialStatementsElement, split[0], split[1]);
		}
		
		// Entering states: The list of states containing the target state but
		// not the source state.
		List<State> targetContainingStates = StatemachinesUtils
				.getContainingStates(targetState);
		List<State> sourceContainingStates = StatemachinesUtils
				.getContainingStates(sourceState);
		targetContainingStates.removeAll(sourceContainingStates);
		for (State state : targetContainingStates) {
			Statemachine statemachine = (Statemachine) state.eContainer();
			VHDLUtils.createSignalAssignmentStatement(
					sequentialStatementsElement,
					"next_" + statemachine.getName(), state.getName());
		}

		// Leaving statemachines: The list of statemachines containing the
		// source state but not the target state.
		List<Statemachine> sourceContainingStatemachines = StatemachinesUtils
				.getContainingStatemachines(sourceState);
		List<Statemachine> targetContainingStatemachines = StatemachinesUtils
				.getContainingStatemachines(targetState);
		sourceContainingStatemachines.removeAll(targetContainingStatemachines);
		for (Statemachine statemachine : sourceContainingStatemachines) {
			String name = statemachine.getName();
			VHDLUtils
					.createSignalAssignmentStatement(
							sequentialStatementsElement, "next_" + name, name
									+ "_NULL");
		}

		// TODO Have to consider the sub-statemachines of the source and target nodes.
//		EList<EObject> sourceContainedStatemachine = sourceState
//				.getAllContained(StatemachinesPackage.Literals.STATEMACHINE,
//						true);
//
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
		Transition transition = (Transition) sourceElement;
		AbstractNode source = transition.getSource();
		State state = (State) source;

		// Get the case statement alternative corresponding to the source state.
		Object caseStatementAlterative = storage
				.fetch("Case Statement Alternative " + state.getName());
		if (caseStatementAlterative == null)
			return false;
		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
