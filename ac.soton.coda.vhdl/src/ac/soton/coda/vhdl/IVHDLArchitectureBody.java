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
 * A representation of the model object '<em><b>Architecture Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLArchitectureBody#getBlockDeclarativeItems <em>Block Declarative Items</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLArchitectureBody#getConcurrentStatements <em>Concurrent Statements</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLArchitectureBody()
 * @model
 * @generated
 */
public interface IVHDLArchitectureBody extends IVHDLSecondaryUnit, IVHDLIdentifierElement, IVHDLNamedElement {
	/**
	 * Returns the value of the '<em><b>Block Declarative Items</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Declarative Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Declarative Items</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLArchitectureBody_BlockDeclarativeItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLBlockDeclarativeItem> getBlockDeclarativeItems();

	/**
	 * Returns the value of the '<em><b>Concurrent Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLConcurrentStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent Statements</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLArchitectureBody_ConcurrentStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLConcurrentStatement> getConcurrentStatements();

} // IVHDLArchitectureBody
