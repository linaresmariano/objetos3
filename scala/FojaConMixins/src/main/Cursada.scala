package main

import scala.collection.mutable.ListBuffer

class Cursada(var curso:Curso) {
	def this() = {
	  this(null)
	}

	def this(unaNota:Int) = {
	  this(null)
	  this.setNota(unaNota)
	  this.setTerminada(true)
	}
	
	def this(unaNota:Int, unCurso:Curso) = {
	  this(unCurso)
	  this.setNota(unaNota)
	  this.setTerminada(true)
	}
	
	var terminada:Boolean = false
	var nota:Int = 0
	
	def estaAprobada:Boolean = return nota >= 4
	
	def setTerminada(termina:Boolean) = terminada = termina
	def getTerminada:Boolean = terminada
	def setNota(value:Int) = nota = value
}

