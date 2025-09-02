package logic;
import java.util.Scanner;

public class Laboratorio2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void sumarPares() {
		int suma = 0;
		for(int i = 2; i <= 1000; i+=2) {
			suma+=i;
		}
		System.out.println("La suma es:" + suma);
	}
	
	public void convertirTemperatura() {
		System.out.print("Ingrese la temperatura en cecius: ");
		double celcius = sc.nextInt();
		
		double fahrenheit = (celcius * 9/5) + 32;
		System.out.println("La temperatura en farenheit es: "+ fahrenheit);
	}
	
	public void numeroX() {
		System.out.print("Ingrese numero x: ");
		int x = sc.nextInt();
		System.out.println("Ingrese numero y:");
		int n = sc.nextInt();
		
		if(n==0) {
			int resultado = 1;
		} else if(n>0) {
			
			
			
		}
		
		
	}
}
