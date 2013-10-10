package main.dominio;

import main.ejercicio1.Monitored;

public class Persona {
	private String nombre;

	@Monitored
	public String getNombre() {
		return this.nombre;
	}

	@Monitored
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
