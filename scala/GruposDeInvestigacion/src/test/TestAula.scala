package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.mockito.Mockito._
import builders.AulaBuilder
import model.Recurso
import model.Aula

class TestAula {

	@Test
	def testTieneRecurso{
	  
		var aulaBuilder : AulaBuilder = new AulaBuilder()
		aulaBuilder.withRecurso(new Recurso("Microfono"))
		aulaBuilder.withRecurso(new Recurso("Estabilizador"))
		aulaBuilder.withRecurso(new Recurso("AireAcondicionado"))

		var aula : Aula = aulaBuilder.build
		
		assertTrue(aula.tieneAireAcondicionado)
		assertTrue(aula.tieneEstabilizador)
		assertTrue(aula.tieneMicrofono)
		assertFalse(aula.tieneCanion)

	}
	
	
	@Test
	def testTieneTamanioMinimoDePizarron{
	  
		var aulaBuilder : AulaBuilder = new AulaBuilder()
		aulaBuilder.withTamanioDePizzaron(3,3)
		var aula : Aula = aulaBuilder.build
		
		assertTrue(aula.tieneTamanioMinimoDePizarron(3,3))
		assertFalse(aula.tieneTamanioMinimoDePizarron(2,5))
		assertFalse(aula.tieneTamanioMinimoDePizarron(4,2))
		assertFalse(aula.tieneTamanioMinimoDePizarron(5,5))
		assertTrue(aula.tieneTamanioMinimoDePizarron(2,2))
	}
	
  
}