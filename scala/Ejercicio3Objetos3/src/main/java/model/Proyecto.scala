package main
import org.joda.time.DateTime
import scala.collection.mutable.ListBuffer

abstract class Proyecto(val detallesDeResultado : String,nombreDeLaActividad : String, montoTotalDeFinanciamiento : Int, responsable : IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad : GrupoDeInvestigacion) extends ActividadDeGrupo(nombreDeLaActividad ,montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad) {

  var fechaDeFinalizacion : DateTime
  val experimentosHechosOPorHacer : ListBuffer[Experimento] = ListBuffer()
  
  def getDetallesDeResultado = detallesDeResultado
  
  def setFechaDeFinalizacion(fechaDeFinalizacion : DateTime) = this.fechaDeFinalizacion = fechaDeFinalizacion 
  def getFechaDeFinalizacion = fechaDeFinalizacion

  def getExperimentosHechosOPorHacer = experimentosHechosOPorHacer
  def addExperimentoHechoOPorHacer(experimento : Experimento) = experimentosHechosOPorHacer += experimento
  
  override def esArticulo = getDetallesDeResultado.contains("articulo")
  
}