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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.coda.vhdl.IVHDLPackage
 * @generated
 */
public class VHDLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IVHDLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IVHDLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHDLSwitch<Adapter> modelSwitch =
		new VHDLSwitch<Adapter>() {
			@Override
			public Adapter caseVHDLEObject(IVHDLEObject object) {
				return createVHDLEObjectAdapter();
			}
			@Override
			public Adapter caseVHDLNamedElement(IVHDLNamedElement object) {
				return createVHDLNamedElementAdapter();
			}
			@Override
			public Adapter caseVHDLLabelledElement(IVHDLLabelledElement object) {
				return createVHDLLabelledElementAdapter();
			}
			@Override
			public Adapter caseVHDLIdentifierElement(IVHDLIdentifierElement object) {
				return createVHDLIdentifierElementAdapter();
			}
			@Override
			public Adapter caseVHDLBooleanExpressionElement(IVHDLBooleanExpressionElement object) {
				return createVHDLBooleanExpressionElementAdapter();
			}
			@Override
			public Adapter caseVHDLExpressionElement(IVHDLExpressionElement object) {
				return createVHDLExpressionElementAdapter();
			}
			@Override
			public Adapter caseVHDLSequentialStatementsElement(IVHDLSequentialStatementsElement object) {
				return createVHDLSequentialStatementsElementAdapter();
			}
			@Override
			public Adapter caseVHDLDesignFile(IVHDLDesignFile object) {
				return createVHDLDesignFileAdapter();
			}
			@Override
			public Adapter caseVHDLDesignUnit(IVHDLDesignUnit object) {
				return createVHDLDesignUnitAdapter();
			}
			@Override
			public Adapter caseVHDLContextItem(IVHDLContextItem object) {
				return createVHDLContextItemAdapter();
			}
			@Override
			public Adapter caseVHDLLibraryClause(IVHDLLibraryClause object) {
				return createVHDLLibraryClauseAdapter();
			}
			@Override
			public Adapter caseVHDLLogicalName(IVHDLLogicalName object) {
				return createVHDLLogicalNameAdapter();
			}
			@Override
			public Adapter caseVHDLUseClause(IVHDLUseClause object) {
				return createVHDLUseClauseAdapter();
			}
			@Override
			public Adapter caseVHDLSelectedName(IVHDLSelectedName object) {
				return createVHDLSelectedNameAdapter();
			}
			@Override
			public Adapter caseVHDLLibraryUnit(IVHDLLibraryUnit object) {
				return createVHDLLibraryUnitAdapter();
			}
			@Override
			public Adapter caseVHDLPrimaryUnit(IVHDLPrimaryUnit object) {
				return createVHDLPrimaryUnitAdapter();
			}
			@Override
			public Adapter caseVHDLEntityDeclaration(IVHDLEntityDeclaration object) {
				return createVHDLEntityDeclarationAdapter();
			}
			@Override
			public Adapter caseVHDLInterfaceList(IVHDLInterfaceList object) {
				return createVHDLInterfaceListAdapter();
			}
			@Override
			public Adapter caseVHDLInterfaceElement(IVHDLInterfaceElement object) {
				return createVHDLInterfaceElementAdapter();
			}
			@Override
			public Adapter caseVHDLInterfaceSignalDeclaration(IVHDLInterfaceSignalDeclaration object) {
				return createVHDLInterfaceSignalDeclarationAdapter();
			}
			@Override
			public Adapter caseVHDLSubtypeIndication(IVHDLSubtypeIndication object) {
				return createVHDLSubtypeIndicationAdapter();
			}
			@Override
			public Adapter caseVHDLEntityDeclarativeItem(IVHDLEntityDeclarativeItem object) {
				return createVHDLEntityDeclarativeItemAdapter();
			}
			@Override
			public Adapter caseVHDLTypeDeclaration(IVHDLTypeDeclaration object) {
				return createVHDLTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseVHDLFullTypeDeclaration(IVHDLFullTypeDeclaration object) {
				return createVHDLFullTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseVHDLTypeDefinition(IVHDLTypeDefinition object) {
				return createVHDLTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseVHDLScalarTypeDefinition(IVHDLScalarTypeDefinition object) {
				return createVHDLScalarTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseVHDLEnumerationTypeDefinition(IVHDLEnumerationTypeDefinition object) {
				return createVHDLEnumerationTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseVHDLEnumerationLiteral(IVHDLEnumerationLiteral object) {
				return createVHDLEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseVHDLSecondaryUnit(IVHDLSecondaryUnit object) {
				return createVHDLSecondaryUnitAdapter();
			}
			@Override
			public Adapter caseVHDLArchitectureBody(IVHDLArchitectureBody object) {
				return createVHDLArchitectureBodyAdapter();
			}
			@Override
			public Adapter caseVHDLBlockDeclarativeItem(IVHDLBlockDeclarativeItem object) {
				return createVHDLBlockDeclarativeItemAdapter();
			}
			@Override
			public Adapter caseVHDLConcurrentStatement(IVHDLConcurrentStatement object) {
				return createVHDLConcurrentStatementAdapter();
			}
			@Override
			public Adapter caseVHDLProcessStatement(IVHDLProcessStatement object) {
				return createVHDLProcessStatementAdapter();
			}
			@Override
			public Adapter caseVHDLSignalName(IVHDLSignalName object) {
				return createVHDLSignalNameAdapter();
			}
			@Override
			public Adapter caseVHDLProcessDeclarativeItem(IVHDLProcessDeclarativeItem object) {
				return createVHDLProcessDeclarativeItemAdapter();
			}
			@Override
			public Adapter caseVHDLSequentialStatement(IVHDLSequentialStatement object) {
				return createVHDLSequentialStatementAdapter();
			}
			@Override
			public Adapter caseVHDLAssertionStatement(IVHDLAssertionStatement object) {
				return createVHDLAssertionStatementAdapter();
			}
			@Override
			public Adapter caseVHDLAssertion(IVHDLAssertion object) {
				return createVHDLAssertionAdapter();
			}
			@Override
			public Adapter caseVHDLSignalAssignmentStatement(IVHDLSignalAssignmentStatement object) {
				return createVHDLSignalAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseVHDLIfStatement(IVHDLIfStatement object) {
				return createVHDLIfStatementAdapter();
			}
			@Override
			public Adapter caseVHDLGuardedStatementElement(IVHDLGuardedStatementElement object) {
				return createVHDLGuardedStatementElementAdapter();
			}
			@Override
			public Adapter caseVHDLIfClause(IVHDLIfClause object) {
				return createVHDLIfClauseAdapter();
			}
			@Override
			public Adapter caseVHDLElsifClause(IVHDLElsifClause object) {
				return createVHDLElsifClauseAdapter();
			}
			@Override
			public Adapter caseVHDLElseClause(IVHDLElseClause object) {
				return createVHDLElseClauseAdapter();
			}
			@Override
			public Adapter caseVHDLCaseStatement(IVHDLCaseStatement object) {
				return createVHDLCaseStatementAdapter();
			}
			@Override
			public Adapter caseVHDLCaseStatementAlternative(IVHDLCaseStatementAlternative object) {
				return createVHDLCaseStatementAlternativeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLEObject
	 * @generated
	 */
	public Adapter createVHDLEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLNamedElement
	 * @generated
	 */
	public Adapter createVHDLNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLLabelledElement <em>Labelled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLLabelledElement
	 * @generated
	 */
	public Adapter createVHDLLabelledElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLIdentifierElement <em>Identifier Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLIdentifierElement
	 * @generated
	 */
	public Adapter createVHDLIdentifierElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLBooleanExpressionElement <em>Boolean Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLBooleanExpressionElement
	 * @generated
	 */
	public Adapter createVHDLBooleanExpressionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLExpressionElement <em>Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLExpressionElement
	 * @generated
	 */
	public Adapter createVHDLExpressionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLSequentialStatementsElement <em>Sequential Statements Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLSequentialStatementsElement
	 * @generated
	 */
	public Adapter createVHDLSequentialStatementsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLDesignFile <em>Design File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLDesignFile
	 * @generated
	 */
	public Adapter createVHDLDesignFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLDesignUnit <em>Design Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLDesignUnit
	 * @generated
	 */
	public Adapter createVHDLDesignUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLContextItem <em>Context Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLContextItem
	 * @generated
	 */
	public Adapter createVHDLContextItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLLibraryClause <em>Library Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLLibraryClause
	 * @generated
	 */
	public Adapter createVHDLLibraryClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLLogicalName <em>Logical Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLLogicalName
	 * @generated
	 */
	public Adapter createVHDLLogicalNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLUseClause <em>Use Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLUseClause
	 * @generated
	 */
	public Adapter createVHDLUseClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLSelectedName <em>Selected Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLSelectedName
	 * @generated
	 */
	public Adapter createVHDLSelectedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLLibraryUnit <em>Library Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLLibraryUnit
	 * @generated
	 */
	public Adapter createVHDLLibraryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLPrimaryUnit <em>Primary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLPrimaryUnit
	 * @generated
	 */
	public Adapter createVHDLPrimaryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLEntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLEntityDeclaration
	 * @generated
	 */
	public Adapter createVHDLEntityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLInterfaceList <em>Interface List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceList
	 * @generated
	 */
	public Adapter createVHDLInterfaceListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLInterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceElement
	 * @generated
	 */
	public Adapter createVHDLInterfaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration <em>Interface Signal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration
	 * @generated
	 */
	public Adapter createVHDLInterfaceSignalDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLSubtypeIndication <em>Subtype Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLSubtypeIndication
	 * @generated
	 */
	public Adapter createVHDLSubtypeIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem <em>Entity Declarative Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem
	 * @generated
	 */
	public Adapter createVHDLEntityDeclarativeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLTypeDeclaration
	 * @generated
	 */
	public Adapter createVHDLTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLFullTypeDeclaration <em>Full Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLFullTypeDeclaration
	 * @generated
	 */
	public Adapter createVHDLFullTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLTypeDefinition
	 * @generated
	 */
	public Adapter createVHDLTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLScalarTypeDefinition <em>Scalar Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLScalarTypeDefinition
	 * @generated
	 */
	public Adapter createVHDLScalarTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition
	 * @generated
	 */
	public Adapter createVHDLEnumerationTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLEnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLEnumerationLiteral
	 * @generated
	 */
	public Adapter createVHDLEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLSecondaryUnit <em>Secondary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLSecondaryUnit
	 * @generated
	 */
	public Adapter createVHDLSecondaryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLArchitectureBody <em>Architecture Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLArchitectureBody
	 * @generated
	 */
	public Adapter createVHDLArchitectureBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem <em>Block Declarative Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem
	 * @generated
	 */
	public Adapter createVHDLBlockDeclarativeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLConcurrentStatement <em>Concurrent Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLConcurrentStatement
	 * @generated
	 */
	public Adapter createVHDLConcurrentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLProcessStatement <em>Process Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLProcessStatement
	 * @generated
	 */
	public Adapter createVHDLProcessStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLSignalName <em>Signal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLSignalName
	 * @generated
	 */
	public Adapter createVHDLSignalNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem <em>Process Declarative Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem
	 * @generated
	 */
	public Adapter createVHDLProcessDeclarativeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLSequentialStatement <em>Sequential Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLSequentialStatement
	 * @generated
	 */
	public Adapter createVHDLSequentialStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLAssertionStatement <em>Assertion Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLAssertionStatement
	 * @generated
	 */
	public Adapter createVHDLAssertionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLAssertion
	 * @generated
	 */
	public Adapter createVHDLAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement <em>Signal Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement
	 * @generated
	 */
	public Adapter createVHDLSignalAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLIfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLIfStatement
	 * @generated
	 */
	public Adapter createVHDLIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLGuardedStatementElement <em>Guarded Statement Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLGuardedStatementElement
	 * @generated
	 */
	public Adapter createVHDLGuardedStatementElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLIfClause <em>If Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLIfClause
	 * @generated
	 */
	public Adapter createVHDLIfClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLElsifClause <em>Elsif Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLElsifClause
	 * @generated
	 */
	public Adapter createVHDLElsifClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLElseClause <em>Else Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLElseClause
	 * @generated
	 */
	public Adapter createVHDLElseClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLCaseStatement <em>Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLCaseStatement
	 * @generated
	 */
	public Adapter createVHDLCaseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.coda.vhdl.IVHDLCaseStatementAlternative <em>Case Statement Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.coda.vhdl.IVHDLCaseStatementAlternative
	 * @generated
	 */
	public Adapter createVHDLCaseStatementAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VHDLAdapterFactory
