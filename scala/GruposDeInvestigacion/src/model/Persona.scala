package model

import scala.collection.mutable.ListBuffer
import scala.collection.immutable.Nil

class Persona {

  val grupos: ListBuffer[GrupoDeInvestigacion] = ListBuffer()
  
  def actividades:ListBuffer[Actividad] = {
    grupos.foldLeft(ListBuffer(): ListBuffer[Actividad]) { (acts, grupo) =>
    	acts ++= grupo.actividades
    }
  }

  def eventosEnLosQueParticipa: ListBuffer[DetalleEvento] = {
		var detallesDeEeventos = actividades.foldLeft(ListBuffer(): ListBuffer[DetalleEvento]) { (detalles, act) => detalles ++= act.detalleDeEventos}
	    detallesDeEeventos.sortWith((detalle1,detalle2) => detalle1.fechaDesde.isBefore(detalle2.fechaDesde))
	}
  
}