package test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.mockito.Mockito._
import builders.GrupoDeInvestigacionBuilder
import model.Seminario
import model.Charla
import model.Proyecto
import model.GrupoDeInvestigacion
import scala.collection.mutable.ListBuffer
import model.Actividad
import model.Persona
import model.DetalleEvento
import org.joda.time.DateTime

class TestPersona {

	@Test
	def testActividades{
	  
		var actividad1  = mock(classOf[Charla])

		var actividad2 = mock(classOf[Proyecto])

		var actividad3 = mock(classOf[Seminario])


		var actividades1 : ListBuffer[Actividad] = ListBuffer()
		actividades1+=actividad1
		actividades1+=actividad2
		actividades1+=actividad3
	  
		var grupo1 : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo1.actividades ++= actividades1
		
		
		var actividad4  = mock(classOf[Charla])

		var actividad5 = mock(classOf[Proyecto])

		var actividad6 = mock(classOf[Seminario])


		var actividades2 : ListBuffer[Actividad] = ListBuffer()
		actividades2+=actividad4
		actividades2+=actividad5
		actividades2+=actividad6
	  
		var grupo2 : GrupoDeInvestigacion = new GrupoDeInvestigacionBuilder().build()
		grupo2.actividades ++= actividades2
		
		var  persona : Persona = new Persona()
		persona.grupos += grupo1
		persona.grupos += grupo2
		
		assertTrue(persona.actividades.contains(actividad1))
		assertTrue(persona.actividades.contains(actividad2))
		assertTrue(persona.actividades.contains(actividad3))
		assertTrue(persona.actividades.contains(actividad4))
		assertTrue(persona.actividades.contains(actividad5))
		assertTrue(persona.actividades.contains(actividad6))
		
	  
	}
	
	@Test
	def testGetEventosEnLosQueParticipa {
	  
		//actividad
		var actividad1g1  = mock(classOf[Charla])
		//inicializacion de detalles de eventos
		var detalleEvento1Act1G1 = mock(classOf[DetalleEvento])
		when(detalleEvento1Act1G1.fechaDesde).thenReturn(new DateTime(2010))
		//detalles de eventos
		var detalleDeEventosAct1G1 : ListBuffer[DetalleEvento] = ListBuffer()
		detalleDeEventosAct1G1 += detalleEvento1Act1G1
		when(actividad1g1.detalleDeEventos).thenReturn(detalleDeEventosAct1G1)
		
		//actividad
		var actividad2g1 = mock(classOf[Proyecto])
		//inicializacion de detalles de eventos
		var detalleEvento1Act2G1 = mock(classOf[DetalleEvento])
		when(detalleEvento1Act2G1.fechaDesde).thenReturn(new DateTime(2001))
		var detalleEvento2Act2G1 = mock(classOf[DetalleEvento])
		when(detalleEvento2Act2G1.fechaDesde).thenReturn(new DateTime(2002))
		var detalleEvento3Act2G1 = mock(classOf[DetalleEvento])
		when(detalleEvento3Act2G1.fechaDesde).thenReturn(new DateTime(2003))
	
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
		when(detalleEvento1Act3G1.fechaDesde).thenReturn(new DateTime(2004))
		var detalleEvento2Act3G1 = mock(classOf[DetalleEvento])
		when(detalleEvento2Act3G1.fechaDesde).thenReturn(new DateTime(2005))
		var detalleEvento3Act3G1 = mock(classOf[DetalleEvento])
		when(detalleEvento3Act3G1.fechaDesde).thenReturn(new DateTime(2006))
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
		
		assertEquals(eventosEnLosQueParticipa.indexOf(detalleEvento1Act1G1),6)
		assertEquals(eventosEnLosQueParticipa.indexOf(detalleEvento1Act2G1),0)
		assertEquals(eventosEnLosQueParticipa.indexOf(detalleEvento2Act2G1),1)
		assertEquals(eventosEnLosQueParticipa.indexOf(detalleEvento3Act2G1),2)
		assertEquals(eventosEnLosQueParticipa.indexOf(detalleEvento1Act3G1),3)
		assertEquals(eventosEnLosQueParticipa.indexOf(detalleEvento2Act3G1),4)
		assertEquals(eventosEnLosQueParticipa.indexOf(detalleEvento3Act3G1),5)
	}
  
}