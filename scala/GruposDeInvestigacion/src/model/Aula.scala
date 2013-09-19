package model

import scala.collection.mutable.ListBuffer

class Aula(val metrosCuadradosDePizzarron : (Int,Int), val capacidad : Int) {

	val recursos : ListBuffer[Recurso] = ListBuffer()
  
	def tieneRecurso(nombre : String) : Boolean = recursos.exists(recurso => recurso.nombre == nombre)
	def tieneCanion : Boolean = this.tieneRecurso("Canion")
	def tieneMicrofono : Boolean = this.tieneRecurso("Microfono")
	def tieneAireAcondicionado : Boolean = this.tieneRecurso("AireAcondicionado")
	def tieneEstabilizador : Boolean = this.tieneRecurso("Estabilizador")
	def tieneTamanioMinimoDePizarron( tama�o : (Int,Int)) : Boolean = this.metrosCuadradosDePizzarron._1 >= tama�o._1 && this.metrosCuadradosDePizzarron._2 >= tama�o._2
}