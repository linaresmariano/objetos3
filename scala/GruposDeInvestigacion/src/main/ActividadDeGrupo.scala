package main


abstract class ActividadDeGrupo (nombreDeLaActividad: String, montoTotalDeFinanciamiento: Int, responsable: IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad: GrupoDeInvestigacion) {
	var aprobacion : Boolean = false
	val fechaDePresentacionDeLaActividadALaUniversidad : AlgunDate
	var fechaDeAprobacionDeLaActividad : AlgunDate
	
	def aprobarActividad = aprobacion = true
	def getAprobacion : Boolean = aprobacion
	
	def getResponsable = responsable
	
	def getGrupoOrganizadorDeLaActividad = grupoOrganizadorDeLaActividad
	
	def getFechaDePresentacionDeLaActividadALaUniversidad = fechaDePresentacionDeLaActividadALaUniversidad
	
	def getFechaDeAprobacionDeLaActividad = fechaDeAprobacionDeLaActividad
	
	def getNombreDeLaActividad = nombreDeLaActividad
	
	def getMontoTotalDeFinanciamiento = montoTotalDeFinanciamiento
	
	def esArticulo : Boolean = false
}