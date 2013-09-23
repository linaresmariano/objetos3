package builders

import org.joda.time.DateTime
import model.Curso

class CursoBuilder {

	var diaDeLaSemana : Int = 0
	var horaInicio : Int = 0
	var horaFin : Int = 0
	var fechaComienzo : DateTime = new DateTime
	var fechaFin : DateTime = new DateTime
	
	def build : Curso = new Curso(this.diaDeLaSemana,this.horaInicio,this.horaFin,this.fechaComienzo,this.fechaFin) 
  
}