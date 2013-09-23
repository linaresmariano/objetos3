package test

import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import main.Estudiante
import main.Cursada

class EstudianteTest {
	val estudiante:Estudiante = new Estudiante()
	val cursada:Cursada = new Cursada(8)
	val cursada1:Cursada = new Cursada(10)
	val cursada2:Cursada = new Cursada(2)
	val cursada3:Cursada = new Cursada()
	val cursada4:Cursada = new Cursada(2)

	@Test
	def testPromedioSinAplasosSinNotas = {
	  assertEquals(estudiante.promedioSinAplazos, 0f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENSoloTengoAplazos = {
	  estudiante.addCursada(new Cursada(1))
	  assertEquals(estudiante.promedioSinAplazos, 0f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENNoTengoAplazos = {
	  estudiante.addCursada(new Cursada(10))
	  estudiante.addCursada(new Cursada(8))
	  assertEquals(estudiante.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENTengoAplazosYNo = {
	  estudiante.addCursada(new Cursada(9))
	  estudiante.addCursada(new Cursada(7))
	  estudiante.addCursada(new Cursada(3))
	  assertEquals(estudiante.promedioSinAplazos, 8f, 0.01f)
	}
	
	def initializeEstudiante = {
		estudiante addCursada cursada
		estudiante addCursada cursada1
		estudiante addCursada cursada2
		estudiante addCursada cursada3
		estudiante addCursada cursada4
	}
	
	@Test
	def testNotas = {
		initializeEstudiante
		assertEquals(estudiante.notas, List(8, 10, 2, 2))
	}
	
	@Test
	def testPromedioSinAplazos = {
		initializeEstudiante
		assertEquals(estudiante.promedioSinAplazos, 9.0, 0.01f)
	}
	
	@Test
	def testPromedioConAplazos = {
		initializeEstudiante
		assertEquals(estudiante.promedioConAplazos, 5.0, 0.01f)
	}
	
	
}