/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLDesignUnit#getContextItems <em>Context Items</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLDesignUnit#getLibraryUnit <em>Library Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLDesignUnit()
 * @model
 * @generated
 */
public interface IVHDLDesignUnit extends IVHDLEObject {
	/**
	 * Returns the value of the '<em><b>Context Items</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLContextItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Items</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLDesignUnit_ContextItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLContextItem> getContextItems();

	/**
	 * Returns the value of the '<em><b>Library Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Unit</em>' containment reference.
	 * @see #setLibraryUnit(IVHDLLibraryUnit)
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLDesignUnit_LibraryUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IVHDLLibraryUnit getLibraryUnit();

	/**
	 * Sets the value of the '{@link ac.soton.coda.vhdl.IVHDLDesignUnit#getLibraryUnit <em>Library Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Unit</em>' containment reference.
	 * @see #getLibraryUnit()
	 * @generated
	 */
	void setLibraryUnit(IVHDLLibraryUnit value);

} // IVHDLDesignUnit
