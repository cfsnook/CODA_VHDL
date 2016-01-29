/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Statements Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLSequentialStatementsElement#getSequentialStatements <em>Sequential Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLSequentialStatementsElement()
 * @model abstract="true"
 * @generated
 */
public interface IVHDLSequentialStatementsElement extends IVHDLEObject {
	/**
	 * Returns the value of the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLSequentialStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential Statements</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLSequentialStatementsElement_SequentialStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLSequentialStatement> getSequentialStatements();

} // IVHDLSequentialStatementsElement
