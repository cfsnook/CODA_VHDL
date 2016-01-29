/**
 */
package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLContextItem;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLLibraryUnit;
import ac.soton.coda.vhdl.IVHDLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLDesignUnit#getContextItems <em>Context Items</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLDesignUnit#getLibraryUnit <em>Library Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VHDLDesignUnit extends MinimalEObjectImpl.Container implements IVHDLDesignUnit {
	/**
	 * The cached value of the '{@link #getContextItems() <em>Context Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextItems()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLContextItem> contextItems;

	/**
	 * The cached value of the '{@link #getLibraryUnit() <em>Library Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryUnit()
	 * @generated
	 * @ordered
	 */
	protected IVHDLLibraryUnit libraryUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLDesignUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_DESIGN_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLContextItem> getContextItems() {
		if (contextItems == null) {
			contextItems = new EObjectContainmentEList<IVHDLContextItem>(IVHDLContextItem.class, this, IVHDLPackage.VHDL_DESIGN_UNIT__CONTEXT_ITEMS);
		}
		return contextItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLLibraryUnit getLibraryUnit() {
		return libraryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibraryUnit(IVHDLLibraryUnit newLibraryUnit, NotificationChain msgs) {
		IVHDLLibraryUnit oldLibraryUnit = libraryUnit;
		libraryUnit = newLibraryUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT, oldLibraryUnit, newLibraryUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryUnit(IVHDLLibraryUnit newLibraryUnit) {
		if (newLibraryUnit != libraryUnit) {
			NotificationChain msgs = null;
			if (libraryUnit != null)
				msgs = ((InternalEObject)libraryUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT, null, msgs);
			if (newLibraryUnit != null)
				msgs = ((InternalEObject)newLibraryUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT, null, msgs);
			msgs = basicSetLibraryUnit(newLibraryUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT, newLibraryUnit, newLibraryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_DESIGN_UNIT__CONTEXT_ITEMS:
				return ((InternalEList<?>)getContextItems()).basicRemove(otherEnd, msgs);
			case IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT:
				return basicSetLibraryUnit(null, msgs);
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
			case IVHDLPackage.VHDL_DESIGN_UNIT__CONTEXT_ITEMS:
				return getContextItems();
			case IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT:
				return getLibraryUnit();
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
			case IVHDLPackage.VHDL_DESIGN_UNIT__CONTEXT_ITEMS:
				getContextItems().clear();
				getContextItems().addAll((Collection<? extends IVHDLContextItem>)newValue);
				return;
			case IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT:
				setLibraryUnit((IVHDLLibraryUnit)newValue);
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
			case IVHDLPackage.VHDL_DESIGN_UNIT__CONTEXT_ITEMS:
				getContextItems().clear();
				return;
			case IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT:
				setLibraryUnit((IVHDLLibraryUnit)null);
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
			case IVHDLPackage.VHDL_DESIGN_UNIT__CONTEXT_ITEMS:
				return contextItems != null && !contextItems.isEmpty();
			case IVHDLPackage.VHDL_DESIGN_UNIT__LIBRARY_UNIT:
				return libraryUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //VHDLDesignUnit
