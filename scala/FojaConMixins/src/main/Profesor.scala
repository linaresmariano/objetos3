package main

import scala.collection.mutable.ListBuffer

class Profesor(unNombre:String) extends Grupal with CalculaEstadistica {
	val nombre = unNombre
	val cursos:ListBuffer[Curso] = new ListBuffer()
	
	override def origenDeLasCursadas:List[{ def cursadas:List[Cursada] }] = cursos.toList
}