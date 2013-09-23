package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.mockito.Mockito._
import model.Aula
import model.Seminario
import builders.SeminarioBuilder
import model.Sesion

class TestSeminario {
  
  
	@Test
	def testMeSirveShouldBeFalse {
	  
		var aula : Aula = mock(classOf[Aula])
		when(aula.tieneMicrofono).thenReturn(true)
		when(aula.tieneAireAcondicionado).thenReturn(true)
		when(aula.tieneCanion).thenReturn(true)
		when(aula.tieneEstabilizador).thenReturn(true)
		when(aula.tieneTamanioMinimoDePizarron((2,10))).thenReturn(false)
		
		var seminario : Seminario = new SeminarioBuilder().build
		
		assertFalse(seminario.meSirve(aula))
	}
	
	
		@Test
	def testMeSirveShouldBeTrue {
	  
		var aula : Aula = mock(classOf[Aula])
		when(aula.tieneMicrofono).thenReturn(true)
		when(aula.tieneAireAcondicionado).thenReturn(true)
		when(aula.tieneCanion).thenReturn(true)
		when(aula.tieneEstabilizador).thenReturn(true)
		when(aula.tieneTamanioMinimoDePizarron((2,5))).thenReturn(true)
		
		var seminario : Seminario = new SeminarioBuilder().build
		
		assertTrue(seminario.meSirve(aula))
	}
}