package main

trait FiltrarCursosPorAnio {
  
	def cursos:List[Curso]
	
	def filtrarCursosPorAnio(anio:Int) = {
	  	cursos.filter(curso => curso.anio.equals(anio))
	}
}
