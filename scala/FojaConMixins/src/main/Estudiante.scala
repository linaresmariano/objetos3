package main

import scala.collection.mutable.ListBuffer
import scala.collection.immutable.Nil

class Estudiante extends CalculaEstadistica {
	var cursadas:ListBuffer[Cursada] = ListBuffer()
	
	def addCursada(unaCursada:Cursada) = cursadas += unaCursada
	
	// Devuelve una lista de notas sin los aplazos
	def notasSinAplazos:List[Int] = {
		var ret:ListBuffer[Int] = ListBuffer()
		
		for(cursada:Cursada <- cursadas) {
			if(cursada.estaAprobada) {
				ret += cursada.nota
			}
		}
		ret.toList	  
	}
	
	// Devuelve una lista de notas de todas sus cursadas
	// No se toman en cuenta las materias que abandona
	def notas:List[Int] = {
		cursadas.filter(x => x.getTerminada).map(x => x.nota).toList
	}
	
	// Devuelve la cantidad de cursadas aprobadas
	def cantidadDeCursadasAprobadas:Int = {
	  cantAprobadasAux(cursadas.toList)
	}
	
	// Cursadas aprobadas usando pattern matching
	def cantAprobadasAux(listaCursadas:List[Cursada]):Int = {
		listaCursadas match {
			case Nil => 0
			case (x::xs) if x.estaAprobada => 1 + (cantAprobadasAux(xs)) 
			case (x::xs) => cantAprobadasAux(xs)
		}
	}
	
	def cantidadDeCursadasDesaprobadas:Int = {
			cursadas.toList.filter(x => ! x.estaAprobada && x.getTerminada).length
	}
	
	def cantidadDeCursadasAbandonadas:Int = {
		var ret:Int = 0
		cursadas.foreach { cursada =>
			if(! cursada.getTerminada) {
				ret += 1
			}
		}
		ret
	}
	
	def cursosAprobadosSobreIniciados:Float = {
		if(cursadas.length != 0) {
			return cantidadDeCursadasAprobadas * 100 / cursadas.length
		}
		
		return 100
	}
	
	// Devuelve un map de Nota -> Cantidad
	def tablaNotas:Map[Int, Int] = {
		var retMap:Map[Int, Int] = Map()
		for(nota <- 1 to 10) {
			retMap = retMap + (nota -> notas.toList.count(_ == nota))
		}
		
		retMap
	}
	
	
	def notaMasAltaSuperadaAlMenos(nVeces: Int): Int = {
		var cant:Int = 0
		
		for(nota <- (1 to 10).reverse) {
			cant += notas.toList.count(_ == nota)
			if(cant >= nVeces)
				return nota
		}
		
		return 0
	}
	
	def notaMasAltaAlMenos(nVeces:Int):Int = {
		val result:Map[Int, Int] = tablaNotas.filter( x => (x._2 >= nVeces))
		println(result);
		
		result match {
		  case x if x == Map.empty => 0
		  case _ => result.keys.max
		}
	}

}


object estudia extends App {
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