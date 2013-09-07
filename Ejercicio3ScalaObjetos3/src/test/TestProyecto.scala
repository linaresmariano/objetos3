package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import builders.ProyectoBuilder
import model.ActividadDeGrupo
import model.Proyecto

class TestProyecto {

	@Test
	def testEsArticulo(){
	  
		var proyectoBuilder : ProyectoBuilder = new ProyectoBuilder()
		var actividad1 : Proyecto = proyectoBuilder.withDetallesDeResultado("soy un articulo ").build()
		var actividad2 : Proyecto = proyectoBuilder.withDetallesDeResultado("soy un articul o asd ").build()
		var actividad3 : Proyecto = proyectoBuilder.withDetallesDeResultado("soy asdasun articulosdasdsd ").build()
	  
		assertTrue(actividad1.esArticulo)
		assertFalse(actividad2.esArticulo)
		assertTrue(actividad3.esArticulo)
		
	}
  
}