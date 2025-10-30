package logic;

import java.util.List;
public abstract class Pieza {
	
	protected String color;
	protected String pieza;
	
	public Pieza(String color, String pieza) {
		this.color = color;
		this.pieza = pieza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPieza() {
		return pieza;
	}

	public void setPieza(String pieza) {
		this.pieza = pieza;
	}
	
	public abstract  List<String> movimientoValido( Casillas coordenadaActual, Casillas[][] tablero);
	public abstract int obtenerFila(Casillas coordenadaActual);
	public abstract int obtenerColumna(Casillas coordenadaActual);
	
	
	
}
