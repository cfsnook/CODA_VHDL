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

package ac.soton.coda.vhdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLFullTypeDeclaration#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLFullTypeDeclaration()
 * @model
 * @generated
 */
public interface IVHDLFullTypeDeclaration extends IVHDLTypeDeclaration, IVHDLIdentifierElement {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference.
	 * @see #setTypeDefinition(IVHDLTypeDefinition)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLFullTypeDeclaration_TypeDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IVHDLTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLFullTypeDeclaration#getTypeDefinition <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' containment reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(IVHDLTypeDefinition value);

} // IVHDLFullTypeDeclaration
