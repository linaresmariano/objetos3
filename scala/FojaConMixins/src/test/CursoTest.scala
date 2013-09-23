package test

import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import main.Estudiante
import main.Cursada
import main.Curso

class CursoTest {
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
}