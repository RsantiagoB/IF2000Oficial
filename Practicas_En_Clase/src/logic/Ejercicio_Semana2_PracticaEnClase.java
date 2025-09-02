package logic;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_Semana2_PracticaEnClase {
	
	
	Scanner sc = new Scanner(System.in);
	
	public Ejercicio_Semana2_PracticaEnClase() {
		
	}
	
	
	public void ejercicioA() {
		
		System.out.println("Ingrese un numero: ");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			for(int j = 1; j <= numero - i; j++) {
				System.out.print("  ");
				}
			for(int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* ");
				}
			System.out.println();
		}
	}
	
	public void ejercicioB() {
		
		System.out.print("Ingrese un numero:");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			for(int j = 1; j <= numero; j++) {
				if(i == 1 || i == numero || j == 1 || j ==  numero) {
					System.out.print("*  ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
	public void ejercicioC() {
		System.out.print("Ingrese un numero:");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			for(int j = 1; j <= numero-1; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= (1 * i ); k++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	
	public void ejercicioD() {
		System.out.print("Ingrese un numero:");
		int numero = sc.nextInt();
		
		for(int i = numero; i >= 1; i--) {
			for(int j = numero; j >= 1; j--) {
				System.out.print("  ");
			}
			for(int k = 1; k <= (1*i); k++) {
				System.out.print("*  ");
				
			}
			System.out.println();
		}
		
	}
	
	public void ejercicioE() {
		int[] baul = new int [5];
		int numero;
		for(int i = 0; i < baul.length; i++) {
			
			//do {
				System.out.print("Ingrese un numero entero: ");
				numero = sc.nextInt();
				
			//}while(numero % 2 != 0);
			
			baul[i] = numero;
		}
		
		for(int i = 0; i < baul.length; i++) {
			System.out.print(baul[i]);
			System.out.print("  ");
		}
		
		for(int i = 0; i < baul.length; i++) {
			for( int j = 0; j < baul.length; j++) {
				
			}
		}
		System.out.println();
		//imprimir el arreglo de forma ascendente
		for(int i = 0; i < baul.length; i++) {
			for(int j = i + 1; j < baul.length; j++) {
				if(baul[i] > baul[j]) {
					int numMenor = baul[i];
					baul[i] = baul[j];
					baul[j] = numMenor;

				}
			}
			System.out.print(baul[i]);
			System.out.print("  ");;
		}
	}
	
	public void ejercicioF() {
		
		Random aleatorio = new Random();
		int[] baul = new int[100];
		
		for(int i = 0; i < baul.length; i++) {
			baul[i] = aleatorio.nextInt(100+1) ;
			
		}
		
		/*for(int i = 0; i < baul.length; i++) {
			System.out.print(baul[i] + ", ");
		}*/
		
		for(int i = 0; i < baul.length; i++) {
			for(int j = i + 1; j < baul.length; j++) {
				if(baul[i] < baul[j]) {
					int numMayor = baul[i];
					baul[i] = baul[j];
					baul[j] = numMayor;
				}
			}
			
			System.out.print(baul[i] + ", ");
		}
		
		
	}
	
	
	
	
	
}
