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

package ac.soton.coda.internal.vhdl.utils;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

import ac.soton.coda.vhdl.IVHDLArchitectureBody;
import ac.soton.coda.vhdl.IVHDLAssertion;
import ac.soton.coda.vhdl.IVHDLAssertionStatement;
import ac.soton.coda.vhdl.IVHDLBlockDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLCaseStatement;
import ac.soton.coda.vhdl.IVHDLCaseStatementAlternative;
import ac.soton.coda.vhdl.IVHDLConcurrentStatement;
import ac.soton.coda.vhdl.IVHDLContextItem;
import ac.soton.coda.vhdl.IVHDLDesignFile;
import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLElseClause;
import ac.soton.coda.vhdl.IVHDLElsifClause;
import ac.soton.coda.vhdl.IVHDLEntityDeclaration;
import ac.soton.coda.vhdl.IVHDLEntityDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLEnumerationLiteral;
import ac.soton.coda.vhdl.IVHDLEnumerationTypeDefinition;
import ac.soton.coda.vhdl.IVHDLFullTypeDeclaration;
import ac.soton.coda.vhdl.IVHDLIfClause;
import ac.soton.coda.vhdl.IVHDLIfStatement;
import ac.soton.coda.vhdl.IVHDLInterfaceElement;
import ac.soton.coda.vhdl.IVHDLInterfaceList;
import ac.soton.coda.vhdl.IVHDLInterfaceSignalDeclaration;
import ac.soton.coda.vhdl.IVHDLLibraryClause;
import ac.soton.coda.vhdl.IVHDLLibraryUnit;
import ac.soton.coda.vhdl.IVHDLLogicalName;
import ac.soton.coda.vhdl.IVHDLProcessDeclarativeItem;
import ac.soton.coda.vhdl.IVHDLProcessStatement;
import ac.soton.coda.vhdl.IVHDLSelectedName;
import ac.soton.coda.vhdl.IVHDLSequentialStatement;
import ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement;
import ac.soton.coda.vhdl.IVHDLSignalName;
import ac.soton.coda.vhdl.IVHDLSubtypeIndication;
import ac.soton.coda.vhdl.IVHDLTypeDefinition;
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
public class VXMI2VHDLPrettyPrinter implements IVXMI2VHDLPrettyPrinter {

	private String tab = "  ";

	/**
	 * @param indentLevel
	 * @return
	 */
	private String printIndentation(int indentLevel) {
		String result = "";
		for (int i = 0; i < indentLevel; i++) {
			result = result + tab;
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLDesignFile,
	 * int)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLDesignFile designFile,
			int indentLevel, IProgressMonitor monitor) {
		EList<IVHDLDesignUnit> designUnits = designFile.getDesignUnits();
		boolean first = true;
		for (IVHDLDesignUnit designUnit : designUnits) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, designUnit, indentLevel);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLDesignUnit,
	 * int)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLDesignUnit designUnit,
			int indentLevel) {
		EList<IVHDLContextItem> contextItems = designUnit.getContextItems();
		boolean first = true;
		for (IVHDLContextItem contextItem : contextItems) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, contextItem, indentLevel);
		}
		sb.append("\n");
		sb.append("\n");
		IVHDLLibraryUnit libraryUnit = designUnit.getLibraryUnit();
		prettyPrint(sb, libraryUnit, indentLevel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLContextItem,
	 * int)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLContextItem contextItem,
			int indentLevel) {
		if (contextItem instanceof IVHDLLibraryClause) {
			IVHDLLibraryClause libraryClause = (IVHDLLibraryClause) contextItem;
			sb.append(printIndentation(indentLevel));
			sb.append("LIBRARY ");
			EList<IVHDLLogicalName> logicalNames = libraryClause
					.getLogicalNames();
			boolean first = true;
			for (IVHDLLogicalName logicalName : logicalNames) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");

				}
				sb.append(logicalName.getIdentifier());
			}
			sb.append(";");
			return;
		}
		if (contextItem instanceof IVHDLUseClause) {
			IVHDLUseClause useClause = (IVHDLUseClause) contextItem;
			sb.append(printIndentation(indentLevel));
			sb.append("USE ");
			EList<IVHDLSelectedName> selectedNames = useClause
					.getSelectedNames();
			boolean first = true;
			for (IVHDLSelectedName selectedName : selectedNames) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");
				}
				sb.append(selectedName.getName());
			}
			sb.append(";");
			return;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ac.soton.coda.internal.vhdl.utils.IVXMI2VHDLPrettyPrinter#prettyPrint
	 * (java.lang.StringBuffer, ac.soton.coda.vhdl.IVHDLLibraryUnit, int)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLLibraryUnit libraryUnit,
			int indentLevel) {
		if (libraryUnit instanceof IVHDLEntityDeclaration) {
			IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) libraryUnit;

			String identifier = entityDeclaration.getIdentifier();
			sb.append(printIndentation(indentLevel));
			sb.append("ENTITY " + identifier + " IS\n");

			if (entityDeclaration.isSetPortInterfaceList()) {
				sb.append(printIndentation(indentLevel + 1));
				sb.append("PORT (\n");
				IVHDLInterfaceList portInterfaceList = entityDeclaration
						.getPortInterfaceList();
				EList<IVHDLInterfaceElement> interfaceElements = portInterfaceList
						.getInterfaceElements();
				boolean first = true;
				for (IVHDLInterfaceElement interfaceElement : interfaceElements) {
					if (first) {
						first = false;
					} else {
						sb.append("\n");
					}
					prettyPrint(sb, interfaceElement, indentLevel + 2);
				}
				sb.append("\n");
				sb.append(printIndentation(indentLevel + 1));
				sb.append(");");
			}

			EList<IVHDLEntityDeclarativeItem> entityDeclarativeItems = entityDeclaration
					.getEntityDeclarativeItems();
			boolean first = true;
			for (IVHDLEntityDeclarativeItem entityDeclarativeItem : entityDeclarativeItems) {
				if (first) {
					sb.append("\n");
					first = false;
				}
				sb.append("\n");
				prettyPrint(sb, entityDeclarativeItem, indentLevel + 1);
			}

			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("END " + identifier + ";");
			return;
		}
		if (libraryUnit instanceof IVHDLArchitectureBody) {
			IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) libraryUnit;
			sb.append("\n");
			sb.append("\n");
			String identifier = architectureBody.getIdentifier();
			String name = architectureBody.getName();
			sb.append(printIndentation(indentLevel));
			sb.append("ARCHITECTURE " + identifier + " OF " + name + " IS\n");
			EList<IVHDLBlockDeclarativeItem> blockDeclarativeItems = architectureBody
					.getBlockDeclarativeItems();
			for (IVHDLBlockDeclarativeItem blockDeclarativeItem : blockDeclarativeItems) {
				sb.append("\n");
				prettyPrint(sb, blockDeclarativeItem, indentLevel + 1);
			}
			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("BEGIN\n");
			EList<IVHDLConcurrentStatement> concurrentStatements = architectureBody
					.getConcurrentStatements();
			for (IVHDLConcurrentStatement concurrentStatement : concurrentStatements) {
				sb.append("\n");
				sb.append("\n");
				prettyPrint(sb, concurrentStatement, indentLevel + 1);
			}
			sb.append("\n");
			sb.append("END " + identifier + "\n");
			return;
		}

	}

	/**
	 * @param sb
	 * @param interfaceElement
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLInterfaceElement interfaceElement, int indentLevel) {
		if (interfaceElement instanceof IVHDLInterfaceSignalDeclaration) {
			IVHDLInterfaceSignalDeclaration interfaceSignalDeclaration = (IVHDLInterfaceSignalDeclaration) interfaceElement;
			String identifier = interfaceSignalDeclaration.getIdentifier();
			IVHDLSubtypeIndication subtypeIndication = interfaceSignalDeclaration
					.getSubtypeIndication();
			String type = subtypeIndication.getName();
			sb.append(printIndentation(indentLevel));
			if (interfaceSignalDeclaration.isSetSignal()) {
				sb.append("signal ");
			}
			sb.append(identifier);
			sb.append(" : ");
			if (interfaceSignalDeclaration.isSetMode()) {
				VHDLMode mode = interfaceSignalDeclaration.getMode();
				switch (mode.getValue()) {
				case VHDLMode.IN_VALUE:
					sb.append("IN");
					break;
				case VHDLMode.OUT_VALUE:
					sb.append("OUT");
					break;
				case VHDLMode.INOUT_VALUE:
					sb.append("INOUT");
					break;

				default:
					break;
				}
				sb.append(" ");
			}
			sb.append(type);
			sb.append(";");
			return;
		}
	}

	/**
	 * @param sb
	 * @param entityDeclarativeItem
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLEntityDeclarativeItem entityDeclarativeItem, int indentLevel) {
		if (entityDeclarativeItem instanceof IVHDLFullTypeDeclaration) {
			IVHDLFullTypeDeclaration fullTypeDeclaration = (IVHDLFullTypeDeclaration) entityDeclarativeItem;
			sb.append(printIndentation(indentLevel));
			sb.append("TYPE ");
			String identifier = fullTypeDeclaration.getIdentifier();
			sb.append(identifier);
			sb.append(" is ");
			IVHDLTypeDefinition typeDefinition = fullTypeDeclaration
					.getTypeDefinition();
			if (typeDefinition instanceof IVHDLEnumerationTypeDefinition) {
				IVHDLEnumerationTypeDefinition enumerationTypeDefinition = (IVHDLEnumerationTypeDefinition) typeDefinition;
				sb.append("(");
				EList<IVHDLEnumerationLiteral> enumerationLiterals = enumerationTypeDefinition
						.getEnumerationLiterals();
				boolean first = true;
				for (IVHDLEnumerationLiteral enumerationLiteral : enumerationLiterals) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(enumerationLiteral.getName());
				}
				sb.append(")");
			}
			sb.append(";");
			return;
		}

	}

	/**
	 * @param sb
	 * @param blockDeclarativeItem
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLBlockDeclarativeItem blockDeclarativeItem, int indentLevel) {
		if (blockDeclarativeItem instanceof IVHDLInterfaceSignalDeclaration) {
			IVHDLInterfaceSignalDeclaration interfaceSignalDeclaration = (IVHDLInterfaceSignalDeclaration) blockDeclarativeItem;
			String identifier = interfaceSignalDeclaration.getIdentifier();
			IVHDLSubtypeIndication subtypeIndication = interfaceSignalDeclaration
					.getSubtypeIndication();
			String type = subtypeIndication.getName();
			sb.append(printIndentation(indentLevel));
			if (interfaceSignalDeclaration.isSetSignal()) {
				sb.append("signal ");
			}
			sb.append(identifier);
			sb.append(" : ");
			if (interfaceSignalDeclaration.isSetMode()) {
				VHDLMode mode = interfaceSignalDeclaration.getMode();
				switch (mode.getValue()) {
				case VHDLMode.IN_VALUE:
					sb.append("IN");
					break;
				case VHDLMode.OUT_VALUE:
					sb.append("OUT");
					break;
				case VHDLMode.INOUT_VALUE:
					sb.append("INOUT");
					break;

				default:
					break;
				}
				sb.append(" ");
			}
			sb.append(type);
			sb.append(";");
			return;
		}

		if (blockDeclarativeItem instanceof IVHDLFullTypeDeclaration) {
			IVHDLFullTypeDeclaration fullTypeDeclaration = (IVHDLFullTypeDeclaration) blockDeclarativeItem;
			sb.append(printIndentation(indentLevel));
			sb.append("TYPE ");
			String identifier = fullTypeDeclaration.getIdentifier();
			sb.append(identifier);
			sb.append(" is ");
			IVHDLTypeDefinition typeDefinition = fullTypeDeclaration
					.getTypeDefinition();
			if (typeDefinition instanceof IVHDLEnumerationTypeDefinition) {
				IVHDLEnumerationTypeDefinition enumerationTypeDefinition = (IVHDLEnumerationTypeDefinition) typeDefinition;
				sb.append("(");
				EList<IVHDLEnumerationLiteral> enumerationLiterals = enumerationTypeDefinition
						.getEnumerationLiterals();
				boolean first = true;
				for (IVHDLEnumerationLiteral enumerationLiteral : enumerationLiterals) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(enumerationLiteral.getName());
				}
				sb.append(")");
			}
			sb.append(";");
			return;
		}
		return;
	}

	/**
	 * @param sb
	 * @param concurrentStatement
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLConcurrentStatement concurrentStatement, int indentLevel) {
		if (concurrentStatement instanceof IVHDLProcessStatement) {
			IVHDLProcessStatement processStatement = (IVHDLProcessStatement) concurrentStatement;

			EList<IVHDLSignalName> sensitivityList = processStatement
					.getSensitivityList();
			sb.append(printIndentation(indentLevel));
			sb.append("PROCESS (");
			boolean first = true;
			for (IVHDLSignalName signalName : sensitivityList) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");
				}
				sb.append(signalName.getName());
			}
			sb.append(")\n");
			EList<IVHDLProcessDeclarativeItem> processDeclarativeItems = processStatement
					.getProcessDeclarativeItems();
			for (IVHDLProcessDeclarativeItem processDeclarativeItem : processDeclarativeItems) {
				prettyPrint(sb, processDeclarativeItem, indentLevel + 1);
			}
			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("BEGIN\n");
			EList<IVHDLSequentialStatement> sequentialStatements = processStatement
					.getSequentialStatements();
			for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
				prettyPrint(sb, sequentialStatement, indentLevel + 1);
			}
			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("END PROCESS;");
			return;
		}
		return;
	}

	/**
	 * @param sb
	 * @param processDeclarativeItem
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLProcessDeclarativeItem processDeclarativeItem, int indentLevel) {
		if (processDeclarativeItem instanceof IVHDLFullTypeDeclaration) {
			IVHDLFullTypeDeclaration fullTypeDeclaration = (IVHDLFullTypeDeclaration) processDeclarativeItem;
			sb.append(printIndentation(indentLevel));
			sb.append("TYPE ");
			String identifier = fullTypeDeclaration.getIdentifier();
			sb.append(identifier);
			sb.append(" is ");
			IVHDLTypeDefinition typeDefinition = fullTypeDeclaration
					.getTypeDefinition();
			if (typeDefinition instanceof IVHDLEnumerationTypeDefinition) {
				IVHDLEnumerationTypeDefinition enumerationTypeDefinition = (IVHDLEnumerationTypeDefinition) typeDefinition;
				sb.append("(");
				EList<IVHDLEnumerationLiteral> enumerationLiterals = enumerationTypeDefinition
						.getEnumerationLiterals();
				boolean first = true;
				for (IVHDLEnumerationLiteral enumerationLiteral : enumerationLiterals) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(enumerationLiteral.getName());
				}
				sb.append(")");
			}
			sb.append(";");
			return;
		}

	}

	/**
	 * @param sb
	 * @param sequentialStatement
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLSequentialStatement sequentialStatement, int indentLevel) {
		if (sequentialStatement instanceof IVHDLAssertionStatement) {
			IVHDLAssertionStatement assertionStatement = (IVHDLAssertionStatement) sequentialStatement;
			IVHDLAssertion assertion = assertionStatement.getAssertion();
			String booleanExpression = assertion.getBooleanExpression();
			sb.append(printIndentation(indentLevel));
			sb.append("assert ");
			sb.append(booleanExpression);
			sb.append(";");
			return;
		}

		if (sequentialStatement instanceof IVHDLCaseStatement) {
			IVHDLCaseStatement caseStatement = (IVHDLCaseStatement) sequentialStatement;
			String expression = caseStatement.getExpression();
			EList<IVHDLCaseStatementAlternative> caseStatementAlternatives = caseStatement
					.getCaseStatementAlternatives();

			sb.append(printIndentation(indentLevel));
			sb.append("CASE " + expression + " IS \n");
			boolean first = true;
			for (IVHDLCaseStatementAlternative caseStatementAlternative : caseStatementAlternatives) {
				if (first) {
					first = false;
				} else {
					sb.append("\n");
				}
				prettyPrint(sb, caseStatementAlternative, indentLevel + 1);
			}

			return;
		}

		if (sequentialStatement instanceof IVHDLIfStatement) {
			IVHDLIfStatement ifStatement = (IVHDLIfStatement) sequentialStatement;
			IVHDLIfClause ifClause = ifStatement.getIfClause();
			prettyPrint(sb, ifClause, indentLevel);

			EList<IVHDLElsifClause> elsifClauses = ifStatement
					.getElsifClauses();
			for (IVHDLElsifClause elsifClause : elsifClauses) {
				sb.append("\n");
				prettyPrint(sb, elsifClause, indentLevel);
			}

			if (ifStatement.isSetElseClause()) {
				IVHDLElseClause elseClause = ifStatement.getElseClause();
				sb.append("\n");
				prettyPrint(sb, elseClause, indentLevel);
			}
			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("END IF;");
			return;
		}

		if (sequentialStatement instanceof IVHDLSignalAssignmentStatement) {
			IVHDLSignalAssignmentStatement signalAssignmentStatement = (IVHDLSignalAssignmentStatement) sequentialStatement;
			String target = signalAssignmentStatement.getTarget();
			String waveform = signalAssignmentStatement.getWaveform();
			sb.append(printIndentation(indentLevel));
			sb.append(target + " <= " + waveform);
			return;
		}

		throw new UnsupportedOperationException(
				"Unsupported sequential statement");
	}

	/**
	 * @param sb
	 * @param caseStatementAlternative
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLCaseStatementAlternative caseStatementAlternative,
			int indentLevel) {
		String label = caseStatementAlternative.getLabel();
		EList<IVHDLSequentialStatement> sequentialStatements = caseStatementAlternative
				.getSequentialStatements();
		sb.append(printIndentation(indentLevel));
		sb.append("WHEN " + label + " => \n");
		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1);
		}
	}

	/**
	 * @param sb
	 * @param ifClause
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb, IVHDLIfClause ifClause,
			int indentLevel) {
		String booleanExpression = ifClause.getBooleanExpression();
		EList<IVHDLSequentialStatement> sequentialStatements = ifClause
				.getSequentialStatements();
		sb.append(printIndentation(indentLevel));
		sb.append("IF " + booleanExpression + " THEN\n");
		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1);
		}
	}

	/**
	 * @param sb
	 * @param elsifClause
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb, IVHDLElsifClause elsifClause,
			int indentLevel) {
		String booleanExpression = elsifClause.getBooleanExpression();
		EList<IVHDLSequentialStatement> sequentialStatements = elsifClause
				.getSequentialStatements();
		sb.append(printIndentation(indentLevel));
		sb.append("ELSIF " + booleanExpression + " THEN\n");
		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1);
		}

	}

	/**
	 * @param sb
	 * @param elseClause
	 * @param indentLevel
	 */
	public void prettyPrint(StringBuffer sb, IVHDLElseClause elseClause,
			int indentLevel) {
		EList<IVHDLSequentialStatement> sequentialStatements = elseClause
				.getSequentialStatements();
		sb.append(printIndentation(indentLevel));
		sb.append("ELSE\n");
		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1);
		}
	}

}
