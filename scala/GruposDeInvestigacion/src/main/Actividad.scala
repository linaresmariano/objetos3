package main

import scala.collection.mutable.ListBuffer
import java.util.Calendar

////////////////////////
//      Actividad
////////////////////////
abstract class Actividad(val nombre: String, val responsable: Persona, val montoDeFinanciamiento: Int, val grupo: GrupoDeInvestigacion) {
	var fechaPresentacion: Calendar = null
	var fechaAprobacion: Calendar = null
	
	def estaAprobada: Boolean = {
		fechaAprobacion ne null
	}
	
	def estaPresentada: Boolean = {
		(fechaPresentacion ne null) && fechaPresentacion.before(Calendar.getInstance());
	}
	
	def getFechaDePresentacionALaUniversidad = fechaPresentacion
	def setFechaPresentacion(fecha:Calendar) = {
		fechaPresentacion = fecha
	}
	
	def getFechaDeAprobacion = fechaAprobacion
	def setFechaAprobacion(fecha:Calendar) = {
		fechaAprobacion = fecha
	}
	
	def esArticulo: Boolean = false
	
	def detalleDeEventos: ListBuffer[DetalleEvento]
}








