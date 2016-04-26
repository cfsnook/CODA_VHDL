package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesUtils;

public class Statemachine_ProcessDeclarationRule extends AbstractVHDLRule implements IRule {

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
		assert sourceElement instanceof Statemachine;
		Statemachine statemachine = (Statemachine) sourceElement;

		IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) storage
				.fetch("Architecture Body");
		if (architectureBody == null)
			throw new Exception("Dependency KO");

		if (VXMITranslatorUtils.DEBUG)
			VXMITranslatorUtils.debug("Statemachine: Process");

		if (!StatemachinesUtils.isTopLevel(statemachine))
			return new ArrayList<TranslationDescriptor>();

		Collection<String> signals = new ArrayList<String>();
		String name = statemachine.getName();
		signals.add("current_" + name);

		Component component = (Component) statemachine
				.getContaining(ComponentsPackage.Literals.COMPONENT);
		Machine mch = (Machine) component
				.getContaining(MachinePackage.Literals.MACHINE);
		Connector[] connectors = ComponentsUtils.getConnectors(mch);
		Connector[] inputConnectors = ComponentsUtils.getInputConnector(
				component, connectors);
		for (Connector inputConnector : inputConnectors) {
			signals.add(inputConnector.getName());
		}

		IVHDLProcessStatement processStatement = VHDLUtils
				.createProcessStatement(architectureBody,
						signals.toArray(new String[signals.size()]));
		storage.stash("Process Statement " + name, processStatement);
		
		return new ArrayList<TranslationDescriptor>();
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
		IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) storage
				.fetch("Architecture Body");
		if (architectureBody == null)
			return false;
		// TODO Auto-generated method stub
		return super.dependenciesOK(sourceElement, translatedElements);
	}

}
