package builders

import model.GrupoDeInvestigacion
import model.IntegranteDeGrupoDeInvestigacion
import org.joda.time.DateTime
import model.Proyecto

class ProyectoBuilder {

  var detallesDeResultado : String = ""
  var nombreDeLaActividad : String = "" 
  var montoTotalDeFinanciamiento : Integer = 0 
  var responsable : IntegranteDeGrupoDeInvestigacion = null
  var grupoOrganizadorDeLaActividad : GrupoDeInvestigacion = null
  var fechaDePresentacionDeLaActividadALaUniversidad : DateTime = null
 
  def withDetallesDeResultado(detalle : String) : ProyectoBuilder = {
    this.detallesDeResultado = detalle
    return this
  }
  
  def build() : Proyecto = new Proyecto( this.detallesDeResultado ,this.nombreDeLaActividad , this.montoTotalDeFinanciamiento, this.responsable , this.grupoOrganizadorDeLaActividad, this.fechaDePresentacionDeLaActividadALaUniversidad) 
  
}