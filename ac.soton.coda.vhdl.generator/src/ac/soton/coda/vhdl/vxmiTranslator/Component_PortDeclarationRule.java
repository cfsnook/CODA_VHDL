package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.VHDLMode;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.IRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.util.ComponentsUtils;

public class Component_PortDeclarationRule extends AbstractVHDLRule implements
		IRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractRule#fire(EObject, List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement,
			List<TranslationDescriptor> translatedElements) throws Exception {
		assert sourceElement instanceof Component;
		Component component = (Component) sourceElement;
		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Component - Entity declaration");

		IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) storage
				.fetch("Entity Declaration");
		if (entityDeclaration == null)
			throw new Exception("Dependency KO");

		// Add the ports declaration
		VHDLUtils.createInterfaceSignalDeclaration(entityDeclaration, "clk",
				VHDLMode.IN, "std_logic");
		VHDLUtils.createInterfaceSignalDeclaration(entityDeclaration, "reset",
				VHDLMode.IN, "std_logic");
		Machine mch = (Machine) component
				.getContaining(MachinePackage.Literals.MACHINE);
		Connector[] connectors = ComponentsUtils.getConnectors(mch);
		Connector[] inputConnectors = ComponentsUtils.getInputConnector(
				component, connectors);
		Collection<String> usedTypes = (Collection<String>) storage
				.fetch("@Used Types");
		for (Connector inputConnector : inputConnectors) {
			String type = inputConnector.getType();
			VHDLUtils.createInterfaceSignalDeclaration(entityDeclaration,
					inputConnector.getName(), VHDLMode.IN, type);
			usedTypes.add(type);
		}
		Connector[] outputConnectors = ComponentsUtils.getOutputConnector(
				component, connectors);
		for (Connector outputConnector : outputConnectors) {
			String type = outputConnector.getType();
			VHDLUtils.createInterfaceSignalDeclaration(entityDeclaration,
					outputConnector.getName(), VHDLMode.OUT, type);
			usedTypes.add(type);
		}

		storage.stash("@Port Declaration", "done");
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
		IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) storage
				.fetch("Entity Declaration");
		if (entityDeclaration == null)
			return false;

		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
