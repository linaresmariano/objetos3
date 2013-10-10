package main.ejercicio2;

public class ValidarStringNoVacio implements Validador<String> {
	public boolean validar(String valor) {
		return valor.length() > 0;
	}
}