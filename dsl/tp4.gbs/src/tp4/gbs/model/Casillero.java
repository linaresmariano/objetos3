package tp4.gbs.model;

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
	
	public boolean hayBolitasRojo() {
		return this.rojo > 0;
	}
	
	public boolean hayBolitasVerde() {
		return this.verde > 0;
	}
	
	public boolean hayBolitasNegro() {
		return this.negro > 0;
	}
	
	public boolean hayBolitasAzul() {
		return this.azul > 0;
	}

	public String toPrint() {
		return "| R:"+rojo+" V:"+verde+" N:"+negro+" A:"+azul+" |";
	}

	public String toPrintCurrent() {
		return this.toPrint().replace("|", "@").replace("-", "@");
	}
}
