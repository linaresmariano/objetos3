package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import scala.collection.mutable.ListBuffer
import org.mockito.Mockito._
import builders.GrupoDeInvestigacionBuilder
import model.Seminario
import model.Actividad
import model.Charla
import model.Proyecto
import model.GrupoDeInvestigacion


class TestGrupoDeInvestigacion {
  
	@Test
	def testActividadesPresentadasPendientesDeAprobacion{
	  
		var actividad1  = mock(classOf[Charla])
		when(actividad1.estaAprobada).thenReturn(true)
		when(actividad1.estaPresentada).thenReturn(true)
		var actividad2 = mock(classOf[Charla])
		when(actividad2.estaAprobada).thenReturn(false)
		when(actividad2.estaPresentada).thenReturn(true)
		var actividad3 = mock(classOf[Charla])
		when(actividad3.estaAprobada).thenReturn(false)
		when(actividad3.estaPresentada).thenReturn(true)
		var actividad4 = mock(classOf[Charla])
		when(actividad4.estaAprobada).thenReturn(true)
		when(actividad4.estaPresentada).thenReturn(true)
	  
		var actividades : ListBuffer[Actividad] = ListBuffer()
		actividades+=actividad1
		actividades+=actividad2
		actividades+=actividad3
		actividades+=actividad4
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo.actividades ++= actividades
		
		assertTrue(grupo.actividadesPresentadasPendientesDeAprobacion.contains(actividad2))
		assertTrue(grupo.actividadesPresentadasPendientesDeAprobacion.contains(actividad3))
		assertFalse(grupo.actividadesPresentadasPendientesDeAprobacion.contains(actividad1))
		assertFalse(grupo.actividadesPresentadasPendientesDeAprobacion.contains(actividad4))
		assertEquals(grupo.actividadesPresentadasPendientesDeAprobacion.size, 2)
		
	}
	
	@Test
	def testGetMontoTotal{
		
		var actividad1  = mock(classOf[Charla])
		when(actividad1.montoDeFinanciamiento).thenReturn(100)

		var actividad2 = mock(classOf[Charla])
		when(actividad2.montoDeFinanciamiento).thenReturn(120)
		
		var actividad3 = mock(classOf[Charla])
		when(actividad3.montoDeFinanciamiento).thenReturn(80)
		
		var actividad4 = mock(classOf[Charla])
		when(actividad4.montoDeFinanciamiento).thenReturn(100)
	  
		
		var actividades : ListBuffer[Actividad] = ListBuffer()
		actividades+=actividad1
		actividades+=actividad2
		actividades+=actividad3
		actividades+=actividad4
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		
		assertEquals(grupo.getMontoTotal(actividades),400)
		
	}
	
		
	@Test
	def testGetArticulos{
		
		var actividad1  = mock(classOf[Charla])
		when(actividad1.esArticulo).thenReturn(false)

		var actividad2 = mock(classOf[Proyecto])
		when(actividad2.esArticulo).thenReturn(true)
		
		var actividad3 = mock(classOf[Seminario])
		when(actividad3.esArticulo).thenReturn(false)
		
		var actividad4 = mock(classOf[Charla])
		when(actividad4.esArticulo).thenReturn(true)
	  

		
		var actividades : ListBuffer[Actividad] = ListBuffer()
		actividades+=actividad1
		actividades+=actividad2
		actividades+=actividad3
		actividades+=actividad4
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo.actividades ++= actividades
		
		assertTrue(grupo.getArticulos.contains(actividad4))
		assertTrue(grupo.getArticulos.contains(actividad2))
		assertFalse(grupo.getArticulos.contains(actividad1))
		assertFalse(grupo.getArticulos.contains(actividad3))
		
	}	
  
}