package test

import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import main.Estudiante
import main.Cursada
import main.Curso

class CursoTest {
  	val cursada:Cursada = new Cursada(8)
	val cursada1:Cursada = new Cursada(10)
	val cursada2:Cursada = new Cursada(2)
	val cursada3:Cursada = new Cursada()
	val cursada4:Cursada = new Cursada(2)	
  	
	val curso:Curso = new Curso("Objetos3")
	
	@Test
	def testPromedioSinAplasosSinNotas = {
	  assertEquals(curso.promedioSinAplazos, 0f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENSoloTengoAplazos = {
	  curso.addCursada(new Cursada(1))
	  assertEquals(curso.promedioSinAplazos, 0f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENNoTengoAplazos = {
	  curso.addCursada(new Cursada(10))
	  curso.addCursada(new Cursada(8))
	  assertEquals(curso.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENTengoAplazosYNo = {
	  curso.addCursada(new Cursada(9))
	  curso.addCursada(new Cursada(7))
	  curso.addCursada(new Cursada(3))
	  assertEquals(curso.promedioSinAplazos, 8f, 0.01f)
	}
	
	
	def initializeEstudiante = {
		curso addCursada cursada
		curso addCursada cursada1
		curso addCursada cursada2
		curso addCursada cursada3
		curso addCursada cursada4
	}
	
	@Test
	def testNotas = {
		initializeEstudiante
		assertEquals(curso.notas, List(8, 10, 2, 2))
	}
	
	@Test
	def testPromedioSinAplazos = {
		initializeEstudiante
		assertEquals(curso.promedioSinAplazos, 9.0, 0.01f)
	}
	
	@Test
	def testPromedioConAplazos = {
		initializeEstudiante
		assertEquals(curso.promedioConAplazos, 5.0, 0.01f)
	}
	
	@Test
	def testCantidadDeCursadasAprobadas = {
		initializeEstudiante
		assertEquals(curso.cantidadDeCursadasAprobadas, 2)
	}
	
	@Test
	def testCantidadDeCursadasDesaprobadas = {
		initializeEstudiante
		assertEquals(curso.cantidadDeCursadasDesaprobadas, 2)
	}
	
	@Test
	def testCantidadDeCursadasAbandonadas = {
		initializeEstudiante
		assertEquals(curso.cantidadDeCursadasAbandonadas, 1)
	}
	
	@Test
	def testNotaMasAltaSuperadaAlMenos = {
		initializeEstudiante
		assertEquals(curso.notaMasAltaSuperadaAlMenos(2), 8)
	}

	@Test
	def testCursosAprobadosSobreIniciados = {
		initializeEstudiante
		assertEquals(curso.cursosAprobadosSobreIniciados, 40f, 0.01f)
	}
}