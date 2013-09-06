package main

import scala.collection.mutable.ListBuffer

abstract class Seminario(nombreDeLaActividad : String,montoTotalDeFinanciamiento : Int, responsable : IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad : GrupoDeInvestigacion) extends ActividadDeGrupo(nombreDeLaActividad ,montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad)  {

  var sesiones : ListBuffer[SesionDeSeminario] = ListBuffer()
  
  def getSesiones = sesiones
  def addSesion(sesion : SesionDeSeminario) = sesiones += sesion
  
}