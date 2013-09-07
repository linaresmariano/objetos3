package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import scala.collection.mutable.ListBuffer
import model.ActividadDeGrupo
import builders.CharlaBuilder
import builders.GrupoDeInvestigacionBuilder
import model.GrupoDeInvestigacion
import builders.ProyectoBuilder

class TestGrupoDeInvestigacion {

	@Test
	def testAddActividades{
		
		var charlaBuilder : CharlaBuilder = new CharlaBuilder()
	  
		var actividad1 : ActividadDeGrupo = charlaBuilder.build()
		actividad1.aprobarActividad
		var actividad2 : ActividadDeGrupo = charlaBuilder.build()
		
		var actividad3 : ActividadDeGrupo = charlaBuilder.build()

		var actividad4 : ActividadDeGrupo = charlaBuilder.build()
		actividad4.aprobarActividad
	  
		var actividades : ListBuffer[ActividadDeGrupo] = ListBuffer()
		actividades+=actividad1
		actividades+=actividad2
		actividades+=actividad3
		actividades+=actividad4
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo.addActividades(actividades)

		assertEquals(grupo.getActividades.size, 4)
		
	}
  
	@Test
	def testGetActividadesAunNoAprobadas{
		
		var charlaBuilder : CharlaBuilder = new CharlaBuilder()
	  
		var actividad1 : ActividadDeGrupo = charlaBuilder.build()
		actividad1.aprobarActividad
		var actividad2 : ActividadDeGrupo = charlaBuilder.build()
		
		var actividad3 : ActividadDeGrupo = charlaBuilder.build()

		var actividad4 : ActividadDeGrupo = charlaBuilder.build()
		actividad4.aprobarActividad
	  
		var actividades : ListBuffer[ActividadDeGrupo] = ListBuffer()
		actividades+=actividad1
		actividades+=actividad2
		actividades+=actividad3
		actividades+=actividad4
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo.addActividades(actividades)
		
		assertTrue(grupo.getActividadesAunNoAprobadas.contains(actividad2))
		assertTrue(grupo.getActividadesAunNoAprobadas.contains(actividad3))
		assertFalse(grupo.getActividadesAunNoAprobadas.contains(actividad1))
		assertFalse(grupo.getActividadesAunNoAprobadas.contains(actividad4))
		assertEquals(grupo.getActividadesAunNoAprobadas.size, 2)
		
	}
	
	@Test
	def testGetMontoTotalDeActividadesAunNoAprobadas{
		
		var charlaBuilder : CharlaBuilder = new CharlaBuilder()
	  
		var actividad1 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(100).build()
		actividad1.aprobarActividad
		var actividad2 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(120).build()
		
		var actividad3 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(80).build()

		var actividad4 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(100).build()
		actividad4.aprobarActividad
	  
		
		var actividades : ListBuffer[ActividadDeGrupo] = ListBuffer()
		actividades+=actividad1
		actividades+=actividad2
		actividades+=actividad3
		actividades+=actividad4
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo.addActividades(actividades)
		
		var monto : Integer = grupo.getMontoTotalDeFinanciamientoDeActividadesAunNoAprobadas
		
		assertEquals(grupo.getMontoTotalDeFinanciamientoDeActividadesAunNoAprobadas,200)
		
	}
	
		
	@Test
	def testGetArticulosAprobados{
		
		var charlaBuilder : CharlaBuilder = new CharlaBuilder()
		var proyectoBuilder : ProyectoBuilder = new ProyectoBuilder()
	  
		var actividad1 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(100).build()
		
		var actividad2 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(120).build()
		
		var actividad3 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(80).build()

		var actividad4 : ActividadDeGrupo = charlaBuilder.withMontoTotalDeFinanciamiento(100).build()
	  
		var actividad5 : ActividadDeGrupo = proyectoBuilder.withDetallesDeResultado("soy un articulo ").build()
		
		var actividad6 : ActividadDeGrupo = proyectoBuilder.withDetallesDeResultado("no soy un articul o").build()
		
		var actividades : ListBuffer[ActividadDeGrupo] = ListBuffer()
		actividades+=actividad1
		actividades+=actividad2
		actividades+=actividad3
		actividades+=actividad4
		actividades+=actividad5
		actividades+=actividad6
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo.addActividades(actividades)
		
		var articulosPub : ListBuffer[ActividadDeGrupo] = grupo.getArticulosPublicados
		
		assertTrue(articulosPub.contains(actividad5))
		assertFalse(articulosPub.contains(actividad6))
		assertFalse(articulosPub.contains(actividad1))
		
	}	
  
}