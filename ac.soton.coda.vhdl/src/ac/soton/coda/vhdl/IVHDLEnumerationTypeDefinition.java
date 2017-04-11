/*******************************************************************************
 * (c) Crown owned copyright 2015, 2017 (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials  are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This is to identify the UK Ministry of Defence as owners along with the
 * license rights provided.
 *
 * Contributors:
 *     University of Southampton - Initial API and implementation
 *******************************************************************************/

package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLEnumerationTypeDefinition()
 * @model
 * @generated
 */
public interface IVHDLEnumerationTypeDefinition extends IVHDLScalarTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLEnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLEnumerationTypeDefinition_EnumerationLiterals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLEnumerationLiteral> getEnumerationLiterals();

} // IVHDLEnumerationTypeDefinition
