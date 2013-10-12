package test

import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import main.Estudiante
import main.Cursada
import main.Curso

class EstudianteTest {
	val obj3 = new Curso("Objectos3")
	val des = new Curso("Desarrollo")
	val tvd = new Curso("TVD")
	val tti = new Curso("TTI")
	val labo = new Curso("Laboratorio")
	
	val estudiante:Estudiante = new Estudiante()
	val cursada:Cursada = new Cursada(8)
	cursada.curso = obj3
	val cursada1:Cursada = new Cursada(10)
	cursada1.curso = des
	val cursada2:Cursada = new Cursada(2)
	cursada2.curso = tvd
	val cursada3:Cursada = new Cursada()
	cursada3.curso = tti
	val cursada4:Cursada = new Cursada(2)
	cursada4.curso = labo

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
	
	@Test
	def testCantidadDeCursadasAprobadas = {
		initializeEstudiante
		assertEquals(estudiante.cantidadDeCursadasAprobadas, 2)
	}
	
	@Test
	def testCantidadDeCursadasDesaprobadas = {
		initializeEstudiante
		assertEquals(estudiante.cantidadDeCursadasDesaprobadas, 2)
	}
	
	@Test
	def testCantidadDeCursadasAbandonadas = {
		initializeEstudiante
		assertEquals(estudiante.cantidadDeCursadasAbandonadas, 1)
	}
	
	@Test
	def testNotaMasAltaSuperadaAlMenos = {
		initializeEstudiante
		assertEquals(estudiante.notaMasAltaSuperadaAlMenos(2), 8)
	}

	@Test
	def testCursosAprobadosSobreIniciados = {
		initializeEstudiante
		assertEquals(estudiante.cursosAprobadosSobreIniciados, 40f, 0.01f)
	}
	
	@Test
	def testTablaNotas = {
		initializeEstudiante
		assertEquals(estudiante.tablaNotas, Map(1 -> 0, 2 -> 2, 3 -> 0, 4 -> 0, 5 -> 0, 6 -> 0, 7 -> 0, 8 -> 1, 9 -> 0, 10 -> 1))
	}
	
	@Test
	def testFiltrarCursosPorAnio2013 = {
		initializeEstudiante
		assertEquals(estudiante.filtrarCursosPorAnio(2013).cursos, List(obj3, des, tvd, tti, labo))
	}
	
	@Test
	def testPromedioSinAplazosDelCortePorAnio = {
		initializeEstudiante
		assertEquals(estudiante.filtrarCursosPorAnio(2013).promedioSinAplazos, 9.0, 0.01f)
	}
	
	@Test
	def testPromedioConAplazosDelCortePorAnio = {
		initializeEstudiante
		assertEquals(estudiante.filtrarCursosPorAnio(2013).promedioConAplazos, 5.0, 0.01f)
	}
	
	@Test
	def testFiltrarCursosPorAnio2014 = {
		initializeEstudiante
		assertEquals(estudiante.filtrarCursosPorAnio(2014).cursos, List())
	}
}