package tp4.gbs.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Tablero {
	
	Coord cabezal = new Coord(0,0);
	
	private final int SIZE = 4;
	
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
		try {
			Method moveDir = Coord.class.getDeclaredMethod("mover"+dir);
			moveDir.invoke(cabezal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void poner(String color) {
		try {
			Field field = Casillero.class.getDeclaredField(color.toLowerCase());
			field.setAccessible(true);
			int cant = field.getInt(this.getCasilleroActual());
			field.setInt(this.getCasilleroActual(), ++cant);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean haybolitas(String color) {
		int cant = 0;
		
		try {
			Field field = Casillero.class.getDeclaredField(color.toLowerCase());
			field.setAccessible(true);
			cant = field.getInt(this.getCasilleroActual());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cant > 0;
	}

	private Casillero getCasilleroActual() {
		return this.tablero.get(this.cabezal.getY()).get(this.cabezal.getX());
	}
	
	public void print() {
		String border = "---------------------------------------------------------------------------------";
		System.out.println(border);
		System.out.println("|   ||        1        ||        2        ||        3        ||        4        |");
		System.out.println(border);
		
		for(List<Casillero> row : this.tablero) {
			System.out.print("| " + (this.tablero.indexOf(row)+1) + " |");
			for(Casillero casillero : row) {
				if(casillero.equals(this.getCasilleroActual())) {
					System.out.print(casillero.toPrintCurrent());
				} else {
					System.out.print(casillero.toPrint());
				}
			}
			System.out.println("\n"+ border);
		}
	}
}
