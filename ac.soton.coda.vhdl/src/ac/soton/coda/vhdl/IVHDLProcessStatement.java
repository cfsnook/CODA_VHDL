/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLProcessStatement#getSensitivityList <em>Sensitivity List</em>}</li>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLProcessStatement#getProcessDeclarativeItems <em>Process Declarative Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLProcessStatement()
 * @model
 * @generated
 */
public interface IVHDLProcessStatement extends IVHDLConcurrentStatement, IVHDLSequentialStatementsElement {
	/**
	 * Returns the value of the '<em><b>Sensitivity List</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLSignalName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivity List</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLProcessStatement_SensitivityList()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLSignalName> getSensitivityList();

	/**
	 * Returns the value of the '<em><b>Process Declarative Items</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Declarative Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Declarative Items</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLProcessStatement_ProcessDeclarativeItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<IVHDLProcessDeclarativeItem> getProcessDeclarativeItems();

} // IVHDLProcessStatement
