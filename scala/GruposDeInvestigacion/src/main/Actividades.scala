package main

import scala.collection.mutable.ListBuffer
import java.util.Calendar


////////////////////////
//      Proyecto
////////////////////////
class Proyecto(nombre: String, responsable: Persona, montoDeFinanciamiento: Int, grupo: GrupoDeInvestigacion)
				extends Actividad(nombre, responsable, montoDeFinanciamiento, grupo) {

  
	val resultados:Map[Calendar, String] = Map()
	val experimentos:ListBuffer[DetalleEvento] = ListBuffer()
	
	override def esArticulo: Boolean = resultados.exists( x => (x._2.contains("articulo")))
	
	override def detalleDeEventos: ListBuffer[DetalleEvento] = experimentos
}

////////////////////////
//      Seminario
////////////////////////
class Seminario(nombre: String, responsable: Persona, montoDeFinanciamiento: Int, grupo: GrupoDeInvestigacion)
				extends Actividad(nombre, responsable, montoDeFinanciamiento, grupo) {
  
	val sesiones:ListBuffer[Sesion] = ListBuffer()
	
	override def detalleDeEventos: ListBuffer[DetalleEvento] = {
		sesiones.foldLeft(ListBuffer(): ListBuffer[DetalleEvento]) { (acum, sesion) =>
			acum += new DetalleEvento(sesion.fechaDesde, sesion.fechaHasta, this.nombre)
		}
	}
}

class Sesion(val fechaDesde:Calendar, val fechaHasta:Calendar) {}

////////////////////////
//      Charla
////////////////////////
class Charla(nombre: String, responsable: Persona, montoDeFinanciamiento: Int, grupo: GrupoDeInvestigacion,
		val cantidadPublico: Int, val fechaDesde: Calendar, val fechaHasta: Calendar)
				extends Actividad(nombre, responsable, montoDeFinanciamiento, grupo) {
  
	override def detalleDeEventos: ListBuffer[DetalleEvento] = {
		ListBuffer(new DetalleEvento(this.fechaDesde, this.fechaHasta, this.nombre))
	}
}


///////////////////////////////
//      Detalle del evento
///////////////////////////////
class DetalleEvento(val fechaDesde: Calendar, val fechaHasta: Calendar, val descripcion: String) {}
