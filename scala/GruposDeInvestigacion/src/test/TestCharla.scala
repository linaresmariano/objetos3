package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.mockito.Mockito._
import model.Aula
import builders.CharlaBuilder
import model.Charla

class TestCharla {
  
  	@Test
	def testMeSirveShouldBeFalse {
	  
		var aula : Aula = mock(classOf[Aula])
		when(aula.tieneMicrofono).thenReturn(false)
		when(aula.tieneAireAcondicionado).thenReturn(false)
		when(aula.tieneCanion).thenReturn(true)
		when(aula.tieneEstabilizador).thenReturn(false)
		when(aula.tieneTamanioMinimoDePizarron((2,5))).thenReturn(true)
		
		var charla : Charla = new CharlaBuilder().build
		
		assertFalse(charla.meSirve(aula))
	}
  
	@Test
	def testMeSirveShouldBeTrue1 {
	  
		var aula : Aula = mock(classOf[Aula])
		when(aula.tieneMicrofono).thenReturn(true)
		when(aula.tieneAireAcondicionado).thenReturn(false)
		when(aula.tieneCanion).thenReturn(true)
		when(aula.tieneEstabilizador).thenReturn(false)
		when(aula.tieneTamanioMinimoDePizarron((2,5))).thenReturn(true)
		
		var charla : Charla = new CharlaBuilder().build
		
		assertTrue(charla.meSirve(aula))
	}
	
	
	@Test
	def testMeSirveShouldBeTrue2 {
	  
		var aula : Aula = mock(classOf[Aula])
		when(aula.tieneMicrofono).thenReturn(true)
		when(aula.tieneAireAcondicionado).thenReturn(true)
		when(aula.tieneCanion).thenReturn(true)
		when(aula.tieneEstabilizador).thenReturn(true)
		when(aula.tieneTamanioMinimoDePizarron((2,5))).thenReturn(true)
		
		var charla : Charla = new CharlaBuilder().build
		
		assertTrue(charla.meSirve(aula))
	}
}