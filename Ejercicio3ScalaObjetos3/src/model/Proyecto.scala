package model
import scala.collection.mutable.ListBuffer
import org.joda.time.DateTime


class Proyecto(val detallesDeResultado : String,nombreDeLaActividad : String , montoTotalDeFinanciamiento : Integer ,responsable : IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad : GrupoDeInvestigacion, fechaDePresentacionDeLaActividadALaUniversidad : DateTime) extends ActividadDeGrupo(nombreDeLaActividad ,montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad,fechaDePresentacionDeLaActividadALaUniversidad) {

	var fechaDeFinalizacion : DateTime = null
	val experimentosHechosOPorHacer : ListBuffer[Experimento] = ListBuffer()
  
	def setFechaDeFinalizacion(fechaDeFinalizacion : DateTime) = this.fechaDeFinalizacion = fechaDeFinalizacion 
	def getFechaDeFinalizacion = fechaDeFinalizacion
  
	def getExperimentosHechosOPorHacer = experimentosHechosOPorHacer
	def addExperimentoHechoOPorHacer(experimento : Experimento) = experimentosHechosOPorHacer += experimento
  
	def detallesDeExperimentos : ListBuffer[String] = experimentosHechosOPorHacer.map(experimento => experimento.descripcion)
	
	override def esArticulo : Boolean = detallesDeResultado.contains("articulo")
  
}