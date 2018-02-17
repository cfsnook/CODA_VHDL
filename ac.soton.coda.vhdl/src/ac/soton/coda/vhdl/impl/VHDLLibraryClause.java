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

package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLLibraryClause;
import ac.soton.coda.vhdl.IVHDLLogicalName;
import ac.soton.coda.vhdl.IVHDLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLLibraryClause#getLogicalNames <em>Logical Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLLibraryClause extends MinimalEObjectImpl.Container implements IVHDLLibraryClause {
	/**
	 * The cached value of the '{@link #getLogicalNames() <em>Logical Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalNames()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLLogicalName> logicalNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLLibraryClause() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_LIBRARY_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLLogicalName> getLogicalNames() {
		if (logicalNames == null) {
			logicalNames = new EObjectContainmentEList<IVHDLLogicalName>(IVHDLLogicalName.class, this, IVHDLPackage.VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES);
		}
		return logicalNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES:
				return ((InternalEList<?>)getLogicalNames()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IVHDLPackage.VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES:
				return getLogicalNames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IVHDLPackage.VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES:
				getLogicalNames().clear();
				getLogicalNames().addAll((Collection<? extends IVHDLLogicalName>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IVHDLPackage.VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES:
				getLogicalNames().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IVHDLPackage.VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES:
				return logicalNames != null && !logicalNames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VHDLLibraryClause
