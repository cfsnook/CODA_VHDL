/**
 */
package ac.soton.coda.vhdl.tests;

import ac.soton.coda.vhdl.IVHDLFactory;
import ac.soton.coda.vhdl.IVHDLSelectedName;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selected Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLSelectedNameTest extends VHDLNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VHDLSelectedNameTest.class);
	}

	/**
	 * Constructs a new Selected Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLSelectedNameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Selected Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IVHDLSelectedName getFixture() {
		return (IVHDLSelectedName)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IVHDLFactory.eINSTANCE.createVHDLSelectedName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VHDLSelectedNameTest
