package builders

import org.joda.time.DateTime
import model.DetalleEvento


class ExperimentoBuilder {  
	
	var fechaDesde : DateTime = null
	var fechaHasta : DateTime = null
	var descripcion : String = ""
  
	def withDescripcion (descripcion : String ) : ExperimentoBuilder = {
	  this.descripcion = descripcion
	  return this
	}
	  
	def build(): DetalleEvento = new DetalleEvento(this.fechaDesde,this.fechaHasta,this.descripcion)
	
}