package main

trait FiltrarCursosPorAnio {
  
	def cursos:List[Curso]
	
	def filtrar(anio:Int) = {
	  	cursos.filter(curso => curso.anio.equals(anio))
	}
}
