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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Statements Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLSequentialStatementsElement#getSequentialStatements <em>Sequential Statements</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLSequentialStatementsElement()
 * @model abstract="true"
 * @generated
 */
public interface IVHDLSequentialStatementsElement extends IVHDLEObject {
	/**
	 * Returns the value of the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLSequentialStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential Statements</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLSequentialStatementsElement_SequentialStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLSequentialStatement> getSequentialStatements();

} // IVHDLSequentialStatementsElement
