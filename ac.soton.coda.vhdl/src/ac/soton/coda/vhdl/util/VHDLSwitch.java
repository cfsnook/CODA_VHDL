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

package ac.soton.coda.vhdl.util;

import ac.soton.coda.vhdl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ac.soton.coda.vhdl.IVHDLPackage
 * @generated
 */
public class VHDLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IVHDLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLSwitch() {
		if (modelPackage == null) {
			modelPackage = IVHDLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IVHDLPackage.VHDL_EOBJECT: {
				IVHDLEObject vhdleObject = (IVHDLEObject)theEObject;
				T result = caseVHDLEObject(vhdleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_NAMED_ELEMENT: {
				IVHDLNamedElement vhdlNamedElement = (IVHDLNamedElement)theEObject;
				T result = caseVHDLNamedElement(vhdlNamedElement);
				if (result == null) result = caseVHDLEObject(vhdlNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_LABELLED_ELEMENT: {
				IVHDLLabelledElement vhdlLabelledElement = (IVHDLLabelledElement)theEObject;
				T result = caseVHDLLabelledElement(vhdlLabelledElement);
				if (result == null) result = caseVHDLEObject(vhdlLabelledElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_IDENTIFIER_ELEMENT: {
				IVHDLIdentifierElement vhdlIdentifierElement = (IVHDLIdentifierElement)theEObject;
				T result = caseVHDLIdentifierElement(vhdlIdentifierElement);
				if (result == null) result = caseVHDLEObject(vhdlIdentifierElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_BOOLEAN_EXPRESSION_ELEMENT: {
				IVHDLBooleanExpressionElement vhdlBooleanExpressionElement = (IVHDLBooleanExpressionElement)theEObject;
				T result = caseVHDLBooleanExpressionElement(vhdlBooleanExpressionElement);
				if (result == null) result = caseVHDLEObject(vhdlBooleanExpressionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_EXPRESSION_ELEMENT: {
				IVHDLExpressionElement vhdlExpressionElement = (IVHDLExpressionElement)theEObject;
				T result = caseVHDLExpressionElement(vhdlExpressionElement);
				if (result == null) result = caseVHDLEObject(vhdlExpressionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SEQUENTIAL_STATEMENTS_ELEMENT: {
				IVHDLSequentialStatementsElement vhdlSequentialStatementsElement = (IVHDLSequentialStatementsElement)theEObject;
				T result = caseVHDLSequentialStatementsElement(vhdlSequentialStatementsElement);
				if (result == null) result = caseVHDLEObject(vhdlSequentialStatementsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_DESIGN_FILE: {
				IVHDLDesignFile vhdlDesignFile = (IVHDLDesignFile)theEObject;
				T result = caseVHDLDesignFile(vhdlDesignFile);
				if (result == null) result = caseVHDLLabelledElement(vhdlDesignFile);
				if (result == null) result = caseVHDLEObject(vhdlDesignFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_DESIGN_UNIT: {
				IVHDLDesignUnit vhdlDesignUnit = (IVHDLDesignUnit)theEObject;
				T result = caseVHDLDesignUnit(vhdlDesignUnit);
				if (result == null) result = caseVHDLEObject(vhdlDesignUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_CONTEXT_ITEM: {
				IVHDLContextItem vhdlContextItem = (IVHDLContextItem)theEObject;
				T result = caseVHDLContextItem(vhdlContextItem);
				if (result == null) result = caseVHDLEObject(vhdlContextItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_LIBRARY_CLAUSE: {
				IVHDLLibraryClause vhdlLibraryClause = (IVHDLLibraryClause)theEObject;
				T result = caseVHDLLibraryClause(vhdlLibraryClause);
				if (result == null) result = caseVHDLContextItem(vhdlLibraryClause);
				if (result == null) result = caseVHDLEObject(vhdlLibraryClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_LOGICAL_NAME: {
				IVHDLLogicalName vhdlLogicalName = (IVHDLLogicalName)theEObject;
				T result = caseVHDLLogicalName(vhdlLogicalName);
				if (result == null) result = caseVHDLIdentifierElement(vhdlLogicalName);
				if (result == null) result = caseVHDLEObject(vhdlLogicalName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_USE_CLAUSE: {
				IVHDLUseClause vhdlUseClause = (IVHDLUseClause)theEObject;
				T result = caseVHDLUseClause(vhdlUseClause);
				if (result == null) result = caseVHDLContextItem(vhdlUseClause);
				if (result == null) result = caseVHDLEObject(vhdlUseClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SELECTED_NAME: {
				IVHDLSelectedName vhdlSelectedName = (IVHDLSelectedName)theEObject;
				T result = caseVHDLSelectedName(vhdlSelectedName);
				if (result == null) result = caseVHDLNamedElement(vhdlSelectedName);
				if (result == null) result = caseVHDLEObject(vhdlSelectedName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_LIBRARY_UNIT: {
				IVHDLLibraryUnit vhdlLibraryUnit = (IVHDLLibraryUnit)theEObject;
				T result = caseVHDLLibraryUnit(vhdlLibraryUnit);
				if (result == null) result = caseVHDLEObject(vhdlLibraryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_PRIMARY_UNIT: {
				IVHDLPrimaryUnit vhdlPrimaryUnit = (IVHDLPrimaryUnit)theEObject;
				T result = caseVHDLPrimaryUnit(vhdlPrimaryUnit);
				if (result == null) result = caseVHDLLibraryUnit(vhdlPrimaryUnit);
				if (result == null) result = caseVHDLEObject(vhdlPrimaryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ENTITY_DECLARATION: {
				IVHDLEntityDeclaration vhdlEntityDeclaration = (IVHDLEntityDeclaration)theEObject;
				T result = caseVHDLEntityDeclaration(vhdlEntityDeclaration);
				if (result == null) result = caseVHDLPrimaryUnit(vhdlEntityDeclaration);
				if (result == null) result = caseVHDLIdentifierElement(vhdlEntityDeclaration);
				if (result == null) result = caseVHDLLibraryUnit(vhdlEntityDeclaration);
				if (result == null) result = caseVHDLEObject(vhdlEntityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_INTERFACE_LIST: {
				IVHDLInterfaceList vhdlInterfaceList = (IVHDLInterfaceList)theEObject;
				T result = caseVHDLInterfaceList(vhdlInterfaceList);
				if (result == null) result = caseVHDLEObject(vhdlInterfaceList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_INTERFACE_ELEMENT: {
				IVHDLInterfaceElement vhdlInterfaceElement = (IVHDLInterfaceElement)theEObject;
				T result = caseVHDLInterfaceElement(vhdlInterfaceElement);
				if (result == null) result = caseVHDLEObject(vhdlInterfaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_INTERFACE_SIGNAL_DECLARATION: {
				IVHDLInterfaceSignalDeclaration vhdlInterfaceSignalDeclaration = (IVHDLInterfaceSignalDeclaration)theEObject;
				T result = caseVHDLInterfaceSignalDeclaration(vhdlInterfaceSignalDeclaration);
				if (result == null) result = caseVHDLBlockDeclarativeItem(vhdlInterfaceSignalDeclaration);
				if (result == null) result = caseVHDLIdentifierElement(vhdlInterfaceSignalDeclaration);
				if (result == null) result = caseVHDLInterfaceElement(vhdlInterfaceSignalDeclaration);
				if (result == null) result = caseVHDLEObject(vhdlInterfaceSignalDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SUBTYPE_INDICATION: {
				IVHDLSubtypeIndication vhdlSubtypeIndication = (IVHDLSubtypeIndication)theEObject;
				T result = caseVHDLSubtypeIndication(vhdlSubtypeIndication);
				if (result == null) result = caseVHDLNamedElement(vhdlSubtypeIndication);
				if (result == null) result = caseVHDLEObject(vhdlSubtypeIndication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ENTITY_DECLARATIVE_ITEM: {
				IVHDLEntityDeclarativeItem vhdlEntityDeclarativeItem = (IVHDLEntityDeclarativeItem)theEObject;
				T result = caseVHDLEntityDeclarativeItem(vhdlEntityDeclarativeItem);
				if (result == null) result = caseVHDLEObject(vhdlEntityDeclarativeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_TYPE_DECLARATION: {
				IVHDLTypeDeclaration vhdlTypeDeclaration = (IVHDLTypeDeclaration)theEObject;
				T result = caseVHDLTypeDeclaration(vhdlTypeDeclaration);
				if (result == null) result = caseVHDLEntityDeclarativeItem(vhdlTypeDeclaration);
				if (result == null) result = caseVHDLBlockDeclarativeItem(vhdlTypeDeclaration);
				if (result == null) result = caseVHDLProcessDeclarativeItem(vhdlTypeDeclaration);
				if (result == null) result = caseVHDLEObject(vhdlTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_FULL_TYPE_DECLARATION: {
				IVHDLFullTypeDeclaration vhdlFullTypeDeclaration = (IVHDLFullTypeDeclaration)theEObject;
				T result = caseVHDLFullTypeDeclaration(vhdlFullTypeDeclaration);
				if (result == null) result = caseVHDLTypeDeclaration(vhdlFullTypeDeclaration);
				if (result == null) result = caseVHDLIdentifierElement(vhdlFullTypeDeclaration);
				if (result == null) result = caseVHDLEntityDeclarativeItem(vhdlFullTypeDeclaration);
				if (result == null) result = caseVHDLBlockDeclarativeItem(vhdlFullTypeDeclaration);
				if (result == null) result = caseVHDLProcessDeclarativeItem(vhdlFullTypeDeclaration);
				if (result == null) result = caseVHDLEObject(vhdlFullTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_TYPE_DEFINITION: {
				IVHDLTypeDefinition vhdlTypeDefinition = (IVHDLTypeDefinition)theEObject;
				T result = caseVHDLTypeDefinition(vhdlTypeDefinition);
				if (result == null) result = caseVHDLEObject(vhdlTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SCALAR_TYPE_DEFINITION: {
				IVHDLScalarTypeDefinition vhdlScalarTypeDefinition = (IVHDLScalarTypeDefinition)theEObject;
				T result = caseVHDLScalarTypeDefinition(vhdlScalarTypeDefinition);
				if (result == null) result = caseVHDLTypeDefinition(vhdlScalarTypeDefinition);
				if (result == null) result = caseVHDLEObject(vhdlScalarTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ENUMERATION_TYPE_DEFINITION: {
				IVHDLEnumerationTypeDefinition vhdlEnumerationTypeDefinition = (IVHDLEnumerationTypeDefinition)theEObject;
				T result = caseVHDLEnumerationTypeDefinition(vhdlEnumerationTypeDefinition);
				if (result == null) result = caseVHDLScalarTypeDefinition(vhdlEnumerationTypeDefinition);
				if (result == null) result = caseVHDLTypeDefinition(vhdlEnumerationTypeDefinition);
				if (result == null) result = caseVHDLEObject(vhdlEnumerationTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ENUMERATION_LITERAL: {
				IVHDLEnumerationLiteral vhdlEnumerationLiteral = (IVHDLEnumerationLiteral)theEObject;
				T result = caseVHDLEnumerationLiteral(vhdlEnumerationLiteral);
				if (result == null) result = caseVHDLNamedElement(vhdlEnumerationLiteral);
				if (result == null) result = caseVHDLEObject(vhdlEnumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SECONDARY_UNIT: {
				IVHDLSecondaryUnit vhdlSecondaryUnit = (IVHDLSecondaryUnit)theEObject;
				T result = caseVHDLSecondaryUnit(vhdlSecondaryUnit);
				if (result == null) result = caseVHDLLibraryUnit(vhdlSecondaryUnit);
				if (result == null) result = caseVHDLEObject(vhdlSecondaryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ARCHITECTURE_BODY: {
				IVHDLArchitectureBody vhdlArchitectureBody = (IVHDLArchitectureBody)theEObject;
				T result = caseVHDLArchitectureBody(vhdlArchitectureBody);
				if (result == null) result = caseVHDLSecondaryUnit(vhdlArchitectureBody);
				if (result == null) result = caseVHDLIdentifierElement(vhdlArchitectureBody);
				if (result == null) result = caseVHDLNamedElement(vhdlArchitectureBody);
				if (result == null) result = caseVHDLLibraryUnit(vhdlArchitectureBody);
				if (result == null) result = caseVHDLEObject(vhdlArchitectureBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_BLOCK_DECLARATIVE_ITEM: {
				IVHDLBlockDeclarativeItem vhdlBlockDeclarativeItem = (IVHDLBlockDeclarativeItem)theEObject;
				T result = caseVHDLBlockDeclarativeItem(vhdlBlockDeclarativeItem);
				if (result == null) result = caseVHDLEObject(vhdlBlockDeclarativeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_CONCURRENT_STATEMENT: {
				IVHDLConcurrentStatement vhdlConcurrentStatement = (IVHDLConcurrentStatement)theEObject;
				T result = caseVHDLConcurrentStatement(vhdlConcurrentStatement);
				if (result == null) result = caseVHDLEObject(vhdlConcurrentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_PROCESS_STATEMENT: {
				IVHDLProcessStatement vhdlProcessStatement = (IVHDLProcessStatement)theEObject;
				T result = caseVHDLProcessStatement(vhdlProcessStatement);
				if (result == null) result = caseVHDLConcurrentStatement(vhdlProcessStatement);
				if (result == null) result = caseVHDLSequentialStatementsElement(vhdlProcessStatement);
				if (result == null) result = caseVHDLEObject(vhdlProcessStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SIGNAL_NAME: {
				IVHDLSignalName vhdlSignalName = (IVHDLSignalName)theEObject;
				T result = caseVHDLSignalName(vhdlSignalName);
				if (result == null) result = caseVHDLNamedElement(vhdlSignalName);
				if (result == null) result = caseVHDLEObject(vhdlSignalName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_PROCESS_DECLARATIVE_ITEM: {
				IVHDLProcessDeclarativeItem vhdlProcessDeclarativeItem = (IVHDLProcessDeclarativeItem)theEObject;
				T result = caseVHDLProcessDeclarativeItem(vhdlProcessDeclarativeItem);
				if (result == null) result = caseVHDLEObject(vhdlProcessDeclarativeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SEQUENTIAL_STATEMENT: {
				IVHDLSequentialStatement vhdlSequentialStatement = (IVHDLSequentialStatement)theEObject;
				T result = caseVHDLSequentialStatement(vhdlSequentialStatement);
				if (result == null) result = caseVHDLEObject(vhdlSequentialStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ASSERTION_STATEMENT: {
				IVHDLAssertionStatement vhdlAssertionStatement = (IVHDLAssertionStatement)theEObject;
				T result = caseVHDLAssertionStatement(vhdlAssertionStatement);
				if (result == null) result = caseVHDLSequentialStatement(vhdlAssertionStatement);
				if (result == null) result = caseVHDLLabelledElement(vhdlAssertionStatement);
				if (result == null) result = caseVHDLEObject(vhdlAssertionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ASSERTION: {
				IVHDLAssertion vhdlAssertion = (IVHDLAssertion)theEObject;
				T result = caseVHDLAssertion(vhdlAssertion);
				if (result == null) result = caseVHDLBooleanExpressionElement(vhdlAssertion);
				if (result == null) result = caseVHDLEObject(vhdlAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_SIGNAL_ASSIGNMENT_STATEMENT: {
				IVHDLSignalAssignmentStatement vhdlSignalAssignmentStatement = (IVHDLSignalAssignmentStatement)theEObject;
				T result = caseVHDLSignalAssignmentStatement(vhdlSignalAssignmentStatement);
				if (result == null) result = caseVHDLSequentialStatement(vhdlSignalAssignmentStatement);
				if (result == null) result = caseVHDLEObject(vhdlSignalAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_IF_STATEMENT: {
				IVHDLIfStatement vhdlIfStatement = (IVHDLIfStatement)theEObject;
				T result = caseVHDLIfStatement(vhdlIfStatement);
				if (result == null) result = caseVHDLSequentialStatement(vhdlIfStatement);
				if (result == null) result = caseVHDLEObject(vhdlIfStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_GUARDED_STATEMENT_ELEMENT: {
				IVHDLGuardedStatementElement vhdlGuardedStatementElement = (IVHDLGuardedStatementElement)theEObject;
				T result = caseVHDLGuardedStatementElement(vhdlGuardedStatementElement);
				if (result == null) result = caseVHDLBooleanExpressionElement(vhdlGuardedStatementElement);
				if (result == null) result = caseVHDLSequentialStatementsElement(vhdlGuardedStatementElement);
				if (result == null) result = caseVHDLEObject(vhdlGuardedStatementElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_IF_CLAUSE: {
				IVHDLIfClause vhdlIfClause = (IVHDLIfClause)theEObject;
				T result = caseVHDLIfClause(vhdlIfClause);
				if (result == null) result = caseVHDLGuardedStatementElement(vhdlIfClause);
				if (result == null) result = caseVHDLBooleanExpressionElement(vhdlIfClause);
				if (result == null) result = caseVHDLSequentialStatementsElement(vhdlIfClause);
				if (result == null) result = caseVHDLEObject(vhdlIfClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ELSIF_CLAUSE: {
				IVHDLElsifClause vhdlElsifClause = (IVHDLElsifClause)theEObject;
				T result = caseVHDLElsifClause(vhdlElsifClause);
				if (result == null) result = caseVHDLGuardedStatementElement(vhdlElsifClause);
				if (result == null) result = caseVHDLBooleanExpressionElement(vhdlElsifClause);
				if (result == null) result = caseVHDLSequentialStatementsElement(vhdlElsifClause);
				if (result == null) result = caseVHDLEObject(vhdlElsifClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_ELSE_CLAUSE: {
				IVHDLElseClause vhdlElseClause = (IVHDLElseClause)theEObject;
				T result = caseVHDLElseClause(vhdlElseClause);
				if (result == null) result = caseVHDLSequentialStatementsElement(vhdlElseClause);
				if (result == null) result = caseVHDLEObject(vhdlElseClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_CASE_STATEMENT: {
				IVHDLCaseStatement vhdlCaseStatement = (IVHDLCaseStatement)theEObject;
				T result = caseVHDLCaseStatement(vhdlCaseStatement);
				if (result == null) result = caseVHDLSequentialStatement(vhdlCaseStatement);
				if (result == null) result = caseVHDLExpressionElement(vhdlCaseStatement);
				if (result == null) result = caseVHDLEObject(vhdlCaseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IVHDLPackage.VHDL_CASE_STATEMENT_ALTERNATIVE: {
				IVHDLCaseStatementAlternative vhdlCaseStatementAlternative = (IVHDLCaseStatementAlternative)theEObject;
				T result = caseVHDLCaseStatementAlternative(vhdlCaseStatementAlternative);
				if (result == null) result = caseVHDLLabelledElement(vhdlCaseStatementAlternative);
				if (result == null) result = caseVHDLSequentialStatementsElement(vhdlCaseStatementAlternative);
				if (result == null) result = caseVHDLEObject(vhdlCaseStatementAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLEObject(IVHDLEObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLNamedElement(IVHDLNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labelled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labelled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLLabelledElement(IVHDLLabelledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLIdentifierElement(IVHDLIdentifierElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLBooleanExpressionElement(IVHDLBooleanExpressionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLExpressionElement(IVHDLExpressionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Statements Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Statements Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLSequentialStatementsElement(IVHDLSequentialStatementsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLDesignFile(IVHDLDesignFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLDesignUnit(IVHDLDesignUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLContextItem(IVHDLContextItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLLibraryClause(IVHDLLibraryClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLLogicalName(IVHDLLogicalName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLUseClause(IVHDLUseClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selected Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selected Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLSelectedName(IVHDLSelectedName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLLibraryUnit(IVHDLLibraryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLPrimaryUnit(IVHDLPrimaryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLEntityDeclaration(IVHDLEntityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLInterfaceList(IVHDLInterfaceList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLInterfaceElement(IVHDLInterfaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Signal Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Signal Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLInterfaceSignalDeclaration(IVHDLInterfaceSignalDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLSubtypeIndication(IVHDLSubtypeIndication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Declarative Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Declarative Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLEntityDeclarativeItem(IVHDLEntityDeclarativeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLTypeDeclaration(IVHDLTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLFullTypeDeclaration(IVHDLFullTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLTypeDefinition(IVHDLTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLScalarTypeDefinition(IVHDLScalarTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLEnumerationTypeDefinition(IVHDLEnumerationTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLEnumerationLiteral(IVHDLEnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLSecondaryUnit(IVHDLSecondaryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLArchitectureBody(IVHDLArchitectureBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Declarative Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Declarative Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLBlockDeclarativeItem(IVHDLBlockDeclarativeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrent Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrent Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLConcurrentStatement(IVHDLConcurrentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLProcessStatement(IVHDLProcessStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLSignalName(IVHDLSignalName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Declarative Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Declarative Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLProcessDeclarativeItem(IVHDLProcessDeclarativeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLSequentialStatement(IVHDLSequentialStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLAssertionStatement(IVHDLAssertionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLAssertion(IVHDLAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLSignalAssignmentStatement(IVHDLSignalAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLIfStatement(IVHDLIfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guarded Statement Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guarded Statement Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLGuardedStatementElement(IVHDLGuardedStatementElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLIfClause(IVHDLIfClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elsif Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elsif Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLElsifClause(IVHDLElsifClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLElseClause(IVHDLElseClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLCaseStatement(IVHDLCaseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Statement Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Statement Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHDLCaseStatementAlternative(IVHDLCaseStatementAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VHDLSwitch
