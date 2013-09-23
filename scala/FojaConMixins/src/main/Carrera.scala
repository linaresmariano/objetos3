package main

import scala.collection.mutable.ListBuffer

class Carrera(unNombre:String) extends Grupal with CalculaEstadistica {
	val nombre = unNombre
	val estudiantes:ListBuffer[Estudiante] = new ListBuffer()
	
	override def origenDeLasCursadas:List[{ def cursadas:List[Cursada] }] = estudiantes.toList
}