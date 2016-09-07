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

package ac.soton.coda.vhdl.vxmiTranslator;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ast.BooleanType;
import org.eventb.core.ast.GivenType;
import org.eventb.core.ast.IntegerType;
import org.eventb.core.ast.Type;
import org.eventb.emf.core.machine.Guard;
import org.rodinp.core.RodinDBException;

import ac.soton.coda.vhdl.IVHDLGuardedStatementElement;
import ac.soton.coda.vhdl.IVHDLSequentialStatementsElement;
import ac.soton.coda.vhdl.IVHDLSignalAssignmentStatement;
import ac.soton.coda.vhdl.custom.VHDLUtils;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.PortWake;
import ch.ethz.eventb.utils.EventBSCUtils;

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
public class VXMITranslatorUtils {

	private static Map<String, String> eventB2VHDL;
	
	static {
		eventB2VHDL = new HashMap<String, String>();
		eventB2VHDL.put("≠", "/=");
		eventB2VHDL.put("−", "-");
		eventB2VHDL.put("≔", "<=");
	}
	
	/**
	 * The debug flag. This is set by the option when the platform is launched.
	 * Client should not try to reset this flag.
	 */
	public static boolean DEBUG = false;

	/**
	 * Utility method to print a debug message.
	 * 
	 * @param msg
	 *            the debug message.
	 */
	public static void debug(String msg) {
		System.out.println("VXMI translator: " + msg);
	}

	/**
	 * @param type
	 * @return
	 */
	public static String eventBTypeToVHDLType(Type type) {
		if (type instanceof BooleanType) {
			return "BOOL";
		}
		if (type instanceof IntegerType) {
			return "int";
		}
		if (type instanceof GivenType)
			return ((GivenType) type).getName();
		return null;
	}

	/**
	 * @param type
	 * @return
	 */
	public static String eventBTypeToVHDLType(String type) {
		if ("BIT7".equals(type)) {
			return "std_logic_vector(6 downto 0)";
		}
		return type;
	}

	/**
	 * @param transitionGuard
	 * @return
	 */
	public static String eventBGuardsToVHDLBooleanExpression(EList<Guard> guards) {
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		for (Guard guard : guards) {
			if (first) {
				first = false;
			} else {
				sb.append(" & ");
			}
			String predicate = guard.getPredicate();
			sb.append("(" + eventBpredicateToVHDLBooleanExpression(predicate)
					+ ")");
		}

		String result = sb.toString();
		if (result.equals(""))
			result = "(true)";
		return result;
	}

	/**
	 * @param predicate
	 * @return
	 */
	private static String eventBpredicateToVHDLBooleanExpression(
			String predicate) {
		for (String eventBop : eventB2VHDL.keySet()) {
			predicate = predicate.replaceAll(eventBop,
					eventB2VHDL.get(eventBop));
		}
		return predicate;
	}

	/**
	 * @param guards
	 */
	public static String operationGuardsToVHDLBooleanExpression(
			EList<OperationGuard> guards) {
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		for (OperationGuard guard : guards) {
			if (first) {
				first = false;
			} else {
				sb.append(" & ");
			}
			String predicate = guard.getPredicate();
			sb.append("(" + eventBpredicateToVHDLBooleanExpression(predicate)
					+ ")");
		}

		String result = sb.toString();
		if (result.equals(""))
			result = "(true)";
		return result;
	}

	/**
	 * @param assignment
	 */
	public static String eventBAssignmentToVHDLSignalAssignment(
			String assignment) {
		// TODO this is done ad-hoc at the moment using string replacement.
		for (String eventBop : eventB2VHDL.keySet()) {
			assignment = assignment
					.replace(eventBop, eventB2VHDL.get(eventBop));
		}
		return assignment;
	}

	/**
	 * @param sequentialStatementsElement
	 * @param action
	 */
	public static IVHDLSignalAssignmentStatement createSignalAssignmentStatement(
			IVHDLSequentialStatementsElement sequentialStatementsElement,
			OperationAction action) {
		String assignment = action.getAction();
		String signalAssignment = eventBAssignmentToVHDLSignalAssignment(assignment);
		String[] split = signalAssignment.split("<=");
		return VHDLUtils.createSignalAssignmentStatement(
				sequentialStatementsElement, split[0], split[1]);

	}

	/**
	 * @param guardedStatementsElement
	 * @param send
	 */
	public static IVHDLSignalAssignmentStatement createSignalAssignmentStatement(
			IVHDLSequentialStatementsElement sequentialStatementsElement,
			DelayedDataPacket packet) {
		Connector connector = packet.getConnector();
		String value = packet.getValue();
		return VHDLUtils.createSignalAssignmentStatement(
				sequentialStatementsElement, connector.getName(), value);

	}

	/**
	 * @param guardedStatementsElement
	 * @param booleanExpression
	 */
	public static void appendGuard(
			IVHDLGuardedStatementElement guardedStatementsElement,
			String booleanExpression) {
		String currentBooleanExpression = guardedStatementsElement
				.getBooleanExpression();
		String newBooleanExpression = "(" + currentBooleanExpression + " & "
				+ booleanExpression + ")";
		guardedStatementsElement.setBooleanExpression(newBooleanExpression);
	}

	/**
	 * @param portWake
	 * @param booleanExpression
	 * @return
	 */
	public static String fixPortWakeGuards(PortWake portWake,
			String booleanExpression) {
		EList<DataPacket> receives = portWake.getReceives();
		for (DataPacket receive : receives) {
			Connector connector = receive.getConnector();
			String value = receive.getValue();
			booleanExpression = booleanExpression.replaceAll(value,
					connector.getName());
		}
		return booleanExpression;
	}

	/**
	 * @param identifier
	 * @param mchRoot
	 * @return
	 * @throws RodinDBException
	 */
	public static String getVHDLType(String identifier, IMachineRoot mchRoot)
			throws RodinDBException {
		Map<String, String> scSeenAxioms = EventBSCUtils.getSCSeenAxioms(
				mchRoot, false);
		String patternString = identifier + "\\s*∈\\s*(.*)";
		Pattern pattern = Pattern.compile(patternString);

		for (String pred : scSeenAxioms.values()) {
	        Matcher matcher = pattern.matcher(pred);
			if (matcher.matches()) {
				String type = matcher.group(0);
				if ("BIT2".equals(type)) {
					return "std_logic_vector(1 downto 0)";
				}
				if ("BIT3".equals(type)) {
					return "std_logic_vector(2 downto 0)";
				}
				if ("BIT7".equals(type)) {
					return "std_logic_vector(6 downto 0)";
				}
			}
		}
		return null;
	}

}
