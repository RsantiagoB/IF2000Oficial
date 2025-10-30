package logic;

public class Casillas {
	
	public String coordenadas;
	protected Pieza pieza;
	
	public Casillas(String coordenadas, Pieza pieza) {
		this.coordenadas = coordenadas;
		this.pieza = pieza;
	}
	
	public Casillas(String coordenadas) {
		this.coordenadas = coordenadas;
		this.pieza = null;
	}
	public String getCoordenadas() {
		return coordenadas;
	}
	
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public Pieza getPieza() {
		return pieza;
	}
	
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}
	
	public boolean estaVacia() {
		return this.pieza == null;
	}
	
	
}
