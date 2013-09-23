package main

import scala.collection.mutable.ListBuffer

class Profesor(unNombre:String) extends Grupal with CalculaEstadistica with FiltrarCursosPorAnio {
	val nombre = unNombre
	val cursosBuffer:ListBuffer[Curso] = new ListBuffer()
	
	def cursos:List[Curso] = cursosBuffer.toList
	
	override def origenDeLasCursadas:List[{ def cursadas:List[Cursada] }] = cursosBuffer.toList
}