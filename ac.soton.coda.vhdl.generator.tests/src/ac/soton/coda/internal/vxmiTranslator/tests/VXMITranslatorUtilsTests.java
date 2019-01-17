package ac.soton.coda.internal.vxmiTranslator.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.eventb.core.ast.FormulaFactory;
import org.eventb.core.ast.Type;
import org.eventb.emf.core.machine.Guard;
import org.junit.Test;

import ac.soton.coda.vhdl.vxmiTranslator.VXMITranslatorUtils;

public class VXMITranslatorUtilsTests {

	private static FormulaFactory ff = FormulaFactory.getDefault();

	@Test
	public void testEventBTypeToVHDLType_1() {
		Type eventBType;
		String vhdlType;

		eventBType = ff.makeBooleanType();
		vhdlType = VXMITranslatorUtils.eventBTypeToVHDLType(eventBType);
		assertEquals("Invalid VHDL Type", "boolean", vhdlType);
	}

	@Test
	public void testEventBTypeToVHDLType_2() {
		Type eventBType;
		String vhdlType;

		eventBType = ff.makeIntegerType();
		vhdlType = VXMITranslatorUtils.eventBTypeToVHDLType(eventBType);
		assertEquals("Invalid VHDL Type", "integer", vhdlType);
		
		eventBType = ff.makeGivenType("std_logic");
		vhdlType = VXMITranslatorUtils.eventBTypeToVHDLType(eventBType);
		assertEquals("Invalid VHDL Type", "std_logic", vhdlType);
	}

	@Test
	public void testEventBTypeToVHDLType_3() {
		Type eventBType;
		String vhdlType;

		eventBType = ff.makeGivenType("std_logic");
		vhdlType = VXMITranslatorUtils.eventBTypeToVHDLType(eventBType);
		assertEquals("Invalid VHDL Type", "std_logic", vhdlType);
	}

	@Test
	public void testEventBTypeStringToVHDLType_1() {
		String eventBType;
		String vhdlType;

		eventBType = "BitVector(3)";
		vhdlType = VXMITranslatorUtils.eventBTypeToVHDLType(eventBType);
		assertEquals("Invalid VHDL Type", "std_logic_vector(2 downto 0)", vhdlType);
		
		eventBType = "BOOL";
		vhdlType = VXMITranslatorUtils.eventBTypeToVHDLType(eventBType);
		assertEquals("Invalid VHDL Type", "boolean", vhdlType);
	}

	@Test
	public void testEventBGuardsToVHDLBooleanExpression() {
		List<Guard> guards = new ArrayList<Guard>();
		
		VXMITranslatorUtils.eventBGuardsToVHDLBooleanExpression(guards);
		
	}
}
 