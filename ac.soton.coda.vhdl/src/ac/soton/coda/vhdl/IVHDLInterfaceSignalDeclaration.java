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
 * A representation of the model object '<em><b>Interface Signal Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#isSignal <em>Signal</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getMode <em>Mode</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getSubtypeIndication <em>Subtype Indication</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLInterfaceSignalDeclaration()
 * @model
 * @generated
 */
public interface IVHDLInterfaceSignalDeclaration extends IVHDLBlockDeclarativeItem, IVHDLIdentifierElement, IVHDLInterfaceElement {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see #isSetSignal()
	 * @see #unsetSignal()
	 * @see #setSignal(boolean)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLInterfaceSignalDeclaration_Signal()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isSignal();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#isSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see #isSetSignal()
	 * @see #unsetSignal()
	 * @see #isSignal()
	 * @generated
	 */
	void setSignal(boolean value);

	/**
	 * Unsets the value of the '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#isSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignal()
	 * @see #isSignal()
	 * @see #setSignal(boolean)
	 * @generated
	 */
	void unsetSignal();

	/**
	 * Returns whether the value of the '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#isSignal <em>Signal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal</em>' attribute is set.
	 * @see #unsetSignal()
	 * @see #isSignal()
	 * @see #setSignal(boolean)
	 * @generated
	 */
	boolean isSetSignal();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ac.soton.coda.vhdl.VHDLMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see ac.soton.coda.vhdl.VHDLMode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(VHDLMode)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLInterfaceSignalDeclaration_Mode()
	 * @model unsettable="true"
	 * @generated
	 */
	VHDLMode getMode();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see ac.soton.coda.vhdl.VHDLMode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(VHDLMode value);

	/**
	 * Unsets the value of the '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(VHDLMode)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(VHDLMode)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Subtype Indication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype Indication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Indication</em>' containment reference.
	 * @see #setSubtypeIndication(IVHDLSubtypeIndication)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLInterfaceSignalDeclaration_SubtypeIndication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IVHDLSubtypeIndication getSubtypeIndication();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getSubtypeIndication <em>Subtype Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype Indication</em>' containment reference.
	 * @see #getSubtypeIndication()
	 * @generated
	 */
	void setSubtypeIndication(IVHDLSubtypeIndication value);

} // IVHDLInterfaceSignalDeclaration
