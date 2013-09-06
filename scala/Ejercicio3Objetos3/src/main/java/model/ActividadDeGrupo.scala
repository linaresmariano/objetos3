package main
import org.joda.time.DateTime

abstract class ActividadDeGrupo (val nombreDeLaActividad: String, val montoTotalDeFinanciamiento : Int,val responsable: IntegranteDeGrupoDeInvestigacion,val grupoOrganizadorDeLaActividad: GrupoDeInvestigacion) {
	var aprobacion : Boolean = false
	val fechaDePresentacionDeLaActividadALaUniversidad : DateTime
	var fechaDeAprobacionDeLaActividad : DateTime
	
	def aprobarActividad = aprobacion = true
	def getAprobacion : Boolean = aprobacion
	
	def getFechaDePresentacionDeLaActividadALaUniversidad = fechaDePresentacionDeLaActividadALaUniversidad
	
	def getFechaDeAprobacionDeLaActividad = fechaDeAprobacionDeLaActividad
	
	
	def esArticulo : Boolean = false
}