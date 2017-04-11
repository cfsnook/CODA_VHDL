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

package ac.soton.coda.vhdl.generator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import ac.soton.coda.internal.vhdl.utils.VHDLGeneratorUtils;
import ac.soton.coda.vhdl.vxmiTranslator.VXMITranslatorUtils;

/**
 * @author htson
 *
 * The activator class controls the plug-in life cycle
 */
public class VHDLGeneratorPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "ac.soton.coda.simulator2"; //$NON-NLS-1$

	// The shared instance
	private static VHDLGeneratorPlugin plugin;
	
	// Trace options
	private static final String GLOBAL_TRACE = PLUGIN_ID + "/debug"; //$NON-NLS-1$
	private static final String VXMI_TRANSLATOR_TRACE = PLUGIN_ID + "/debug/VXMITranslator"; //$NON-NLS-1$

	/**
	 * The constructor
	 */
	public VHDLGeneratorPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		if (isDebugging())
			configureDebugOptions();

	}

	/**
	 * Process debugging/tracing options coming from Eclipse.
	 */
	private void configureDebugOptions() {
		VHDLGeneratorUtils.DEBUG = parseOption(GLOBAL_TRACE);
		VXMITranslatorUtils.DEBUG = parseOption(VXMI_TRANSLATOR_TRACE);
	}

	private static boolean parseOption(String key) {
		final String option = Platform.getDebugOption(key);
		return "true".equalsIgnoreCase(option); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see AbstractUIPlugin#stop(BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static VHDLGeneratorPlugin getDefault() {
		return plugin;
	}

}
