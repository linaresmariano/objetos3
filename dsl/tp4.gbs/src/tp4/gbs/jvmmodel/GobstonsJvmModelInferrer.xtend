package tp4.gbs.jvmmodel

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import tp4.gbs.gobstons.ProcedureDeclaration

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class GobstonsJvmModelInferrer extends AbstractModelInferrer {

 /**
   * a builder API to programmatically create Jvm elements 
   * in readable way.
   */
//	@Inject extension JvmTypesBuilder
//  
//	@Inject extension IQualifiedNameProvider
//	
//	Tablero tablero = new Tablero();
//  
def dispatch void infer(ProcedureDeclaration element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
}
}


