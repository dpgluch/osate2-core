/*
 * generated by Xtext
 */
package org.osate.xtext.aadl2.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.osate.xtext.aadl2.ui.internal.Aadl2Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Aadl2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Aadl2Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Aadl2Activator.getInstance().getInjector(Aadl2Activator.ORG_OSATE_XTEXT_AADL2_AADL2);
	}
	
}
