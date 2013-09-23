package main

import scala.collection.mutable.ListBuffer

class Profesor(val nombre:String) extends Grupal with CalculaEstadistica with FiltrarCursosPorAnio {

	val cursosBuffer:ListBuffer[Curso] = new ListBuffer()
	
	def addCurso(curso:Curso) = {
		cursosBuffer += curso
	}
	
	def cursos:List[Curso] = cursosBuffer.toList
	
	override def origenDeLasCursadas:List[{ def cursadas:List[Cursada] }] = cursosBuffer.toList
}