package main;
import logic.Laboratorio2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		logic.Laboratorio2 lab = new Laboratorio2();
		
int opcion;
        
        do {
            System.out.println("==============================================");
            System.out.println("            MENU DE OPCIONES");
            System.out.println("==============================================");
            System.out.println();
            System.out.print("1. Intercambiar valores"); System.out.println("      ||   2. Ecuacion de la recta");
            System.out.print("3. Suma naturales < K"); System.out.println("        ||   4. Promedio números positivos");
            System.out.print("5. Analisis 10 numeros"); System.out.println("       ||   6. Suma pares/impares 1-200");
            System.out.print("7. Suma de cuadrados 1-100"); System.out.println("   ||   8. Factorial de un numero");
            System.out.print("9. Valor maximo de 10 numeros"); System.out.println("||   10. Salir");
            System.out.println();
            System.out.println("==============================================");
            System.out.print("Ingrese el numero de la opcion que desea: ");
            opcion = sc.nextInt();
            System.out.println();
            
            switch(opcion) {
                
            case 1:
                System.out.println("=== INTERCAMBIAR VALORES ===");
                lab.intercambiarValores();
                break;
                
            case 2:
                System.out.println("=== ECUACION DE LA RECTA ===");
                lab.ejercicio20();
                break;
                
            case 3:
                System.out.println("=== SUMA NATURALES MENORES QUE K ===");
                lab.ejercicio21();
                break;
                
            case 4: 
                System.out.println("=== PROMEDIO DE NUMEROS POSITIVOS ===");
                lab.ejercicio22();
                break;
                
            case 5:
                System.out.println("=== ANALISIS DE 10 NUMEROS ===");
                lab.ejercicio23();
                break;
                
            case 6:
                System.out.println("=== SUMA PARES/IMPARES 1-200 ===");
                lab.ejercicio24();
                break;
                
            case 7:
                System.out.println("=== SUMA DE CUADRADOS 1-100 ===");
                lab.ejercicio25();
                break;
                
            case 8:
                System.out.println("=== FACTORIAL DE UN NUMERO ===");
                lab.ejercicio26();
                break;
                
            case 9:
                System.out.println("=== VALOR MAXIMO DE 10 NuMEROS ===");
                lab.ejercicio27();
                break;
                
            case 10:
                System.out.println("Saliendo del programa...");
                System.out.println("¡Hasta pronto!");
                break;
                
            default:
                System.out.println(" Opcion invalida. Por favor ingrese un numero del 1 al 10.");
                break;
            }
            
            // Pausa antes de mostrar el menu
            if (opcion != 10) {
                System.out.println();
                System.out.println("Presione Enter para continuar...");
                sc.nextLine(); // Limpiar buffer
                sc.nextLine(); // Esperar Enter
                System.out.println();
            }
            
        } while(opcion != 10);
		
	}
}
