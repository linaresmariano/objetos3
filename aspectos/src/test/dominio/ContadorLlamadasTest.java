package test.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.dominio.Persona;
import main.ejercicio1.ContadorLlamadasAspect;

public class ContadorLlamadasTest {
	@Test
	public void sampleTest () {
		Persona p1 = new Persona();
		p1.getNombre();
		p1.setNombre("Nico");
		p1.setNombre("Carlos");
		
		Persona p2 = new Persona() ;
		int llamadas_p1_getNombre =
				ContadorLlamadasAspect.aspectOf().cantLlamadas(p1, "getNombre");
		int llamadas_p1_setNombre =
				ContadorLlamadasAspect.aspectOf().cantLlamadas(p1, "setNombre");
		int llamadas_p2_setNombre =
				ContadorLlamadasAspect.aspectOf().cantLlamadas(p2, "setNombre");
		
		System.out.println(ContadorLlamadasAspect.aspectOf());
		
		assertEquals(llamadas_p1_getNombre, 1);
		assertEquals(llamadas_p1_setNombre, 2);
		assertEquals(llamadas_p2_setNombre, 0);
	}
}
