package builders

import model.GrupoDeInvestigacion
import model.IntegranteDeGrupoDeInvestigacion
import org.joda.time.DateTime
import model.Charla

class CharlaBuilder {

	var cantidadEstimadaDePublico: Integer = 0
	var fechaDeCharla: DateTime = new DateTime
	var horaComienzoDeCharla: Integer = 0
	var horaFinDeCharla: Integer = 0
	var nombreDeLaActividad : String = ""
	var montoTotalDeFinanciamiento : Integer = 0
	var responsable : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion
	var grupoOrganizadorDeLaActividad : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
	var fechaDePresentacionDeLaActividadALaUniversidad : DateTime = new DateTime
	
	def withMontoTotalDeFinanciamiento(monto : Integer) : CharlaBuilder = {
	  this.montoTotalDeFinanciamiento = monto
	  return this
	}
	
	def withNombreDeLaActividad(nombreDeLaActividad : String) : CharlaBuilder = {
		this.nombreDeLaActividad = nombreDeLaActividad
		return this
	}
	
	def build() : Charla  = return new Charla(this.cantidadEstimadaDePublico, this.fechaDeCharla,  this.horaComienzoDeCharla, this.horaFinDeCharla,this.nombreDeLaActividad  , this.montoTotalDeFinanciamiento  ,this.responsable , this.grupoOrganizadorDeLaActividad , this.fechaDePresentacionDeLaActividadALaUniversidad )
}