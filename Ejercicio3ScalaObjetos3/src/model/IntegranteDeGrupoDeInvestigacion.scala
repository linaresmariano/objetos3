package model

import scala.collection.mutable.ListBuffer

class IntegranteDeGrupoDeInvestigacion {

  val actividadesDeGrupo : ListBuffer[ActividadDeGrupo] = ListBuffer()
  
  def getActividadesEnLasQueParticipa = actividadesDeGrupo
  def participarEnUnaActividad(actividad : ActividadDeGrupo) = actividadesDeGrupo += actividad
  
  def getEventosEnLosQueParticipa : ListBuffer[String] = {
    	var nombreDeEventos : ListBuffer[String] = ListBuffer()
    	
    	this.actividadesDeGrupo.map(actividad => actividad match {
	    	  case charla : Charla => nombreDeEventos+=(charla.nombreDeLaActividad)
	    	  case proyecto : Proyecto => nombreDeEventos++=(proyecto.detallesDeExperimentos)
	    	  case seminario : Seminario => nombreDeEventos++=(seminario.nombresDeSesiones)
    		}
    	)
    	return nombreDeEventos
  }
}