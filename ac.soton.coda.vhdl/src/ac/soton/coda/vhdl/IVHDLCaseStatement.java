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
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLCaseStatement#getCaseStatementAlternatives <em>Case Statement Alternatives</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLCaseStatement()
 * @model
 * @generated
 */
public interface IVHDLCaseStatement extends IVHDLSequentialStatement, IVHDLExpressionElement {
	/**
	 * Returns the value of the '<em><b>Case Statement Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLCaseStatementAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Statement Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Statement Alternatives</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLCaseStatement_CaseStatementAlternatives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLCaseStatementAlternative> getCaseStatementAlternatives();

} // IVHDLCaseStatement
