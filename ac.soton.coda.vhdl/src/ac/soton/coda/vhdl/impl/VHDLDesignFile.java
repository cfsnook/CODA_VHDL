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

import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLDesignFile#getDesignUnits <em>Design Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLDesignFile extends VHDLLabelledElement implements IVHDLDesignFile {
	/**
	 * The cached value of the '{@link #getDesignUnits() <em>Design Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLDesignUnit> designUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLDesignFile() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_DESIGN_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLDesignUnit> getDesignUnits() {
		if (designUnits == null) {
			designUnits = new EObjectContainmentEList<IVHDLDesignUnit>(IVHDLDesignUnit.class, this, IVHDLPackage.VHDL_DESIGN_FILE__DESIGN_UNITS);
		}
		return designUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_DESIGN_FILE__DESIGN_UNITS:
				return ((InternalEList<?>)getDesignUnits()).basicRemove(otherEnd, msgs);
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
			case IVHDLPackage.VHDL_DESIGN_FILE__DESIGN_UNITS:
				return getDesignUnits();
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
			case IVHDLPackage.VHDL_DESIGN_FILE__DESIGN_UNITS:
				getDesignUnits().clear();
				getDesignUnits().addAll((Collection<? extends IVHDLDesignUnit>)newValue);
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
			case IVHDLPackage.VHDL_DESIGN_FILE__DESIGN_UNITS:
				getDesignUnits().clear();
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
			case IVHDLPackage.VHDL_DESIGN_FILE__DESIGN_UNITS:
				return designUnits != null && !designUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VHDLDesignFile
