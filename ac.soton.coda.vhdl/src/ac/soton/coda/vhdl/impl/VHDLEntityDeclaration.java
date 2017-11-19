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

import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLIdentifierElement;
import ac.soton.coda.vhdl.IVHDLInterfaceList;
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
 * An implementation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLEntityDeclaration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLEntityDeclaration#getPortInterfaceList <em>Port Interface List</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLEntityDeclaration#getEntityDeclarativeItems <em>Entity Declarative Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLEntityDeclaration extends MinimalEObjectImpl.Container implements IVHDLEntityDeclaration {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortInterfaceList() <em>Port Interface List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInterfaceList()
	 * @generated
	 * @ordered
	 */
	protected IVHDLInterfaceList portInterfaceList;

	/**
	 * This is true if the Port Interface List containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portInterfaceListESet;

	/**
	 * The cached value of the '{@link #getEntityDeclarativeItems() <em>Entity Declarative Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityDeclarativeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLEntityDeclarativeItem> entityDeclarativeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLEntityDeclaration() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_ENTITY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_ENTITY_DECLARATION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLInterfaceList getPortInterfaceList() {
		return portInterfaceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortInterfaceList(IVHDLInterfaceList newPortInterfaceList, NotificationChain msgs) {
		IVHDLInterfaceList oldPortInterfaceList = portInterfaceList;
		portInterfaceList = newPortInterfaceList;
		boolean oldPortInterfaceListESet = portInterfaceListESet;
		portInterfaceListESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST, oldPortInterfaceList, newPortInterfaceList, !oldPortInterfaceListESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortInterfaceList(IVHDLInterfaceList newPortInterfaceList) {
		if (newPortInterfaceList != portInterfaceList) {
			NotificationChain msgs = null;
			if (portInterfaceList != null)
				msgs = ((InternalEObject)portInterfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST, null, msgs);
			if (newPortInterfaceList != null)
				msgs = ((InternalEObject)newPortInterfaceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST, null, msgs);
			msgs = basicSetPortInterfaceList(newPortInterfaceList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPortInterfaceListESet = portInterfaceListESet;
			portInterfaceListESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST, newPortInterfaceList, newPortInterfaceList, !oldPortInterfaceListESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPortInterfaceList(NotificationChain msgs) {
		IVHDLInterfaceList oldPortInterfaceList = portInterfaceList;
		portInterfaceList = null;
		boolean oldPortInterfaceListESet = portInterfaceListESet;
		portInterfaceListESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST, oldPortInterfaceList, null, oldPortInterfaceListESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPortInterfaceList() {
		if (portInterfaceList != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)portInterfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST, null, msgs);
			msgs = basicUnsetPortInterfaceList(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPortInterfaceListESet = portInterfaceListESet;
			portInterfaceListESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST, null, null, oldPortInterfaceListESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortInterfaceList() {
		return portInterfaceListESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLEntityDeclarativeItem> getEntityDeclarativeItems() {
		if (entityDeclarativeItems == null) {
			entityDeclarativeItems = new EObjectContainmentEList<IVHDLEntityDeclarativeItem>(IVHDLEntityDeclarativeItem.class, this, IVHDLPackage.VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS);
		}
		return entityDeclarativeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST:
				return basicUnsetPortInterfaceList(msgs);
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS:
				return ((InternalEList<?>)getEntityDeclarativeItems()).basicRemove(otherEnd, msgs);
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
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__IDENTIFIER:
				return getIdentifier();
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST:
				return getPortInterfaceList();
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS:
				return getEntityDeclarativeItems();
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
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST:
				setPortInterfaceList((IVHDLInterfaceList)newValue);
				return;
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS:
				getEntityDeclarativeItems().clear();
				getEntityDeclarativeItems().addAll((Collection<? extends IVHDLEntityDeclarativeItem>)newValue);
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
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST:
				unsetPortInterfaceList();
				return;
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS:
				getEntityDeclarativeItems().clear();
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
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST:
				return isSetPortInterfaceList();
			case IVHDLPackage.VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS:
				return entityDeclarativeItems != null && !entityDeclarativeItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IVHDLIdentifierElement.class) {
			switch (derivedFeatureID) {
				case IVHDLPackage.VHDL_ENTITY_DECLARATION__IDENTIFIER: return IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IVHDLIdentifierElement.class) {
			switch (baseFeatureID) {
				case IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER: return IVHDLPackage.VHDL_ENTITY_DECLARATION__IDENTIFIER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //VHDLEntityDeclaration
