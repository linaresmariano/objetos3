package test

import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import main.Cursada
import main.Curso
import main.Profesor

class ProfesorTest {
	val cursada:Cursada = new Cursada(8)
	val cursada1:Cursada = new Cursada(10)
	val cursada2:Cursada = new Cursada(2)
	val cursada3:Cursada = new Cursada()
	val cursada4:Cursada = new Cursada(2)	
	
	val obj3 = new Curso("Objectos3")
	obj3.addCursada(cursada)
	obj3.addCursada(cursada1)
	val des = new Curso("Desarrollo")
	des.addCursada(cursada2)
	des.addCursada(cursada3)
	des.addCursada(cursada4)
	
	val profesor:Profesor = new Profesor("Pepe")
	profesor.addCurso(obj3)
	profesor.addCurso(des)


	@Test
	def testPromedioSinAplasosSinNotas = {
	  assertEquals(profesor.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENSoloTengoAplazos = {
	  assertEquals(profesor.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENNoTengoAplazos = {
	  assertEquals(profesor.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testPromedioSinAplasosWHENTengoAplazosYNo = {
	  assertEquals(profesor.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testNotas = {
		assertEquals(profesor.notas, List(8, 10, 2, 2))
	}
	
	@Test
	def testPromedioSinAplazos = {
		assertEquals(profesor.promedioSinAplazos, 9f, 0.01f)
	}
	
	@Test
	def testPromedioConAplazos = {
		assertEquals(profesor.promedioConAplazos, 5f, 0.01f)
	}
	
	@Test
	def testFiltrarCursosPorAnio2013 = {
		assertEquals(profesor.filtrarCursosPorAnio(2013).cursos, List(obj3, des))
	}
	
	@Test
	def testFiltrarCursosPorAnio2014 = {
		assertEquals(profesor.filtrarCursosPorAnio(2014).cursos, List())
	}
}