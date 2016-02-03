package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.IRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.statemachines.Statemachine;

public class Statemachine_StateVariableAsSignalDeclarationRule extends
		AbstractVHDLRule implements IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#fire(EObject, List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Statemachine;
		Statemachine statemachine = (Statemachine) sourceElement;

		IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) storage
				.fetch("Architecture Body");
		if (architectureBody == null)
			throw new Exception("Dependency KO");

		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Statemachine: Signal Declaration");

		String name = statemachine.getName();
		VHDLUtils.createInterfaceSignalDeclaration(architectureBody, "current_"
				+ name, null, name + "_STATES");
		VHDLUtils.createInterfaceSignalDeclaration(architectureBody, "next_"
				+ name, null, name + "_STATES");

		return new ArrayList<TranslationDescriptor>();
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
