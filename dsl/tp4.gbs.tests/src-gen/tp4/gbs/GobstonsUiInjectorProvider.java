/*
* generated by Xtext
*/
package tp4.gbs;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class GobstonsUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return tp4.gbs.ui.internal.GobstonsActivator.getInstance().getInjector("tp4.gbs.Gobstons");
	}
	
}