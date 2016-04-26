package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.emf.components.Component;

public class Component_FileCreationRule extends AbstractVHDLRule implements
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
		assert sourceElement instanceof Component;
		Component component = (Component) sourceElement;
		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Component - File creation");

		// Reset the storage
		storage.reset();

		// Create the design file
		IVHDLDesignFile designFile = VHDLUtils.createDesignFile(component
				.getName());

		// Create the design unit 1
		IVHDLDesignUnit designUnit1 = VHDLUtils.createDesignUnit(designFile);
		storage.stash("Design Unit 1", designUnit1);

		// Create the design unit 2
		IVHDLDesignUnit designUnit2 = VHDLUtils.createDesignUnit(designFile);
		storage.stash("Design Unit 2", designUnit2);

		// Create the collection of used types
		Collection<String> usedTypes = new HashSet<String>();
		storage.stash("@Used Types", usedTypes);
		
		List<TranslationDescriptor> result = new ArrayList<TranslationDescriptor>();
		result.add(new TranslationDescriptor(null, null, designFile));
		return result;
	}

}
