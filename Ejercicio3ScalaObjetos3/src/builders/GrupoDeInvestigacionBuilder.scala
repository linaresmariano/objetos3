package builders

import scala.collection.mutable.ListBuffer
import model.IntegranteDeGrupoDeInvestigacion
import model.GrupoDeInvestigacion

class GrupoDeInvestigacionBuilder {

	var integrantes : ListBuffer[IntegranteDeGrupoDeInvestigacion] = new ListBuffer()
	
	def withIntegrantes(integrantes : ListBuffer[IntegranteDeGrupoDeInvestigacion]) : GrupoDeInvestigacionBuilder = {
	  	this.integrantes = integrantes
	  	return this
	}
	
	def build() = new GrupoDeInvestigacion(this.integrantes)
  
}