package builders

import model.GrupoDeInvestigacion
import model.Persona
import model.Seminario

class SeminarioBuilder {
	
	var nombre: String = ""
	var responsable: Persona = null
	var montoDeFinanciamiento: Int = 0
	var grupo: GrupoDeInvestigacion = null
	
	
	def build : Seminario = new Seminario(this.nombre,this.responsable,this.montoDeFinanciamiento,this.grupo) 
  
}