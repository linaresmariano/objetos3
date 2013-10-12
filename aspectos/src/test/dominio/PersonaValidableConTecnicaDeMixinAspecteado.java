package test.dominio;

import static org.junit.Assert.assertEquals;
import main.ejercicio2.ValidarStringNoVacio;
import main.ejercicio4.PersonaValidable;

import org.junit.Test;

public class PersonaValidableConTecnicaDeMixinAspecteado {
	@Test
	public void sampleTest () {
		PersonaValidable persona = new PersonaValidable();

		persona.addValidator("name", new ValidarStringNoVacio());

		persona.setName("nuevoNombre");
		assertEquals(persona.getName(),"nuevoNombre" );
	
		persona.setName("");
		assertEquals(persona.getName(),"nuevoNombre" );
		
		persona.setName("unTerceroAunMasNuevo");
		assertEquals(persona.getName(),"unTerceroAunMasNuevo" );
		
	}
}
