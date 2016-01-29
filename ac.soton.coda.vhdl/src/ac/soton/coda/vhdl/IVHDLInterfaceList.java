/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLInterfaceList#getInterfaceElements <em>Interface Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLInterfaceList()
 * @model
 * @generated
 */
public interface IVHDLInterfaceList extends IVHDLEObject {
	/**
	 * Returns the value of the '<em><b>Interface Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLInterfaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Elements</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLInterfaceList_InterfaceElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLInterfaceElement> getInterfaceElements();

} // IVHDLInterfaceList
