package main

import scala.collection.mutable.ListBuffer

class GrupoDeInvestigacion {
	val actividades:ListBuffer[Actividad] = ListBuffer()
	val integrantes:ListBuffer[Persona] = ListBuffer()
	
	def actividadesPresentadasPendientesDeAprobacion: ListBuffer[Actividad] = {
		actividades.filter(actividad => (actividad.estaPresentada && !actividad.estaAprobada))
	}
	
	def getMontoTotal(acts:ListBuffer[Actividad]): Integer = {
		acts.map( actividad => actividad.montoDeFinanciamiento).sum
	}
	
	def getArticulosPublicados: ListBuffer[Actividad] = {
		actividades.filter(actividad => actividad.esArticulo)
	}
}