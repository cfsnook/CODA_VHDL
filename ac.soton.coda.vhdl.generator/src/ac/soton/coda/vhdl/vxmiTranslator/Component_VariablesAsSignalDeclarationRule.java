package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ast.Type;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.persistence.EventBEMFUtils;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentVariable;
import ac.soton.eventb.emf.diagrams.importExport.IRule;
import ac.soton.eventb.emf.diagrams.importExport.TranslationDescriptor;
import ch.ethz.eventb.utils.EventBSCUtils;

public class Component_VariablesAsSignalDeclarationRule extends
		AbstractVHDLRule implements IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#fire(EObject, List)
	 */
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Component;
		Component component = (Component) sourceElement;

		IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) storage
				.fetch("Architecture Body");
		if (architectureBody == null)
			throw new Exception("Dependency KO");

		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils
					.debug("Component: Variables as signal declaration");

		Machine mch = (Machine) component
				.getContaining(MachinePackage.Literals.MACHINE);
		IMachineRoot mchRoot = EventBEMFUtils.getRoot(mch);
		EList<ComponentVariable> variables = component.getVariables();
		Collection<String> usedTypes = (Collection<String>) storage.fetch("@Used Types");
		for (ComponentVariable variable : variables) {
			String identifier = variable.getName();
			Type type = EventBSCUtils.getVariableType(mchRoot, identifier);
			String vhdlType = VXMITranslatorUtils.eventBTypeToVHDLType(type);
			VHDLUtils.createInterfaceSignalDeclaration(architectureBody,
					identifier, null, vhdlType);
			usedTypes.add(vhdlType);
		}

		// Mark the translation of variables is finished.
		storage.stash("@Variables", "done");
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
