package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.eventb.emf.diagrams.importExport.IRule;
import ac.soton.eventb.emf.diagrams.importExport.TranslationDescriptor;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesUtils;
import ac.soton.eventb.statemachines.Transition;

public class Statemachine_InitialisationRule extends AbstractVHDLRule implements
		IRule {

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.importExport.AbstractRule#enabled(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		assert sourceElement instanceof Transition;
		Transition transition = (Transition) sourceElement;
		AbstractNode source = transition.getSource();
		AbstractNode target = transition.getTarget();
		if (source instanceof Initial && target instanceof State) {
			return true;
		} else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.importExport.AbstractRule#fire(org.eclipse.emf.ecore.EObject, java.util.List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		Transition transition = (Transition) sourceElement;
		
		IVHDLIfClause ifClause = (IVHDLIfClause) storage.fetch("@Initial");
		if (ifClause == null)
			throw new Exception("Dependency KO");

		AbstractNode target = transition.getTarget();
		State targetState = (State) target;
		Statemachine statemachine = (Statemachine) targetState.eContainer();
		VHDLUtils.createSignalAssignmentStatement(ifClause,
				statemachine.getName(), targetState.getName());
		while (!StatemachinesUtils.isTopLevel(statemachine)) {
			targetState = (State) statemachine.eContainer();
			statemachine = (Statemachine) targetState.eContainer();
			VHDLUtils.createSignalAssignmentStatement(ifClause,
					statemachine.getName(), targetState.getName());
		}
		
		return new ArrayList<TranslationDescriptor>();
	}

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.importExport.AbstractRule#dependenciesOK(org.eclipse.emf.ecore.EObject, java.util.List)
	 */
	@Override
	public boolean dependenciesOK(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		Object fetch = storage.fetch("@Initial");
		if (fetch == null)
			return false;
		return true;
	}


}
