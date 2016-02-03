/**
 */
package ac.soton.coda.vhdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getTarget <em>Target</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getWaveform <em>Waveform</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLSignalAssignmentStatement()
 * @model
 * @generated
 */
public interface IVHDLSignalAssignmentStatement extends IVHDLSequentialStatement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLSignalAssignmentStatement_Target()
	 * @model required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Waveform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waveform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waveform</em>' attribute.
	 * @see #setWaveform(String)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLSignalAssignmentStatement_Waveform()
	 * @model required="true"
	 * @generated
	 */
	String getWaveform();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getWaveform <em>Waveform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waveform</em>' attribute.
	 * @see #getWaveform()
	 * @generated
	 */
	void setWaveform(String value);

} // IVHDLSignalAssignmentStatement
