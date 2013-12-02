package main.java;

public class Coord {
	
	private int x;
	private int y;

	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moverSur() {
		this.y++;
	}
	
	public void moverNorte() {
		this.y--;
	}
	
	public void moverEste() {
		this.x++;
	}
	
	public void moverOeste() {
		this.x--;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
