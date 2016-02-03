/**
 */
package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLPackage;
import ac.soton.coda.vhdl.IVHDLSelectedName;
import ac.soton.coda.vhdl.IVHDLUseClause;

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
 * An implementation of the model object '<em><b>Use Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLUseClause#getSelectedNames <em>Selected Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VHDLUseClause extends MinimalEObjectImpl.Container implements IVHDLUseClause {
	/**
	 * The cached value of the '{@link #getSelectedNames() <em>Selected Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedNames()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLSelectedName> selectedNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLUseClause() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_USE_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLSelectedName> getSelectedNames() {
		if (selectedNames == null) {
			selectedNames = new EObjectContainmentEList<IVHDLSelectedName>(IVHDLSelectedName.class, this, IVHDLPackage.VHDL_USE_CLAUSE__SELECTED_NAMES);
		}
		return selectedNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_USE_CLAUSE__SELECTED_NAMES:
				return ((InternalEList<?>)getSelectedNames()).basicRemove(otherEnd, msgs);
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
			case IVHDLPackage.VHDL_USE_CLAUSE__SELECTED_NAMES:
				return getSelectedNames();
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
			case IVHDLPackage.VHDL_USE_CLAUSE__SELECTED_NAMES:
				getSelectedNames().clear();
				getSelectedNames().addAll((Collection<? extends IVHDLSelectedName>)newValue);
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
			case IVHDLPackage.VHDL_USE_CLAUSE__SELECTED_NAMES:
				getSelectedNames().clear();
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
			case IVHDLPackage.VHDL_USE_CLAUSE__SELECTED_NAMES:
				return selectedNames != null && !selectedNames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VHDLUseClause
