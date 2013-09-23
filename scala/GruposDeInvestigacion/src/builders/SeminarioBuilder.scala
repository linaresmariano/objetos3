package builders

import model.GrupoDeInvestigacion
import model.Persona
import model.Seminario
import scala.collection.mutable.ListBuffer
import model.Sesion

class SeminarioBuilder {
	
	var nombre: String = ""
	var responsable: Persona = null
	var montoDeFinanciamiento: Int = 0
	var grupo: GrupoDeInvestigacion = null
	var sesiones : ListBuffer[Sesion] = new ListBuffer()
	
	def withSesion(sesion : Sesion) = this.sesiones += sesion
	
	def build : Seminario = {
	  var seminario : Seminario = new Seminario(this.nombre,this.responsable,this.montoDeFinanciamiento,this.grupo) 
  	  seminario.sesiones ++= this.sesiones
  	  return seminario
	}  
}