/*
 * generated by Xtext
 */
package tp4.gbs.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractGobstonsValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(tp4.gbs.gobstons.GobstonsPackage.eINSTANCE);
		return result;
	}
}
