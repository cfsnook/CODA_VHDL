/**
 */
package ac.soton.coda.vhdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.coda.vhdl.IVHDLFactory
 * @model kind="package"
 * @generated
 */
public interface IVHDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vhdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/vhdl/2015";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vhdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IVHDLPackage eINSTANCE = ac.soton.coda.vhdl.impl.VHDLPackage.init();

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLEObject <em>EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLEObject
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEObject()
	 * @generated
	 */
	int VHDL_EOBJECT = 0;

	/**
	 * The number of structural features of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_EOBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_EOBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLNamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLNamedElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLNamedElement()
	 * @generated
	 */
	int VHDL_NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_NAMED_ELEMENT__NAME = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_NAMED_ELEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_NAMED_ELEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLLabelledElement <em>Labelled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLLabelledElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLabelledElement()
	 * @generated
	 */
	int VHDL_LABELLED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LABELLED_ELEMENT__LABEL = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labelled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LABELLED_ELEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Labelled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LABELLED_ELEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLIdentifierElement <em>Identifier Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLIdentifierElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLIdentifierElement()
	 * @generated
	 */
	int VHDL_IDENTIFIER_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IDENTIFIER_ELEMENT__IDENTIFIER = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IDENTIFIER_ELEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifier Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IDENTIFIER_ELEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLBooleanExpressionElement <em>Boolean Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLBooleanExpressionElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLBooleanExpressionElement()
	 * @generated
	 */
	int VHDL_BOOLEAN_EXPRESSION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_BOOLEAN_EXPRESSION_ELEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_BOOLEAN_EXPRESSION_ELEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLExpressionElement <em>Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLExpressionElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLExpressionElement()
	 * @generated
	 */
	int VHDL_EXPRESSION_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_EXPRESSION_ELEMENT__EXPRESSION = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_EXPRESSION_ELEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_EXPRESSION_ELEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLSequentialStatementsElement <em>Sequential Statements Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLSequentialStatementsElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSequentialStatementsElement()
	 * @generated
	 */
	int VHDL_SEQUENTIAL_STATEMENTS_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequential Statements Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SEQUENTIAL_STATEMENTS_ELEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequential Statements Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SEQUENTIAL_STATEMENTS_ELEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLDesignFile <em>Design File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLDesignFile
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLDesignFile()
	 * @generated
	 */
	int VHDL_DESIGN_FILE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_FILE__LABEL = VHDL_LABELLED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Design Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_FILE__DESIGN_UNITS = VHDL_LABELLED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Design File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_FILE_FEATURE_COUNT = VHDL_LABELLED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Design File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_FILE_OPERATION_COUNT = VHDL_LABELLED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLDesignUnit <em>Design Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLDesignUnit
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLDesignUnit()
	 * @generated
	 */
	int VHDL_DESIGN_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Context Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_UNIT__CONTEXT_ITEMS = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_UNIT__LIBRARY_UNIT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Design Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_UNIT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Design Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_DESIGN_UNIT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLContextItem <em>Context Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLContextItem
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLContextItem()
	 * @generated
	 */
	int VHDL_CONTEXT_ITEM = 9;

	/**
	 * The number of structural features of the '<em>Context Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CONTEXT_ITEM_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CONTEXT_ITEM_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLLibraryClause <em>Library Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLLibraryClause
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLibraryClause()
	 * @generated
	 */
	int VHDL_LIBRARY_CLAUSE = 10;

	/**
	 * The feature id for the '<em><b>Logical Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES = VHDL_CONTEXT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LIBRARY_CLAUSE_FEATURE_COUNT = VHDL_CONTEXT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Library Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LIBRARY_CLAUSE_OPERATION_COUNT = VHDL_CONTEXT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLLogicalName <em>Logical Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLLogicalName
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLogicalName()
	 * @generated
	 */
	int VHDL_LOGICAL_NAME = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LOGICAL_NAME__IDENTIFIER = VHDL_IDENTIFIER_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Logical Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LOGICAL_NAME_FEATURE_COUNT = VHDL_IDENTIFIER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LOGICAL_NAME_OPERATION_COUNT = VHDL_IDENTIFIER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLUseClause <em>Use Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLUseClause
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLUseClause()
	 * @generated
	 */
	int VHDL_USE_CLAUSE = 12;

	/**
	 * The feature id for the '<em><b>Selected Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_USE_CLAUSE__SELECTED_NAMES = VHDL_CONTEXT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Use Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_USE_CLAUSE_FEATURE_COUNT = VHDL_CONTEXT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Use Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_USE_CLAUSE_OPERATION_COUNT = VHDL_CONTEXT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLSelectedName <em>Selected Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLSelectedName
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSelectedName()
	 * @generated
	 */
	int VHDL_SELECTED_NAME = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SELECTED_NAME__NAME = VHDL_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Selected Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SELECTED_NAME_FEATURE_COUNT = VHDL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selected Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SELECTED_NAME_OPERATION_COUNT = VHDL_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLLibraryUnit <em>Library Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLLibraryUnit
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLibraryUnit()
	 * @generated
	 */
	int VHDL_LIBRARY_UNIT = 14;

	/**
	 * The number of structural features of the '<em>Library Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LIBRARY_UNIT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_LIBRARY_UNIT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLPrimaryUnit <em>Primary Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLPrimaryUnit
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLPrimaryUnit()
	 * @generated
	 */
	int VHDL_PRIMARY_UNIT = 15;

	/**
	 * The number of structural features of the '<em>Primary Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PRIMARY_UNIT_FEATURE_COUNT = VHDL_LIBRARY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PRIMARY_UNIT_OPERATION_COUNT = VHDL_LIBRARY_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLEntityDeclaration <em>Entity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLEntityDeclaration
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEntityDeclaration()
	 * @generated
	 */
	int VHDL_ENTITY_DECLARATION = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENTITY_DECLARATION__IDENTIFIER = VHDL_PRIMARY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Interface List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST = VHDL_PRIMARY_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Declarative Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS = VHDL_PRIMARY_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENTITY_DECLARATION_FEATURE_COUNT = VHDL_PRIMARY_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENTITY_DECLARATION_OPERATION_COUNT = VHDL_PRIMARY_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLInterfaceList <em>Interface List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLInterfaceList
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLInterfaceList()
	 * @generated
	 */
	int VHDL_INTERFACE_LIST = 17;

	/**
	 * The feature id for the '<em><b>Interface Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_LIST__INTERFACE_ELEMENTS = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_LIST_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_LIST_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLInterfaceElement <em>Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLInterfaceElement()
	 * @generated
	 */
	int VHDL_INTERFACE_ELEMENT = 18;

	/**
	 * The number of structural features of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_ELEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_ELEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem <em>Block Declarative Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLBlockDeclarativeItem()
	 * @generated
	 */
	int VHDL_BLOCK_DECLARATIVE_ITEM = 30;

	/**
	 * The number of structural features of the '<em>Block Declarative Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_BLOCK_DECLARATIVE_ITEM_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Declarative Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_BLOCK_DECLARATIVE_ITEM_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration <em>Interface Signal Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLInterfaceSignalDeclaration()
	 * @generated
	 */
	int VHDL_INTERFACE_SIGNAL_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_SIGNAL_DECLARATION__IDENTIFIER = VHDL_BLOCK_DECLARATIVE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL = VHDL_BLOCK_DECLARATIVE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_SIGNAL_DECLARATION__MODE = VHDL_BLOCK_DECLARATIVE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtype Indication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION = VHDL_BLOCK_DECLARATIVE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Signal Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_SIGNAL_DECLARATION_FEATURE_COUNT = VHDL_BLOCK_DECLARATIVE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Signal Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_INTERFACE_SIGNAL_DECLARATION_OPERATION_COUNT = VHDL_BLOCK_DECLARATIVE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLSubtypeIndication <em>Subtype Indication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLSubtypeIndication
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSubtypeIndication()
	 * @generated
	 */
	int VHDL_SUBTYPE_INDICATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SUBTYPE_INDICATION__NAME = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subtype Indication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SUBTYPE_INDICATION_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subtype Indication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SUBTYPE_INDICATION_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem <em>Entity Declarative Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEntityDeclarativeItem()
	 * @generated
	 */
	int VHDL_ENTITY_DECLARATIVE_ITEM = 21;

	/**
	 * The number of structural features of the '<em>Entity Declarative Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENTITY_DECLARATIVE_ITEM_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Declarative Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENTITY_DECLARATIVE_ITEM_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLTypeDeclaration <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLTypeDeclaration
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLTypeDeclaration()
	 * @generated
	 */
	int VHDL_TYPE_DECLARATION = 22;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_TYPE_DECLARATION_FEATURE_COUNT = VHDL_ENTITY_DECLARATIVE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_TYPE_DECLARATION_OPERATION_COUNT = VHDL_ENTITY_DECLARATIVE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLFullTypeDeclaration <em>Full Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLFullTypeDeclaration
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLFullTypeDeclaration()
	 * @generated
	 */
	int VHDL_FULL_TYPE_DECLARATION = 23;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_FULL_TYPE_DECLARATION__IDENTIFIER = VHDL_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION = VHDL_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Full Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_FULL_TYPE_DECLARATION_FEATURE_COUNT = VHDL_TYPE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Full Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_FULL_TYPE_DECLARATION_OPERATION_COUNT = VHDL_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLTypeDefinition <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLTypeDefinition
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLTypeDefinition()
	 * @generated
	 */
	int VHDL_TYPE_DEFINITION = 24;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_TYPE_DEFINITION_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_TYPE_DEFINITION_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLScalarTypeDefinition <em>Scalar Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLScalarTypeDefinition
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLScalarTypeDefinition()
	 * @generated
	 */
	int VHDL_SCALAR_TYPE_DEFINITION = 25;

	/**
	 * The number of structural features of the '<em>Scalar Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SCALAR_TYPE_DEFINITION_FEATURE_COUNT = VHDL_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scalar Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SCALAR_TYPE_DEFINITION_OPERATION_COUNT = VHDL_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLEnumerationTypeDefinition <em>Enumeration Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLEnumerationTypeDefinition
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEnumerationTypeDefinition()
	 * @generated
	 */
	int VHDL_ENUMERATION_TYPE_DEFINITION = 26;

	/**
	 * The feature id for the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENUMERATION_TYPE_DEFINITION__ENUMERATION_LITERALS = VHDL_SCALAR_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENUMERATION_TYPE_DEFINITION_FEATURE_COUNT = VHDL_SCALAR_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENUMERATION_TYPE_DEFINITION_OPERATION_COUNT = VHDL_SCALAR_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLEnumerationLiteral <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLEnumerationLiteral
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEnumerationLiteral()
	 * @generated
	 */
	int VHDL_ENUMERATION_LITERAL = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENUMERATION_LITERAL__NAME = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENUMERATION_LITERAL_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ENUMERATION_LITERAL_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLSecondaryUnit <em>Secondary Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLSecondaryUnit
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSecondaryUnit()
	 * @generated
	 */
	int VHDL_SECONDARY_UNIT = 28;

	/**
	 * The number of structural features of the '<em>Secondary Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SECONDARY_UNIT_FEATURE_COUNT = VHDL_LIBRARY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Secondary Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SECONDARY_UNIT_OPERATION_COUNT = VHDL_LIBRARY_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLArchitectureBody <em>Architecture Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLArchitectureBody
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLArchitectureBody()
	 * @generated
	 */
	int VHDL_ARCHITECTURE_BODY = 29;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ARCHITECTURE_BODY__IDENTIFIER = VHDL_SECONDARY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ARCHITECTURE_BODY__NAME = VHDL_SECONDARY_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block Declarative Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS = VHDL_SECONDARY_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concurrent Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS = VHDL_SECONDARY_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Architecture Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ARCHITECTURE_BODY_FEATURE_COUNT = VHDL_SECONDARY_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Architecture Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ARCHITECTURE_BODY_OPERATION_COUNT = VHDL_SECONDARY_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLConcurrentStatement <em>Concurrent Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLConcurrentStatement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLConcurrentStatement()
	 * @generated
	 */
	int VHDL_CONCURRENT_STATEMENT = 31;

	/**
	 * The number of structural features of the '<em>Concurrent Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CONCURRENT_STATEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concurrent Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CONCURRENT_STATEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLProcessStatement <em>Process Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLProcessStatement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLProcessStatement()
	 * @generated
	 */
	int VHDL_PROCESS_STATEMENT = 32;

	/**
	 * The feature id for the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PROCESS_STATEMENT__SEQUENTIAL_STATEMENTS = VHDL_CONCURRENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensitivity List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST = VHDL_CONCURRENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Declarative Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS = VHDL_CONCURRENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PROCESS_STATEMENT_FEATURE_COUNT = VHDL_CONCURRENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Process Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PROCESS_STATEMENT_OPERATION_COUNT = VHDL_CONCURRENT_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLSignalName <em>Signal Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLSignalName
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSignalName()
	 * @generated
	 */
	int VHDL_SIGNAL_NAME = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SIGNAL_NAME__NAME = VHDL_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Signal Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SIGNAL_NAME_FEATURE_COUNT = VHDL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SIGNAL_NAME_OPERATION_COUNT = VHDL_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem <em>Process Declarative Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLProcessDeclarativeItem()
	 * @generated
	 */
	int VHDL_PROCESS_DECLARATIVE_ITEM = 34;

	/**
	 * The number of structural features of the '<em>Process Declarative Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PROCESS_DECLARATIVE_ITEM_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Declarative Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_PROCESS_DECLARATIVE_ITEM_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.IVHDLSequentialStatement <em>Sequential Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.IVHDLSequentialStatement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSequentialStatement()
	 * @generated
	 */
	int VHDL_SEQUENTIAL_STATEMENT = 35;

	/**
	 * The number of structural features of the '<em>Sequential Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT = VHDL_EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequential Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SEQUENTIAL_STATEMENT_OPERATION_COUNT = VHDL_EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLAssertionStatement <em>Assertion Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLAssertionStatement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLAssertionStatement()
	 * @generated
	 */
	int VHDL_ASSERTION_STATEMENT = 36;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ASSERTION_STATEMENT__LABEL = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ASSERTION_STATEMENT__ASSERTION = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assertion Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ASSERTION_STATEMENT_FEATURE_COUNT = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assertion Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ASSERTION_STATEMENT_OPERATION_COUNT = VHDL_SEQUENTIAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLAssertion <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLAssertion
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLAssertion()
	 * @generated
	 */
	int VHDL_ASSERTION = 37;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ASSERTION__BOOLEAN_EXPRESSION = VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ASSERTION_FEATURE_COUNT = VHDL_BOOLEAN_EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ASSERTION_OPERATION_COUNT = VHDL_BOOLEAN_EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLSignalAssignmentStatement <em>Signal Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLSignalAssignmentStatement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSignalAssignmentStatement()
	 * @generated
	 */
	int VHDL_SIGNAL_ASSIGNMENT_STATEMENT = 38;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SIGNAL_ASSIGNMENT_STATEMENT__TARGET = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Waveform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SIGNAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SIGNAL_ASSIGNMENT_STATEMENT_OPERATION_COUNT = VHDL_SEQUENTIAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLIfStatement <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLIfStatement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLIfStatement()
	 * @generated
	 */
	int VHDL_IF_STATEMENT = 39;

	/**
	 * The feature id for the '<em><b>If Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_STATEMENT__IF_CLAUSE = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elsif Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_STATEMENT__ELSIF_CLAUSES = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_STATEMENT__ELSE_CLAUSE = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_STATEMENT_FEATURE_COUNT = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_STATEMENT_OPERATION_COUNT = VHDL_SEQUENTIAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLGuardedStatementElement <em>Guarded Statement Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLGuardedStatementElement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLGuardedStatementElement()
	 * @generated
	 */
	int VHDL_GUARDED_STATEMENT_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_GUARDED_STATEMENT_ELEMENT__BOOLEAN_EXPRESSION = VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS = VHDL_BOOLEAN_EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded Statement Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_GUARDED_STATEMENT_ELEMENT_FEATURE_COUNT = VHDL_BOOLEAN_EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guarded Statement Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_GUARDED_STATEMENT_ELEMENT_OPERATION_COUNT = VHDL_BOOLEAN_EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLIfClause <em>If Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLIfClause
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLIfClause()
	 * @generated
	 */
	int VHDL_IF_CLAUSE = 41;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_CLAUSE__BOOLEAN_EXPRESSION = VHDL_GUARDED_STATEMENT_ELEMENT__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_CLAUSE__SEQUENTIAL_STATEMENTS = VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS;

	/**
	 * The number of structural features of the '<em>If Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_CLAUSE_FEATURE_COUNT = VHDL_GUARDED_STATEMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_IF_CLAUSE_OPERATION_COUNT = VHDL_GUARDED_STATEMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLElsifClause <em>Elsif Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLElsifClause
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLElsifClause()
	 * @generated
	 */
	int VHDL_ELSIF_CLAUSE = 42;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ELSIF_CLAUSE__BOOLEAN_EXPRESSION = VHDL_GUARDED_STATEMENT_ELEMENT__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ELSIF_CLAUSE__SEQUENTIAL_STATEMENTS = VHDL_GUARDED_STATEMENT_ELEMENT__SEQUENTIAL_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Elsif Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ELSIF_CLAUSE_FEATURE_COUNT = VHDL_GUARDED_STATEMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elsif Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ELSIF_CLAUSE_OPERATION_COUNT = VHDL_GUARDED_STATEMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLElseClause <em>Else Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLElseClause
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLElseClause()
	 * @generated
	 */
	int VHDL_ELSE_CLAUSE = 43;

	/**
	 * The feature id for the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ELSE_CLAUSE__SEQUENTIAL_STATEMENTS = VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Else Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ELSE_CLAUSE_FEATURE_COUNT = VHDL_SEQUENTIAL_STATEMENTS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Else Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_ELSE_CLAUSE_OPERATION_COUNT = VHDL_SEQUENTIAL_STATEMENTS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLCaseStatement <em>Case Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLCaseStatement
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLCaseStatement()
	 * @generated
	 */
	int VHDL_CASE_STATEMENT = 44;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT__EXPRESSION = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Statement Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT_FEATURE_COUNT = VHDL_SEQUENTIAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT_OPERATION_COUNT = VHDL_SEQUENTIAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.impl.VHDLCaseStatementAlternative <em>Case Statement Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.impl.VHDLCaseStatementAlternative
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLCaseStatementAlternative()
	 * @generated
	 */
	int VHDL_CASE_STATEMENT_ALTERNATIVE = 45;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT_ALTERNATIVE__LABEL = VHDL_LABELLED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Sequential Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT_ALTERNATIVE__SEQUENTIAL_STATEMENTS = VHDL_LABELLED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Statement Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT_ALTERNATIVE_FEATURE_COUNT = VHDL_LABELLED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Case Statement Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_CASE_STATEMENT_ALTERNATIVE_OPERATION_COUNT = VHDL_LABELLED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.coda.vhdl.VHDLMode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.coda.vhdl.VHDLMode
	 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLMode()
	 * @generated
	 */
	int VHDL_MODE = 46;


	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEObject
	 * @generated
	 */
	EClass getVHDLEObject();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLNamedElement
	 * @generated
	 */
	EClass getVHDLNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLNamedElement#getName()
	 * @see #getVHDLNamedElement()
	 * @generated
	 */
	EAttribute getVHDLNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLLabelledElement <em>Labelled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labelled Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLLabelledElement
	 * @generated
	 */
	EClass getVHDLLabelledElement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLLabelledElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLLabelledElement#getLabel()
	 * @see #getVHDLLabelledElement()
	 * @generated
	 */
	EAttribute getVHDLLabelledElement_Label();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLIdentifierElement <em>Identifier Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLIdentifierElement
	 * @generated
	 */
	EClass getVHDLIdentifierElement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLIdentifierElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLIdentifierElement#getIdentifier()
	 * @see #getVHDLIdentifierElement()
	 * @generated
	 */
	EAttribute getVHDLIdentifierElement_Identifier();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLBooleanExpressionElement <em>Boolean Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLBooleanExpressionElement
	 * @generated
	 */
	EClass getVHDLBooleanExpressionElement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLBooleanExpressionElement#getBooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Expression</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLBooleanExpressionElement#getBooleanExpression()
	 * @see #getVHDLBooleanExpressionElement()
	 * @generated
	 */
	EAttribute getVHDLBooleanExpressionElement_BooleanExpression();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLExpressionElement <em>Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLExpressionElement
	 * @generated
	 */
	EClass getVHDLExpressionElement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLExpressionElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLExpressionElement#getExpression()
	 * @see #getVHDLExpressionElement()
	 * @generated
	 */
	EAttribute getVHDLExpressionElement_Expression();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLSequentialStatementsElement <em>Sequential Statements Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Statements Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSequentialStatementsElement
	 * @generated
	 */
	EClass getVHDLSequentialStatementsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLSequentialStatementsElement#getSequentialStatements <em>Sequential Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequential Statements</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSequentialStatementsElement#getSequentialStatements()
	 * @see #getVHDLSequentialStatementsElement()
	 * @generated
	 */
	EReference getVHDLSequentialStatementsElement_SequentialStatements();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLDesignFile <em>Design File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design File</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLDesignFile
	 * @generated
	 */
	EClass getVHDLDesignFile();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLDesignFile#getDesignUnits <em>Design Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Units</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLDesignFile#getDesignUnits()
	 * @see #getVHDLDesignFile()
	 * @generated
	 */
	EReference getVHDLDesignFile_DesignUnits();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLDesignUnit <em>Design Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Unit</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLDesignUnit
	 * @generated
	 */
	EClass getVHDLDesignUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLDesignUnit#getContextItems <em>Context Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Items</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLDesignUnit#getContextItems()
	 * @see #getVHDLDesignUnit()
	 * @generated
	 */
	EReference getVHDLDesignUnit_ContextItems();

	/**
	 * Returns the meta object for the containment reference '{@link ac.soton.coda.vhdl.IVHDLDesignUnit#getLibraryUnit <em>Library Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library Unit</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLDesignUnit#getLibraryUnit()
	 * @see #getVHDLDesignUnit()
	 * @generated
	 */
	EReference getVHDLDesignUnit_LibraryUnit();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLContextItem <em>Context Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Item</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLContextItem
	 * @generated
	 */
	EClass getVHDLContextItem();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLLibraryClause <em>Library Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Clause</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLLibraryClause
	 * @generated
	 */
	EClass getVHDLLibraryClause();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLLibraryClause#getLogicalNames <em>Logical Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Names</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLLibraryClause#getLogicalNames()
	 * @see #getVHDLLibraryClause()
	 * @generated
	 */
	EReference getVHDLLibraryClause_LogicalNames();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLLogicalName <em>Logical Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Name</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLLogicalName
	 * @generated
	 */
	EClass getVHDLLogicalName();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLUseClause <em>Use Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Clause</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLUseClause
	 * @generated
	 */
	EClass getVHDLUseClause();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLUseClause#getSelectedNames <em>Selected Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Names</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLUseClause#getSelectedNames()
	 * @see #getVHDLUseClause()
	 * @generated
	 */
	EReference getVHDLUseClause_SelectedNames();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLSelectedName <em>Selected Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected Name</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSelectedName
	 * @generated
	 */
	EClass getVHDLSelectedName();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLLibraryUnit <em>Library Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Unit</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLLibraryUnit
	 * @generated
	 */
	EClass getVHDLLibraryUnit();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLPrimaryUnit <em>Primary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Unit</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLPrimaryUnit
	 * @generated
	 */
	EClass getVHDLPrimaryUnit();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Declaration</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEntityDeclaration
	 * @generated
	 */
	EClass getVHDLEntityDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration#getPortInterfaceList <em>Port Interface List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Interface List</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEntityDeclaration#getPortInterfaceList()
	 * @see #getVHDLEntityDeclaration()
	 * @generated
	 */
	EReference getVHDLEntityDeclaration_PortInterfaceList();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration#getEntityDeclarativeItems <em>Entity Declarative Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Declarative Items</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEntityDeclaration#getEntityDeclarativeItems()
	 * @see #getVHDLEntityDeclaration()
	 * @generated
	 */
	EReference getVHDLEntityDeclaration_EntityDeclarativeItems();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLInterfaceList <em>Interface List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface List</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceList
	 * @generated
	 */
	EClass getVHDLInterfaceList();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLInterfaceList#getInterfaceElements <em>Interface Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Elements</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceList#getInterfaceElements()
	 * @see #getVHDLInterfaceList()
	 * @generated
	 */
	EReference getVHDLInterfaceList_InterfaceElements();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLInterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceElement
	 * @generated
	 */
	EClass getVHDLInterfaceElement();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration <em>Interface Signal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Signal Declaration</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration
	 * @generated
	 */
	EClass getVHDLInterfaceSignalDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#isSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#isSignal()
	 * @see #getVHDLInterfaceSignalDeclaration()
	 * @generated
	 */
	EAttribute getVHDLInterfaceSignalDeclaration_Signal();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getMode()
	 * @see #getVHDLInterfaceSignalDeclaration()
	 * @generated
	 */
	EAttribute getVHDLInterfaceSignalDeclaration_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getSubtypeIndication <em>Subtype Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtype Indication</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration#getSubtypeIndication()
	 * @see #getVHDLInterfaceSignalDeclaration()
	 * @generated
	 */
	EReference getVHDLInterfaceSignalDeclaration_SubtypeIndication();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLSubtypeIndication <em>Subtype Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype Indication</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSubtypeIndication
	 * @generated
	 */
	EClass getVHDLSubtypeIndication();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem <em>Entity Declarative Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Declarative Item</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem
	 * @generated
	 */
	EClass getVHDLEntityDeclarativeItem();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLTypeDeclaration
	 * @generated
	 */
	EClass getVHDLTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLFullTypeDeclaration <em>Full Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Type Declaration</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLFullTypeDeclaration
	 * @generated
	 */
	EClass getVHDLFullTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link ac.soton.coda.vhdl.IVHDLFullTypeDeclaration#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Definition</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLFullTypeDeclaration#getTypeDefinition()
	 * @see #getVHDLFullTypeDeclaration()
	 * @generated
	 */
	EReference getVHDLFullTypeDeclaration_TypeDefinition();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLTypeDefinition
	 * @generated
	 */
	EClass getVHDLTypeDefinition();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLScalarTypeDefinition <em>Scalar Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Type Definition</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLScalarTypeDefinition
	 * @generated
	 */
	EClass getVHDLScalarTypeDefinition();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type Definition</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition
	 * @generated
	 */
	EClass getVHDLEnumerationTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition#getEnumerationLiterals <em>Enumeration Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Literals</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition#getEnumerationLiterals()
	 * @see #getVHDLEnumerationTypeDefinition()
	 * @generated
	 */
	EReference getVHDLEnumerationTypeDefinition_EnumerationLiterals();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLEnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLEnumerationLiteral
	 * @generated
	 */
	EClass getVHDLEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLSecondaryUnit <em>Secondary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Unit</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSecondaryUnit
	 * @generated
	 */
	EClass getVHDLSecondaryUnit();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLArchitectureBody <em>Architecture Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Body</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLArchitectureBody
	 * @generated
	 */
	EClass getVHDLArchitectureBody();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLArchitectureBody#getBlockDeclarativeItems <em>Block Declarative Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Declarative Items</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLArchitectureBody#getBlockDeclarativeItems()
	 * @see #getVHDLArchitectureBody()
	 * @generated
	 */
	EReference getVHDLArchitectureBody_BlockDeclarativeItems();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLArchitectureBody#getConcurrentStatements <em>Concurrent Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concurrent Statements</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLArchitectureBody#getConcurrentStatements()
	 * @see #getVHDLArchitectureBody()
	 * @generated
	 */
	EReference getVHDLArchitectureBody_ConcurrentStatements();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem <em>Block Declarative Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Declarative Item</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem
	 * @generated
	 */
	EClass getVHDLBlockDeclarativeItem();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLConcurrentStatement <em>Concurrent Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrent Statement</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLConcurrentStatement
	 * @generated
	 */
	EClass getVHDLConcurrentStatement();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLProcessStatement <em>Process Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Statement</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLProcessStatement
	 * @generated
	 */
	EClass getVHDLProcessStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLProcessStatement#getSensitivityList <em>Sensitivity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensitivity List</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLProcessStatement#getSensitivityList()
	 * @see #getVHDLProcessStatement()
	 * @generated
	 */
	EReference getVHDLProcessStatement_SensitivityList();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLProcessStatement#getProcessDeclarativeItems <em>Process Declarative Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Declarative Items</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLProcessStatement#getProcessDeclarativeItems()
	 * @see #getVHDLProcessStatement()
	 * @generated
	 */
	EReference getVHDLProcessStatement_ProcessDeclarativeItems();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLSignalName <em>Signal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Name</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSignalName
	 * @generated
	 */
	EClass getVHDLSignalName();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem <em>Process Declarative Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Declarative Item</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem
	 * @generated
	 */
	EClass getVHDLProcessDeclarativeItem();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLSequentialStatement <em>Sequential Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Statement</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSequentialStatement
	 * @generated
	 */
	EClass getVHDLSequentialStatement();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLAssertionStatement <em>Assertion Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Statement</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLAssertionStatement
	 * @generated
	 */
	EClass getVHDLAssertionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ac.soton.coda.vhdl.IVHDLAssertionStatement#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLAssertionStatement#getAssertion()
	 * @see #getVHDLAssertionStatement()
	 * @generated
	 */
	EReference getVHDLAssertionStatement_Assertion();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLAssertion
	 * @generated
	 */
	EClass getVHDLAssertion();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement <em>Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Assignment Statement</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement
	 * @generated
	 */
	EClass getVHDLSignalAssignmentStatement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getTarget()
	 * @see #getVHDLSignalAssignmentStatement()
	 * @generated
	 */
	EAttribute getVHDLSignalAssignmentStatement_Target();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getWaveform <em>Waveform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waveform</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement#getWaveform()
	 * @see #getVHDLSignalAssignmentStatement()
	 * @generated
	 */
	EAttribute getVHDLSignalAssignmentStatement_Waveform();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLIfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLIfStatement
	 * @generated
	 */
	EClass getVHDLIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ac.soton.coda.vhdl.IVHDLIfStatement#getIfClause <em>If Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Clause</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLIfStatement#getIfClause()
	 * @see #getVHDLIfStatement()
	 * @generated
	 */
	EReference getVHDLIfStatement_IfClause();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLIfStatement#getElsifClauses <em>Elsif Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsif Clauses</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLIfStatement#getElsifClauses()
	 * @see #getVHDLIfStatement()
	 * @generated
	 */
	EReference getVHDLIfStatement_ElsifClauses();

	/**
	 * Returns the meta object for the containment reference '{@link ac.soton.coda.vhdl.IVHDLIfStatement#getElseClause <em>Else Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Clause</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLIfStatement#getElseClause()
	 * @see #getVHDLIfStatement()
	 * @generated
	 */
	EReference getVHDLIfStatement_ElseClause();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLGuardedStatementElement <em>Guarded Statement Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Statement Element</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLGuardedStatementElement
	 * @generated
	 */
	EClass getVHDLGuardedStatementElement();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLIfClause <em>If Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Clause</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLIfClause
	 * @generated
	 */
	EClass getVHDLIfClause();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLElsifClause <em>Elsif Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elsif Clause</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLElsifClause
	 * @generated
	 */
	EClass getVHDLElsifClause();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLElseClause <em>Else Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Clause</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLElseClause
	 * @generated
	 */
	EClass getVHDLElseClause();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLCaseStatement <em>Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Statement</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLCaseStatement
	 * @generated
	 */
	EClass getVHDLCaseStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.coda.vhdl.IVHDLCaseStatement#getCaseStatementAlternatives <em>Case Statement Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Statement Alternatives</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLCaseStatement#getCaseStatementAlternatives()
	 * @see #getVHDLCaseStatement()
	 * @generated
	 */
	EReference getVHDLCaseStatement_CaseStatementAlternatives();

	/**
	 * Returns the meta object for class '{@link ac.soton.coda.vhdl.IVHDLCaseStatementAlternative <em>Case Statement Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Statement Alternative</em>'.
	 * @see ac.soton.coda.vhdl.IVHDLCaseStatementAlternative
	 * @generated
	 */
	EClass getVHDLCaseStatementAlternative();

	/**
	 * Returns the meta object for enum '{@link ac.soton.coda.vhdl.VHDLMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see ac.soton.coda.vhdl.VHDLMode
	 * @generated
	 */
	EEnum getVHDLMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IVHDLFactory getVHDLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLEObject <em>EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLEObject
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEObject()
		 * @generated
		 */
		EClass VHDL_EOBJECT = eINSTANCE.getVHDLEObject();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLNamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLNamedElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLNamedElement()
		 * @generated
		 */
		EClass VHDL_NAMED_ELEMENT = eINSTANCE.getVHDLNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_NAMED_ELEMENT__NAME = eINSTANCE.getVHDLNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLLabelledElement <em>Labelled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLLabelledElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLabelledElement()
		 * @generated
		 */
		EClass VHDL_LABELLED_ELEMENT = eINSTANCE.getVHDLLabelledElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_LABELLED_ELEMENT__LABEL = eINSTANCE.getVHDLLabelledElement_Label();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLIdentifierElement <em>Identifier Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLIdentifierElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLIdentifierElement()
		 * @generated
		 */
		EClass VHDL_IDENTIFIER_ELEMENT = eINSTANCE.getVHDLIdentifierElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_IDENTIFIER_ELEMENT__IDENTIFIER = eINSTANCE.getVHDLIdentifierElement_Identifier();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLBooleanExpressionElement <em>Boolean Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLBooleanExpressionElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLBooleanExpressionElement()
		 * @generated
		 */
		EClass VHDL_BOOLEAN_EXPRESSION_ELEMENT = eINSTANCE.getVHDLBooleanExpressionElement();

		/**
		 * The meta object literal for the '<em><b>Boolean Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION = eINSTANCE.getVHDLBooleanExpressionElement_BooleanExpression();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLExpressionElement <em>Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLExpressionElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLExpressionElement()
		 * @generated
		 */
		EClass VHDL_EXPRESSION_ELEMENT = eINSTANCE.getVHDLExpressionElement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_EXPRESSION_ELEMENT__EXPRESSION = eINSTANCE.getVHDLExpressionElement_Expression();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLSequentialStatementsElement <em>Sequential Statements Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLSequentialStatementsElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSequentialStatementsElement()
		 * @generated
		 */
		EClass VHDL_SEQUENTIAL_STATEMENTS_ELEMENT = eINSTANCE.getVHDLSequentialStatementsElement();

		/**
		 * The meta object literal for the '<em><b>Sequential Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS = eINSTANCE.getVHDLSequentialStatementsElement_SequentialStatements();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLDesignFile <em>Design File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLDesignFile
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLDesignFile()
		 * @generated
		 */
		EClass VHDL_DESIGN_FILE = eINSTANCE.getVHDLDesignFile();

		/**
		 * The meta object literal for the '<em><b>Design Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_DESIGN_FILE__DESIGN_UNITS = eINSTANCE.getVHDLDesignFile_DesignUnits();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLDesignUnit <em>Design Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLDesignUnit
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLDesignUnit()
		 * @generated
		 */
		EClass VHDL_DESIGN_UNIT = eINSTANCE.getVHDLDesignUnit();

		/**
		 * The meta object literal for the '<em><b>Context Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_DESIGN_UNIT__CONTEXT_ITEMS = eINSTANCE.getVHDLDesignUnit_ContextItems();

		/**
		 * The meta object literal for the '<em><b>Library Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_DESIGN_UNIT__LIBRARY_UNIT = eINSTANCE.getVHDLDesignUnit_LibraryUnit();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLContextItem <em>Context Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLContextItem
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLContextItem()
		 * @generated
		 */
		EClass VHDL_CONTEXT_ITEM = eINSTANCE.getVHDLContextItem();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLLibraryClause <em>Library Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLLibraryClause
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLibraryClause()
		 * @generated
		 */
		EClass VHDL_LIBRARY_CLAUSE = eINSTANCE.getVHDLLibraryClause();

		/**
		 * The meta object literal for the '<em><b>Logical Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES = eINSTANCE.getVHDLLibraryClause_LogicalNames();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLLogicalName <em>Logical Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLLogicalName
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLogicalName()
		 * @generated
		 */
		EClass VHDL_LOGICAL_NAME = eINSTANCE.getVHDLLogicalName();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLUseClause <em>Use Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLUseClause
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLUseClause()
		 * @generated
		 */
		EClass VHDL_USE_CLAUSE = eINSTANCE.getVHDLUseClause();

		/**
		 * The meta object literal for the '<em><b>Selected Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_USE_CLAUSE__SELECTED_NAMES = eINSTANCE.getVHDLUseClause_SelectedNames();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLSelectedName <em>Selected Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLSelectedName
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSelectedName()
		 * @generated
		 */
		EClass VHDL_SELECTED_NAME = eINSTANCE.getVHDLSelectedName();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLLibraryUnit <em>Library Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLLibraryUnit
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLLibraryUnit()
		 * @generated
		 */
		EClass VHDL_LIBRARY_UNIT = eINSTANCE.getVHDLLibraryUnit();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLPrimaryUnit <em>Primary Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLPrimaryUnit
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLPrimaryUnit()
		 * @generated
		 */
		EClass VHDL_PRIMARY_UNIT = eINSTANCE.getVHDLPrimaryUnit();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLEntityDeclaration <em>Entity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLEntityDeclaration
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEntityDeclaration()
		 * @generated
		 */
		EClass VHDL_ENTITY_DECLARATION = eINSTANCE.getVHDLEntityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Port Interface List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST = eINSTANCE.getVHDLEntityDeclaration_PortInterfaceList();

		/**
		 * The meta object literal for the '<em><b>Entity Declarative Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS = eINSTANCE.getVHDLEntityDeclaration_EntityDeclarativeItems();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLInterfaceList <em>Interface List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLInterfaceList
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLInterfaceList()
		 * @generated
		 */
		EClass VHDL_INTERFACE_LIST = eINSTANCE.getVHDLInterfaceList();

		/**
		 * The meta object literal for the '<em><b>Interface Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_INTERFACE_LIST__INTERFACE_ELEMENTS = eINSTANCE.getVHDLInterfaceList_InterfaceElements();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLInterfaceElement <em>Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLInterfaceElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLInterfaceElement()
		 * @generated
		 */
		EClass VHDL_INTERFACE_ELEMENT = eINSTANCE.getVHDLInterfaceElement();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration <em>Interface Signal Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLInterfaceSignalDeclaration
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLInterfaceSignalDeclaration()
		 * @generated
		 */
		EClass VHDL_INTERFACE_SIGNAL_DECLARATION = eINSTANCE.getVHDLInterfaceSignalDeclaration();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL = eINSTANCE.getVHDLInterfaceSignalDeclaration_Signal();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_INTERFACE_SIGNAL_DECLARATION__MODE = eINSTANCE.getVHDLInterfaceSignalDeclaration_Mode();

		/**
		 * The meta object literal for the '<em><b>Subtype Indication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION = eINSTANCE.getVHDLInterfaceSignalDeclaration_SubtypeIndication();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLSubtypeIndication <em>Subtype Indication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLSubtypeIndication
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSubtypeIndication()
		 * @generated
		 */
		EClass VHDL_SUBTYPE_INDICATION = eINSTANCE.getVHDLSubtypeIndication();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem <em>Entity Declarative Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEntityDeclarativeItem()
		 * @generated
		 */
		EClass VHDL_ENTITY_DECLARATIVE_ITEM = eINSTANCE.getVHDLEntityDeclarativeItem();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLTypeDeclaration <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLTypeDeclaration
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLTypeDeclaration()
		 * @generated
		 */
		EClass VHDL_TYPE_DECLARATION = eINSTANCE.getVHDLTypeDeclaration();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLFullTypeDeclaration <em>Full Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLFullTypeDeclaration
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLFullTypeDeclaration()
		 * @generated
		 */
		EClass VHDL_FULL_TYPE_DECLARATION = eINSTANCE.getVHDLFullTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION = eINSTANCE.getVHDLFullTypeDeclaration_TypeDefinition();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLTypeDefinition <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLTypeDefinition
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLTypeDefinition()
		 * @generated
		 */
		EClass VHDL_TYPE_DEFINITION = eINSTANCE.getVHDLTypeDefinition();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLScalarTypeDefinition <em>Scalar Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLScalarTypeDefinition
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLScalarTypeDefinition()
		 * @generated
		 */
		EClass VHDL_SCALAR_TYPE_DEFINITION = eINSTANCE.getVHDLScalarTypeDefinition();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLEnumerationTypeDefinition <em>Enumeration Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLEnumerationTypeDefinition
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEnumerationTypeDefinition()
		 * @generated
		 */
		EClass VHDL_ENUMERATION_TYPE_DEFINITION = eINSTANCE.getVHDLEnumerationTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Enumeration Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_ENUMERATION_TYPE_DEFINITION__ENUMERATION_LITERALS = eINSTANCE.getVHDLEnumerationTypeDefinition_EnumerationLiterals();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLEnumerationLiteral <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLEnumerationLiteral
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLEnumerationLiteral()
		 * @generated
		 */
		EClass VHDL_ENUMERATION_LITERAL = eINSTANCE.getVHDLEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLSecondaryUnit <em>Secondary Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLSecondaryUnit
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSecondaryUnit()
		 * @generated
		 */
		EClass VHDL_SECONDARY_UNIT = eINSTANCE.getVHDLSecondaryUnit();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLArchitectureBody <em>Architecture Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLArchitectureBody
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLArchitectureBody()
		 * @generated
		 */
		EClass VHDL_ARCHITECTURE_BODY = eINSTANCE.getVHDLArchitectureBody();

		/**
		 * The meta object literal for the '<em><b>Block Declarative Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS = eINSTANCE.getVHDLArchitectureBody_BlockDeclarativeItems();

		/**
		 * The meta object literal for the '<em><b>Concurrent Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS = eINSTANCE.getVHDLArchitectureBody_ConcurrentStatements();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem <em>Block Declarative Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLBlockDeclarativeItem()
		 * @generated
		 */
		EClass VHDL_BLOCK_DECLARATIVE_ITEM = eINSTANCE.getVHDLBlockDeclarativeItem();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLConcurrentStatement <em>Concurrent Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLConcurrentStatement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLConcurrentStatement()
		 * @generated
		 */
		EClass VHDL_CONCURRENT_STATEMENT = eINSTANCE.getVHDLConcurrentStatement();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLProcessStatement <em>Process Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLProcessStatement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLProcessStatement()
		 * @generated
		 */
		EClass VHDL_PROCESS_STATEMENT = eINSTANCE.getVHDLProcessStatement();

		/**
		 * The meta object literal for the '<em><b>Sensitivity List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST = eINSTANCE.getVHDLProcessStatement_SensitivityList();

		/**
		 * The meta object literal for the '<em><b>Process Declarative Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS = eINSTANCE.getVHDLProcessStatement_ProcessDeclarativeItems();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLSignalName <em>Signal Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLSignalName
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSignalName()
		 * @generated
		 */
		EClass VHDL_SIGNAL_NAME = eINSTANCE.getVHDLSignalName();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem <em>Process Declarative Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLProcessDeclarativeItem()
		 * @generated
		 */
		EClass VHDL_PROCESS_DECLARATIVE_ITEM = eINSTANCE.getVHDLProcessDeclarativeItem();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.IVHDLSequentialStatement <em>Sequential Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.IVHDLSequentialStatement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSequentialStatement()
		 * @generated
		 */
		EClass VHDL_SEQUENTIAL_STATEMENT = eINSTANCE.getVHDLSequentialStatement();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLAssertionStatement <em>Assertion Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLAssertionStatement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLAssertionStatement()
		 * @generated
		 */
		EClass VHDL_ASSERTION_STATEMENT = eINSTANCE.getVHDLAssertionStatement();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_ASSERTION_STATEMENT__ASSERTION = eINSTANCE.getVHDLAssertionStatement_Assertion();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLAssertion <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLAssertion
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLAssertion()
		 * @generated
		 */
		EClass VHDL_ASSERTION = eINSTANCE.getVHDLAssertion();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLSignalAssignmentStatement <em>Signal Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLSignalAssignmentStatement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLSignalAssignmentStatement()
		 * @generated
		 */
		EClass VHDL_SIGNAL_ASSIGNMENT_STATEMENT = eINSTANCE.getVHDLSignalAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_SIGNAL_ASSIGNMENT_STATEMENT__TARGET = eINSTANCE.getVHDLSignalAssignmentStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Waveform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM = eINSTANCE.getVHDLSignalAssignmentStatement_Waveform();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLIfStatement <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLIfStatement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLIfStatement()
		 * @generated
		 */
		EClass VHDL_IF_STATEMENT = eINSTANCE.getVHDLIfStatement();

		/**
		 * The meta object literal for the '<em><b>If Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_IF_STATEMENT__IF_CLAUSE = eINSTANCE.getVHDLIfStatement_IfClause();

		/**
		 * The meta object literal for the '<em><b>Elsif Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_IF_STATEMENT__ELSIF_CLAUSES = eINSTANCE.getVHDLIfStatement_ElsifClauses();

		/**
		 * The meta object literal for the '<em><b>Else Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_IF_STATEMENT__ELSE_CLAUSE = eINSTANCE.getVHDLIfStatement_ElseClause();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLGuardedStatementElement <em>Guarded Statement Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLGuardedStatementElement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLGuardedStatementElement()
		 * @generated
		 */
		EClass VHDL_GUARDED_STATEMENT_ELEMENT = eINSTANCE.getVHDLGuardedStatementElement();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLIfClause <em>If Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLIfClause
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLIfClause()
		 * @generated
		 */
		EClass VHDL_IF_CLAUSE = eINSTANCE.getVHDLIfClause();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLElsifClause <em>Elsif Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLElsifClause
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLElsifClause()
		 * @generated
		 */
		EClass VHDL_ELSIF_CLAUSE = eINSTANCE.getVHDLElsifClause();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLElseClause <em>Else Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLElseClause
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLElseClause()
		 * @generated
		 */
		EClass VHDL_ELSE_CLAUSE = eINSTANCE.getVHDLElseClause();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLCaseStatement <em>Case Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLCaseStatement
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLCaseStatement()
		 * @generated
		 */
		EClass VHDL_CASE_STATEMENT = eINSTANCE.getVHDLCaseStatement();

		/**
		 * The meta object literal for the '<em><b>Case Statement Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES = eINSTANCE.getVHDLCaseStatement_CaseStatementAlternatives();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.impl.VHDLCaseStatementAlternative <em>Case Statement Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.impl.VHDLCaseStatementAlternative
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLCaseStatementAlternative()
		 * @generated
		 */
		EClass VHDL_CASE_STATEMENT_ALTERNATIVE = eINSTANCE.getVHDLCaseStatementAlternative();

		/**
		 * The meta object literal for the '{@link ac.soton.coda.vhdl.VHDLMode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.coda.vhdl.VHDLMode
		 * @see ac.soton.coda.vhdl.impl.VHDLPackage#getVHDLMode()
		 * @generated
		 */
		EEnum VHDL_MODE = eINSTANCE.getVHDLMode();

	}

} //IVHDLPackage
