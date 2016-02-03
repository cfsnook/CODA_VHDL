package ac.soton.coda.vhdl.vxmiTranslator;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.IRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.statemachines.Statemachine;

public class Statemachine_StateUpdateRule extends AbstractVHDLRule implements IRule {

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.importExport.AbstractRule#fire(org.eclipse.emf.ecore.EObject, java.util.List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		IVHDLElsifClause elsifClause = (IVHDLElsifClause) storage.fetch("@RaisingEdge");
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
		Object fetch = storage.fetch("@RaisingEdge");
		if (fetch == null)
			return false;
		return true;
	}

}
