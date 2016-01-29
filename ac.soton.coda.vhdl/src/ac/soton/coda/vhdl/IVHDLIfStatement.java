/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLIfStatement#getIfClause <em>If Clause</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLIfStatement#getElsifClauses <em>Elsif Clauses</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLIfStatement#getElseClause <em>Else Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLIfStatement()
 * @model
 * @generated
 */
public interface IVHDLIfStatement extends IVHDLSequentialStatement {
	/**
	 * Returns the value of the '<em><b>If Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Clause</em>' containment reference.
	 * @see #setIfClause(IVHDLIfClause)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLIfStatement_IfClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IVHDLIfClause getIfClause();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLIfStatement#getIfClause <em>If Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Clause</em>' containment reference.
	 * @see #getIfClause()
	 * @generated
	 */
	void setIfClause(IVHDLIfClause value);

	/**
	 * Returns the value of the '<em><b>Elsif Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLElsifClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsif Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsif Clauses</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLIfStatement_ElsifClauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLElsifClause> getElsifClauses();

	/**
	 * Returns the value of the '<em><b>Else Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Clause</em>' containment reference.
	 * @see #isSetElseClause()
	 * @see #unsetElseClause()
	 * @see #setElseClause(IVHDLElseClause)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLIfStatement_ElseClause()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	IVHDLElseClause getElseClause();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLIfStatement#getElseClause <em>Else Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Clause</em>' containment reference.
	 * @see #isSetElseClause()
	 * @see #unsetElseClause()
	 * @see #getElseClause()
	 * @generated
	 */
	void setElseClause(IVHDLElseClause value);

	/**
	 * Unsets the value of the '{@link ac.soton.coda.vhdl.IVHDLIfStatement#getElseClause <em>Else Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElseClause()
	 * @see #getElseClause()
	 * @see #setElseClause(IVHDLElseClause)
	 * @generated
	 */
	void unsetElseClause();

	/**
	 * Returns whether the value of the '{@link ac.soton.coda.vhdl.IVHDLIfStatement#getElseClause <em>Else Clause</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Else Clause</em>' containment reference is set.
	 * @see #unsetElseClause()
	 * @see #getElseClause()
	 * @see #setElseClause(IVHDLElseClause)
	 * @generated
	 */
	boolean isSetElseClause();

} // IVHDLIfStatement
