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

package ac.soton.coda.internal.vxmi2vhdl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
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
 * An implementation of VXMI to VHDL Pretty Printer. This is a singleton class.
 * </p>
 *
 * @author htson
 * @version
 * @see
 * @since
 * @noextend This class is not intended to be subclassed by clients.
 */
public class VXMI2VHDLPrettyPrinter implements IVXMI2VHDLPrettyPrinter {

	// The white space tab for one indent level.
	private static String tab = "  ";

	// THe private instance
	private static VXMI2VHDLPrettyPrinter instance;

	/**
	 * Singleton class has private default constructor.
	 */
	private VXMI2VHDLPrettyPrinter() {
		// Do nothing
	}

	/**
	 * Public constructor for testing purpose.
	 * 
	 * @param id
	 *            dummy input to make it different from the default constructor.
	 *            (not used)
	 * @warning User should not use this constructor as this is for testing
	 *          purpose only.
	 */
	public VXMI2VHDLPrettyPrinter(String id) {
		// Do nothing
	}

	/**
	 * Returns the default instance of this class.
	 * 
	 * @return the default instance of this class.
	 */
	public static VXMI2VHDLPrettyPrinter getDefault() {
		if (instance == null)
			instance = new VXMI2VHDLPrettyPrinter();
		return instance;
	}

	/**
	 * Utility method to print white spaces according to the indent level.
	 * 
	 * @param indentLevel
	 *            the input indent level.
	 * @return the white space string result.
	 */
	private String printIndentation(int indentLevel) {
		String result = "";
		for (int i = 0; i < indentLevel; ++i) {
			result = result + tab;
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLDesignFile,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLDesignFile designFile,
			int indentLevel, IProgressMonitor monitor) {
		EList<IVHDLDesignUnit> designUnits = designFile.getDesignUnits();

		// Split the monitor according to the number of design units.
		SubMonitor subMonitor = SubMonitor.convert(monitor, designUnits.size());

		boolean first = true;
		for (IVHDLDesignUnit designUnit : designUnits) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, designUnit, indentLevel, subMonitor.newChild(1));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLDesignUnit,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLDesignUnit designUnit,
			int indentLevel, IProgressMonitor monitor) {
		EList<IVHDLContextItem> contextItems = designUnit.getContextItems();

		// Split the monitor according to the number of context items plus 1 for
		// the library unit.
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				contextItems.size() + 1);

		boolean first = true;
		for (IVHDLContextItem contextItem : contextItems) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, contextItem, indentLevel, subMonitor.newChild(1));
		}
		sb.append("\n");
		sb.append("\n");
		IVHDLLibraryUnit libraryUnit = designUnit.getLibraryUnit();
		prettyPrint(sb, libraryUnit, indentLevel, subMonitor.newChild(1));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLContextItem,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLContextItem contextItem,
			int indentLevel, IProgressMonitor monitor) {
		if (contextItem instanceof IVHDLLibraryClause) {
			IVHDLLibraryClause libraryClause = (IVHDLLibraryClause) contextItem;
			EList<IVHDLLogicalName> logicalNames = libraryClause
					.getLogicalNames();
			// Split the monitor according to the number of logical names plus 2
			// for the LIBRARY keyword and the final semi-colon.
			SubMonitor subMonitor = SubMonitor.convert(monitor,
					logicalNames.size() + 2);

			sb.append(printIndentation(indentLevel));
			sb.append("LIBRARY ");
			subMonitor.worked(1);

			boolean first = true;
			for (IVHDLLogicalName logicalName : logicalNames) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");

				}
				sb.append(logicalName.getIdentifier());
				subMonitor.worked(1);
			}
			sb.append(";");
			subMonitor.worked(1);
			return;
		}
		if (contextItem instanceof IVHDLUseClause) {
			IVHDLUseClause useClause = (IVHDLUseClause) contextItem;
			EList<IVHDLSelectedName> selectedNames = useClause
					.getSelectedNames();
			// Split the monitor according to the number of selected names plus
			// 2
			// for the USE keyword and the final semi-colon.
			SubMonitor subMonitor = SubMonitor.convert(monitor,
					selectedNames.size() + 2);

			sb.append(printIndentation(indentLevel));
			sb.append("USE ");
			subMonitor.worked(1);

			boolean first = true;
			for (IVHDLSelectedName selectedName : selectedNames) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");
				}
				sb.append(selectedName.getName());
				subMonitor.worked(1);
			}
			sb.append(";");
			subMonitor.worked(1);
			return;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLLibraryUnit,
	 * int, IProgressMonitor)
	 */
	@Override
	public void prettyPrint(StringBuffer sb, IVHDLLibraryUnit libraryUnit,
			int indentLevel, IProgressMonitor monitor) {
		if (libraryUnit instanceof IVHDLEntityDeclaration) {
			IVHDLEntityDeclaration entityDeclaration = (IVHDLEntityDeclaration) libraryUnit;

			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			// 1. (20%) Print the ENTITY declaration
			String identifier = entityDeclaration.getIdentifier();
			sb.append(printIndentation(indentLevel));
			sb.append("ENTITY " + identifier + " IS\n");
			subMonitor.worked(20);

			// 2. (30%) Print the port interface list
			if (entityDeclaration.isSetPortInterfaceList()) {
				IVHDLInterfaceList portInterfaceList = entityDeclaration
						.getPortInterfaceList();
				EList<IVHDLInterfaceElement> interfaceElements = portInterfaceList
						.getInterfaceElements();

				SubMonitor loopMonitor = subMonitor.newChild(30)
						.setWorkRemaining(interfaceElements.size() + 2);
				sb.append(printIndentation(indentLevel + 1));
				sb.append("PORT (\n");
				loopMonitor.worked(1);
				boolean first = true;
				for (IVHDLInterfaceElement interfaceElement : interfaceElements) {
					if (first) {
						first = false;
					} else {
						sb.append("\n");
					}
					prettyPrint(sb, interfaceElement, indentLevel + 2,
							loopMonitor.newChild(1));
				}
				sb.append("\n");
				sb.append(printIndentation(indentLevel + 1));
				sb.append(");");
				loopMonitor.worked(1);
			} else {
				subMonitor.worked(30);
			}

			// 3. (30%) Pretty print the declarative items
			EList<IVHDLEntityDeclarativeItem> entityDeclarativeItems = entityDeclaration
					.getEntityDeclarativeItems();
			SubMonitor loopMonitor = subMonitor.newChild(30).setWorkRemaining(
					entityDeclarativeItems.size());
			boolean first = true;
			for (IVHDLEntityDeclarativeItem entityDeclarativeItem : entityDeclarativeItems) {
				if (first) {
					sb.append("\n");
					first = false;
				}
				sb.append("\n");
				prettyPrint(sb, entityDeclarativeItem, indentLevel + 1,
						loopMonitor.newChild(1));
			}

			// 4. (20%) Print the END clause
			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("END " + identifier + ";");
			subMonitor.worked(20);

			return;
		}

		if (libraryUnit instanceof IVHDLArchitectureBody) {
			IVHDLArchitectureBody architectureBody = (IVHDLArchitectureBody) libraryUnit;
			EList<IVHDLBlockDeclarativeItem> blockDeclarativeItems = architectureBody
					.getBlockDeclarativeItems();
			EList<IVHDLConcurrentStatement> concurrentStatements = architectureBody
					.getConcurrentStatements();
			// Split the monitor according to the total number of block
			// declarative items and the number of concurrent statements plus 3
			// for the ARCHITECTURE keyword, the BEGIN keyword, and the END
			// keyword.
			SubMonitor subMonitor = SubMonitor.convert(monitor,
					blockDeclarativeItems.size() + concurrentStatements.size()
							+ 3);

			// 1. Pretty print the ARCHITECTURE declaration
			sb.append("\n");
			sb.append("\n");
			String identifier = architectureBody.getIdentifier();
			String name = architectureBody.getName();
			sb.append(printIndentation(indentLevel));
			sb.append("ARCHITECTURE " + identifier + " OF " + name + " IS\n");
			subMonitor.worked(1);

			// 2. The block declarative items
			for (IVHDLBlockDeclarativeItem blockDeclarativeItem : blockDeclarativeItems) {
				sb.append("\n");
				prettyPrint(sb, blockDeclarativeItem, indentLevel + 1,
						subMonitor.newChild(1));
			}

			// 3. The BEGIN keyword
			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("BEGIN\n");
			subMonitor.worked(1);

			// 4. The concurrent statements
			for (IVHDLConcurrentStatement concurrentStatement : concurrentStatements) {
				sb.append("\n");
				sb.append("\n");
				prettyPrint(sb, concurrentStatement, indentLevel + 1,
						subMonitor.newChild(1));
			}

			// 5. The END keyword
			sb.append("\n");
			sb.append("END " + identifier + "\n");
			return;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLInterfaceElement, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLInterfaceElement interfaceElement, int indentLevel,
			IProgressMonitor monitor) {
		if (interfaceElement instanceof IVHDLInterfaceSignalDeclaration) {

			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			IVHDLInterfaceSignalDeclaration interfaceSignalDeclaration = (IVHDLInterfaceSignalDeclaration) interfaceElement;
			String identifier = interfaceSignalDeclaration.getIdentifier();
			IVHDLSubtypeIndication subtypeIndication = interfaceSignalDeclaration
					.getSubtypeIndication();
			String type = subtypeIndication.getName();

			// 1. (25%) signal keyword
			sb.append(printIndentation(indentLevel));
			if (interfaceSignalDeclaration.isSetSignal()) {
				sb.append("signal ");
			}
			subMonitor.worked(25);

			// 2. (25%) Signal identifier
			sb.append(identifier);
			sb.append(" : ");

			// 3. (25%) Mode
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
			subMonitor.worked(25);

			// 4 (25%) Signal type
			sb.append(type);
			sb.append(";");
			subMonitor.worked(25);

			return;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLEntityDeclarativeItem, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLEntityDeclarativeItem entityDeclarativeItem, int indentLevel,
			IProgressMonitor monitor) {
		if (entityDeclarativeItem instanceof IVHDLFullTypeDeclaration) {
			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			// 1. (25%) TYPE keyword
			IVHDLFullTypeDeclaration fullTypeDeclaration = (IVHDLFullTypeDeclaration) entityDeclarativeItem;
			sb.append(printIndentation(indentLevel));
			sb.append("TYPE ");
			subMonitor.worked(25);

			// 2. (25%) Type identifier
			String identifier = fullTypeDeclaration.getIdentifier();
			sb.append(identifier);
			sb.append(" is ");
			subMonitor.worked(25);

			// 3. (25%) Type definition
			IVHDLTypeDefinition typeDefinition = fullTypeDeclaration
					.getTypeDefinition();
			if (typeDefinition instanceof IVHDLEnumerationTypeDefinition) {
				IVHDLEnumerationTypeDefinition enumerationTypeDefinition = (IVHDLEnumerationTypeDefinition) typeDefinition;
				EList<IVHDLEnumerationLiteral> enumerationLiterals = enumerationTypeDefinition
						.getEnumerationLiterals();
				// Set the remaining work to the number literals plus 2
				SubMonitor loopMonitor = subMonitor.newChild(25)
						.setWorkRemaining(enumerationLiterals.size() + 2);

				sb.append("(");
				loopMonitor.worked(1);

				boolean first = true;
				for (IVHDLEnumerationLiteral enumerationLiteral : enumerationLiterals) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(enumerationLiteral.getName());
					loopMonitor.worked(1);
				}
				sb.append(")");
				loopMonitor.worked(1);
			}

			// 4. (25%) Final semi-colon
			sb.append(";");
			subMonitor.worked(25);

			return;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLBlockDeclarativeItem, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLBlockDeclarativeItem blockDeclarativeItem, int indentLevel,
			IProgressMonitor monitor) {
		if (blockDeclarativeItem instanceof IVHDLInterfaceSignalDeclaration) {
			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			IVHDLInterfaceSignalDeclaration interfaceSignalDeclaration = (IVHDLInterfaceSignalDeclaration) blockDeclarativeItem;
			String identifier = interfaceSignalDeclaration.getIdentifier();
			IVHDLSubtypeIndication subtypeIndication = interfaceSignalDeclaration
					.getSubtypeIndication();
			String type = subtypeIndication.getName();
			sb.append(printIndentation(indentLevel));

			// 1. (25%) Signal keyword
			if (interfaceSignalDeclaration.isSetSignal()) {
				sb.append("signal ");
			}
			subMonitor.worked(25);

			// 2. (25%) Signal identifier
			sb.append(identifier);
			sb.append(" : ");
			subMonitor.worked(25);

			// 3. (25%) Mode
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
			subMonitor.worked(25);

			// 4. (25%) Type
			sb.append(type);
			sb.append(";");
			subMonitor.worked(25);

			return;
		}

		if (blockDeclarativeItem instanceof IVHDLFullTypeDeclaration) {
			IVHDLFullTypeDeclaration fullTypeDeclaration = (IVHDLFullTypeDeclaration) blockDeclarativeItem;
			sb.append(printIndentation(indentLevel));
			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			// 1. (25%) TYPE keyword
			sb.append("TYPE ");
			String identifier = fullTypeDeclaration.getIdentifier();
			subMonitor.worked(25);

			// 2. (25%) Type identifier
			sb.append(identifier);
			sb.append(" is ");
			subMonitor.worked(25);

			// 3. (25%) Type definition
			IVHDLTypeDefinition typeDefinition = fullTypeDeclaration
					.getTypeDefinition();
			if (typeDefinition instanceof IVHDLEnumerationTypeDefinition) {
				IVHDLEnumerationTypeDefinition enumerationTypeDefinition = (IVHDLEnumerationTypeDefinition) typeDefinition;
				EList<IVHDLEnumerationLiteral> enumerationLiterals = enumerationTypeDefinition
						.getEnumerationLiterals();
				// Set the remaining works to the number of literals plus 2.
				SubMonitor loopMonitor = subMonitor.newChild(25)
						.setWorkRemaining(enumerationLiterals.size() + 2);

				sb.append("(");
				loopMonitor.worked(1);
				boolean first = true;
				for (IVHDLEnumerationLiteral enumerationLiteral : enumerationLiterals) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(enumerationLiteral.getName());
					loopMonitor.worked(1);
				}
				sb.append(")");
				loopMonitor.worked(1);
			}

			// 4. (25%) The final semi-colon
			sb.append(";");
			subMonitor.worked(25);
			return;
		}
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLConcurrentStatement, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLConcurrentStatement concurrentStatement, int indentLevel,
			IProgressMonitor monitor) {
		if (concurrentStatement instanceof IVHDLProcessStatement) {
			IVHDLProcessStatement processStatement = (IVHDLProcessStatement) concurrentStatement;
			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			// 1. (10%) PROCESS with sensitivity list
			EList<IVHDLSignalName> sensitivityList = processStatement
					.getSensitivityList();
			// Set the remaining works to the number of sensitivity elements
			// plus 2.
			SubMonitor loopMonitor = subMonitor.newChild(10).setWorkRemaining(
					sensitivityList.size() + 2);
			sb.append(printIndentation(indentLevel));
			sb.append("PROCESS (");
			loopMonitor.worked(1);

			boolean first = true;
			for (IVHDLSignalName signalName : sensitivityList) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");
				}
				sb.append(signalName.getName());
				loopMonitor.worked(1);
			}

			sb.append(")\n");
			loopMonitor.worked(1);

			// 2. (20%) Declarative items.
			EList<IVHDLProcessDeclarativeItem> processDeclarativeItems = processStatement
					.getProcessDeclarativeItems();
			// Set the remaining works to the number of process declarative
			// items.
			loopMonitor = subMonitor.newChild(20).setWorkRemaining(
					processDeclarativeItems.size());
			for (IVHDLProcessDeclarativeItem processDeclarativeItem : processDeclarativeItems) {
				prettyPrint(sb, processDeclarativeItem, indentLevel + 1,
						loopMonitor.newChild(1));
			}
			sb.append("\n");

			// 3. (70%) Sequential statements
			EList<IVHDLSequentialStatement> sequentialStatements = processStatement
					.getSequentialStatements();
			// Set the remaining works to the number of sequential statements
			// plus 2.
			loopMonitor = subMonitor.newChild(20).setWorkRemaining(
					sequentialStatements.size() + 2);

			sb.append(printIndentation(indentLevel));
			sb.append("BEGIN\n");
			loopMonitor.worked(1);

			for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
				prettyPrint(sb, sequentialStatement, indentLevel + 1,
						loopMonitor.newChild(1));
			}
			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("END PROCESS;");
			loopMonitor.worked(1);

			return;
		}
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLProcessDeclarativeItem, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLProcessDeclarativeItem processDeclarativeItem,
			int indentLevel, IProgressMonitor monitor) {
		if (processDeclarativeItem instanceof IVHDLFullTypeDeclaration) {
			IVHDLFullTypeDeclaration fullTypeDeclaration = (IVHDLFullTypeDeclaration) processDeclarativeItem;
			sb.append(printIndentation(indentLevel));
			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			// 1. (25%) Type keyword
			sb.append("TYPE ");
			String identifier = fullTypeDeclaration.getIdentifier();
			subMonitor.worked(25);

			// 2. (25%) Type identifier
			sb.append(identifier);
			sb.append(" is ");
			subMonitor.worked(25);

			// 3. (25%) Type definition.
			IVHDLTypeDefinition typeDefinition = fullTypeDeclaration
					.getTypeDefinition();
			if (typeDefinition instanceof IVHDLEnumerationTypeDefinition) {
				IVHDLEnumerationTypeDefinition enumerationTypeDefinition = (IVHDLEnumerationTypeDefinition) typeDefinition;
				EList<IVHDLEnumerationLiteral> enumerationLiterals = enumerationTypeDefinition
						.getEnumerationLiterals();
				// Set the remaining works to the number of literals plus 2.
				SubMonitor loopMonitor = subMonitor.newChild(25)
						.setWorkRemaining(enumerationLiterals.size() + 2);

				sb.append("(");
				loopMonitor.worked(1);
				boolean first = true;
				for (IVHDLEnumerationLiteral enumerationLiteral : enumerationLiterals) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(enumerationLiteral.getName());
					loopMonitor.worked(1);
				}
				sb.append(")");
				loopMonitor.worked(1);
			}

			// 4. (25%) Final semi-colon
			sb.append(";");
			subMonitor.worked(25);
			return;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLSequentialStatement, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLSequentialStatement sequentialStatement, int indentLevel,
			IProgressMonitor monitor) {
		if (sequentialStatement instanceof IVHDLAssertionStatement) {
			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			IVHDLAssertionStatement assertionStatement = (IVHDLAssertionStatement) sequentialStatement;
			IVHDLAssertion assertion = assertionStatement.getAssertion();
			String booleanExpression = assertion.getBooleanExpression();
			sb.append(printIndentation(indentLevel));

			// 1. (50%) Assert keyword
			sb.append("assert ");
			subMonitor.worked(50);

			// 2. (50%) Boolean expression
			sb.append(booleanExpression);
			sb.append(";");
			subMonitor.worked(50);
			return;
		}

		if (sequentialStatement instanceof IVHDLCaseStatement) {
			IVHDLCaseStatement caseStatement = (IVHDLCaseStatement) sequentialStatement;
			String expression = caseStatement.getExpression();
			EList<IVHDLCaseStatementAlternative> caseStatementAlternatives = caseStatement
					.getCaseStatementAlternatives();

			// Convert the monitor to the number of case statement alternatives
			// plus 2.
			SubMonitor subMonitor = SubMonitor.convert(monitor,
					caseStatementAlternatives.size() + 1);

			sb.append(printIndentation(indentLevel));
			sb.append("CASE " + expression + " IS \n");
			subMonitor.worked(1);

			boolean first = true;
			for (IVHDLCaseStatementAlternative caseStatementAlternative : caseStatementAlternatives) {
				if (first) {
					first = false;
				} else {
					sb.append("\n");
				}
				prettyPrint(sb, caseStatementAlternative, indentLevel + 1,
						subMonitor.newChild(1));
			}

			return;
		}

		if (sequentialStatement instanceof IVHDLIfStatement) {
			IVHDLIfStatement ifStatement = (IVHDLIfStatement) sequentialStatement;
			EList<IVHDLElsifClause> elsifClauses = ifStatement
					.getElsifClauses();

			// Convert the monitor to the number of ELSIF clauses
			// plus 3 (one for the IF clause, one for the ELSE clause, one for
			// the END keyword).
			SubMonitor subMonitor = SubMonitor.convert(monitor,
					elsifClauses.size() + 2);

			IVHDLIfClause ifClause = ifStatement.getIfClause();
			prettyPrint(sb, ifClause, indentLevel, subMonitor.newChild(1));

			for (IVHDLElsifClause elsifClause : elsifClauses) {
				sb.append("\n");
				prettyPrint(sb, elsifClause, indentLevel,
						subMonitor.newChild(1));
			}

			if (ifStatement.isSetElseClause()) {
				IVHDLElseClause elseClause = ifStatement.getElseClause();
				sb.append("\n");
				prettyPrint(sb, elseClause, indentLevel, subMonitor.newChild(1));
			} else {
				subMonitor.worked(1);
			}

			sb.append("\n");
			sb.append(printIndentation(indentLevel));
			sb.append("END IF;");
			subMonitor.worked(1);

			return;
		}

		if (sequentialStatement instanceof IVHDLSignalAssignmentStatement) {
			IVHDLSignalAssignmentStatement signalAssignmentStatement = (IVHDLSignalAssignmentStatement) sequentialStatement;
			String target = signalAssignmentStatement.getTarget();
			String waveform = signalAssignmentStatement.getWaveform();

			// Convert the monitor to 100%
			SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

			sb.append(printIndentation(indentLevel));
			sb.append(target + " <= " + waveform);
			subMonitor.worked(100);

			return;
		}

		// Throws unsupported operation exception.
		throw new UnsupportedOperationException(
				"Unsupported sequential statement");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer,
	 * IVHDLCaseStatementAlternative, int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb,
			IVHDLCaseStatementAlternative caseStatementAlternative,
			int indentLevel, IProgressMonitor monitor) {
		String label = caseStatementAlternative.getLabel();
		EList<IVHDLSequentialStatement> sequentialStatements = caseStatementAlternative
				.getSequentialStatements();
		sb.append(printIndentation(indentLevel));
		// Convert the monitor to the number of sequential statements
		// plus 1 (for the WHEN clause).
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				sequentialStatements.size() + 1);

		// 1. WHEN label
		sb.append("WHEN " + label + " => \n");
		subMonitor.worked(1);

		// 2. Sequential statements
		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1,
					subMonitor.newChild(1));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLIfClause,
	 * int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLIfClause ifClause,
			int indentLevel, IProgressMonitor monitor) {
		String booleanExpression = ifClause.getBooleanExpression();
		EList<IVHDLSequentialStatement> sequentialStatements = ifClause
				.getSequentialStatements();

		// Convert the monitor to the number of sequential statements
		// plus 1 (for the IF clause).
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				sequentialStatements.size() + 1);

		sb.append(printIndentation(indentLevel));
		sb.append("IF " + booleanExpression + " THEN\n");
		subMonitor.worked(1);

		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1,
					subMonitor.newChild(1));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLElsifClause,
	 * int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLElsifClause elsifClause,
			int indentLevel, IProgressMonitor monitor) {
		String booleanExpression = elsifClause.getBooleanExpression();
		EList<IVHDLSequentialStatement> sequentialStatements = elsifClause
				.getSequentialStatements();
		// Convert the monitor to the number of sequential statements
		// plus 1 (for the ELSIF clause).
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				sequentialStatements.size() + 1);

		sb.append(printIndentation(indentLevel));
		sb.append("ELSIF " + booleanExpression + " THEN\n");
		subMonitor.worked(1);

		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1,
					subMonitor.newChild(1));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IVXMI2VHDLPrettyPrinter#prettyPrint(StringBuffer, IVHDLElseClause,
	 * int, IProgressMonitor)
	 */
	public void prettyPrint(StringBuffer sb, IVHDLElseClause elseClause,
			int indentLevel, IProgressMonitor monitor) {
		EList<IVHDLSequentialStatement> sequentialStatements = elseClause
				.getSequentialStatements();
		// Convert the monitor to the number of sequential statements
		// plus 1 (for the ELSE clause).
		SubMonitor subMonitor = SubMonitor.convert(monitor,
				sequentialStatements.size() + 1);

		sb.append(printIndentation(indentLevel));
		sb.append("ELSE\n");
		subMonitor.worked(1);

		boolean first = true;
		for (IVHDLSequentialStatement sequentialStatement : sequentialStatements) {
			if (first) {
				first = false;
			} else {
				sb.append("\n");
			}
			prettyPrint(sb, sequentialStatement, indentLevel + 1,
					subMonitor.newChild(1));
		}
	}

}
