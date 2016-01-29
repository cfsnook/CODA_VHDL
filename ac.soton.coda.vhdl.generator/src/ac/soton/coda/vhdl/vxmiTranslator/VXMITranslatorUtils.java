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

import org.eclipse.emf.common.util.EList;
import org.eventb.core.ast.BooleanType;
import org.eventb.core.ast.IntegerType;
import org.eventb.core.ast.Type;
import org.eventb.emf.core.machine.Guard;

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
		// TODO Check for other composite type?
		if (type instanceof BooleanType) {
			return "BOOL";
		}
		if (type instanceof IntegerType) {
			return "int";
		}
		return type.toString();
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
		// TODO Auto-generated method stub
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
		return assignment.replaceFirst("≔", " <= ");
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

}
