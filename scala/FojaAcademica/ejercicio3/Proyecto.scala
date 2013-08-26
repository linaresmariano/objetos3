package ejercicio3

import scala.collection.mutable.ListBuffer

class Proyecto(detallesDeResultado : String, fechaDeFinalizacion : AlgunDate, nombreDeLaActividad : String,montoTotalDeFinanciamiento : Int, responsable : IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad : GrupoDeInvestigacion) extends ActividadDeGrupo(nombreDeLaActividad ,montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad) {

  var experimentosHechosOPorHacer : ListBuffer[Experimento] = ListBuffer()
  
  def getDetallesDeResultado = detallesDeResultado
  def getFechaDeFinalizacion = fechaDeFinalizacion

  def getExperimentosHechosOPorHacer = experimentosHechosOPorHacer
  def addExperimentoHechoOPorHacer(experimento : Experimento) = experimentosHechosOPorHacer += experimento
  
  override def esArticulo = getDetallesDeResultado.contains("articulo")
  
}