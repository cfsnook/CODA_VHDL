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

import ac.soton.coda.vhdl.IVHDLCaseStatement;
import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLExpressionElement;
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
 * An implementation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLCaseStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLCaseStatement#getCaseStatementAlternatives <em>Case Statement Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLCaseStatement extends MinimalEObjectImpl.Container implements IVHDLCaseStatement {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCaseStatementAlternatives() <em>Case Statement Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseStatementAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLCaseStatementAlternative> caseStatementAlternatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLCaseStatement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_CASE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_CASE_STATEMENT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLCaseStatementAlternative> getCaseStatementAlternatives() {
		if (caseStatementAlternatives == null) {
			caseStatementAlternatives = new EObjectContainmentEList<IVHDLCaseStatementAlternative>(IVHDLCaseStatementAlternative.class, this, IVHDLPackage.VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES);
		}
		return caseStatementAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
				return ((InternalEList<?>)getCaseStatementAlternatives()).basicRemove(otherEnd, msgs);
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
			case IVHDLPackage.VHDL_CASE_STATEMENT__EXPRESSION:
				return getExpression();
			case IVHDLPackage.VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
				return getCaseStatementAlternatives();
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
			case IVHDLPackage.VHDL_CASE_STATEMENT__EXPRESSION:
				setExpression((String)newValue);
				return;
			case IVHDLPackage.VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
				getCaseStatementAlternatives().clear();
				getCaseStatementAlternatives().addAll((Collection<? extends IVHDLCaseStatementAlternative>)newValue);
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
			case IVHDLPackage.VHDL_CASE_STATEMENT__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case IVHDLPackage.VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
				getCaseStatementAlternatives().clear();
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
			case IVHDLPackage.VHDL_CASE_STATEMENT__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case IVHDLPackage.VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
				return caseStatementAlternatives != null && !caseStatementAlternatives.isEmpty();
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
		if (baseClass == IVHDLExpressionElement.class) {
			switch (derivedFeatureID) {
				case IVHDLPackage.VHDL_CASE_STATEMENT__EXPRESSION: return IVHDLPackage.VHDL_EXPRESSION_ELEMENT__EXPRESSION;
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
		if (baseClass == IVHDLExpressionElement.class) {
			switch (baseFeatureID) {
				case IVHDLPackage.VHDL_EXPRESSION_ELEMENT__EXPRESSION: return IVHDLPackage.VHDL_CASE_STATEMENT__EXPRESSION;
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //VHDLCaseStatement
