package main.java;

public class Casillero {
	private int rojo = 0;
	private int verde = 0;
	private int negro = 0;
	private int azul = 0;
	
	public int addRojo() {
		return this.rojo++;
	}

	public int addVerde() {
		return this.verde++;
	}
	
	public int addNegro() {
		return this.negro++;
	}
	
	public int addAzul() {
		return this.azul++;
	}

	public String toPrint() {
		return "|R:"+rojo+"-V:"+verde+"-N:"+negro+"-A:"+azul+"|";
	}
}
