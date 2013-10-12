package main

trait FiltrarCursosPorAnio {
  
	def cursos:List[Curso]
	
	def filtrarCursosPorAnio(anio:Int) = {
	  	new CortePorAnio( cursos.filter(curso => curso.anio.equals(anio)) )
	}
}


class CortePorAnio(val cursos:List[Curso]) extends Grupal with CalculaEstadistica {
	def origenDeLasCursadas:List[{ def cursadas:List[Cursada] }] = cursos
}