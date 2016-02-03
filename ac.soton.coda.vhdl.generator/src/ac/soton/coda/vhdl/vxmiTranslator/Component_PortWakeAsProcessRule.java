package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Event;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLGuardedStatementElement;
import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLIfStatement;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.IRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.statemachines.StatemachinesPackage;

public class Component_PortWakeAsProcessRule extends AbstractVHDLRule implements
		IRule {

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
		PortWake portWake = (PortWake) sourceElement;
		EList<OperationGuard> guards = portWake.getGuards();
		String booleanExpression = VXMITranslatorUtils
				.operationGuardsToVHDLBooleanExpression(guards);
		booleanExpression = VXMITranslatorUtils.fixPortWakeGuards(portWake, booleanExpression);
		EList<OperationAction> actions = portWake.getActions();
		EList<DataPacket> receives = portWake.getReceives();
		EList<DelayedDataPacket> sends = portWake.getSends();

		Event event = getCorrespondingEvent(portWake);
		if (event == null) {
			IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) storage
					.fetch("Architecture Body");
			if (architectureBody == null)
				throw new Exception("Dependency KO");
			List<String> dataPackets = new ArrayList<String>();
			for (DataPacket receive : receives) {
				dataPackets.add(receive.getConnector().getName());
			}
			IVHDLProcessStatement processStatement = VHDLUtils
					.createProcessStatement(architectureBody,
							dataPackets.toArray(new String[dataPackets.size()]));
			IVHDLIfStatement ifStatement = VHDLUtils
					.createIfStatement(processStatement);
			IVHDLIfClause ifClause = VHDLUtils.createIfClause(ifStatement,
					booleanExpression);
			for (OperationAction action : actions) {
				VXMITranslatorUtils.createSignalAssignmentStatement(ifClause,
						action);
			}
			for (DelayedDataPacket send : sends) {
				VXMITranslatorUtils.createSignalAssignmentStatement(ifClause,
						send);
			}
		} else {
			Object fetch = storage.fetch(event.getName());
			if (fetch == null)
				throw new Exception("Dependency KO");

			IVHDLGuardedStatementElement guardedStatementElement = (IVHDLGuardedStatementElement) fetch;
			VXMITranslatorUtils.appendGuard(guardedStatementElement,
					booleanExpression);
			for (OperationAction action : actions) {
				VXMITranslatorUtils.createSignalAssignmentStatement(
						guardedStatementElement, action);
			}
			for (DelayedDataPacket send : sends) {
				VXMITranslatorUtils.createSignalAssignmentStatement(
						guardedStatementElement, send);
			}

		}
		return super.fire(sourceElement, translatedElements);
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
		PortWake portWake = (PortWake) sourceElement;
		Event event = getCorrespondingEvent(portWake);
		if (event == null) {
			Object fetch = storage.fetch("Architecture Body");
			if (fetch == null)
				return false;
			return true;
		} else {
			Object fetch = storage.fetch(event.getName());
			if (fetch == null)
				return false;
			return true;
		}
	}

	private Event getCorrespondingEvent(PortWake portWake) {
		EList<Event> elaborates = portWake.getElaborates();
		Event event = elaborates.get(0);
		Component component = (Component) portWake.eContainer();
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

}
