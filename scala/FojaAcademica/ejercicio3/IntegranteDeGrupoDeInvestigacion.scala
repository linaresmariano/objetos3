package ejercicio3

class IntegranteDeGrupoDeInvestigacion {

  var eventosEnLosQueParticipa : ListBuffe[String] = ListBuffer()
  
  def getEventosEnLosQueParticipa = eventosEnLosQueParticipa
  def addEventoEnElQueParticipa(evento : String) = eventosEnLosQueParticipa += evento
}