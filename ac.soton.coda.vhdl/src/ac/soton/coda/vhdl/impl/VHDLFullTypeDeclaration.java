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

package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLFullTypeDeclaration;
import ac.soton.coda.vhdl.IVHDLIdentifierElement;
import ac.soton.coda.vhdl.IVHDLPackage;
import ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLTypeDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLFullTypeDeclaration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLFullTypeDeclaration#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLFullTypeDeclaration extends MinimalEObjectImpl.Container implements IVHDLFullTypeDeclaration {
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
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected IVHDLTypeDefinition typeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLFullTypeDeclaration() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_FULL_TYPE_DECLARATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLTypeDefinition getTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinition(IVHDLTypeDefinition newTypeDefinition, NotificationChain msgs) {
		IVHDLTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION, oldTypeDefinition, newTypeDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(IVHDLTypeDefinition newTypeDefinition) {
		if (newTypeDefinition != typeDefinition) {
			NotificationChain msgs = null;
			if (typeDefinition != null)
				msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION, null, msgs);
			if (newTypeDefinition != null)
				msgs = ((InternalEObject)newTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION, null, msgs);
			msgs = basicSetTypeDefinition(newTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION, newTypeDefinition, newTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION:
				return basicSetTypeDefinition(null, msgs);
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
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__IDENTIFIER:
				return getIdentifier();
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION:
				return getTypeDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION:
				setTypeDefinition((IVHDLTypeDefinition)newValue);
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
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION:
				setTypeDefinition((IVHDLTypeDefinition)null);
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
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION:
				return typeDefinition != null;
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
		if (baseClass == IVHDLBlockDeclarativeItem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IVHDLProcessDeclarativeItem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IVHDLIdentifierElement.class) {
			switch (derivedFeatureID) {
				case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__IDENTIFIER: return IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER;
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
		if (baseClass == IVHDLBlockDeclarativeItem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IVHDLProcessDeclarativeItem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IVHDLIdentifierElement.class) {
			switch (baseFeatureID) {
				case IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER: return IVHDLPackage.VHDL_FULL_TYPE_DECLARATION__IDENTIFIER;
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

} //VHDLFullTypeDeclaration
