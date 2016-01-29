/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration#getPortInterfaceList <em>Port Interface List</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration#getEntityDeclarativeItems <em>Entity Declarative Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLEntityDeclaration()
 * @model
 * @generated
 */
public interface IVHDLEntityDeclaration extends IVHDLPrimaryUnit, IVHDLIdentifierElement {
	/**
	 * Returns the value of the '<em><b>Port Interface List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Interface List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Interface List</em>' containment reference.
	 * @see #isSetPortInterfaceList()
	 * @see #unsetPortInterfaceList()
	 * @see #setPortInterfaceList(IVHDLInterfaceList)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLEntityDeclaration_PortInterfaceList()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	IVHDLInterfaceList getPortInterfaceList();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration#getPortInterfaceList <em>Port Interface List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Interface List</em>' containment reference.
	 * @see #isSetPortInterfaceList()
	 * @see #unsetPortInterfaceList()
	 * @see #getPortInterfaceList()
	 * @generated
	 */
	void setPortInterfaceList(IVHDLInterfaceList value);

	/**
	 * Unsets the value of the '{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration#getPortInterfaceList <em>Port Interface List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPortInterfaceList()
	 * @see #getPortInterfaceList()
	 * @see #setPortInterfaceList(IVHDLInterfaceList)
	 * @generated
	 */
	void unsetPortInterfaceList();

	/**
	 * Returns whether the value of the '{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration#getPortInterfaceList <em>Port Interface List</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port Interface List</em>' containment reference is set.
	 * @see #unsetPortInterfaceList()
	 * @see #getPortInterfaceList()
	 * @see #setPortInterfaceList(IVHDLInterfaceList)
	 * @generated
	 */
	boolean isSetPortInterfaceList();

	/**
	 * Returns the value of the '<em><b>Entity Declarative Items</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Declarative Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Declarative Items</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLEntityDeclaration_EntityDeclarativeItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLEntityDeclarativeItem> getEntityDeclarativeItems();

} // IVHDLEntityDeclaration
