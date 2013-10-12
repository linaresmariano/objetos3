package test.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.dominio.Persona;
import main.ejercicio3.ContadorLlamadasBonusAspect;

public class ContadorLlamadasBonusTest {
	@Test
	public void sampleTest () {
		Persona p1 = new Persona();
		p1.getNombre();
		p1.setNombre("Nico");
		p1.setNombre("Carlos");
		
		Persona p2 = new Persona();
		p2.getNombre();
		
		int llamadas_p1_getNombre =
				ContadorLlamadasBonusAspect.aspectOf(p1).cantLlamadas("getNombre");
		int llamadas_p1_setNombre =
				ContadorLlamadasBonusAspect.aspectOf(p1).cantLlamadas("setNombre");
		int llamadas_p2_setNombre =
				ContadorLlamadasBonusAspect.aspectOf(p2).cantLlamadas("setNombre");
		
		assertEquals(llamadas_p1_getNombre, 1);
		assertEquals(llamadas_p1_setNombre, 2);
		assertEquals(llamadas_p2_setNombre, 0);
	}
}
