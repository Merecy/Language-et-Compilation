/*
 * generated by Xtext 2.25.0
 */
package curvehtml.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import univ.xtext.projet.myhtml.ui.internal.MyhtmlActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyHtmlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MyhtmlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MyhtmlActivator activator = MyhtmlActivator.getInstance();
		return activator != null ? activator.getInjector(MyhtmlActivator.CURVEHTML_MYHTML) : null;
	}

}
