package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.emf.components.Component;

public class Component_EntityDeclarationRule extends AbstractVHDLRule implements
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
			VXMITranslatorUtils.debug("Component - Entity declaration");

		IVHDLDesignUnit designUnit1 = (IVHDLDesignUnit) storage
				.fetch("Design Unit 1");
		if (designUnit1 == null)
			throw new Exception("Dependency KO");

		// Add entity declaration to designUnit1
		IVHDLEntityDeclaration entityDeclaration = VHDLUtils
				.createEntityDeclaration(designUnit1, component.getName());
		storage.stash("Entity Declaration", entityDeclaration);

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
		IVHDLDesignUnit designUnit1 = (IVHDLDesignUnit) storage
				.fetch("Design Unit 1");
		if (designUnit1 == null)
			return false;

		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
