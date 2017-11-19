/*******************************************************************************
 * (c) Crown owned copyright (2017) (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      University of Southampton - Initial API and implementation
 *******************************************************************************/

package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLAssertion;
import ac.soton.coda.vhdl.IVHDLAssertionStatement;
import ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLBooleanExpressionElement;
import ac.soton.coda.vhdl.IVHDLCaseStatement;
import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLConcurrentStatement;
import ac.soton.coda.vhdl.IVHDLContextItem;
import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLEObject;
import ac.soton.coda.vhdl.IVHDLElseClause;
import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLEnumerationLiteral;
import ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition;
import ac.soton.coda.vhdl.IVHDLExpressionElement;
import ac.soton.coda.vhdl.IVHDLFactory;
import ac.soton.coda.vhdl.IVHDLFullTypeDeclaration;
import ac.soton.coda.vhdl.IVHDLGuardedStatementElement;
import ac.soton.coda.vhdl.IVHDLIdentifierElement;
import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLIfStatement;
import ac.soton.coda.vhdl.IVHDLInterfaceElement;
import ac.soton.coda.vhdl.IVHDLInterfaceList;
import ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration;
import ac.soton.coda.vhdl.IVHDLLabelledElement;
import ac.soton.coda.vhdl.IVHDLLibraryClause;
import ac.soton.coda.vhdl.IVHDLLibraryUnit;
import ac.soton.coda.vhdl.IVHDLLogicalName;
import ac.soton.coda.vhdl.IVHDLNamedElement;
import ac.soton.coda.vhdl.IVHDLPackage;
import ac.soton.coda.vhdl.IVHDLPrimaryUnit;
import ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.IVHDLScalarTypeDefinition;
import ac.soton.coda.vhdl.IVHDLSecondaryUnit;
import ac.soton.coda.vhdl.IVHDLSelectedName;
import ac.soton.coda.vhdl.IVHDLSequentialStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatementsElement;
import ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement;
import ac.soton.coda.vhdl.IVHDLSignalName;
import ac.soton.coda.vhdl.IVHDLSubtypeIndication;
import ac.soton.coda.vhdl.IVHDLTypeDeclaration;
import ac.soton.coda.vhdl.IVHDLTypeDefinition;
import ac.soton.coda.vhdl.IVHDLUseClause;
import ac.soton.coda.vhdl.VHDLMode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLPackage extends EPackageImpl implements IVHDLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdleObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlLabelledElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlIdentifierElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlBooleanExpressionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlExpressionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSequentialStatementsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlDesignFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlDesignUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlContextItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlLibraryClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlLogicalNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlUseClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSelectedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlLibraryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlPrimaryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlEntityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlInterfaceListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlInterfaceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlInterfaceSignalDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSubtypeIndicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlEntityDeclarativeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlFullTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlScalarTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlEnumerationTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSecondaryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlArchitectureBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlBlockDeclarativeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlConcurrentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlProcessStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSignalNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlProcessDeclarativeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSequentialStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlAssertionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSignalAssignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlIfStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlGuardedStatementElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlIfClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlElsifClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlElseClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlCaseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlCaseStatementAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vhdlModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.soton.coda.vhdl.IVHDLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VHDLPackage() {
		super(eNS_URI, IVHDLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IVHDLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IVHDLPackage init() {
		if (isInited) return (IVHDLPackage)EPackage.Registry.INSTANCE.getEPackage(IVHDLPackage.eNS_URI);

		// Obtain or create and register package
		VHDLPackage theVHDLPackage = (VHDLPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VHDLPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VHDLPackage());

		isInited = true;

		// Create package meta-data objects
		theVHDLPackage.createPackageContents();

		// Initialize created meta-data
		theVHDLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVHDLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IVHDLPackage.eNS_URI, theVHDLPackage);
		return theVHDLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLEObject() {
		return vhdleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLNamedElement() {
		return vhdlNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLNamedElement_Name() {
		return (EAttribute)vhdlNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLLabelledElement() {
		return vhdlLabelledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLLabelledElement_Label() {
		return (EAttribute)vhdlLabelledElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLIdentifierElement() {
		return vhdlIdentifierElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLIdentifierElement_Identifier() {
		return (EAttribute)vhdlIdentifierElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLBooleanExpressionElement() {
		return vhdlBooleanExpressionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLBooleanExpressionElement_BooleanExpression() {
		return (EAttribute)vhdlBooleanExpressionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLExpressionElement() {
		return vhdlExpressionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLExpressionElement_Expression() {
		return (EAttribute)vhdlExpressionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSequentialStatementsElement() {
		return vhdlSequentialStatementsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLSequentialStatementsElement_SequentialStatements() {
		return (EReference)vhdlSequentialStatementsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLDesignFile() {
		return vhdlDesignFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLDesignFile_DesignUnits() {
		return (EReference)vhdlDesignFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLDesignUnit() {
		return vhdlDesignUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLDesignUnit_ContextItems() {
		return (EReference)vhdlDesignUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLDesignUnit_LibraryUnit() {
		return (EReference)vhdlDesignUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLContextItem() {
		return vhdlContextItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLLibraryClause() {
		return vhdlLibraryClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLLibraryClause_LogicalNames() {
		return (EReference)vhdlLibraryClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLLogicalName() {
		return vhdlLogicalNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLUseClause() {
		return vhdlUseClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLUseClause_SelectedNames() {
		return (EReference)vhdlUseClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSelectedName() {
		return vhdlSelectedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLLibraryUnit() {
		return vhdlLibraryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLPrimaryUnit() {
		return vhdlPrimaryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLEntityDeclaration() {
		return vhdlEntityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLEntityDeclaration_PortInterfaceList() {
		return (EReference)vhdlEntityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLEntityDeclaration_EntityDeclarativeItems() {
		return (EReference)vhdlEntityDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLInterfaceList() {
		return vhdlInterfaceListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLInterfaceList_InterfaceElements() {
		return (EReference)vhdlInterfaceListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLInterfaceElement() {
		return vhdlInterfaceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLInterfaceSignalDeclaration() {
		return vhdlInterfaceSignalDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLInterfaceSignalDeclaration_Signal() {
		return (EAttribute)vhdlInterfaceSignalDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLInterfaceSignalDeclaration_Mode() {
		return (EAttribute)vhdlInterfaceSignalDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLInterfaceSignalDeclaration_SubtypeIndication() {
		return (EReference)vhdlInterfaceSignalDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSubtypeIndication() {
		return vhdlSubtypeIndicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLEntityDeclarativeItem() {
		return vhdlEntityDeclarativeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLTypeDeclaration() {
		return vhdlTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLFullTypeDeclaration() {
		return vhdlFullTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLFullTypeDeclaration_TypeDefinition() {
		return (EReference)vhdlFullTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLTypeDefinition() {
		return vhdlTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLScalarTypeDefinition() {
		return vhdlScalarTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLEnumerationTypeDefinition() {
		return vhdlEnumerationTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLEnumerationTypeDefinition_EnumerationLiterals() {
		return (EReference)vhdlEnumerationTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLEnumerationLiteral() {
		return vhdlEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSecondaryUnit() {
		return vhdlSecondaryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLArchitectureBody() {
		return vhdlArchitectureBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLArchitectureBody_BlockDeclarativeItems() {
		return (EReference)vhdlArchitectureBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLArchitectureBody_ConcurrentStatements() {
		return (EReference)vhdlArchitectureBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLBlockDeclarativeItem() {
		return vhdlBlockDeclarativeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLConcurrentStatement() {
		return vhdlConcurrentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLProcessStatement() {
		return vhdlProcessStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLProcessStatement_SensitivityList() {
		return (EReference)vhdlProcessStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLProcessStatement_ProcessDeclarativeItems() {
		return (EReference)vhdlProcessStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSignalName() {
		return vhdlSignalNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLProcessDeclarativeItem() {
		return vhdlProcessDeclarativeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSequentialStatement() {
		return vhdlSequentialStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLAssertionStatement() {
		return vhdlAssertionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLAssertionStatement_Assertion() {
		return (EReference)vhdlAssertionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLAssertion() {
		return vhdlAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSignalAssignmentStatement() {
		return vhdlSignalAssignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLSignalAssignmentStatement_Target() {
		return (EAttribute)vhdlSignalAssignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLSignalAssignmentStatement_Waveform() {
		return (EAttribute)vhdlSignalAssignmentStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLIfStatement() {
		return vhdlIfStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLIfStatement_IfClause() {
		return (EReference)vhdlIfStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLIfStatement_ElsifClauses() {
		return (EReference)vhdlIfStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLIfStatement_ElseClause() {
		return (EReference)vhdlIfStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLGuardedStatementElement() {
		return vhdlGuardedStatementElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLIfClause() {
		return vhdlIfClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLElsifClause() {
		return vhdlElsifClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLElseClause() {
		return vhdlElseClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLCaseStatement() {
		return vhdlCaseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLCaseStatement_CaseStatementAlternatives() {
		return (EReference)vhdlCaseStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLCaseStatementAlternative() {
		return vhdlCaseStatementAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVHDLMode() {
		return vhdlModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLFactory getVHDLFactory() {
		return (IVHDLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vhdleObjectEClass = createEClass(VHDL_EOBJECT);

		vhdlNamedElementEClass = createEClass(VHDL_NAMED_ELEMENT);
		createEAttribute(vhdlNamedElementEClass, VHDL_NAMED_ELEMENT__NAME);

		vhdlLabelledElementEClass = createEClass(VHDL_LABELLED_ELEMENT);
		createEAttribute(vhdlLabelledElementEClass, VHDL_LABELLED_ELEMENT__LABEL);

		vhdlIdentifierElementEClass = createEClass(VHDL_IDENTIFIER_ELEMENT);
		createEAttribute(vhdlIdentifierElementEClass, VHDL_IDENTIFIER_ELEMENT__IDENTIFIER);

		vhdlBooleanExpressionElementEClass = createEClass(VHDL_BOOLEAN_EXPRESSION_ELEMENT);
		createEAttribute(vhdlBooleanExpressionElementEClass, VHDL_BOOLEAN_EXPRESSION_ELEMENT__BOOLEAN_EXPRESSION);

		vhdlExpressionElementEClass = createEClass(VHDL_EXPRESSION_ELEMENT);
		createEAttribute(vhdlExpressionElementEClass, VHDL_EXPRESSION_ELEMENT__EXPRESSION);

		vhdlSequentialStatementsElementEClass = createEClass(VHDL_SEQUENTIAL_STATEMENTS_ELEMENT);
		createEReference(vhdlSequentialStatementsElementEClass, VHDL_SEQUENTIAL_STATEMENTS_ELEMENT__SEQUENTIAL_STATEMENTS);

		vhdlDesignFileEClass = createEClass(VHDL_DESIGN_FILE);
		createEReference(vhdlDesignFileEClass, VHDL_DESIGN_FILE__DESIGN_UNITS);

		vhdlDesignUnitEClass = createEClass(VHDL_DESIGN_UNIT);
		createEReference(vhdlDesignUnitEClass, VHDL_DESIGN_UNIT__CONTEXT_ITEMS);
		createEReference(vhdlDesignUnitEClass, VHDL_DESIGN_UNIT__LIBRARY_UNIT);

		vhdlContextItemEClass = createEClass(VHDL_CONTEXT_ITEM);

		vhdlLibraryClauseEClass = createEClass(VHDL_LIBRARY_CLAUSE);
		createEReference(vhdlLibraryClauseEClass, VHDL_LIBRARY_CLAUSE__LOGICAL_NAMES);

		vhdlLogicalNameEClass = createEClass(VHDL_LOGICAL_NAME);

		vhdlUseClauseEClass = createEClass(VHDL_USE_CLAUSE);
		createEReference(vhdlUseClauseEClass, VHDL_USE_CLAUSE__SELECTED_NAMES);

		vhdlSelectedNameEClass = createEClass(VHDL_SELECTED_NAME);

		vhdlLibraryUnitEClass = createEClass(VHDL_LIBRARY_UNIT);

		vhdlPrimaryUnitEClass = createEClass(VHDL_PRIMARY_UNIT);

		vhdlEntityDeclarationEClass = createEClass(VHDL_ENTITY_DECLARATION);
		createEReference(vhdlEntityDeclarationEClass, VHDL_ENTITY_DECLARATION__PORT_INTERFACE_LIST);
		createEReference(vhdlEntityDeclarationEClass, VHDL_ENTITY_DECLARATION__ENTITY_DECLARATIVE_ITEMS);

		vhdlInterfaceListEClass = createEClass(VHDL_INTERFACE_LIST);
		createEReference(vhdlInterfaceListEClass, VHDL_INTERFACE_LIST__INTERFACE_ELEMENTS);

		vhdlInterfaceElementEClass = createEClass(VHDL_INTERFACE_ELEMENT);

		vhdlInterfaceSignalDeclarationEClass = createEClass(VHDL_INTERFACE_SIGNAL_DECLARATION);
		createEAttribute(vhdlInterfaceSignalDeclarationEClass, VHDL_INTERFACE_SIGNAL_DECLARATION__SIGNAL);
		createEAttribute(vhdlInterfaceSignalDeclarationEClass, VHDL_INTERFACE_SIGNAL_DECLARATION__MODE);
		createEReference(vhdlInterfaceSignalDeclarationEClass, VHDL_INTERFACE_SIGNAL_DECLARATION__SUBTYPE_INDICATION);

		vhdlSubtypeIndicationEClass = createEClass(VHDL_SUBTYPE_INDICATION);

		vhdlEntityDeclarativeItemEClass = createEClass(VHDL_ENTITY_DECLARATIVE_ITEM);

		vhdlTypeDeclarationEClass = createEClass(VHDL_TYPE_DECLARATION);

		vhdlFullTypeDeclarationEClass = createEClass(VHDL_FULL_TYPE_DECLARATION);
		createEReference(vhdlFullTypeDeclarationEClass, VHDL_FULL_TYPE_DECLARATION__TYPE_DEFINITION);

		vhdlTypeDefinitionEClass = createEClass(VHDL_TYPE_DEFINITION);

		vhdlScalarTypeDefinitionEClass = createEClass(VHDL_SCALAR_TYPE_DEFINITION);

		vhdlEnumerationTypeDefinitionEClass = createEClass(VHDL_ENUMERATION_TYPE_DEFINITION);
		createEReference(vhdlEnumerationTypeDefinitionEClass, VHDL_ENUMERATION_TYPE_DEFINITION__ENUMERATION_LITERALS);

		vhdlEnumerationLiteralEClass = createEClass(VHDL_ENUMERATION_LITERAL);

		vhdlSecondaryUnitEClass = createEClass(VHDL_SECONDARY_UNIT);

		vhdlArchitectureBodyEClass = createEClass(VHDL_ARCHITECTURE_BODY);
		createEReference(vhdlArchitectureBodyEClass, VHDL_ARCHITECTURE_BODY__BLOCK_DECLARATIVE_ITEMS);
		createEReference(vhdlArchitectureBodyEClass, VHDL_ARCHITECTURE_BODY__CONCURRENT_STATEMENTS);

		vhdlBlockDeclarativeItemEClass = createEClass(VHDL_BLOCK_DECLARATIVE_ITEM);

		vhdlConcurrentStatementEClass = createEClass(VHDL_CONCURRENT_STATEMENT);

		vhdlProcessStatementEClass = createEClass(VHDL_PROCESS_STATEMENT);
		createEReference(vhdlProcessStatementEClass, VHDL_PROCESS_STATEMENT__SENSITIVITY_LIST);
		createEReference(vhdlProcessStatementEClass, VHDL_PROCESS_STATEMENT__PROCESS_DECLARATIVE_ITEMS);

		vhdlSignalNameEClass = createEClass(VHDL_SIGNAL_NAME);

		vhdlProcessDeclarativeItemEClass = createEClass(VHDL_PROCESS_DECLARATIVE_ITEM);

		vhdlSequentialStatementEClass = createEClass(VHDL_SEQUENTIAL_STATEMENT);

		vhdlAssertionStatementEClass = createEClass(VHDL_ASSERTION_STATEMENT);
		createEReference(vhdlAssertionStatementEClass, VHDL_ASSERTION_STATEMENT__ASSERTION);

		vhdlAssertionEClass = createEClass(VHDL_ASSERTION);

		vhdlSignalAssignmentStatementEClass = createEClass(VHDL_SIGNAL_ASSIGNMENT_STATEMENT);
		createEAttribute(vhdlSignalAssignmentStatementEClass, VHDL_SIGNAL_ASSIGNMENT_STATEMENT__TARGET);
		createEAttribute(vhdlSignalAssignmentStatementEClass, VHDL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM);

		vhdlIfStatementEClass = createEClass(VHDL_IF_STATEMENT);
		createEReference(vhdlIfStatementEClass, VHDL_IF_STATEMENT__IF_CLAUSE);
		createEReference(vhdlIfStatementEClass, VHDL_IF_STATEMENT__ELSIF_CLAUSES);
		createEReference(vhdlIfStatementEClass, VHDL_IF_STATEMENT__ELSE_CLAUSE);

		vhdlGuardedStatementElementEClass = createEClass(VHDL_GUARDED_STATEMENT_ELEMENT);

		vhdlIfClauseEClass = createEClass(VHDL_IF_CLAUSE);

		vhdlElsifClauseEClass = createEClass(VHDL_ELSIF_CLAUSE);

		vhdlElseClauseEClass = createEClass(VHDL_ELSE_CLAUSE);

		vhdlCaseStatementEClass = createEClass(VHDL_CASE_STATEMENT);
		createEReference(vhdlCaseStatementEClass, VHDL_CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES);

		vhdlCaseStatementAlternativeEClass = createEClass(VHDL_CASE_STATEMENT_ALTERNATIVE);

		// Create enums
		vhdlModeEEnum = createEEnum(VHDL_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vhdlNamedElementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlLabelledElementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlIdentifierElementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlBooleanExpressionElementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlExpressionElementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlSequentialStatementsElementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlDesignFileEClass.getESuperTypes().add(this.getVHDLLabelledElement());
		vhdlDesignUnitEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlContextItemEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlLibraryClauseEClass.getESuperTypes().add(this.getVHDLContextItem());
		vhdlLogicalNameEClass.getESuperTypes().add(this.getVHDLIdentifierElement());
		vhdlUseClauseEClass.getESuperTypes().add(this.getVHDLContextItem());
		vhdlSelectedNameEClass.getESuperTypes().add(this.getVHDLNamedElement());
		vhdlLibraryUnitEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlPrimaryUnitEClass.getESuperTypes().add(this.getVHDLLibraryUnit());
		vhdlEntityDeclarationEClass.getESuperTypes().add(this.getVHDLPrimaryUnit());
		vhdlEntityDeclarationEClass.getESuperTypes().add(this.getVHDLIdentifierElement());
		vhdlInterfaceListEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlInterfaceElementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlInterfaceSignalDeclarationEClass.getESuperTypes().add(this.getVHDLBlockDeclarativeItem());
		vhdlInterfaceSignalDeclarationEClass.getESuperTypes().add(this.getVHDLIdentifierElement());
		vhdlInterfaceSignalDeclarationEClass.getESuperTypes().add(this.getVHDLInterfaceElement());
		vhdlSubtypeIndicationEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlSubtypeIndicationEClass.getESuperTypes().add(this.getVHDLNamedElement());
		vhdlEntityDeclarativeItemEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlTypeDeclarationEClass.getESuperTypes().add(this.getVHDLEntityDeclarativeItem());
		vhdlTypeDeclarationEClass.getESuperTypes().add(this.getVHDLBlockDeclarativeItem());
		vhdlTypeDeclarationEClass.getESuperTypes().add(this.getVHDLProcessDeclarativeItem());
		vhdlFullTypeDeclarationEClass.getESuperTypes().add(this.getVHDLTypeDeclaration());
		vhdlFullTypeDeclarationEClass.getESuperTypes().add(this.getVHDLIdentifierElement());
		vhdlTypeDefinitionEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlScalarTypeDefinitionEClass.getESuperTypes().add(this.getVHDLTypeDefinition());
		vhdlEnumerationTypeDefinitionEClass.getESuperTypes().add(this.getVHDLScalarTypeDefinition());
		vhdlEnumerationLiteralEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlEnumerationLiteralEClass.getESuperTypes().add(this.getVHDLNamedElement());
		vhdlSecondaryUnitEClass.getESuperTypes().add(this.getVHDLLibraryUnit());
		vhdlArchitectureBodyEClass.getESuperTypes().add(this.getVHDLSecondaryUnit());
		vhdlArchitectureBodyEClass.getESuperTypes().add(this.getVHDLIdentifierElement());
		vhdlArchitectureBodyEClass.getESuperTypes().add(this.getVHDLNamedElement());
		vhdlBlockDeclarativeItemEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlConcurrentStatementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlProcessStatementEClass.getESuperTypes().add(this.getVHDLConcurrentStatement());
		vhdlProcessStatementEClass.getESuperTypes().add(this.getVHDLSequentialStatementsElement());
		vhdlSignalNameEClass.getESuperTypes().add(this.getVHDLNamedElement());
		vhdlProcessDeclarativeItemEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlSequentialStatementEClass.getESuperTypes().add(this.getVHDLEObject());
		vhdlAssertionStatementEClass.getESuperTypes().add(this.getVHDLSequentialStatement());
		vhdlAssertionStatementEClass.getESuperTypes().add(this.getVHDLLabelledElement());
		vhdlAssertionEClass.getESuperTypes().add(this.getVHDLBooleanExpressionElement());
		vhdlSignalAssignmentStatementEClass.getESuperTypes().add(this.getVHDLSequentialStatement());
		vhdlIfStatementEClass.getESuperTypes().add(this.getVHDLSequentialStatement());
		vhdlGuardedStatementElementEClass.getESuperTypes().add(this.getVHDLBooleanExpressionElement());
		vhdlGuardedStatementElementEClass.getESuperTypes().add(this.getVHDLSequentialStatementsElement());
		vhdlIfClauseEClass.getESuperTypes().add(this.getVHDLGuardedStatementElement());
		vhdlElsifClauseEClass.getESuperTypes().add(this.getVHDLGuardedStatementElement());
		vhdlElseClauseEClass.getESuperTypes().add(this.getVHDLSequentialStatementsElement());
		vhdlCaseStatementEClass.getESuperTypes().add(this.getVHDLSequentialStatement());
		vhdlCaseStatementEClass.getESuperTypes().add(this.getVHDLExpressionElement());
		vhdlCaseStatementAlternativeEClass.getESuperTypes().add(this.getVHDLLabelledElement());
		vhdlCaseStatementAlternativeEClass.getESuperTypes().add(this.getVHDLSequentialStatementsElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(vhdleObjectEClass, IVHDLEObject.class, "VHDLEObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlNamedElementEClass, IVHDLNamedElement.class, "VHDLNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVHDLNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IVHDLNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlLabelledElementEClass, IVHDLLabelledElement.class, "VHDLLabelledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVHDLLabelledElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, IVHDLLabelledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlIdentifierElementEClass, IVHDLIdentifierElement.class, "VHDLIdentifierElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVHDLIdentifierElement_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, IVHDLIdentifierElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlBooleanExpressionElementEClass, IVHDLBooleanExpressionElement.class, "VHDLBooleanExpressionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVHDLBooleanExpressionElement_BooleanExpression(), ecorePackage.getEString(), "booleanExpression", null, 1, 1, IVHDLBooleanExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlExpressionElementEClass, IVHDLExpressionElement.class, "VHDLExpressionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVHDLExpressionElement_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, IVHDLExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlSequentialStatementsElementEClass, IVHDLSequentialStatementsElement.class, "VHDLSequentialStatementsElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLSequentialStatementsElement_SequentialStatements(), this.getVHDLSequentialStatement(), null, "sequentialStatements", null, 0, -1, IVHDLSequentialStatementsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlDesignFileEClass, IVHDLDesignFile.class, "VHDLDesignFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLDesignFile_DesignUnits(), this.getVHDLDesignUnit(), null, "designUnits", null, 1, -1, IVHDLDesignFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlDesignUnitEClass, IVHDLDesignUnit.class, "VHDLDesignUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLDesignUnit_ContextItems(), this.getVHDLContextItem(), null, "contextItems", null, 0, -1, IVHDLDesignUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVHDLDesignUnit_LibraryUnit(), this.getVHDLLibraryUnit(), null, "libraryUnit", null, 1, 1, IVHDLDesignUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlContextItemEClass, IVHDLContextItem.class, "VHDLContextItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlLibraryClauseEClass, IVHDLLibraryClause.class, "VHDLLibraryClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLLibraryClause_LogicalNames(), this.getVHDLLogicalName(), null, "logicalNames", null, 1, -1, IVHDLLibraryClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlLogicalNameEClass, IVHDLLogicalName.class, "VHDLLogicalName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlUseClauseEClass, IVHDLUseClause.class, "VHDLUseClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLUseClause_SelectedNames(), this.getVHDLSelectedName(), null, "selectedNames", null, 1, -1, IVHDLUseClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlSelectedNameEClass, IVHDLSelectedName.class, "VHDLSelectedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlLibraryUnitEClass, IVHDLLibraryUnit.class, "VHDLLibraryUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlPrimaryUnitEClass, IVHDLPrimaryUnit.class, "VHDLPrimaryUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlEntityDeclarationEClass, IVHDLEntityDeclaration.class, "VHDLEntityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLEntityDeclaration_PortInterfaceList(), this.getVHDLInterfaceList(), null, "portInterfaceList", null, 0, 1, IVHDLEntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVHDLEntityDeclaration_EntityDeclarativeItems(), this.getVHDLEntityDeclarativeItem(), null, "entityDeclarativeItems", null, 0, -1, IVHDLEntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlInterfaceListEClass, IVHDLInterfaceList.class, "VHDLInterfaceList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLInterfaceList_InterfaceElements(), this.getVHDLInterfaceElement(), null, "interfaceElements", null, 1, -1, IVHDLInterfaceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlInterfaceElementEClass, IVHDLInterfaceElement.class, "VHDLInterfaceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlInterfaceSignalDeclarationEClass, IVHDLInterfaceSignalDeclaration.class, "VHDLInterfaceSignalDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVHDLInterfaceSignalDeclaration_Signal(), ecorePackage.getEBoolean(), "signal", null, 0, 1, IVHDLInterfaceSignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVHDLInterfaceSignalDeclaration_Mode(), this.getVHDLMode(), "mode", null, 0, 1, IVHDLInterfaceSignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVHDLInterfaceSignalDeclaration_SubtypeIndication(), this.getVHDLSubtypeIndication(), null, "subtypeIndication", null, 1, 1, IVHDLInterfaceSignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlSubtypeIndicationEClass, IVHDLSubtypeIndication.class, "VHDLSubtypeIndication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlEntityDeclarativeItemEClass, IVHDLEntityDeclarativeItem.class, "VHDLEntityDeclarativeItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlTypeDeclarationEClass, IVHDLTypeDeclaration.class, "VHDLTypeDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlFullTypeDeclarationEClass, IVHDLFullTypeDeclaration.class, "VHDLFullTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLFullTypeDeclaration_TypeDefinition(), this.getVHDLTypeDefinition(), null, "typeDefinition", null, 1, 1, IVHDLFullTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlTypeDefinitionEClass, IVHDLTypeDefinition.class, "VHDLTypeDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlScalarTypeDefinitionEClass, IVHDLScalarTypeDefinition.class, "VHDLScalarTypeDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlEnumerationTypeDefinitionEClass, IVHDLEnumerationTypeDefinition.class, "VHDLEnumerationTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLEnumerationTypeDefinition_EnumerationLiterals(), this.getVHDLEnumerationLiteral(), null, "enumerationLiterals", null, 1, -1, IVHDLEnumerationTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlEnumerationLiteralEClass, IVHDLEnumerationLiteral.class, "VHDLEnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlSecondaryUnitEClass, IVHDLSecondaryUnit.class, "VHDLSecondaryUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlArchitectureBodyEClass, IVHDLArchitectureBody.class, "VHDLArchitectureBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLArchitectureBody_BlockDeclarativeItems(), this.getVHDLBlockDeclarativeItem(), null, "blockDeclarativeItems", null, 0, -1, IVHDLArchitectureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVHDLArchitectureBody_ConcurrentStatements(), this.getVHDLConcurrentStatement(), null, "concurrentStatements", null, 0, -1, IVHDLArchitectureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlBlockDeclarativeItemEClass, IVHDLBlockDeclarativeItem.class, "VHDLBlockDeclarativeItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlConcurrentStatementEClass, IVHDLConcurrentStatement.class, "VHDLConcurrentStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlProcessStatementEClass, IVHDLProcessStatement.class, "VHDLProcessStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLProcessStatement_SensitivityList(), this.getVHDLSignalName(), null, "sensitivityList", null, 0, -1, IVHDLProcessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVHDLProcessStatement_ProcessDeclarativeItems(), this.getVHDLProcessDeclarativeItem(), null, "processDeclarativeItems", null, 0, -1, IVHDLProcessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlSignalNameEClass, IVHDLSignalName.class, "VHDLSignalName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlProcessDeclarativeItemEClass, IVHDLProcessDeclarativeItem.class, "VHDLProcessDeclarativeItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlSequentialStatementEClass, IVHDLSequentialStatement.class, "VHDLSequentialStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlAssertionStatementEClass, IVHDLAssertionStatement.class, "VHDLAssertionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLAssertionStatement_Assertion(), this.getVHDLAssertion(), null, "assertion", null, 1, 1, IVHDLAssertionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlAssertionEClass, IVHDLAssertion.class, "VHDLAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlSignalAssignmentStatementEClass, IVHDLSignalAssignmentStatement.class, "VHDLSignalAssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVHDLSignalAssignmentStatement_Target(), ecorePackage.getEString(), "target", null, 1, 1, IVHDLSignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVHDLSignalAssignmentStatement_Waveform(), ecorePackage.getEString(), "waveform", null, 1, 1, IVHDLSignalAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlIfStatementEClass, IVHDLIfStatement.class, "VHDLIfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLIfStatement_IfClause(), this.getVHDLIfClause(), null, "ifClause", null, 1, 1, IVHDLIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVHDLIfStatement_ElsifClauses(), this.getVHDLElsifClause(), null, "elsifClauses", null, 0, -1, IVHDLIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVHDLIfStatement_ElseClause(), this.getVHDLElseClause(), null, "elseClause", null, 0, 1, IVHDLIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlGuardedStatementElementEClass, IVHDLGuardedStatementElement.class, "VHDLGuardedStatementElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlIfClauseEClass, IVHDLIfClause.class, "VHDLIfClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlElsifClauseEClass, IVHDLElsifClause.class, "VHDLElsifClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlElseClauseEClass, IVHDLElseClause.class, "VHDLElseClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlCaseStatementEClass, IVHDLCaseStatement.class, "VHDLCaseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLCaseStatement_CaseStatementAlternatives(), this.getVHDLCaseStatementAlternative(), null, "caseStatementAlternatives", null, 1, -1, IVHDLCaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vhdlCaseStatementAlternativeEClass, IVHDLCaseStatementAlternative.class, "VHDLCaseStatementAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(vhdlModeEEnum, VHDLMode.class, "VHDLMode");
		addEEnumLiteral(vhdlModeEEnum, VHDLMode.IN);
		addEEnumLiteral(vhdlModeEEnum, VHDLMode.OUT);
		addEEnumLiteral(vhdlModeEEnum, VHDLMode.INOUT);

		// Create resource
		createResource(eNS_URI);
	}

} //VHDLPackage
