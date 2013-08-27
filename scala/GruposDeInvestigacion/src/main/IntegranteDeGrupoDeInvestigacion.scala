package main

import scala.collection.mutable.ListBuffer

class IntegranteDeGrupoDeInvestigacion {

  var eventosEnLosQueParticipa : ListBuffer[String] = ListBuffer()
  
  def getEventosEnLosQueParticipa = eventosEnLosQueParticipa
  def addEventoEnElQueParticipa(evento : String) = eventosEnLosQueParticipa += evento
}