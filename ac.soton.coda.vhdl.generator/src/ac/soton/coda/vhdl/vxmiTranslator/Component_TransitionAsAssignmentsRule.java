package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Event;

import ac.soton.coda.vhdl.IVHDLGuardedStatementElement;
import ac.soton.emf.translator.IRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.Transition;
import ac.soton.eventb.statemachines.StatemachinesPackage;

public class Component_TransitionAsAssignmentsRule extends AbstractVHDLRule
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
		Transition transition = (Transition) sourceElement;
		EList<OperationAction> actions = transition.getActions();
		EList<OperationGuard> guards = transition.getGuards();
		String booleanExpression = VXMITranslatorUtils
				.operationGuardsToVHDLBooleanExpression(guards);
		EList<DelayedDataPacket> sends = transition.getSends();

		Event event = getCorrespondingEvent(transition);
		if (event == null) {
			// TODO To be implemented
		} else {
			Object fetch = storage.fetch(event.getName());
			if (fetch == null)
				throw new Exception("Dependency KO");
			IVHDLGuardedStatementElement guardedStatementsElement = (IVHDLGuardedStatementElement) fetch;

			// Append the guard
			VXMITranslatorUtils.appendGuard(guardedStatementsElement, booleanExpression);

			// Append the actions
			for (OperationAction action : actions) {
				VXMITranslatorUtils.createSignalAssignmentStatement(
						guardedStatementsElement, action);
			}

			// Append the port sends
			for (DelayedDataPacket send : sends) {
				VXMITranslatorUtils.createSignalAssignmentStatement(
						guardedStatementsElement, send);
			}

		}

		return new ArrayList<TranslationDescriptor>();
	}

	private Event getCorrespondingEvent(Transition transition) {
		EList<Event> elaborates = transition.getElaborates();
		Event event = elaborates.get(0);
		Component component = (Component) transition.eContainer();
		EList<EObject> smTransitions = component.getAllContained(
				StatemachinesPackage.Literals.TRANSITION, true);
		for (EObject smTransition : smTransitions) {
			if (smTransition == null) // TODO Why we have to check for null
										// here.
				continue;
			EList<Event> smEvents = ((ac.soton.eventb.statemachines.Transition) smTransition)
					.getElaborates();
			for (Event smEvent : smEvents) {
				if (smEvent.getName().equals(event.getName())) {
					return event;
				}
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#dependenciesOK(EObject, List)
	 */
	@Override
	public boolean dependenciesOK(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		Transition transition = (Transition) sourceElement;
		Event event = getCorrespondingEvent(transition);
		if (event == null) {
			return true;
		} else {
			Object fetch = storage.fetch(event.getName());
			if (fetch == null)
				return false;
		}
		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
