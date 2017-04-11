/*******************************************************************************
 * (c) Crown owned copyright 2015, 2017 (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials  are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This is to identify the UK Ministry of Defence as owners along with the
 * license rights provided.
 *
 * Contributors:
 *     University of Southampton - Initial API and implementation
 *******************************************************************************/

package ac.soton.coda.vhdl.impl;

import ac.soton.coda.vhdl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLFactory extends EFactoryImpl implements IVHDLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IVHDLFactory init() {
		try {
			IVHDLFactory theVHDLFactory = (IVHDLFactory)EPackage.Registry.INSTANCE.getEFactory(IVHDLPackage.eNS_URI);
			if (theVHDLFactory != null) {
				return theVHDLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VHDLFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IVHDLPackage.VHDL_EXPRESSION_ELEMENT: return createVHDLExpressionElement();
			case IVHDLPackage.VHDL_DESIGN_FILE: return createVHDLDesignFile();
			case IVHDLPackage.VHDL_DESIGN_UNIT: return createVHDLDesignUnit();
			case IVHDLPackage.VHDL_LIBRARY_CLAUSE: return createVHDLLibraryClause();
			case IVHDLPackage.VHDL_LOGICAL_NAME: return createVHDLLogicalName();
			case IVHDLPackage.VHDL_USE_CLAUSE: return createVHDLUseClause();
			case IVHDLPackage.VHDL_SELECTED_NAME: return createVHDLSelectedName();
			case IVHDLPackage.VHDL_ENTITY_DECLARATION: return createVHDLEntityDeclaration();
			case IVHDLPackage.VHDL_INTERFACE_LIST: return createVHDLInterfaceList();
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION: return createVHDLInterfaceSignalDeclaration();
			case IVHDLPackage.VHDL_SUBTYPE_INDICATION: return createVHDLSubtypeIndication();
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION: return createVHDLFullTypeDeclaration();
			case IVHDLPackage.VHDL_ENUMERATION_TYPE_DEFINITION: return createVHDLEnumerationTypeDefinition();
			case IVHDLPackage.VHDL_ENUMERATION_LITERAL: return createVHDLEnumerationLiteral();
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY: return createVHDLArchitectureBody();
			case IVHDLPackage.VHDL_PROCESS_STATEMENT: return createVHDLProcessStatement();
			case IVHDLPackage.VHDL_SIGNAL_NAME: return createVHDLSignalName();
			case IVHDLPackage.VHDL_ASSERTION_STATEMENT: return createVHDLAssertionStatement();
			case IVHDLPackage.VHDL_ASSERTION: return createVHDLAssertion();
			case IVHDLPackage.VHDL_SIGNAL_ASSIGNMENT_STATEMENT: return createVHDLSignalAssignmentStatement();
			case IVHDLPackage.VHDL_IF_STATEMENT: return createVHDLIfStatement();
			case IVHDLPackage.VHDL_IF_CLAUSE: return createVHDLIfClause();
			case IVHDLPackage.VHDL_ELSIF_CLAUSE: return createVHDLElsifClause();
			case IVHDLPackage.VHDL_ELSE_CLAUSE: return createVHDLElseClause();
			case IVHDLPackage.VHDL_CASE_STATEMENT: return createVHDLCaseStatement();
			case IVHDLPackage.VHDL_CASE_STATEMENT_ALTERNATIVE: return createVHDLCaseStatementAlternative();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IVHDLPackage.VHDL_MODE:
				return createVHDLModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IVHDLPackage.VHDL_MODE:
				return convertVHDLModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLExpressionElement createVHDLExpressionElement() {
		VHDLExpressionElement vhdlExpressionElement = new VHDLExpressionElement();
		return vhdlExpressionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLDesignFile createVHDLDesignFile() {
		VHDLDesignFile vhdlDesignFile = new VHDLDesignFile();
		return vhdlDesignFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLDesignUnit createVHDLDesignUnit() {
		VHDLDesignUnit vhdlDesignUnit = new VHDLDesignUnit();
		return vhdlDesignUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLLibraryClause createVHDLLibraryClause() {
		VHDLLibraryClause vhdlLibraryClause = new VHDLLibraryClause();
		return vhdlLibraryClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLLogicalName createVHDLLogicalName() {
		VHDLLogicalName vhdlLogicalName = new VHDLLogicalName();
		return vhdlLogicalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLUseClause createVHDLUseClause() {
		VHDLUseClause vhdlUseClause = new VHDLUseClause();
		return vhdlUseClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLSelectedName createVHDLSelectedName() {
		VHDLSelectedName vhdlSelectedName = new VHDLSelectedName();
		return vhdlSelectedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLEntityDeclaration createVHDLEntityDeclaration() {
		VHDLEntityDeclaration vhdlEntityDeclaration = new VHDLEntityDeclaration();
		return vhdlEntityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLInterfaceList createVHDLInterfaceList() {
		VHDLInterfaceList vhdlInterfaceList = new VHDLInterfaceList();
		return vhdlInterfaceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLInterfaceSignalDeclaration createVHDLInterfaceSignalDeclaration() {
		VHDLInterfaceSignalDeclaration vhdlInterfaceSignalDeclaration = new VHDLInterfaceSignalDeclaration();
		return vhdlInterfaceSignalDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLSubtypeIndication createVHDLSubtypeIndication() {
		VHDLSubtypeIndication vhdlSubtypeIndication = new VHDLSubtypeIndication();
		return vhdlSubtypeIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLFullTypeDeclaration createVHDLFullTypeDeclaration() {
		VHDLFullTypeDeclaration vhdlFullTypeDeclaration = new VHDLFullTypeDeclaration();
		return vhdlFullTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLEnumerationTypeDefinition createVHDLEnumerationTypeDefinition() {
		VHDLEnumerationTypeDefinition vhdlEnumerationTypeDefinition = new VHDLEnumerationTypeDefinition();
		return vhdlEnumerationTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLEnumerationLiteral createVHDLEnumerationLiteral() {
		VHDLEnumerationLiteral vhdlEnumerationLiteral = new VHDLEnumerationLiteral();
		return vhdlEnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLArchitectureBody createVHDLArchitectureBody() {
		VHDLArchitectureBody vhdlArchitectureBody = new VHDLArchitectureBody();
		return vhdlArchitectureBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLProcessStatement createVHDLProcessStatement() {
		VHDLProcessStatement vhdlProcessStatement = new VHDLProcessStatement();
		return vhdlProcessStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLSignalName createVHDLSignalName() {
		VHDLSignalName vhdlSignalName = new VHDLSignalName();
		return vhdlSignalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLAssertionStatement createVHDLAssertionStatement() {
		VHDLAssertionStatement vhdlAssertionStatement = new VHDLAssertionStatement();
		return vhdlAssertionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLAssertion createVHDLAssertion() {
		VHDLAssertion vhdlAssertion = new VHDLAssertion();
		return vhdlAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLSignalAssignmentStatement createVHDLSignalAssignmentStatement() {
		VHDLSignalAssignmentStatement vhdlSignalAssignmentStatement = new VHDLSignalAssignmentStatement();
		return vhdlSignalAssignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLIfStatement createVHDLIfStatement() {
		VHDLIfStatement vhdlIfStatement = new VHDLIfStatement();
		return vhdlIfStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLIfClause createVHDLIfClause() {
		VHDLIfClause vhdlIfClause = new VHDLIfClause();
		return vhdlIfClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLElsifClause createVHDLElsifClause() {
		VHDLElsifClause vhdlElsifClause = new VHDLElsifClause();
		return vhdlElsifClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLElseClause createVHDLElseClause() {
		VHDLElseClause vhdlElseClause = new VHDLElseClause();
		return vhdlElseClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLCaseStatement createVHDLCaseStatement() {
		VHDLCaseStatement vhdlCaseStatement = new VHDLCaseStatement();
		return vhdlCaseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLCaseStatementAlternative createVHDLCaseStatementAlternative() {
		VHDLCaseStatementAlternative vhdlCaseStatementAlternative = new VHDLCaseStatementAlternative();
		return vhdlCaseStatementAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLMode createVHDLModeFromString(EDataType eDataType, String initialValue) {
		VHDLMode result = VHDLMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVHDLModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVHDLPackage getVHDLPackage() {
		return (IVHDLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IVHDLPackage getPackage() {
		return IVHDLPackage.eINSTANCE;
	}

} //VHDLFactory
