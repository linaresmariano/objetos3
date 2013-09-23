package main

import scala.collection.mutable.ListBuffer
import scala.collection.immutable.Nil

class Estudiante extends CalculaEstadistica {
	val cursadasBuffer:ListBuffer[Cursada] = ListBuffer()
	
	override def cursadas:List[Cursada] = cursadasBuffer.toList
	
	def addCursada(unaCursada:Cursada) = cursadasBuffer += unaCursada

}


object estudia extends App {
	val mariano:Estudiante = new Estudiante()
	
	val cursada:Cursada = new Cursada(8)
	mariano addCursada cursada
	
	val cursada1:Cursada = new Cursada(10)
	mariano addCursada cursada1
	
	val cursada2:Cursada = new Cursada(2)
	mariano addCursada cursada2
	
	val cursada3:Cursada = new Cursada()
	mariano addCursada cursada3
	
	val cursada4:Cursada = new Cursada(2)
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
}