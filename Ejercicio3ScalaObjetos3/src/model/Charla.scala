package model

import org.joda.time.DateTime


class Charla(val cantidadEstimadaDePublico: Int,val fechaDeCharla: DateTime, val horaComienzoDeCharla: Int,val horaFinDeCharla: Int,nombreDeLaActividad : String , montoTotalDeFinanciamiento : Integer ,responsable : IntegranteDeGrupoDeInvestigacion, grupoOrganizadorDeLaActividad : GrupoDeInvestigacion, fechaDePresentacionDeLaActividadALaUniversidad : DateTime ) 
				extends ActividadDeGrupo(nombreDeLaActividad, montoTotalDeFinanciamiento, responsable, grupoOrganizadorDeLaActividad, fechaDePresentacionDeLaActividadALaUniversidad) {
  
  
}