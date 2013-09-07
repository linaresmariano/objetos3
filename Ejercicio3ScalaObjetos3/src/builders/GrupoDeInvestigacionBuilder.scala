package builders

import scala.collection.mutable.ListBuffer
import model.IntegranteDeGrupoDeInvestigacion
import model.GrupoDeInvestigacion

class GrupoDeInvestigacionBuilder {

	var integrantes : ListBuffer[IntegranteDeGrupoDeInvestigacion] = new ListBuffer()
	
	def build() = new GrupoDeInvestigacion(this.integrantes)
  
}