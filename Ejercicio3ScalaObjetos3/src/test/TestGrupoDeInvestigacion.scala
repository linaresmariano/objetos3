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
import model.IntegranteDeGrupoDeInvestigacion

class TestGrupoDeInvestigacion {

	@Test
	def testAddActividad{
		
		var charlaBuilder : CharlaBuilder = new CharlaBuilder()  
		var actividad1 : ActividadDeGrupo = charlaBuilder.build()
	  
		var integrantes : ListBuffer[IntegranteDeGrupoDeInvestigacion] = ListBuffer()
		var integrante1 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		var integrante2 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		var integrante3 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		var integrante4 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		
		integrantes+=integrante1
		integrantes+=integrante2
		integrantes+=integrante3
		integrantes+=integrante4
		
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().withIntegrantes(integrantes).build()
		grupo.addActividad(actividad1)
		
		assertTrue(grupo.getActividades.contains(actividad1))
		assertTrue(integrante1.getActividadesEnLasQueParticipa.contains(actividad1))
		assertTrue(integrante2.getActividadesEnLasQueParticipa.contains(actividad1))
		assertTrue(integrante3.getActividadesEnLasQueParticipa.contains(actividad1))
		assertTrue(integrante4.getActividadesEnLasQueParticipa.contains(actividad1))
		
	}
  
	@Test
	def testAddActividades{
		
		var integrantes : ListBuffer[IntegranteDeGrupoDeInvestigacion] = ListBuffer()
		var integrante1 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		var integrante2 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		var integrante3 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		var integrante4 : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		
		integrantes+=integrante1
		integrantes+=integrante2
		integrantes+=integrante3
		integrantes+=integrante4
	  
	  
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
	  
		var grupo : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().withIntegrantes(integrantes).build()
		grupo.addActividades(actividades)

		assertEquals(grupo.getActividades.size, 4)
		assertTrue(integrante1.getActividadesEnLasQueParticipa.contains(actividad1))
		assertTrue(integrante2.getActividadesEnLasQueParticipa.contains(actividad1))
		assertTrue(integrante3.getActividadesEnLasQueParticipa.contains(actividad1))
		assertTrue(integrante4.getActividadesEnLasQueParticipa.contains(actividad1))
		assertTrue(integrante1.getActividadesEnLasQueParticipa.contains(actividad2))
		assertTrue(integrante2.getActividadesEnLasQueParticipa.contains(actividad2))
		assertTrue(integrante3.getActividadesEnLasQueParticipa.contains(actividad2))
		assertTrue(integrante4.getActividadesEnLasQueParticipa.contains(actividad2))
		assertTrue(integrante1.getActividadesEnLasQueParticipa.contains(actividad3))
		assertTrue(integrante2.getActividadesEnLasQueParticipa.contains(actividad3))
		assertTrue(integrante3.getActividadesEnLasQueParticipa.contains(actividad3))
		assertTrue(integrante4.getActividadesEnLasQueParticipa.contains(actividad3))
		assertTrue(integrante1.getActividadesEnLasQueParticipa.contains(actividad4))
		assertTrue(integrante2.getActividadesEnLasQueParticipa.contains(actividad4))
		assertTrue(integrante3.getActividadesEnLasQueParticipa.contains(actividad4))
		assertTrue(integrante4.getActividadesEnLasQueParticipa.contains(actividad4))
		
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