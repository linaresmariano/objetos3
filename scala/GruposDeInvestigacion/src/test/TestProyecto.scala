package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import builders.ProyectoBuilder
import model.Proyecto
import org.joda.time.DateTime


class TestProyecto {

	@Test
	def testEsArticulo(){
	  
		var resultados1 : Map[DateTime,String] = Map()
		resultados1 += (new DateTime(2010) -> "soy un articulo ")
		resultados1 += (new DateTime(2011)-> "soy un articul o asd ")
		resultados1 += (new DateTime(2012) -> "soy asdasun articulosdasdsd ")
		
		var resultados2 : Map[DateTime,String] = Map()
		resultados2 += (new DateTime(2010) -> "soy un articul ")
		resultados2 += (new DateTime(2011) -> "articu lo ")
		resultados2 += (new DateTime(2012) -> "a rticulo")
		
		var proyectoBuilder : ProyectoBuilder = new ProyectoBuilder()
		proyectoBuilder.withResultados(resultados1)
		var actividad1 : Proyecto = proyectoBuilder.build()
		proyectoBuilder.withResultados(resultados2)
		var actividad2 : Proyecto = proyectoBuilder.build()
	  
		assertTrue(actividad1.esArticulo)
		assertFalse(actividad2.esArticulo)
		
	}
  
}