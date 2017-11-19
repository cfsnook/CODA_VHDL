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

import ac.soton.coda.vhdl.IVHDLElseClause;
import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLIfStatement;
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
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLIfStatement#getIfClause <em>If Clause</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLIfStatement#getElsifClauses <em>Elsif Clauses</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLIfStatement#getElseClause <em>Else Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHDLIfStatement extends MinimalEObjectImpl.Container implements IVHDLIfStatement {
	/**
	 * The cached value of the '{@link #getIfClause() <em>If Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfClause()
	 * @generated
	 * @ordered
	 */
	protected IVHDLIfClause ifClause;

	/**
	 * The cached value of the '{@link #getElsifClauses() <em>Elsif Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsifClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<IVHDLElsifClause> elsifClauses;

	/**
	 * The cached value of the '{@link #getElseClause() <em>Else Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseClause()
	 * @generated
	 * @ordered
	 */
	protected IVHDLElseClause elseClause;

	/**
	 * This is true if the Else Clause containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elseClauseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLIfStatement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLIfClause getIfClause() {
		return ifClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfClause(IVHDLIfClause newIfClause, NotificationChain msgs) {
		IVHDLIfClause oldIfClause = ifClause;
		ifClause = newIfClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE, oldIfClause, newIfClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfClause(IVHDLIfClause newIfClause) {
		if (newIfClause != ifClause) {
			NotificationChain msgs = null;
			if (ifClause != null)
				msgs = ((InternalEObject)ifClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE, null, msgs);
			if (newIfClause != null)
				msgs = ((InternalEObject)newIfClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE, null, msgs);
			msgs = basicSetIfClause(newIfClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE, newIfClause, newIfClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVHDLElsifClause> getElsifClauses() {
		if (elsifClauses == null) {
			elsifClauses = new EObjectContainmentEList<IVHDLElsifClause>(IVHDLElsifClause.class, this, IVHDLPackage.VHDL_IF_STATEMENT__ELSIF_CLAUSES);
		}
		return elsifClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLElseClause getElseClause() {
		return elseClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseClause(IVHDLElseClause newElseClause, NotificationChain msgs) {
		IVHDLElseClause oldElseClause = elseClause;
		elseClause = newElseClause;
		boolean oldElseClauseESet = elseClauseESet;
		elseClauseESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE, oldElseClause, newElseClause, !oldElseClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseClause(IVHDLElseClause newElseClause) {
		if (newElseClause != elseClause) {
			NotificationChain msgs = null;
			if (elseClause != null)
				msgs = ((InternalEObject)elseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE, null, msgs);
			if (newElseClause != null)
				msgs = ((InternalEObject)newElseClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE, null, msgs);
			msgs = basicSetElseClause(newElseClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElseClauseESet = elseClauseESet;
			elseClauseESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE, newElseClause, newElseClause, !oldElseClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetElseClause(NotificationChain msgs) {
		IVHDLElseClause oldElseClause = elseClause;
		elseClause = null;
		boolean oldElseClauseESet = elseClauseESet;
		elseClauseESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE, oldElseClause, null, oldElseClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElseClause() {
		if (elseClause != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)elseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE, null, msgs);
			msgs = basicUnsetElseClause(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldElseClauseESet = elseClauseESet;
			elseClauseESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE, null, null, oldElseClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElseClause() {
		return elseClauseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE:
				return basicSetIfClause(null, msgs);
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSIF_CLAUSES:
				return ((InternalEList<?>)getElsifClauses()).basicRemove(otherEnd, msgs);
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE:
				return basicUnsetElseClause(msgs);
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
			case IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE:
				return getIfClause();
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSIF_CLAUSES:
				return getElsifClauses();
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE:
				return getElseClause();
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
			case IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE:
				setIfClause((IVHDLIfClause)newValue);
				return;
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSIF_CLAUSES:
				getElsifClauses().clear();
				getElsifClauses().addAll((Collection<? extends IVHDLElsifClause>)newValue);
				return;
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE:
				setElseClause((IVHDLElseClause)newValue);
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
			case IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE:
				setIfClause((IVHDLIfClause)null);
				return;
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSIF_CLAUSES:
				getElsifClauses().clear();
				return;
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE:
				unsetElseClause();
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
			case IVHDLPackage.VHDL_IF_STATEMENT__IF_CLAUSE:
				return ifClause != null;
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSIF_CLAUSES:
				return elsifClauses != null && !elsifClauses.isEmpty();
			case IVHDLPackage.VHDL_IF_STATEMENT__ELSE_CLAUSE:
				return isSetElseClause();
		}
		return super.eIsSet(featureID);
	}

} //VHDLIfStatement
