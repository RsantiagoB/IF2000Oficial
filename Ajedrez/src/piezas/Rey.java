package piezas;
import java.util.List;
import logic.*;

public class Rey extends Pieza{

	public Rey(String color) {
		super(color, "Rey");
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> movimientoValido(Casillas coordenadaActual, Casillas[][] tablero) {
		// TODO Auto-generated method stub
		List<String> movimientos = new java.util.ArrayList<String>();
		
		int filaActual = obtenerFila(coordenadaActual);
		int columnaActual = obtenerColumna(coordenadaActual);

		
		// Movimientos posibles del rey (una casilla en cualquier dirección)
		int[][] direcciones = {
			{-1, -1}, {-1, 0}, {-1, 1},
			{0, -1},          {0, 1},
			{1, -1}, {1, 0}, {1, 1}
		};
		
		for (int[] direccion : direcciones) {
			int nuevaFila = filaActual + direccion[0];
			int nuevaColumna = columnaActual + direccion[1];
			
			//validacion de limites del tablero
			if (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8) {
				Casillas casillaDestino = tablero[nuevaFila][nuevaColumna];
				if (casillaDestino.estaVacia() || !casillaDestino.getPieza().getColor().equals(this.color)) {
					movimientos.add(casillaDestino.getCoordenadas());
				}
			}
		}
		return movimientos;
	}
	
	@Override
	public int obtenerFila(Casillas coordenadaActual) {
		String coordenada = coordenadaActual.getCoordenadas();
		return Integer.parseInt(coordenada.substring(1)) - 1; // "a1" → fila 0
	}

	@Override
	public int obtenerColumna(Casillas coordenadaActual) {
		String coordenada = coordenadaActual.getCoordenadas();
		char letra = coordenada.charAt(0); // 'a' → 0, 'b' → 1...
		return letra - 'a';
	}
	
	
}
