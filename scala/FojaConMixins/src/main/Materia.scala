package main

import scala.collection.mutable.ListBuffer

class Materia(unaCarrera:Carrera) extends Grupal with CalculaEstadistica {
	val carrera = unaCarrera
	val cursos:ListBuffer[Curso] = new ListBuffer()
	
	override def origenDeLasCursadas:List[{ def cursadas:List[Cursada] }] = cursos.toList
}
