/*
 * generated by Xtext 2.25.0
 */
package curvehtml.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import univ.xtext.projet.myhtml.ui.internal.MyhtmlActivator;

public class MyHtmlUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MyhtmlActivator.getInstance().getInjector("curvehtml.MyHtml");
	}

}
