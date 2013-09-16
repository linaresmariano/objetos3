package main

import scala.collection.mutable.ListBuffer

class Cursada(unCurso:Curso) {
	def this() = {
	  this(null)
	}

	def this(unaNota:Int) = {
	  this(null)
	  this.setNota(unaNota)
	  this.setTerminada(true)
	}
	
	val curso = unCurso
	var terminada:Boolean = false
	var nota:Int = 0
	
	def estaAprobada:Boolean = return nota >= 4
	
	def setTerminada(termina:Boolean) = terminada = termina
	def getTerminada:Boolean = terminada
	def setNota(value:Int) = nota = value
}

class Materia(unaCarrera:Carrera) {
	val carrera = unaCarrera
}

class Carrera(unNombre:String) {
	val nombre = unNombre
}

class Profesor(unNombre:String) {
	val nombre = unNombre
}