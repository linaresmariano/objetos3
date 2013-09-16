package model

import scala.collection.mutable.ListBuffer
import org.joda.time.DateTime

////////////////////////
//      Actividad
////////////////////////
abstract class Actividad(val nombre: String, val responsable: Persona, val montoDeFinanciamiento: Int, val grupo: GrupoDeInvestigacion) {
	var fechaPresentacion: DateTime = null
	var fechaAprobacion: DateTime = null
	
	def estaAprobada: Boolean = {
		fechaAprobacion ne null
	}
	
	def estaPresentada: Boolean = {
		(fechaPresentacion ne null) && fechaPresentacion.isBefore(DateTime.now());
	}
	
	def getFechaDePresentacionALaUniversidad = fechaPresentacion
	def setFechaPresentacion(fecha:DateTime) = {
		fechaPresentacion = fecha
	}
	
	def getFechaDeAprobacion = fechaAprobacion
	def setFechaAprobacion(fecha:DateTime) = {
		fechaAprobacion = fecha
	}
	
	def esArticulo: Boolean = false
	
	def detalleDeEventos: ListBuffer[DetalleEvento]
}








