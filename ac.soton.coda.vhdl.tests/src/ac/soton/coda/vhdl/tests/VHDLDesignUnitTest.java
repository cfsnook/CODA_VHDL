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

package ac.soton.coda.vhdl.tests;

import ac.soton.coda.vhdl.IVHDLDesignUnit;
import ac.soton.coda.vhdl.IVHDLFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Design Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLDesignUnitTest extends TestCase {

	/**
	 * The fixture for this Design Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IVHDLDesignUnit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VHDLDesignUnitTest.class);
	}

	/**
	 * Constructs a new Design Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLDesignUnitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Design Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IVHDLDesignUnit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Design Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IVHDLDesignUnit getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IVHDLFactory.eINSTANCE.createVHDLDesignUnit());
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

} //VHDLDesignUnitTest
