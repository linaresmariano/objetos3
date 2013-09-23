package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.mockito.Mockito._
import model.Aula
import builders.CursoBuilder
import model.Curso


class TestCurso {

	@Test
	def testMeSirveShouldBeFalse {
	  
		var aula : Aula = mock(classOf[Aula])
		when(aula.tieneMicrofono).thenReturn(false)
		when(aula.tieneAireAcondicionado).thenReturn(true)
		when(aula.tieneCanion).thenReturn(true)
		when(aula.tieneEstabilizador).thenReturn(true)
		when(aula.tieneTamanioMinimoDePizarron((2,10))).thenReturn(true)
		
		var curso : Curso = new CursoBuilder().build
		
		assertFalse(curso.meSirve(aula))
	}
	
	
		@Test
	def testMeSirveShouldBeTrue {
	  
		var aula : Aula = mock(classOf[Aula])
		when(aula.tieneMicrofono).thenReturn(true)
		when(aula.tieneAireAcondicionado).thenReturn(true)
		when(aula.tieneCanion).thenReturn(true)
		when(aula.tieneEstabilizador).thenReturn(true)
		when(aula.tieneTamanioMinimoDePizarron((2,10))).thenReturn(true)
		
		var curso : Curso = new CursoBuilder().build
		
		assertTrue(curso.meSirve(aula))
	}
  
}