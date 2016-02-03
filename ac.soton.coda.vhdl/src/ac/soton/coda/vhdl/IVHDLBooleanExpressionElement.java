/**
 */
package ac.soton.coda.vhdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLBooleanExpressionElement#getBooleanExpression <em>Boolean Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLBooleanExpressionElement()
 * @model abstract="true"
 * @generated
 */
public interface IVHDLBooleanExpressionElement extends IVHDLEObject {
	/**
	 * Returns the value of the '<em><b>Boolean Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Expression</em>' attribute.
	 * @see #setBooleanExpression(String)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLBooleanExpressionElement_BooleanExpression()
	 * @model required="true"
	 * @generated
	 */
	String getBooleanExpression();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLBooleanExpressionElement#getBooleanExpression <em>Boolean Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Expression</em>' attribute.
	 * @see #getBooleanExpression()
	 * @generated
	 */
	void setBooleanExpression(String value);

} // IVHDLBooleanExpressionElement
