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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLAssertionStatement#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLAssertionStatement()
 * @model
 * @generated
 */
public interface IVHDLAssertionStatement extends IVHDLSequentialStatement, IVHDLLabelledElement {
	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(IVHDLAssertion)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLAssertionStatement_Assertion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IVHDLAssertion getAssertion();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLAssertionStatement#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(IVHDLAssertion value);

} // IVHDLAssertionStatement
