package tp4.gbs.jvmmodel;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Tablero {
	
	Coord cabezal = new Coord(0,0);
	
	private final int SIZE = 8;
	
	List<List<Casillero>> tablero;
	
	public Tablero() {
		this.tablero = new ArrayList<List<Casillero>>(SIZE);
		
		for(int i=0; i < SIZE; i++) {
			List<Casillero> row = new ArrayList<Casillero>(SIZE);
			
			for(int j=0; j < SIZE; j++) {
				Casillero casillero = new Casillero();
				row.add(casillero);
			}
			
			this.tablero.add(row);
		}
	}
	
	public void mover(String dir) {

	}
	
	public void poner(String color) {
		try {
			Method getColor = Casillero.class.getDeclaredMethod("add"+color);
			getColor.invoke(this.getCasilleroActual());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Casillero getCasilleroActual() {
		return this.tablero.get(this.cabezal.getY()).get(this.cabezal.getX());
	}
}
