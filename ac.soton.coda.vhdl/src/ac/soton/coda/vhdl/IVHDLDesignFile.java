/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.coda.vhdl.IVHDLDesignFile#getDesignUnits <em>Design Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLDesignFile()
 * @model
 * @generated
 */
public interface IVHDLDesignFile extends IVHDLLabelledElement {
	/**
	 * Returns the value of the '<em><b>Design Units</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.coda.vhdl.IVHDLDesignUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Units</em>' containment reference list.
	 * @see ac.soton.coda.vhdl.IVHDLPackage#getVHDLDesignFile_DesignUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IVHDLDesignUnit> getDesignUnits();

} // IVHDLDesignFile
