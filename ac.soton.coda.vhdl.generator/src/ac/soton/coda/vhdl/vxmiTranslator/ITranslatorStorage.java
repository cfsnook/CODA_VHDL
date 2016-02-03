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
public interface ITranslatorStorage {

	/**
	 * @param string
	 */
	public abstract Object fetch(String key);

	/**
	 * @param string
	 * @param entityDeclaration
	 */
	public abstract void stash(String key, Object value);

	public abstract void reset();
}