package builders


import model.GrupoDeInvestigacion
import model.Charla
import model.Persona
import org.joda.time.DateTime

class CharlaBuilder {

	var cantidadEstimadaDePublico: Integer = 0
	var fechaDesde: DateTime = null
	var fechaHasta: DateTime = null
	var nombreDeLaActividad : String = ""
	var montoTotalDeFinanciamiento : Integer = 0
	var responsable : Persona = null
	var grupoOrganizadorDeLaActividad : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
	var fechaDePresentacionDeLaActividadALaUniversidad : DateTime = null
	
	def withMontoTotalDeFinanciamiento(monto : Integer) : CharlaBuilder = {
	  this.montoTotalDeFinanciamiento = monto
	  return this
	}
	
	def withNombreDeLaActividad(nombreDeLaActividad : String) : CharlaBuilder = {
		this.nombreDeLaActividad = nombreDeLaActividad
		return this
	}
	
	def build() : Charla  = return new Charla(this.nombreDeLaActividad,this.responsable,this.montoTotalDeFinanciamiento,this.grupoOrganizadorDeLaActividad,this.cantidadEstimadaDePublico,this.fechaDesde,this.fechaHasta)
}