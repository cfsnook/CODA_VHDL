/*******************************************************************************
 * (c) Crown owned copyright (2017) (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      University of Southampton - Initial API and implementation
 *******************************************************************************/
package ac.soton.coda.vhdl.vxmiTranslator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.DefaultAdapter;
import ac.soton.emf.translator.configuration.IAdapter;

public class VXMITranslator extends DefaultAdapter implements IAdapter {

	public VXMITranslator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.importExport.DefaultAdapter#getComponentURI(ac.soton.eventb.emf.diagrams.importExport.TranslationDescriptor, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public URI getComponentURI(TranslationDescriptor translationDescriptor,
			EObject rootElement) {
		if (translationDescriptor.value instanceof IVHDLDesignFile) {
			IVHDLDesignFile designFile = (IVHDLDesignFile) translationDescriptor.value;
			URI uri = EcoreUtil.getURI(rootElement);
			uri = uri.trimFragment().trimSegments(1);
			uri = uri.appendSegment("VHDL");
			uri = uri.appendSegment(designFile.getLabel() + ".vxmi");
			return uri;
		}
		return super.getComponentURI(translationDescriptor, rootElement);
	}

}
