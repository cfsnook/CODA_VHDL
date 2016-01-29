/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.coda.vhdl.IVHDLPackage
 * @generated
 */
public interface IVHDLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IVHDLFactory eINSTANCE = ac.soton.coda.vhdl.impl.VHDLFactory.init();

	/**
	 * Returns a new object of class '<em>Expression Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Element</em>'.
	 * @generated
	 */
	IVHDLExpressionElement createVHDLExpressionElement();

	/**
	 * Returns a new object of class '<em>Design File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design File</em>'.
	 * @generated
	 */
	IVHDLDesignFile createVHDLDesignFile();

	/**
	 * Returns a new object of class '<em>Design Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Unit</em>'.
	 * @generated
	 */
	IVHDLDesignUnit createVHDLDesignUnit();

	/**
	 * Returns a new object of class '<em>Library Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Clause</em>'.
	 * @generated
	 */
	IVHDLLibraryClause createVHDLLibraryClause();

	/**
	 * Returns a new object of class '<em>Logical Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Name</em>'.
	 * @generated
	 */
	IVHDLLogicalName createVHDLLogicalName();

	/**
	 * Returns a new object of class '<em>Use Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Clause</em>'.
	 * @generated
	 */
	IVHDLUseClause createVHDLUseClause();

	/**
	 * Returns a new object of class '<em>Selected Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Name</em>'.
	 * @generated
	 */
	IVHDLSelectedName createVHDLSelectedName();

	/**
	 * Returns a new object of class '<em>Entity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Declaration</em>'.
	 * @generated
	 */
	IVHDLEntityDeclaration createVHDLEntityDeclaration();

	/**
	 * Returns a new object of class '<em>Interface List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface List</em>'.
	 * @generated
	 */
	IVHDLInterfaceList createVHDLInterfaceList();

	/**
	 * Returns a new object of class '<em>Interface Signal Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Signal Declaration</em>'.
	 * @generated
	 */
	IVHDLInterfaceSignalDeclaration createVHDLInterfaceSignalDeclaration();

	/**
	 * Returns a new object of class '<em>Subtype Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtype Indication</em>'.
	 * @generated
	 */
	IVHDLSubtypeIndication createVHDLSubtypeIndication();

	/**
	 * Returns a new object of class '<em>Full Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Type Declaration</em>'.
	 * @generated
	 */
	IVHDLFullTypeDeclaration createVHDLFullTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Enumeration Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type Definition</em>'.
	 * @generated
	 */
	IVHDLEnumerationTypeDefinition createVHDLEnumerationTypeDefinition();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	IVHDLEnumerationLiteral createVHDLEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Architecture Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Body</em>'.
	 * @generated
	 */
	IVHDLArchitectureBody createVHDLArchitectureBody();

	/**
	 * Returns a new object of class '<em>Process Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Statement</em>'.
	 * @generated
	 */
	IVHDLProcessStatement createVHDLProcessStatement();

	/**
	 * Returns a new object of class '<em>Signal Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Name</em>'.
	 * @generated
	 */
	IVHDLSignalName createVHDLSignalName();

	/**
	 * Returns a new object of class '<em>Assertion Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Statement</em>'.
	 * @generated
	 */
	IVHDLAssertionStatement createVHDLAssertionStatement();

	/**
	 * Returns a new object of class '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion</em>'.
	 * @generated
	 */
	IVHDLAssertion createVHDLAssertion();

	/**
	 * Returns a new object of class '<em>Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Assignment Statement</em>'.
	 * @generated
	 */
	IVHDLSignalAssignmentStatement createVHDLSignalAssignmentStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IVHDLIfStatement createVHDLIfStatement();

	/**
	 * Returns a new object of class '<em>If Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Clause</em>'.
	 * @generated
	 */
	IVHDLIfClause createVHDLIfClause();

	/**
	 * Returns a new object of class '<em>Elsif Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elsif Clause</em>'.
	 * @generated
	 */
	IVHDLElsifClause createVHDLElsifClause();

	/**
	 * Returns a new object of class '<em>Else Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else Clause</em>'.
	 * @generated
	 */
	IVHDLElseClause createVHDLElseClause();

	/**
	 * Returns a new object of class '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Statement</em>'.
	 * @generated
	 */
	IVHDLCaseStatement createVHDLCaseStatement();

	/**
	 * Returns a new object of class '<em>Case Statement Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Statement Alternative</em>'.
	 * @generated
	 */
	IVHDLCaseStatementAlternative createVHDLCaseStatementAlternative();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IVHDLPackage getVHDLPackage();

} //IVHDLFactory
