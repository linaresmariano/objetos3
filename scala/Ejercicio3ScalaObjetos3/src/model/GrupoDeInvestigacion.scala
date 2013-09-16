package model

import scala.collection.mutable.ListBuffer

class GrupoDeInvestigacion(val integrantes : ListBuffer[Persona]) {
	val actividades:ListBuffer[Actividad] = ListBuffer()
	
	def actividadesPresentadasPendientesDeAprobacion: ListBuffer[Actividad] = {
		actividades.filter(actividad => (actividad.estaPresentada && !actividad.estaAprobada))
	}
	
	def getMontoTotal(acts:ListBuffer[Actividad]): Integer = {
		acts.map( actividad => actividad.montoDeFinanciamiento).sum
	}
	
	def getArticulos: ListBuffer[Actividad] = {
		actividades.filter(actividad => actividad.esArticulo)
	}
}