package main

trait CalculaEstadistica {
  
	def notasSinAplazos:List[Int]
	def notas:List[Int]
	
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
}