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

import ac.soton.coda.vhdl.IVHDLGuardedStatementElement;
import ac.soton.coda.vhdl.IVHDLPackage;
import ac.soton.coda.vhdl.IVHDLSequentialStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatementsElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guarded Statement Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLGuardedStatementElement#getSequentialStatements <em>Sequential Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VHDLGuardedStatementElement extends VHDLBooleanExpressionElement implements IVHDLGuardedStatementElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLGuardedStatementElement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_GUARDED_STATEMENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLSequentialStatement> getSequentialStatements() {
		if (sequentialStatements == null) {
			sequentialStatements = new EObjectContainmentEList<IVHDLSequentialStatement>(IVHDLSequentialStatement.class, this, IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS);
		}
		return sequentialStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS:
				return ((InternalEList<?>)getSequentialStatements()).basicRemove(otherEnd, msgs);
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
			case IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS:
				return getSequentialStatements();
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
			case IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS:
				getSequentialStatements().clear();
				getSequentialStatements().addAll((Collection<? extends IVHDLSequentialStatement>)newValue);
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
			case IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS:
				getSequentialStatements().clear();
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
			case IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS:
				return sequentialStatements != null && !sequentialStatements.isEmpty();
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
				case IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS: return IVHDLPackage.VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS;
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
				case IVHDLPackage.VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS: return IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VHDLGuardedStatementElement
