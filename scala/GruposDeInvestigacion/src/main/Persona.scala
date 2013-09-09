package main

import scala.collection.mutable.ListBuffer
import scala.collection.immutable.Nil
import java.util.Calendar

class Persona {

  val grupos: ListBuffer[GrupoDeInvestigacion] = ListBuffer()
  
  def actividades:ListBuffer[Actividad] = {
    grupos.foldLeft(ListBuffer(): ListBuffer[Actividad]) { (acts, grupo) =>
    	acts ++= grupo.actividades
    }
  }

  def eventosEnLosQueParticipa: ListBuffer[DetalleEvento] = {
	actividades.foldLeft(ListBuffer(): ListBuffer[DetalleEvento]) { (detalles, act) =>
	    detalles ++= act.detalleDeEventos
	}
  }
}