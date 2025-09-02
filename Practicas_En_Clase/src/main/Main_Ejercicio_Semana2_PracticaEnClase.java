package main;
import java.util.Scanner;
import logic.Ejercicio_Semana2_PracticaEnClase;

public class Main_Ejercicio_Semana2_PracticaEnClase {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Ejercicio_Semana2_PracticaEnClase ejercicio = new Ejercicio_Semana2_PracticaEnClase();
		int opcion;
		
		
		do {
			
			System.out.println("Menu de opciones: ");
			System.out.println("1. Ejercicio A");
			System.out.println("2. Ejercicio B");
			System.out.println("3. Ejercicio C");
			System.out.println("4. Ejercicio D");
			System.out.println("5. Ejercicio E");
			System.out.println("6. Ejercicio F");
			System.out.println("7. Salir:");
			System.out.print("Ingrese una opcion: ");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				ejercicio.ejercicioA();
				break;
			
			case 2:
				ejercicio.ejercicioB();
				break;
		     
			case 3:
				ejercicio.ejercicioC();
				break;
			
			case 4: 
				ejercicio.ejercicioD();
				break;
				
			case 5:
				ejercicio.ejercicioE();
				break;
				
			case 6:
				ejercicio.ejercicioF();
				break;
				
			case 7:
				System.out.println("saniendo...");
				break;
				
		    default:
			    System.out.println("opcion invalida");
			    break;
			}
			
			
		}while(opcion !=7);
		
		
		//ejercicio.ejercicioA();
		//ejercicio.ejercicioB();
		//ejercicio.ejercicioC();
		//ejercicio.ejercicioD();
		//ejercicio.ejercicioE();
		//ejercicio.ejercicioF();
		
	
	
	
		
		
	
	
	
	
	}
	
	
	
}
