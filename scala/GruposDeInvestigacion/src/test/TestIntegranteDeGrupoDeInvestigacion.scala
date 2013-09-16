package test

import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import scala.collection.mutable.ListBuffer
import org.mockito.Mockito._
import model.Seminario
import model.Actividad
import model.Charla
import model.Proyecto
import model.GrupoDeInvestigacion
import model.Persona
import model.DetalleEvento



class TestIntegranteDeGrupoDeInvestigacion {

	@Test
	def testGetEventosEnLosQueParticipa {
	  
		//actividad
		var actividad1g1  = mock(classOf[Charla])
		//inicializacion de detalles de eventos
		var detalleEvento1Act1G1 = mock(classOf[DetalleEvento])
		//detalles de eventos
		var detalleDeEventosAct1G1 : ListBuffer[DetalleEvento] = ListBuffer()
		detalleDeEventosAct1G1 += detalleEvento1Act1G1
		when(actividad1g1.detalleDeEventos).thenReturn(detalleDeEventosAct1G1)
		
		//actividad
		var actividad2g1 = mock(classOf[Proyecto])
		//inicializacion de detalles de eventos
		var detalleEvento1Act2G1 = mock(classOf[DetalleEvento])
		var detalleEvento2Act2G1 = mock(classOf[DetalleEvento])
		var detalleEvento3Act2G1 = mock(classOf[DetalleEvento])
	
		//detalles de eventos
		var detalleDeEventosAct2G1 : ListBuffer[DetalleEvento] = ListBuffer()
		detalleDeEventosAct2G1 += detalleEvento1Act2G1
		detalleDeEventosAct2G1 += detalleEvento2Act2G1
		detalleDeEventosAct2G1 += detalleEvento3Act2G1
		when(actividad2g1.detalleDeEventos).thenReturn(detalleDeEventosAct2G1)
		
		
		//actividad
		var actividad3g1 = mock(classOf[Seminario])
		//inicializacion de detalles de eventos
		var detalleEvento1Act3G1 = mock(classOf[DetalleEvento])
		var detalleEvento2Act3G1 = mock(classOf[DetalleEvento])
		var detalleEvento3Act3G1 = mock(classOf[DetalleEvento])
		//detalles de eventos
		var detalleDeEventosAct3G1 : ListBuffer[DetalleEvento] = ListBuffer()
		detalleDeEventosAct3G1 += detalleEvento1Act3G1
		detalleDeEventosAct3G1 += detalleEvento2Act3G1
		detalleDeEventosAct3G1 += detalleEvento3Act3G1
		when(actividad3g1.detalleDeEventos).thenReturn(detalleDeEventosAct3G1)

		
		var actividadesg1 : ListBuffer[Actividad] = ListBuffer()
		actividadesg1+=actividad1g1
		actividadesg1+=actividad2g1
		actividadesg1+=actividad3g1
		
		//grupo 1
		var grupo1 = mock(classOf[GrupoDeInvestigacion])
		when(grupo1.actividades).thenReturn(actividadesg1)
	  
		var gruposEnLosQueParticipa : ListBuffer[GrupoDeInvestigacion] = ListBuffer()
		gruposEnLosQueParticipa += grupo1
		
		var integrante : Persona = new Persona()
		integrante.grupos ++= gruposEnLosQueParticipa
		
		
		var eventosEnLosQueParticipa : ListBuffer[DetalleEvento] = integrante.eventosEnLosQueParticipa
		
		assertTrue(eventosEnLosQueParticipa.contains(detalleEvento1Act1G1))
		assertTrue(eventosEnLosQueParticipa.contains(detalleEvento1Act2G1))
		assertTrue(eventosEnLosQueParticipa.contains(detalleEvento2Act2G1))
		assertTrue(eventosEnLosQueParticipa.contains(detalleEvento3Act2G1))
		assertTrue(eventosEnLosQueParticipa.contains(detalleEvento1Act3G1))
		assertTrue(eventosEnLosQueParticipa.contains(detalleEvento2Act3G1))
		assertTrue(eventosEnLosQueParticipa.contains(detalleEvento3Act3G1))
	}
	
  
}