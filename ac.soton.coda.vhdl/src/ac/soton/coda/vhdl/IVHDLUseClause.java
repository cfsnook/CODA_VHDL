/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLUseClause#getSelectedNames <em>Selected Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLUseClause()
 * @model
 * @generated
 */
public interface IVHDLUseClause extends IVHDLContextItem {
	/**
	 * Returns the value of the '<em><b>Selected Names</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLSelectedName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Names</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLUseClause_SelectedNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLSelectedName> getSelectedNames();

} // IVHDLUseClause
