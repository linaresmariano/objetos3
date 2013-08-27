package main

class Charla(cantidadEstimadaDePublico: Int, fechaDeCharla: AlgunDate, horaComienzoDeCharla: Hora, horaFinDeCharla: Hora, nombreDeLaActividad: String, montoTotalDeFinanciamiento: Int, responsable: IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad: GrupoDeInvestigacion) extends ActividadDeGrupo(nombreDeLaActividad, montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad) {

  def getFechaDeCharla = fechaDeCharla
  def getHoraComienzoDeCharla = horaComienzoDeCharla
  def getHoraFinDeCharla = horaFinDeCharla
  def getCantidadEstimadaDePublico = cantidadEstimadaDePublico
}