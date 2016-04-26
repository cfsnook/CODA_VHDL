package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.emf.components.Component;

public class Component_ArchitectureBodyRule extends AbstractVHDLRule implements
		IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#fire(EObject, List)
	 */
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Component;
		Component component = (Component) sourceElement;
		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Component - Architecture body");

		IVHDLDesignUnit designUnit2 = (IVHDLDesignUnit) storage
				.fetch("Design Unit 2");
		if (designUnit2 == null)
			throw new Exception("Dependency KO");

		// Add an architecture body to designUnit2
		IVHDLArchitectureBody architectureBody = VHDLUtils
				.createArchitectureBody(designUnit2, "behaviour",
						component.getName());
		storage.stash("Architecture Body", architectureBody);

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
		IVHDLDesignUnit designUnit2 = (IVHDLDesignUnit) storage
				.fetch("Design Unit 2");
		if (designUnit2 == null)
			return false;

		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
