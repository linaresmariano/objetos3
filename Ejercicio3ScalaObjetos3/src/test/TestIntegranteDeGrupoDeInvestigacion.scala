package test

import model.IntegranteDeGrupoDeInvestigacion
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import scala.collection.mutable.ListBuffer
import model.ActividadDeGrupo
import builders.CharlaBuilder
import builders.ProyectoBuilder
import model.Proyecto
import builders.ExperimentoBuilder

class TestIntegranteDeGrupoDeInvestigacion {

	@Test
	def testGetEventosEnLosQueParticipa {
	  
		var integrante : IntegranteDeGrupoDeInvestigacion = new IntegranteDeGrupoDeInvestigacion()
		
	  
		var charlaBuilder1 : CharlaBuilder = new CharlaBuilder()  
		var actividad1 : ActividadDeGrupo = charlaBuilder1.withNombreDeLaActividad("de algo").build()

		var charlaBuilder2 : CharlaBuilder = new CharlaBuilder() 
		var actividad2 : ActividadDeGrupo = charlaBuilder2.withNombreDeLaActividad("interesante").build()
		
		var charlaBuilder3 : CharlaBuilder = new CharlaBuilder() 
		var actividad3 : ActividadDeGrupo = charlaBuilder3.withNombreDeLaActividad("tonterias").build()

		var charlaBuilder4 : CharlaBuilder = new CharlaBuilder() 
		var actividad4 : ActividadDeGrupo = charlaBuilder4.withNombreDeLaActividad("programacion").build()

		var proyectoBuilder : ProyectoBuilder = new ProyectoBuilder()
		var actividad5 : Proyecto = proyectoBuilder.build()
		
		var experimentoBuilder : ExperimentoBuilder = new ExperimentoBuilder().withDescripcion("dificil")
		actividad5.addExperimentoHechoOPorHacer(experimentoBuilder.build())
	
		
		integrante.participarEnUnaActividad(actividad1)
		integrante.participarEnUnaActividad(actividad2)
		integrante.participarEnUnaActividad(actividad3)
		integrante.participarEnUnaActividad(actividad4)
		integrante.participarEnUnaActividad(actividad5)
		
		var getEventosEnLosQueParticipa : ListBuffer[String] = integrante.getEventosEnLosQueParticipa
		
		assertTrue(getEventosEnLosQueParticipa.contains("de algo"))
		assertTrue(getEventosEnLosQueParticipa.contains("interesante"))
		assertTrue(getEventosEnLosQueParticipa.contains("tonterias"))
		assertTrue(getEventosEnLosQueParticipa.contains("programacion"))
		assertTrue(getEventosEnLosQueParticipa.contains("dificil"))
	}
	
  
}