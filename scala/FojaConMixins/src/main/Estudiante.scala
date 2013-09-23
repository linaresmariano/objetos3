package main

import scala.collection.mutable.ListBuffer
import scala.collection.immutable.Nil

class Estudiante extends CalculaEstadistica with FiltrarCursosPorAnio {
	val cursadasBuffer:ListBuffer[Cursada] = ListBuffer()
	
	override def cursadas:List[Cursada] = cursadasBuffer.toList
	
	override def cursos:List[Curso] = cursadasBuffer.toList.map(cursada => cursada.curso)
	
	def addCursada(unaCursada:Cursada) = cursadasBuffer += unaCursada

}


object estudia extends App {
	val mariano:Estudiante = new Estudiante()
	
	val curso:Curso = new Curso("Objectos3")
	
	val cursada:Cursada = new Cursada(8)
	cursada.curso = new Curso("Objectos3")
	mariano addCursada cursada
	
	val cursada1:Cursada = new Cursada(10)
	cursada1.curso = new Curso("Objectos2")
	mariano addCursada cursada1
	
	val cursada2:Cursada = new Cursada(2)
	cursada2.curso = new Curso("Objectos1")
	mariano addCursada cursada2
	
	val cursada3:Cursada = new Cursada()
	cursada3.curso = new Curso("Objectos4")
	mariano addCursada cursada3
	
	val cursada4:Cursada = new Cursada(2)
	cursada4.curso = new Curso("Objectos5")
	mariano addCursada cursada4
	
	
	println("Notas", mariano.notas)
	println("Promedio sin aplazos", mariano.promedioSinAplazos)
	println("Promedio con aplazos", mariano.promedioConAplazos)
	println("Cursadas aprobadas", mariano.cantidadDeCursadasAprobadas)
	println("Cursadas desaprobadas", mariano.cantidadDeCursadasDesaprobadas)
	println("Cursadas abandonadas", mariano.cantidadDeCursadasAbandonadas)
	println("Porcentaje de cursadas aprobadas sobre iniciadas", mariano.cursosAprobadosSobreIniciados)
	println("Tabla de notas", mariano.tablaNotas)
	println("Nota mas alta al menos N veces", mariano.notaMasAltaAlMenos(2))
	println("Nota mas alta N veces", mariano.notaMasAltaSuperadaAlMenos(2))
	println("Cursos del 2013", mariano.filtrar(2013))
}