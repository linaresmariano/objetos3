package model

import org.joda.time.DateTime

abstract class ActividadDeGrupo (val nombreDeLaActividad: String, val montoTotalDeFinanciamiento : Int,val responsable: IntegranteDeGrupoDeInvestigacion,val grupoOrganizadorDeLaActividad: GrupoDeInvestigacion,val fechaDePresentacionDeLaActividadALaUniversidad : DateTime) {
	var aprobacion : Boolean = false
	var fechaDeAprobacionDeLaActividad : DateTime = null
	
	def aprobarActividad = {
	  this.aprobacion = true
	  this.fechaDeAprobacionDeLaActividad = DateTime.now()
	}
	def aprobada : Boolean = this.aprobacion
	
	def getFechaDeAprobacionDeLaActividad = this.fechaDeAprobacionDeLaActividad

	def esArticulo : Boolean = false
}