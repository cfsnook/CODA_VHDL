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

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLConcurrentStatement;
import ac.soton.coda.vhdl.IVHDLIdentifierElement;
import ac.soton.coda.vhdl.IVHDLNamedElement;
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
 * An implementation of the model object '<em><b>Architecture Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLArchitectureBody#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLArchitectureBody#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLArchitectureBody#getBlockDeclarativeItems <em>Block Declarative Items</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLArchitectureBody#getConcurrentStatements <em>Concurrent Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLArchitectureBody extends MinimalEObjectImpl.Container implements IVHDLArchitectureBody {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlockDeclarativeItems() <em>Block Declarative Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDeclarativeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLBlockDeclarativeItem> blockDeclarativeItems;

	/**
	 * The cached value of the '{@link #getConcurrentStatements() <em>Concurrent Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLConcurrentStatement> concurrentStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLArchitectureBody() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_ARCHITECTURE_BODY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_ARCHITECTURE_BODY__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_ARCHITECTURE_BODY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLBlockDeclarativeItem> getBlockDeclarativeItems() {
		if (blockDeclarativeItems == null) {
			blockDeclarativeItems = new EObjectContainmentEList<IVHDLBlockDeclarativeItem>(IVHDLBlockDeclarativeItem.class, this, IVHDLPackage.VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS);
		}
		return blockDeclarativeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLConcurrentStatement> getConcurrentStatements() {
		if (concurrentStatements == null) {
			concurrentStatements = new EObjectContainmentEList<IVHDLConcurrentStatement>(IVHDLConcurrentStatement.class, this, IVHDLPackage.VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS);
		}
		return concurrentStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS:
				return ((InternalEList<?>)getBlockDeclarativeItems()).basicRemove(otherEnd, msgs);
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS:
				return ((InternalEList<?>)getConcurrentStatements()).basicRemove(otherEnd, msgs);
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
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__IDENTIFIER:
				return getIdentifier();
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__NAME:
				return getName();
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS:
				return getBlockDeclarativeItems();
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS:
				return getConcurrentStatements();
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
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__NAME:
				setName((String)newValue);
				return;
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS:
				getBlockDeclarativeItems().clear();
				getBlockDeclarativeItems().addAll((Collection<? extends IVHDLBlockDeclarativeItem>)newValue);
				return;
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS:
				getConcurrentStatements().clear();
				getConcurrentStatements().addAll((Collection<? extends IVHDLConcurrentStatement>)newValue);
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
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS:
				getBlockDeclarativeItems().clear();
				return;
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS:
				getConcurrentStatements().clear();
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
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS:
				return blockDeclarativeItems != null && !blockDeclarativeItems.isEmpty();
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS:
				return concurrentStatements != null && !concurrentStatements.isEmpty();
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
				case IVHDLPackage.VHDL_ARCHITECTURE_BODY__IDENTIFIER: return IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == IVHDLNamedElement.class) {
			switch (derivedFeatureID) {
				case IVHDLPackage.VHDL_ARCHITECTURE_BODY__NAME: return IVHDLPackage.VHDL_NAMED_ELEMENT__NAME;
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
				case IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER: return IVHDLPackage.VHDL_ARCHITECTURE_BODY__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == IVHDLNamedElement.class) {
			switch (baseFeatureID) {
				case IVHDLPackage.VHDL_NAMED_ELEMENT__NAME: return IVHDLPackage.VHDL_ARCHITECTURE_BODY__NAME;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VHDLArchitectureBody
