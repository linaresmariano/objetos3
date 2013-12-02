package tp4.gbs.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import tp4.gbs.gobstons.Operation
import tp4.gbs.gobstons.ProcedureDeclaration

class GobstonsGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (ProcedureDeclaration e : resource.allContents.toIterable.filter(ProcedureDeclaration)) {
			fsa.generateFile("Main.java", e.compile)
		}
	}

	def compile(Operation op) {
		'''
		tablero.«op.class.simpleName.toLowerCase.substring(0, op.class.simpleName.length-4)»("«op.param»");
		'''
	}

	def compile(ProcedureDeclaration f) {
		'''
			import main.java.Tablero;

			public class Main {

				 public static void main(String[] args) {
				 	Tablero tablero = new Tablero();
				 	tablero.print();
				 	«FOR Operation operation : f.operations»
				 		«operation.compile»
				 	«ENDFOR»
				 	tablero.print();
				}
			}
		'''
	}

}
