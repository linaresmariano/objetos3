package tp4.gbs.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import tp4.gbs.gobstons.Operation
import tp4.gbs.gobstons.ProcedureDeclaration
import tp4.gbs.gobstons.Conditional
import tp4.gbs.gobstons.Function

class GobstonsGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (ProcedureDeclaration e : resource.allContents.toIterable.filter(ProcedureDeclaration)) {
			fsa.generateFile("Main.java", e.compile)
		}
	}

	def dispatch compile(Function op) {
		'''tablero.«op.class.simpleName.toLowerCase.substring(0, op.class.simpleName.length-4)»("«op.param»")'''
	}
	
	def dispatch compile(Conditional op) {
		'''if(«op.boolExpresion.compile») {
	«op.trueBlock.compile»;
} else {
	«op.falseBlock.compile»;
}'''
	}
	
	def compile(ProcedureDeclaration f) {
		'''
			import tp4.gbs.model.Tablero;

			public class Main {

				 public static void main(String[] args) {
				 	Tablero tablero = new Tablero();
				 	tablero.print();
				 	«FOR Operation operation : f.operations»
				 		«operation.compile»;
				 	«ENDFOR»
				 	tablero.print();
				}
			}
		'''
	}

}
