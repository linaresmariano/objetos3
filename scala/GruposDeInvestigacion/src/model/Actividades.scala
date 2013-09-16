package model

import scala.collection.mutable.ListBuffer
import org.joda.time.DateTime


////////////////////////
//      Proyecto
////////////////////////
class Proyecto(nombre: String, responsable: Persona, montoDeFinanciamiento: Int, grupo: GrupoDeInvestigacion)
				extends Actividad(nombre, responsable, montoDeFinanciamiento, grupo) {

  
	var resultados:Map[DateTime, String] = Map()
	val experimentos:ListBuffer[DetalleEvento] = ListBuffer()
	
	override def esArticulo: Boolean = resultados.values.exists( x => (x.contains("articulo")))
	
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

class Sesion(val fechaDesde:DateTime, val fechaHasta:DateTime) {}

////////////////////////
//      Charla
////////////////////////
class Charla(nombre: String, responsable: Persona, montoDeFinanciamiento: Int, grupo: GrupoDeInvestigacion,
		val cantidadPublico: Int, val fechaDesde: DateTime, val fechaHasta: DateTime)
				extends Actividad(nombre, responsable, montoDeFinanciamiento, grupo) {
  
	override def detalleDeEventos: ListBuffer[DetalleEvento] = {
		ListBuffer(new DetalleEvento(this.fechaDesde, this.fechaHasta, this.nombre))
	}
}


///////////////////////////////
//      Detalle del evento
///////////////////////////////
class DetalleEvento(val fechaDesde: DateTime, val fechaHasta: DateTime, val descripcion: String) {}
