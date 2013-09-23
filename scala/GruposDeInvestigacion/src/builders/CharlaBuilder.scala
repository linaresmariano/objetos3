package builders

import model.GrupoDeInvestigacion
import model.Persona
import org.joda.time.DateTime
import model.Charla

class CharlaBuilder {
	var nombre: String = ""
	var responsable: Persona = null
	var montoDeFinanciamiento: Int = 0
	var grupo: GrupoDeInvestigacion = null
	val cantidadPublico: Int = 0
	val fechaDesde: DateTime = new DateTime
	val fechaHasta: DateTime = new DateTime
	
	
	def build : Charla = new Charla(this.nombre,this.responsable,this.montoDeFinanciamiento,this.grupo,this.cantidadPublico,this.fechaDesde,this.fechaHasta) 
}