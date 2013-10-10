package test.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import main.dominio.Persona;
import main.ejercicio2.ValidadorAspect;
import main.ejercicio2.ValidarStringNoVacio;
import main.ejercicio2.ValorInvalidoException;

import org.junit.Test;

public class NombreNoVacioTest {
	@Test
	public void noDebePermitirNombresVacios () {
		Persona p1 = new Persona();
		
		ValidadorAspect.aspectOf().agregarValidador(p1, "nombre", new ValidarStringNoVacio());
		
		p1.setNombre("Nico");
		
		// Se asigna el nombre correctamente
		assertEquals("Nico", p1.getNombre());
		
		try {
			p1.setNombre("");
			fail("Deberia haber tirado exception al asignarle un nombre vacio");
		}
		catch(ValorInvalidoException e) {
			// El nombre no cambio
			assertEquals("Nico", p1.getNombre());
		}
	}
}



