package ejercicio3

import scala.collection.mutable.ListBuffer

class GrupoDeInvestigacion {
	var integrantes : ListBuffer[IntegranteDeGrupoDeInvestigacion] = ListBuffer()
	var actividades : ListBuffer[ActividadDeGrupo] = ListBuffer()
	
	def getIntegrantes = integrantes
	def addIntegrante(integrante : IntegranteDeGrupoDeInvestigacion) = integrantes += integrante
	
	def getActividades = actividades
	def addActividad(actividad : ActividadDeGrupo) = actividades += actividad
	
	def getActividadesAunNoAprobadas = actividades.filter(actividad => (actividad.getFechaDeAprobacionDeLaActividad == null))
	def getMontoTotalDeFinanciamientoDeActividadesAunNoAprobadas = getActividadesAunNoAprobadas.map( actividad => actividad.getMontoTotalDeFinanciamiento).sum

	def getArticulosPublicados = actividades.filter(actividad => actividad.esArticulo)
	
}