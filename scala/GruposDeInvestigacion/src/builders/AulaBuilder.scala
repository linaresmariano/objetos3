package builders

import scala.collection.mutable.ListBuffer
import model.Aula
import model.Recurso

class AulaBuilder {

	var metrosCuadradosDePizzarron : (Int,Int) = (0,0)
	var capacidad : Int = 0
	var recursos : ListBuffer[Recurso] = ListBuffer()
	
	def withTamanioDePizzaron( tamanio : (Int,Int)) = this.metrosCuadradosDePizzarron = tamanio
	
	def withRecurso(recurso : Recurso) = this.recursos += recurso
	
	def build : Aula = {
	  var aula : Aula = new Aula(this.metrosCuadradosDePizzarron,this.capacidad)
	  aula.recursos ++= this.recursos
	  return aula
	}
}