package model

import scala.collection.mutable.ListBuffer
import org.joda.time.DateTime

class Seminario(nombreDeLaActividad : String , montoTotalDeFinanciamiento : Integer ,responsable : IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad : GrupoDeInvestigacion, fechaDePresentacionDeLaActividadALaUniversidad : DateTime) extends ActividadDeGrupo(nombreDeLaActividad ,montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad, fechaDePresentacionDeLaActividadALaUniversidad )  {

  var sesiones : ListBuffer[SesionDeSeminario] = ListBuffer()
  
  def getSesiones = sesiones
  def addSesion(sesion : SesionDeSeminario) = sesiones += sesion
  
}