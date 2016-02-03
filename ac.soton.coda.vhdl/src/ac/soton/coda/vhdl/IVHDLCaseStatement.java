/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLCaseStatement#getCaseStatementAlternatives <em>Case Statement Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLCaseStatement()
 * @model
 * @generated
 */
public interface IVHDLCaseStatement extends IVHDLSequentialStatement, IVHDLExpressionElement {
	/**
	 * Returns the value of the '<em><b>Case Statement Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLCaseStatementAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Statement Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Statement Alternatives</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLCaseStatement_CaseStatementAlternatives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLCaseStatementAlternative> getCaseStatementAlternatives();

} // IVHDLCaseStatement
