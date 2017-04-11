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
 * A representation of the model object '<em><b>Use Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLUseClause#getSelectedNames <em>Selected Names</em>}</li>
 * </ul>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLUseClause()
 * @model
 * @generated
 */
public interface IVHDLUseClause extends IVHDLContextItem {
	/**
	 * Returns the value of the '<em><b>Selected Names</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLSelectedName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Names</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLUseClause_SelectedNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLSelectedName> getSelectedNames();

} // IVHDLUseClause
