package juego;

public class Ficha {
	
	private String color;
    private int fila;
    private int columna;
    
    // Constructor
    public Ficha(String color, int fila, int columna) {
        this.color = color;
        this.fila = fila;
        this.columna = columna;
    }
    
    // Getters
    public String getColor() {
        return color;
    }
    
    public int getFila() {
        return fila;
    }
    
    public int getColumna() {
        return columna;
    }
    
    // Setters
    public void setFila(int fila) {
        this.fila = fila;
    }
    
    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    // Metodo para mostrar la ficha
    public String getSimbolo() {
        if (color.equals("ROJO")) {
            return "R";
        } else if (color.equals("NEGRO")) {
            return "B";
        }
        return " ";
    }
	
}
