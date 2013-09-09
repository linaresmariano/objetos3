package model

import scala.collection.mutable.ListBuffer

class GrupoDeInvestigacion(val integrantes : ListBuffer[IntegranteDeGrupoDeInvestigacion]) {

	val actividades : ListBuffer[ActividadDeGrupo] = ListBuffer()

	def addIntegrante(integrante : IntegranteDeGrupoDeInvestigacion) = integrantes += integrante
	
	def getActividades = this.actividades
	
	def addActividad(actividad : ActividadDeGrupo) = {
	  	this.actividades+=(actividad)
	  	this.integrantes.map(integrante => integrante.participarEnUnaActividad(actividad))
	}
	
	def addActividades(actividades : ListBuffer[ActividadDeGrupo]) = {
		actividades.map(actividad => this.addActividad(actividad))
	}
	def getActividadesAunNoAprobadas  : ListBuffer[ActividadDeGrupo] = this.actividades.filter(actividad => (!actividad.aprobada))
	
	def getMontoTotalDeFinanciamientoDeActividadesAunNoAprobadas : Integer = this.getActividadesAunNoAprobadas.map( actividad => actividad.montoTotalDeFinanciamiento).sum

	def getArticulosPublicados : ListBuffer[ActividadDeGrupo] = this.actividades.filter(actividad => actividad.esArticulo)
	
}