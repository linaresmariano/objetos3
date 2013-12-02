package tp4.gbs.model;

public class Casillero {
	private int rojo = 0;
	private int verde = 0;
	private int negro = 0;
	private int azul = 0;
	
	public String toPrint() {
		return "| R:"+rojo+" V:"+verde+" N:"+negro+" A:"+azul+" |";
	}

	public String toPrintCurrent() {
		return this.toPrint().replace("|", "@").replace("-", "@");
	}
}
