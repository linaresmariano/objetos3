package builders

import scala.collection.mutable.ListBuffer
import model.GrupoDeInvestigacion
import model.Persona



class GrupoDeInvestigacionBuilder {

	var integrantes : ListBuffer[Persona] = new ListBuffer()
	
	def withIntegrantes(integrantes : ListBuffer[Persona]) : GrupoDeInvestigacionBuilder = {
	  	this.integrantes = integrantes
	  	return this
	}
	
	def build() = new GrupoDeInvestigacion(this.integrantes)
  
}