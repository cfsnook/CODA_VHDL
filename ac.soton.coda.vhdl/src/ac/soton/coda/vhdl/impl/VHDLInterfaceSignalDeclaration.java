/**
 */
package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLIdentifierElement;
import ac.soton.coda.vhdl.IVHDLInterfaceElement;
import ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration;
import ac.soton.coda.vhdl.IVHDLPackage;
import ac.soton.coda.vhdl.IVHDLSubtypeIndication;
import ac.soton.coda.vhdl.VHDLMode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Signal Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration#isSignal <em>Signal</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration#getMode <em>Mode</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration#getSubtypeIndication <em>Subtype Indication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VHDLInterfaceSignalDeclaration extends MinimalEObjectImpl.Container implements IVHDLInterfaceSignalDeclaration {
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
	 * The default value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected boolean signal = SIGNAL_EDEFAULT;

	/**
	 * This is true if the Signal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalESet;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final VHDLMode MODE_EDEFAULT = VHDLMode.IN;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected VHDLMode mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The cached value of the '{@link #getSubtypeIndication() <em>Subtype Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeIndication()
	 * @generated
	 * @ordered
	 */
	protected IVHDLSubtypeIndication subtypeIndication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLInterfaceSignalDeclaration() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IVHDLPackage.Literals.VHDL_INTERFACE_SIGNAL_DECLARATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(boolean newSignal) {
		boolean oldSignal = signal;
		signal = newSignal;
		boolean oldSignalESet = signalESet;
		signalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL, oldSignal, signal, !oldSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignal() {
		boolean oldSignal = signal;
		boolean oldSignalESet = signalESet;
		signal = SIGNAL_EDEFAULT;
		signalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL, oldSignal, SIGNAL_EDEFAULT, oldSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignal() {
		return signalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(VHDLMode newMode) {
		VHDLMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		VHDLMode oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLSubtypeIndication getSubtypeIndication() {
		return subtypeIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtypeIndication(IVHDLSubtypeIndication newSubtypeIndication, NotificationChain msgs) {
		IVHDLSubtypeIndication oldSubtypeIndication = subtypeIndication;
		subtypeIndication = newSubtypeIndication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION, oldSubtypeIndication, newSubtypeIndication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypeIndication(IVHDLSubtypeIndication newSubtypeIndication) {
		if (newSubtypeIndication != subtypeIndication) {
			NotificationChain msgs = null;
			if (subtypeIndication != null)
				msgs = ((InternalEObject)subtypeIndication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION, null, msgs);
			if (newSubtypeIndication != null)
				msgs = ((InternalEObject)newSubtypeIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION, null, msgs);
			msgs = basicSetSubtypeIndication(newSubtypeIndication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION, newSubtypeIndication, newSubtypeIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION:
				return basicSetSubtypeIndication(null, msgs);
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
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER:
				return getIdentifier();
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL:
				return isSignal();
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__MODE:
				return getMode();
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION:
				return getSubtypeIndication();
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
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL:
				setSignal((Boolean)newValue);
				return;
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__MODE:
				setMode((VHDLMode)newValue);
				return;
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION:
				setSubtypeIndication((IVHDLSubtypeIndication)newValue);
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
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL:
				unsetSignal();
				return;
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__MODE:
				unsetMode();
				return;
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION:
				setSubtypeIndication((IVHDLSubtypeIndication)null);
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
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL:
				return isSetSignal();
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__MODE:
				return isSetMode();
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION:
				return subtypeIndication != null;
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
				case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER: return IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == IVHDLInterfaceElement.class) {
			switch (derivedFeatureID) {
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
				case IVHDLPackage.VHDL_IDENTIFIER_ELEMENT__IDENTIFIER: return IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == IVHDLInterfaceElement.class) {
			switch (baseFeatureID) {
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
		result.append(", signal: ");
		if (signalESet) result.append(signal); else result.append("<unset>");
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VHDLInterfaceSignalDeclaration
