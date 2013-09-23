package main

trait CalculaEstadistica {
  
	def cursadas:List[Cursada]
	
	// Devuelve una lista de notas de todas sus cursadas
	// No se toman en cuenta las materias que abandona
	def notas:List[Int] = {
		cursadas.filter(x => x.getTerminada).map(x => x.nota).toList
	}
	
	def notasSinAplazos:List[Int] = {
		notas.filter(nota => nota >= 4)
	}
	
	// Promedio de notas sin aplazos
	def promedioSinAplazos:Float = {
		promedio(notasSinAplazos)
	}
	
	// Promedio de todas las notas
	def promedioConAplazos:Float = {
		promedio(notas)
	}
	
	// Devuelve el promedio de notas de toda la lista
	def promedio(notas:List[Int]):Float = {
		var cant:Int = notas.length
		
		if(cant == 0) {
		  cant = 1
		}
		
		return notas.sum / cant
	}
	
	// Devuelve la cantidad de cursadas aprobadas
	def cantidadDeCursadasAprobadas:Int = {
	  cantAprobadasAux(cursadas)
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
			cursadas.filter(x => ! x.estaAprobada && x.getTerminada).length
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