/*******************************************************************************
 * Copyright (c) 2015 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.coda.vhdl.custom;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLCaseStatement;
import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.IVHDLEnumerationLiteral;
import ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition;
import ac.soton.coda.vhdl.IVHDLFactory;
import ac.soton.coda.vhdl.IVHDLFullTypeDeclaration;
import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLIfStatement;
import ac.soton.coda.vhdl.IVHDLInterfaceElement;
import ac.soton.coda.vhdl.IVHDLInterfaceList;
import ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration;
import ac.soton.coda.vhdl.IVHDLLibraryClause;
import ac.soton.coda.vhdl.IVHDLLogicalName;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.IVHDLSelectedName;
import ac.soton.coda.vhdl.IVHDLSequentialStatement;
import ac.soton.coda.vhdl.IVHDLSequentialStatementsElement;
import ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement;
import ac.soton.coda.vhdl.IVHDLSignalName;
import ac.soton.coda.vhdl.IVHDLSubtypeIndication;
import ac.soton.coda.vhdl.IVHDLUseClause;
import ac.soton.coda.vhdl.VHDLMode;

/**
 * <p>
 *
 * </p>
 *
 * @author htson
 * @version
 * @see
 * @since
 */
public class VHDLUtils {

	private static IVHDLFactory vhdlFactory = IVHDLFactory.eINSTANCE;

	/**
	 * @param name
	 * @return
	 */
	public static IVHDLDesignFile createDesignFile(String name) {
		IVHDLDesignFile designFile = vhdlFactory.createVHDLDesignFile();
		designFile.setLabel(name);
		return designFile;
	}

	/**
	 * @param designFile
	 * @return
	 */
	public static IVHDLDesignUnit createDesignUnit(IVHDLDesignFile designFile) {
		IVHDLDesignUnit designUnit = vhdlFactory.createVHDLDesignUnit();
		designFile.getDesignUnits().add(designUnit);
		return designUnit;
	}

	/**
	 * @param designUnit
	 * @param name
	 */
	public static IVHDLEntityDeclaration createEntityDeclaration(
			IVHDLDesignUnit designUnit, String name) {
		IVHDLEntityDeclaration entityDeclaration = vhdlFactory
				.createVHDLEntityDeclaration();
		entityDeclaration.setIdentifier(name);
		designUnit.setLibraryUnit(entityDeclaration);
		return entityDeclaration;
	}

	public static IVHDLLibraryClause createLibraryClause(
			IVHDLDesignUnit designUnit, String... identifiers) {
		assert designUnit != null;
		assert identifiers != null;
		assert identifiers.length != 0;

		IVHDLLibraryClause libraryClause = vhdlFactory
				.createVHDLLibraryClause();

		for (String identifier : identifiers) {
			IVHDLLogicalName logicalName = vhdlFactory.createVHDLLogicalName();
			logicalName.setIdentifier(identifier);
			libraryClause.getLogicalNames().add(logicalName);
		}

		designUnit.getContextItems().add(libraryClause);

		return libraryClause;
	}

	public static IVHDLUseClause createUseClause(IVHDLDesignUnit designUnit,
			String library, String vhdlPackage, String vhdlSuffix) {
		assert designUnit != null;

		IVHDLUseClause useClause = vhdlFactory.createVHDLUseClause();

		IVHDLSelectedName useName = vhdlFactory.createVHDLSelectedName();
		useName.setName(library + "." + vhdlPackage + "." + vhdlSuffix);

		useClause.getSelectedNames().add(useName);

		designUnit.getContextItems().add(useClause);
		return useClause;
	}

	/**
	 * @param entityDeclaration
	 * @param isSignal
	 * @param string
	 */
	public static IVHDLInterfaceElement createInterfaceSignalDeclaration(
			IVHDLEntityDeclaration entityDeclaration, String identifier,
			VHDLMode mode, String type) {
		IVHDLInterfaceSignalDeclaration interfaceSignalDeclaration = createInterfaceSignalDeclaration(
				false, identifier, mode, type);

		IVHDLInterfaceList portInterfaceList;
		if (entityDeclaration.isSetPortInterfaceList()) {
			portInterfaceList = entityDeclaration.getPortInterfaceList();
		} else {
			portInterfaceList = vhdlFactory.createVHDLInterfaceList();
			entityDeclaration.setPortInterfaceList(portInterfaceList);
		}
		portInterfaceList.getInterfaceElements()
				.add(interfaceSignalDeclaration);

		return interfaceSignalDeclaration;
	}

	/**
	 * @param architectureBody
	 * @param identifier
	 * @param mode
	 * @param type
	 * @return
	 */
	public static IVHDLInterfaceSignalDeclaration createInterfaceSignalDeclaration(
			IVHDLArchitectureBody architectureBody, String identifier,
			VHDLMode mode, String type) {
		IVHDLInterfaceSignalDeclaration interfaceSignalDeclaration = createInterfaceSignalDeclaration(
				true, identifier, mode, type);
		architectureBody.getBlockDeclarativeItems().add(
				interfaceSignalDeclaration);
		return null;
	}

	public static IVHDLInterfaceSignalDeclaration createInterfaceSignalDeclaration(
			boolean isSignal, String identifier, VHDLMode mode, String type) {
		IVHDLInterfaceSignalDeclaration interfaceSignalDeclaration = vhdlFactory
				.createVHDLInterfaceSignalDeclaration();
		interfaceSignalDeclaration.setIdentifier(identifier);
		if (mode != null) {
			interfaceSignalDeclaration.setMode(mode);
		}
		if (isSignal) {
			interfaceSignalDeclaration.setSignal(isSignal);
		}

		IVHDLSubtypeIndication subtypeIndication = vhdlFactory
				.createVHDLSubtypeIndication();
		subtypeIndication.setName(type);
		interfaceSignalDeclaration.setSubtypeIndication(subtypeIndication);
		return interfaceSignalDeclaration;
	}

	/**
	 * @param entityDeclaration
	 * @param string
	 * @param string2
	 * @param string3
	 * @return
	 */
	public static IVHDLFullTypeDeclaration createEnumerationTypeDeclaration(
			IVHDLEntityDeclaration entityDeclaration, String identifier,
			String... elements) {
		IVHDLFullTypeDeclaration enumerationTypeDeclaration = createEnumerationTypeDeclaration(
				identifier, elements);
		entityDeclaration.getEntityDeclarativeItems().add(
				enumerationTypeDeclaration);
		return enumerationTypeDeclaration;
	}

	/**
	 * @param string
	 * @param string2
	 * @param string3
	 */
	public static IVHDLFullTypeDeclaration createEnumerationTypeDeclaration(
			String identifier, String... elements) {
		IVHDLFullTypeDeclaration fullTypeDeclaration = vhdlFactory
				.createVHDLFullTypeDeclaration();
		fullTypeDeclaration.setIdentifier(identifier);

		IVHDLEnumerationTypeDefinition enumerationTypeDefinition = vhdlFactory
				.createVHDLEnumerationTypeDefinition();
		for (String element : elements) {
			IVHDLEnumerationLiteral enumerationLiteral = vhdlFactory
					.createVHDLEnumerationLiteral();
			enumerationLiteral.setName(element);
			enumerationTypeDefinition.getEnumerationLiterals().add(
					enumerationLiteral);
		}

		fullTypeDeclaration.setTypeDefinition(enumerationTypeDefinition);
		return fullTypeDeclaration;
	}

	/**
	 * @param designUnit
	 * @param string
	 * @return
	 */
	public static IVHDLArchitectureBody createArchitectureBody(
			IVHDLDesignUnit designUnit, String identifier, String name) {
		IVHDLArchitectureBody architectureBody = vhdlFactory
				.createVHDLArchitectureBody();
		architectureBody.setIdentifier(identifier);
		architectureBody.setName(name);
		designUnit.setLibraryUnit(architectureBody);
		return architectureBody;
	}

	/**
	 * @param architectureBody
	 * @param string
	 * @param string2
	 * @return
	 */
	public static IVHDLProcessStatement createProcessStatement(
			IVHDLArchitectureBody architectureBody, String... signalNames) {
		IVHDLProcessStatement processStatement = createProcessStatement(signalNames);
		architectureBody.getConcurrentStatements().add(processStatement);
		return processStatement;
	}

	/**
	 * @param string
	 * @param string2
	 * @return
	 */
	public static IVHDLProcessStatement createProcessStatement(
			String... signalNames) {
		IVHDLProcessStatement processStatement = vhdlFactory
				.createVHDLProcessStatement();

		for (String signalName : signalNames) {
			IVHDLSignalName signal = vhdlFactory.createVHDLSignalName();
			signal.setName(signalName);
			processStatement.getSensitivityList().add(signal);
		}

		return processStatement;
	}

	/**
	 * @param sequentialStatementsElement
	 */
	public static IVHDLIfStatement createIfStatement(
			IVHDLSequentialStatementsElement sequentialStatementsElement) {
		IVHDLIfStatement ifStatement = vhdlFactory.createVHDLIfStatement();
		sequentialStatementsElement.getSequentialStatements().add(ifStatement);
		return ifStatement;
	}

	/**
	 * @param ifStatement
	 * @param string
	 * @return
	 */
	public static IVHDLIfClause createIfClause(IVHDLIfStatement ifStatement,
			String booleanExpression,
			IVHDLSequentialStatement... sequentialStatements) {
		IVHDLIfClause ifClause = vhdlFactory.createVHDLIfClause();
		ifClause.setBooleanExpression(booleanExpression);
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			ifClause.getSequentialStatements().add(sequentialStatement);
		}
		ifStatement.setIfClause(ifClause);
		return ifClause;
	}

	/**
	 * @param ifStatement
	 * @param string
	 * @return
	 */
	public static IVHDLElsifClause createElsifClause(
			IVHDLIfStatement ifStatement, String booleanExpression,
			IVHDLSequentialStatement... sequentialStatements) {
		IVHDLElsifClause elsifClause = vhdlFactory.createVHDLElsifClause();
		elsifClause.setBooleanExpression(booleanExpression);
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			elsifClause.getSequentialStatements().add(sequentialStatement);
		}
		ifStatement.getElsifClauses().add(elsifClause);

		return elsifClause;
	}

	/**
	 * @param sequentialStatementsElement
	 * @param string
	 * @return
	 */
	public static IVHDLCaseStatement createCaseStatement(
			IVHDLSequentialStatementsElement sequentialStatementsElement,
			String expression) {
		IVHDLCaseStatement caseStatement = createCaseStatement(expression);
		sequentialStatementsElement.getSequentialStatements()
				.add(caseStatement);
		return caseStatement;
	}

	/**
	 * @param string
	 * @return
	 */
	public static IVHDLCaseStatement createCaseStatement(String expression) {
		IVHDLCaseStatement caseStatement = vhdlFactory
				.createVHDLCaseStatement();
		caseStatement.setExpression(expression);
		return caseStatement;
	}

	/**
	 * @param caseStatement
	 * @param name
	 */
	public static IVHDLCaseStatementAlternative addCaseStatementAlternative(
			IVHDLCaseStatement caseStatement, String label,
			IVHDLSequentialStatement... sequentialStatements) {
		IVHDLCaseStatementAlternative caseStatementAlternative = vhdlFactory
				.createVHDLCaseStatementAlternative();
		caseStatementAlternative.setLabel(label);

		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			caseStatementAlternative.getSequentialStatements().add(
					sequentialStatement);
		}

		caseStatement.getCaseStatementAlternatives().add(
				caseStatementAlternative);

		return caseStatementAlternative;
	}

	/**
	 * @param subSequenceOfStatements
	 * @param string
	 * @param name
	 * @return
	 */
	public static IVHDLSignalAssignmentStatement createSignalAssignmentStatement(
			IVHDLSequentialStatementsElement sequentialStatementsElement,
			String target, String waveform) {
		IVHDLSignalAssignmentStatement signalAssignmentStatement = createSignalAssignmentStatement(
				target, waveform);
		sequentialStatementsElement.getSequentialStatements().add(
				signalAssignmentStatement);
		return signalAssignmentStatement;
	}

	/**
	 * @param string
	 * @param name
	 * @return
	 */
	public static IVHDLSignalAssignmentStatement createSignalAssignmentStatement(
			String target, String waveform) {
		IVHDLSignalAssignmentStatement signalAssignmentStatement = vhdlFactory
				.createVHDLSignalAssignmentStatement();
		signalAssignmentStatement.setTarget(target);
		signalAssignmentStatement.setWaveform(waveform);
		return signalAssignmentStatement;
	}

}
