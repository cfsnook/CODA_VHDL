/**
 */
package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLBooleanExpressionElement;
import ac.soton.coda.vhdl.IVHDLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLBooleanExpressionElement#getBooleanExpression <em>Boolean Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VHDLBooleanExpressionElement extends MinimalEObjectImpl.Container implements IVHDLBooleanExpressionElement {
	/**
	 * The default value of the '{@link #getBooleanExpression() <em>Boolean Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOLEAN_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooleanExpression() <em>Boolean Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanExpression()
	 * @generated
	 * @ordered
	 */
	protected String booleanExpression = BOOLEAN_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLBooleanExpressionElement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_BOOLEAN_EXPRESSION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBooleanExpression() {
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanExpression(String newBooleanExpression) {
		String oldBooleanExpression = booleanExpression;
		booleanExpression = newBooleanExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION, oldBooleanExpression, booleanExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IVHDLPackage.VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION:
				return getBooleanExpression();
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
			case IVHDLPackage.VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION:
				setBooleanExpression((String)newValue);
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
			case IVHDLPackage.VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION:
				setBooleanExpression(BOOLEAN_EXPRESSION_EDEFAULT);
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
			case IVHDLPackage.VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION:
				return BOOLEAN_EXPRESSION_EDEFAULT == null ? booleanExpression != null : !BOOLEAN_EXPRESSION_EDEFAULT.equals(booleanExpression);
		}
		return super.eIsSet(featureID);
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
		result.append(" (booleanExpression: ");
		result.append(booleanExpression);
		result.append(')');
		return result.toString();
	}

} //VHDLBooleanExpressionElement
