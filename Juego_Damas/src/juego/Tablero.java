package juego;

public class Tablero {
    private Ficha[][] matriz;
    private int tamano;
    
    // Constructor
    public Tablero() {
        this.tamano = 8;
        this.matriz = new Ficha[tamano][tamano];
        inicializarTablero();
    }
    
    // Inicializar el tablero con fichas en sus posiciones iniciales
    private void inicializarTablero() {
        // Colocar fichas negras arriba
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
              
                if ((fila % 2 == 0 && columna % 2 == 1) || (fila % 2 == 1 && columna % 2 == 0)) {
                    matriz[fila][columna] = new Ficha("NEGRO", fila, columna);
                }
            }
        }
        
        // Colocar fichas rojas abajo
        for (int fila = 5; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                if ((fila % 2 == 1 && columna % 2 == 0) || (fila % 2 == 0 && columna % 2 == 1)) {
                    matriz[fila][columna] = new Ficha("ROJO", fila, columna);
                }
            }
        }
    }
    
    // Mostrar el tablero en consola
    public void mostrarTablero() {
        System.out.println("\n  0 1 2 3 4 5 6 7");
        for (int fila = 0; fila < tamano; fila++) {
            System.out.print(fila + " ");
            for (int columna = 0; columna < tamano; columna++) {
                if (matriz[fila][columna] != null) {
                    System.out.print(matriz[fila][columna].getSimbolo() + " ");
                } else {
                    // Casillas vacias
                    if ((fila + columna) % 2 == 0) {
                        System.out.print(". ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Validar movimiento de ficha
    public boolean validarMovimiento(int filaOrigen, int columnaOrigen, 
                                   int filaDestino, int columnaDestino, String turnoActual) {
        
        // Verificar que las coordenadas esten dentro del tablero
        if (filaOrigen < 0 || filaOrigen >= tamano || columnaOrigen < 0 || columnaOrigen >= tamano ||
            filaDestino < 0 || filaDestino >= tamano || columnaDestino < 0 || columnaDestino >= tamano) {
            System.out.println("Error: Coordenadas fuera del tablero.");
            return false;
        }
        
        // Verificar que haya una ficha en la posicion de origen
        Ficha ficha = matriz[filaOrigen][columnaOrigen];
        if (ficha == null) {
            System.out.println("Error: No hay ficha en la posicion seleccionada.");
            return false;
        }
        
        // Verificar que el color de la ficha coincida con el turno actual
        if (!ficha.getColor().equals(turnoActual)) {
            System.out.println("Error: No es el turno de las fichas " + ficha.getColor() + "s.");
            return false;
        }
        
        // Verificar que la casilla destino este vacia
        if (matriz[filaDestino][columnaDestino] != null) {
            System.out.println("Error: La casilla destino esta ocupada.");
            return false;
        }
        
        // Verificar que el movimiento sea diagonal y de una casilla
        int diferenciaFilas = filaDestino - filaOrigen;
        int diferenciaColumnas = Math.abs(columnaDestino - columnaOrigen);
        
        if (diferenciaColumnas != 1) {
            System.out.println("Error: Solo se puede mover en diagonal a una casilla.");
            return false;
        }
        
        // Verificar direccion segun el color
        if (ficha.getColor().equals("ROJO")) {
            // Rojas solo pueden moverse hacia abajo 
            if (diferenciaFilas != 1) {
                System.out.println("Error: Las fichas Rojas solo pueden moverse hacia abajo.");
                return false;
            }
        } else if (ficha.getColor().equals("NEGRO")) {
            // Negras solo pueden moverse hacia arriba 
            if (diferenciaFilas != -1) {
                System.out.println("Error: Las fichas Negras solo pueden moverse hacia arriba.");
                return false;
            }
        }
        
        return true;
    }
    
    // Mover ficha
    public boolean moverFicha(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        Ficha ficha = matriz[filaOrigen][columnaOrigen];
        matriz[filaOrigen][columnaOrigen] = null;
        ficha.setFila(filaDestino);
        ficha.setColumna(columnaDestino);
        matriz[filaDestino][columnaDestino] = ficha;
        return true;
    }
    
    // Getter para acceder a fichas 
    public Ficha getFicha(int fila, int columna) {
        if (fila >= 0 && fila < tamano && columna >= 0 && columna < tamano) {
            return matriz[fila][columna];
        }
        return null;
    }
}