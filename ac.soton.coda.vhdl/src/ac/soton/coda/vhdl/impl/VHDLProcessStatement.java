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

import ac.soton.coda.vhdl.IVHDLPackage;
import ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatementsElement;
import ac.soton.coda.vhdl.IVHDLSignalName;

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
 * An implementation of the model object '<em><b>Process Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLProcessStatement#getSequentialStatements <em>Sequential Statements</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLProcessStatement#getSensitivityList <em>Sensitivity List</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLProcessStatement#getProcessDeclarativeItems <em>Process Declarative Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLProcessStatement extends MinimalEObjectImpl.Container implements IVHDLProcessStatement {
	/**
	 * The cached value of the '{@link #getSequentialStatements() <em>Sequential Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequentialStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLSequentialStatement> sequentialStatements;

	/**
	 * The cached value of the '{@link #getSensitivityList() <em>Sensitivity List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivityList()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLSignalName> sensitivityList;

	/**
	 * The cached value of the '{@link #getProcessDeclarativeItems() <em>Process Declarative Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDeclarativeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLProcessDeclarativeItem> processDeclarativeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLProcessStatement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_PROCESS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLSequentialStatement> getSequentialStatements() {
		if (sequentialStatements == null) {
			sequentialStatements = new EObjectContainmentEList<IVHDLSequentialStatement>(IVHDLSequentialStatement.class, this, IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS);
		}
		return sequentialStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLSignalName> getSensitivityList() {
		if (sensitivityList == null) {
			sensitivityList = new EObjectContainmentEList<IVHDLSignalName>(IVHDLSignalName.class, this, IVHDLPackage.VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST);
		}
		return sensitivityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLProcessDeclarativeItem> getProcessDeclarativeItems() {
		if (processDeclarativeItems == null) {
			processDeclarativeItems = new EObjectContainmentEList<IVHDLProcessDeclarativeItem>(IVHDLProcessDeclarativeItem.class, this, IVHDLPackage.VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS);
		}
		return processDeclarativeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS:
				return ((InternalEList<?>)getSequentialStatements()).basicRemove(otherEnd, msgs);
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST:
				return ((InternalEList<?>)getSensitivityList()).basicRemove(otherEnd, msgs);
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS:
				return ((InternalEList<?>)getProcessDeclarativeItems()).basicRemove(otherEnd, msgs);
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
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS:
				return getSequentialStatements();
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST:
				return getSensitivityList();
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS:
				return getProcessDeclarativeItems();
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
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS:
				getSequentialStatements().clear();
				getSequentialStatements().addAll((Collection<? extends IVHDLSequentialStatement>)newValue);
				return;
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST:
				getSensitivityList().clear();
				getSensitivityList().addAll((Collection<? extends IVHDLSignalName>)newValue);
				return;
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS:
				getProcessDeclarativeItems().clear();
				getProcessDeclarativeItems().addAll((Collection<? extends IVHDLProcessDeclarativeItem>)newValue);
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
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS:
				getSequentialStatements().clear();
				return;
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST:
				getSensitivityList().clear();
				return;
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS:
				getProcessDeclarativeItems().clear();
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
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS:
				return sequentialStatements != null && !sequentialStatements.isEmpty();
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST:
				return sensitivityList != null && !sensitivityList.isEmpty();
			case IVHDLPackage.VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS:
				return processDeclarativeItems != null && !processDeclarativeItems.isEmpty();
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
		if (baseClass == IVHDLSequentialStatementsElement.class) {
			switch (derivedFeatureID) {
				case IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS: return IVHDLPackage.VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS;
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
		if (baseClass == IVHDLSequentialStatementsElement.class) {
			switch (baseFeatureID) {
				case IVHDLPackage.VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS: return IVHDLPackage.VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VHDLProcessStatement
