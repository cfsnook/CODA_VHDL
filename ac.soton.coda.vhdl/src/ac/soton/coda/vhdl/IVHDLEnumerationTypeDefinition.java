/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLEnumerationTypeDefinition()
 * @model
 * @generated
 */
public interface IVHDLEnumerationTypeDefinition extends IVHDLScalarTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLEnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLEnumerationTypeDefinition_EnumerationLiterals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLEnumerationLiteral> getEnumerationLiterals();

} // IVHDLEnumerationTypeDefinition
