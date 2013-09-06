package main
import org.joda.time.DateTime

abstract class Charla(val cantidadEstimadaDePublico: Int,val fechaDeCharla: DateTime, val horaComienzoDeCharla: DateTime,val horaFinDeCharla: DateTime,nombreDeLaActividad: String, montoTotalDeFinanciamiento: Int, responsable: IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad: GrupoDeInvestigacion) extends ActividadDeGrupo(nombreDeLaActividad, montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad) {

}