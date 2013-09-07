package model

import scala.collection.mutable.ListBuffer

class IntegranteDeGrupoDeInvestigacion {

  val eventosEnLosQueParticipa : ListBuffer[String] = ListBuffer()
  
  def getEventosEnLosQueParticipa = eventosEnLosQueParticipa
  def addEventoEnElQueParticipa(evento : String) = eventosEnLosQueParticipa += evento
}