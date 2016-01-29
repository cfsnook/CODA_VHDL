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
public class TranslatorStorage implements ITranslatorStorage {

	private static ITranslatorStorage instance;
	
	private Map<String, Object> storage;
	
	private TranslatorStorage() {
		storage = new HashMap<String, Object>();
	}
	
	public static ITranslatorStorage getDefault() {
		if (instance == null)
			instance = new TranslatorStorage();
		return instance;
	}

	/* (non-Javadoc)
	 * @see ac.soton.coda.vhdl.vxmiTranslator.ITranslatorStorage#fetch(java.lang.String)
	 */
	@Override
	public Object fetch(String key) {
		return storage.get(key);
	}

	/* (non-Javadoc)
	 * @see ac.soton.coda.vhdl.vxmiTranslator.ITranslatorStorage#stash(java.lang.String, ac.soton.coda.vhdl.IVHDLEntityDeclaration)
	 */
	@Override
	public void stash(String key, Object value) {
		storage.put(key, value);
	}
	
	public void reset() {
		storage = new HashMap<String, Object>();
	}
}
