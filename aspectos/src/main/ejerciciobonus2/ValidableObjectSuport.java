package main.ejerciciobonus2;

import main.ejercicio2.Validador;

public interface ValidableObjectSuport {
	
	public void initialize();
	public void addValidator(String fieldName,Validador validador);
	public Object getValidator(String fieldName);
	
}
