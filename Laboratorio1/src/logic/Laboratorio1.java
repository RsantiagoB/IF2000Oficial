package logic;
import java.util.Scanner;

public class Laboratorio1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void ejercicio1() {
		//DETERMINAR SI UN NUMERO ES PAR O IMPAR
		System.out.print("Ingrese un numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
		System.out.println("El numero " + numero + " es par");
		}else {
			System.out.println("El numero " + numero + " es impar");
		}
		
		
		
		
		
	}
	
	public void ejercicio2() {
		//DETERMINAR EL VALOR ABSOLUTO DE UN NUMERO
		
		System.out.print("Ingrese un numero:");
		int numero = sc.nextInt();
		int numeroClon = numero;
		
		//de forma manual, sin usar la funcion math.abs()
		if(numero < 0) {
			
			numeroClon = numero * -1;
			System.out.println("el valor absoluto de " + numero + " es: " + numeroClon);
		} else {
			
			System.out.println("El valor absoluto de "+numero+" es: " +numero);
		}
	}
	
	public void ejercicio3() {
		//imprimir y sumar una serie de numeros impares
		
		int suma = 0;
		int numero;
		do {
		System.out.print("Ingrese un numero impar mayor o igual a 3: ");
		numero = sc.nextInt();
		}while(numero < 3 || numero % 2 == 0);
		
			
		for(int i = 3; i <= numero; i+=3 ) {
			System.out.print(i + " ");
			suma += i;	
		}
		System.out.println("La suma es: " + suma);
		//no se si cumple al 100% su requisito pero es lo mejor que pude hacer sin usar AI
	}
	
	public void ejercicio4() {
		System.out.print("Ingrese la cantidad de numeros que sea ordenar de forma ascendente: ");
		int cantidad = sc.nextInt();
		int [] lector = new int[cantidad];
		
		for(int i = 0; i < lector.length; i++) {
			System.out.print("Ingrese un numero: ");
			int numero = sc.nextInt();
			lector[i] = numero;
		}
		
		for(int i = 0; i < lector.length; i++) {
			System.out.print(lector[i] + " ");
		}
		System.out.println(" ");
		for(int i = 0; i < lector.length; i++) {
			for(int j = i; j < lector.length; j++) {
				if(lector[i] > lector[j]) {
					int numMenor = lector[i];
					lector[i] = lector[j];
					lector[j] = numMenor;
				}
			}
			System.out.print(lector[i] + " ");
		}
		
		
	}
	
	public void quizCuadrado() {
        int n;
        
        do {
            System.out.print("Ingrese el tamano de la matriz debe ser impar: ");
            n = sc.nextInt();
            
            if (n % 2 == 0) {
                System.out.println("Error: El numero debe ser impar, intente nuevamente.");
            }
        } while (n % 2 == 0); 
        
        char[][] matriz = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }
        
        for (int i = 0; i < n; i++) {
            matriz[0][i] = '*';        // es el borde superior
            matriz[n-1][i] = '*';      // el borde inferior
            matriz[i][0] = '*';        // el borde izquierdo
            matriz[i][n-1] = '*';      // y el borde derecho
        }
        
        int centro = n / 2;
        matriz[centro][centro] = '*';
        
        System.out.println("\nPatrón resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
    }
	
	public void ejercicio5() {
		System.out.print("Ingrese un numero: ");
		int numero1 = sc.nextInt();
		System.out.print("Ingrese un numero: ");
		int numero2 = sc.nextInt();
		
		if(numero1 == numero2) {
			int resultado = numero1 * numero2;
			System.out.println("Los numeros son iguales. El resultado es: "+ resultado);
		} else if(numero1 > numero2) {
			int resultado = numero1 - numero2;
			System.out.println("Los numeros son iguales. El resultado es: "+ resultado);

		} if(numero1 < numero2) {
			int resultado = numero1 + numero2;
			System.out.println("Los numeros son iguales. El resultado es: "+ resultado);

		}
		
	}
	
	public void ejercicio6() {
		int nota;
		int contador = 0;
		do {
			
			System.out.print("ingrese una nota entre 0 y 10: ");
			nota = sc.nextInt();
			
			if(nota == -1) {
				break;
			}
			
			if(nota < 0 || nota > 10) {
				System.out.println("El numero ingresado no es mayor que 1 y menor que 10. ");
			}
			
			if(nota == 10) {
				contador++;
			}
			
		}while(true);
		
		if(contador != 0) {
			System.out.println("La cantidad de notas 10 es: " + contador);

		} else {
			System.out.println("No se ingresaron notas 10");
			System.out.println("La cantidad de notas 10 es: " + contador);

		}
		
	}
	
	public void ejercicio7() {
		double pulsacionesF = 220;
		double pulsacionesM = 210;
		int edad;
		int segundos;
		
		do {
			System.out.print("Ingrese su edad: ");
			edad = sc.nextInt();
			
			if(edad < 0 || edad > 100) {
				System.out.println("La edad no debe ser menor a 0 ni mayor a 100");
				System.out.println("para hacer un calculo mas logico ingrese una edad coherente");

			}
			
		}while(edad < 0 || edad > 100);
		
		do {
		System.out.println("ingrese la cantidad de segundos que desea calcular sus pulsaciones: ");
		System.out.println("La cantidad ingresada debe ser de 10 en 10 (10, 20, 30, etc.) ");
		segundos = sc.nextInt();
		
		if(segundos % 10 != 0) {
			System.out.println("Error, la cantidad de segundos debe ser de 10 en 10");
		}
		
		
		}while(segundos % 10 != 0);
		
		System.out.print("Ingrese su sexo: (F/M) ");
		char sexo = sc.next().toUpperCase().charAt(0);
		
		if(sexo == 'F') {
			double resultado = (pulsacionesF - edad) / segundos;
			System.out.println("la cantidad de pulsaciones por cada " + segundos + " segundos es:");
			System.out.println(resultado);

		} else if(sexo == 'M') {
			
			double resultado = (pulsacionesM - edad) / segundos;
			System.out.println("la cantidad de pulsaciones por cada " + segundos + " segundos es:");
			System.out.println(resultado);
			
		}
		
	}
	
	public void ejercicio8() {
		System.out.println("Ingrese la cantidad de anos que ha trabajado: ");
		System.out.print("Si lleva menos de un ano de trabajar ingrese '0': ");
		int anos = sc.nextInt();
		
		if(anos == 0) {
			int utilidadDelSalario = 5;
			System.out.print("La utilidad de su salariose asignado es: " + utilidadDelSalario);
			
		} else if(anos >= 1 && anos < 2) {
			int utilidadDelSalario = 7;
			System.out.print("La utilidad de su salariose asignado es: " + utilidadDelSalario);
		} else if(anos >= 2 && anos < 5) {
			int utilidadDelSalario = 10;
			System.out.print("La utilidad de su salariose asignado es: " + utilidadDelSalario);
		} else if(anos >= 5 && anos < 10) {
			int utilidadDelSalario = 15;
			System.out.print("La utilidad de su salariose asignado es: " + utilidadDelSalario);
		} else if(anos > 10) {
			int utilidadDelSalario = 20;
			System.out.print("La utilidad de su salariose asignado es: " + utilidadDelSalario);
		}
	}
	
	public void ejercicio9() {
		int numero;
	    
	    System.out.print("Ingrese un numero para verificar si es primo: ");
	    numero = sc.nextInt();
	    
	    if (numero <= 1) {
	        System.out.println(numero + " NO es primo");
	        return;
	    }
	    
	    boolean esPrimo = true;
	    for (int i = 2; i <= numero / 2; i++) {
	        if (numero % i == 0) {
	            esPrimo = false;
	            break;
	        }
	    }
	    
	    if (esPrimo) {
	        System.out.println(numero + " Es primo");
	    } else {
	        System.out.println(numero + " No es primo");
	    }
	}
	
	public void ejercicio10() {
	    int cantidadComputadoras;
	    double precioUnitario = 11000;
	    
	    System.out.print("Ingrese la cantidad de computadoras a comprar: ");
	    cantidadComputadoras = sc.nextInt();
	    
	    double precioTotal = cantidadComputadoras * precioUnitario;
	    double descuento = 0;
	    
	    if (cantidadComputadoras < 5) {
	        descuento = precioTotal * 0.10;
	    } else if (cantidadComputadoras < 10) {
	        descuento = precioTotal * 0.20;
	    } else {
	        descuento = precioTotal * 0.40;
	    }
	    
	    double totalPagar = precioTotal - descuento;
	    
	    System.out.println("Computadoras compradas: " + cantidadComputadoras);
	    System.out.println("Precio total sin descuento: $" + precioTotal);
	    System.out.println("Descuento aplicado: $" + descuento);
	    System.out.println("Total a pagar: $" + totalPagar);
	}
	
	public void ejercicio11() {
	    int n;
	    
	    System.out.print("Ingrese el numero limite (N): ");
	    n = sc.nextInt();
	    
	    System.out.println("Numeros primos entre 2 y " + n + ":");
	    
	    for (int numero = 2; numero <= n; numero++) {
	        boolean esPrimo = true;
	        
	        if (numero <= 1) {
	            esPrimo = false;
	        } else {
	            for (int i = 2; i <= numero / 2; i++) {
	                if (numero % i == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }
	        }
	        
	        if (esPrimo) {
	            System.out.print(numero + " ");
	        }
	    }
	    System.out.println();
	}
	
	public void ejercicio12() {
	    double base, altura;
	    
	    System.out.print("Ingrese la base del triangulo: ");
	    base = sc.nextDouble();
	    
	    System.out.print("Ingrese la altura del triangulo: ");
	    altura = sc.nextDouble();
	    
	    double area = (base * altura) / 2;
	    System.out.println("El area del triangulo con base " + base + " y altura " + altura + " es: " + area);
	}
}
