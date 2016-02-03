/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLLibraryClause#getLogicalNames <em>Logical Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLLibraryClause()
 * @model
 * @generated
 */
public interface IVHDLLibraryClause extends IVHDLContextItem {
	/**
	 * Returns the value of the '<em><b>Logical Names</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLLogicalName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Names</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLLibraryClause_LogicalNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLLogicalName> getLogicalNames();

} // IVHDLLibraryClause
