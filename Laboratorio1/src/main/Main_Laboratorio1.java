package main;
import logic.Laboratorio1;
import java.util.Scanner;

public class Main_Laboratorio1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Laboratorio1 lab = new Laboratorio1();
		
		
int opcion;
		
		
		do {
			
			System.out.println("Menu de opciones: ");
			System.out.println();
			System.out.print("1. Ejercicio 1"); System.out.println("||"+ "   2.  Ejercicio 2");
			System.out.print("3. Ejercicio 3"); System.out.println("||"+ "   4.  Ejercicio 4");
			System.out.print("5.Quiz Cuadrado"); System.out.println("||"+"   6.  Ejercicio 5");
			System.out.print("7. Ejercicio 6"); System.out.println("||"+ "   8.  Ejercicio 7");
			System.out.print("9. Ejercicio 8"); System.out.println("||"+ "   10. Ejercicio 9");
			System.out.print("11.Ejercicio 10"); System.out.println("||"+ "  12. Ejercicio 11");
			System.out.print("13.ejercicio 12"); System.out.println("||"+ "  14. Salir:"); 
			System.out.println();
			System.out.println("Ingrese el numero de las opciones que desea: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				lab.ejercicio1();
				break;
			
			case 2:
				lab.ejercicio2();
				break;
		     
			case 3:
				lab.ejercicio3();
				break;
			
			case 4: 
				lab.ejercicio4();
				break;
				
			case 5:
				lab.quizCuadrado();
				break;
				
			case 6:
				lab.ejercicio5();
				break;
			case 7:
				lab.ejercicio6();
				break;
			case 8:
				lab.ejercicio7();
				break;
			case 9:
				lab.ejercicio8();
				break;
			case 10:
				lab.ejercicio9();
				break;
			case 11:
				lab.ejercicio10();
				break;
			case 12:
				lab.ejercicio11();
				break;
			case 13:
				lab.ejercicio12();
				break;
				
			case 14:
				System.out.println("saliendo...");
				break;
			
				
		    default:
			    System.out.println("opcion invalida");
			    break;
			}
			
			
		}while(opcion !=14);
		
		//lab.ejercicio1();
		//lab.ejercicio2();
		//lab.ejercicio3();
		//lab.ejercicio4();
		//lab.dibujarPatron();
		//lab.ejercicio5();
		//lab.ejercicio6();
		//lab.ejercicio7();
		//lab.ejercicio8();
		//lab.ejercicio9();
		//lab.ejercicio10();
		//lab.ejercicio11();
		//lab.ejercicio12();
		
	}
}
