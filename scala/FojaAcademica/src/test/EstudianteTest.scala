package test

import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import main.Estudiante
import main.Cursada

class EstudianteTest {
	var mariano:Estudiante = new Estudiante()

	@Test
	def testPromedioSinAplasosSinNotas = {
	  assertEquals(mariano.promedioSinAplazos, 0f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENSoloTengoAplazos = {
	  mariano.addCursada(new Cursada(1))
	  assertEquals(mariano.promedioSinAplazos, 0f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENNoTengoAplazos = {
	  mariano.addCursada(new Cursada(10))
	  mariano.addCursada(new Cursada(8))
	  assertEquals(mariano.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENTengoAplazosYNo = {
	  mariano.addCursada(new Cursada(9))
	  mariano.addCursada(new Cursada(7))
	  mariano.addCursada(new Cursada(3))
	  assertEquals(mariano.promedioSinAplazos, 8f, 0.01f)
	}
}