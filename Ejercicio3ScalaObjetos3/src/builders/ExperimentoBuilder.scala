package builders

import org.joda.time.DateTime
import model.Experimento

class ExperimentoBuilder {

	var fechaDeRealizacion : DateTime = null
	var horaComienzoDeExperimento : Integer = 0
	var horaFinDeExperimento : DateTime = null
	var descripcion : String = ""
  
	def withDescripcion (descripcion : String ) : ExperimentoBuilder = {
	  this.descripcion = descripcion
	  return this
	}
	  
	def build() = new Experimento(this.fechaDeRealizacion,this.horaComienzoDeExperimento,this.horaFinDeExperimento,this.descripcion)
	
}