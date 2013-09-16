package builders


import org.joda.time.DateTime
import model.GrupoDeInvestigacion
import model.Proyecto
import model.Persona



class ProyectoBuilder {

  var resultados : Map[DateTime,String] = Map()
  var nombreDeLaActividad : String = "" 
  var montoTotalDeFinanciamiento : Integer = 0 
  var responsable : Persona = null
  var grupoOrganizadorDeLaActividad : GrupoDeInvestigacion = null
  var fechaDePresentacionDeLaActividadALaUniversidad : DateTime = null
 
  def withResultados(detalle : Map[DateTime,String]) : ProyectoBuilder = {
    this.resultados = detalle
    return this
  }
  
  def build() : Proyecto = {
    var proyecto = new Proyecto( this.nombreDeLaActividad,this.responsable,this.montoTotalDeFinanciamiento,this.grupoOrganizadorDeLaActividad) 
    proyecto.resultados = this.resultados
    return proyecto
  }
}