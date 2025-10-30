package juego;

import java.util.Scanner;

public class Juego {
    private Tablero tablero;
    private String turnoActual;
    private Scanner scanner;
    private boolean juegoActivo;
    
    // Constructor
    public Juego() {
        this.tablero = new Tablero();
        this.turnoActual = "ROJO"; // Empiezan las rojas
        this.scanner = new Scanner(System.in);
        this.juegoActivo = true;
    }
    
    // Metodo principal que controla el flujo del juego
    public void iniciarJuego() {
        System.out.println("=== JUEGO DE DAMAS ===");
        System.out.println("Instrucciones:");
        System.out.println("- R = Fichas Rojas");
        System.out.println("- B = Fichas Negras");
        System.out.println("- Ingresa coordenadas (fila columna) separadas por espacio");
        System.out.println("- Ejemplo: 5 2 4 3 (mover de fila5,col2 a fila4,col3)");
        System.out.println("======================");
        
        while (juegoActivo) {
            // Mostrar tablero
            tablero.mostrarTablero();
            
            // Indicar de quien es el turno
            System.out.println("Turno de las fichas: " + turnoActual + "S");
            
            // Obtener movimiento del jugador
            int[] coordenadas = obtenerMovimiento();
            if (coordenadas == null) {
                continue; // Volver a pedir movimiento si hay error
            }
            
            int filaOrigen = coordenadas[0];
            int columnaOrigen = coordenadas[1];
            int filaDestino = coordenadas[2];
            int columnaDestino = coordenadas[3];
            
            // Validar y ejecutar movimiento
            if (tablero.validarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino, turnoActual)) {
                tablero.moverFicha(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
                
                // Cambiar turno
                cambiarTurno();
                
                System.out.println("¡Movimiento exitoso!");
            } else {
                System.out.println("Movimiento invalido, vuelva a intentarlo");
            }
            
            // Opcion para salir del juego
            System.out.print("¿Continuar jugando? s = si, No = n: ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                juegoActivo = false;
                System.out.println("¡Gracias por jugar!");
            }
        }
        
        scanner.close();
    }
    
    // Obtener movimiento del jugador
    private int[] obtenerMovimiento() {
        System.out.print("Ingresa movimiento (filaOrigen colOrigen filaDest colDest): ");
        String input = scanner.nextLine();
        
        // Dividir el input en partes
        String[] partes = input.split(" ");
        
        if (partes.length != 4) {
            System.out.println("Debes ingresar exactamente 4 numeros.");
            return null;
        }
        
        // Validar que cada parte sea un numero
        int filaOrigen = esNumero(partes[0]);
        int columnaOrigen = esNumero(partes[1]);
        int filaDestino = esNumero(partes[2]);
        int columnaDestino = esNumero(partes[3]);
        
        // Si alguno no es numero valido, retornar null
        if (filaOrigen == -1 || columnaOrigen == -1 || filaDestino == -1 || columnaDestino == -1) {
            System.out.println("Error: Ingresa solo numeros validos.");
            return null;
        }
        
        return new int[]{filaOrigen, columnaOrigen, filaDestino, columnaDestino};
    }
    
    // Metodo para verificar si un string es numero 
    private int esNumero(String texto) {
        // Verificar que el string no esté vacío
        if (texto == null || texto.isEmpty()) {
            return -1;
        }
        
        // Verificar que cada caracter sea un digito
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (!Character.isDigit(caracter)) {
                return -1;
            }
        }
        
        // Convertir a numero
        return Integer.parseInt(texto);
    }
    
    // Cambiar turno entre jugadores
    private void cambiarTurno() {
        if (turnoActual.equals("ROJO")) {
            turnoActual = "NEGRO";
        } else {
            turnoActual = "ROJO";
        }
    }
}