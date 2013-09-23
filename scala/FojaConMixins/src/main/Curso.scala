package main

import scala.collection.mutable.ListBuffer

class Curso(val nombre:String, val materia:Materia) extends CalculaEstadistica {
	val docentes:ListBuffer[Profesor] = new ListBuffer()
	val cursadasBuffer:ListBuffer[Cursada] = new ListBuffer()
	
	override def cursadas:List[Cursada] = cursadasBuffer.toList
	
	def addCursada(cursada:Cursada) = {
		cursadasBuffer += cursada
	}
}



object curso extends App {
	val mariano:Estudiante = new Estudiante()
	
	var cursada:Cursada = new Cursada(8)
	mariano addCursada cursada
	
	var cursada1:Cursada = new Cursada(10)
	mariano addCursada cursada1
	
	var cursada2:Cursada = new Cursada(2)
	mariano addCursada cursada2
	
	var cursada3:Cursada = new Cursada()
	mariano addCursada cursada3
	
	var cursada4:Cursada = new Cursada(2)
	mariano addCursada cursada4
	
	val sergio:Estudiante = new Estudiante()
	sergio addCursada cursada
	sergio addCursada cursada
	
	val curso1:Curso = new Curso("Objetos3", new Materia(new Carrera("TPI")))
	//curso1.addAlumno(mariano)
	//curso1.addAlumno(sergio)
	
	println("Notas del curso", curso1.notas)
	println("Promedio sin aplazos del curso", curso1.promedioSinAplazos)
	println("Promedio con aplazos del curso", curso1.promedioConAplazos)
	
	
	println("Notas", mariano.notas)
	println("Promedio sin aplazos", mariano.promedioSinAplazos)
	println("Promedio con aplazos", mariano.promedioConAplazos)
}