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
	
	public double calcularPotencia() {
	    
	    System.out.print("Ingrese el valor de la base: ");
	    int base = sc.nextInt();
	    
	    System.out.print("Ingrese el valor del exponente: ");
	    int exponente = sc.nextInt();
	    
	    double resultado = 1;
	    int exponenteAbsoluto = Math.abs(exponente);
	    
	    // Calculo de la potencia usando multiplicaciones sucesivas
	    for (int i = 0; i < exponenteAbsoluto; i++) {
	        resultado *= base;
	    }
	    
	    // Si el exponente era negativo, calculamos el inverso
	    if (exponente < 0) {
	        resultado = 1 / resultado;
	    }
	    
	    System.out.println(base + " elevado a la " + exponente + " = " + resultado);
	    
	    return resultado;
	}
	
	public void ejercicio16() {
		int numero;
		
		do {
		System.out.println("Ingrese un numero del 1 al 12 y se mostrara al que mes corresponde: ");
		numero = sc.nextInt();
		}while(numero <1 || numero >12);
		
		String mes;
		switch(numero) {
		
		case 1:
			mes = "Enero";
			System.out.println("El mes es: " + mes);
			break;
		case 2:
			mes = "Febrero";
			System.out.println("El mes es: " + mes);
			break;
		case 3:
			mes = "Marzo";
			System.out.println("El mes es: " + mes);
			break;
		case 4:
			mes = "Abril";
			System.out.println("El mes es: " + mes);
			break;
		case 5:
			mes = "Mayo";
			System.out.println("El mes es: " + mes);
			break;
		case 6:
			mes = "Junio";
			System.out.println("El mes es: " + mes);
			break;
		case 7:
			mes = "Julio";
			System.out.println("El mes es: " + mes);
			break;
		case 8:
			mes = "Agosto";
			System.out.println("El mes es: " + mes);
			break;
		case 9:
			mes = "Septiembre";
			System.out.println("El mes es: " + mes);
			break;
		case 10:
			mes = "Octubre";
			System.out.println("El mes es: " + mes);
			break;
		case 11:
			mes = "Noviembre";
			System.out.println("El mes es: " + mes);
			break;
		case 12:
			mes = "Diciembre";
			System.out.println("El mes es: " + mes);
			break;
		default:
			return;
		}
		
	}
	
	public double ejercicio17() {
	    
	    System.out.print("Ingrese el valor de x: ");
	    double x = sc.nextDouble();
	    
	    double resultado;
	    
	    if (x > 0) {
	        resultado = x + 5;
	    } else if (x < 0) {
	        resultado = Math.pow(x, 2); 
	    } else {
	        resultado = 1; 
	    }
	    
	    System.out.println("F(" + x + ") = " + resultado);
	    
	    return resultado;
	}
	
	public void calcularAreaTriangulo() {
	    
	    System.out.println("Calcular el area de un tiangulo. ");
	    System.out.println("--------------------------------");
	    
	    System.out.print("Ingrese la longitud del lado a: ");
	    double a = sc.nextDouble();
	    
	    System.out.print("Ingrese la longitud del lado b: ");
	    double b = sc.nextDouble();
	    
	    System.out.print("Ingrese la longitud del lado c: ");
	    double c = sc.nextDouble();
	    
	    // Validaciones.
	    if (a <= 0 || b <= 0 || c <= 0) {
	        System.out.println("Error: Todos los lados deben ser mayores que cero.");
	        sc.close();
	        return;
	    }
	    
	    if (a + b <= c || a + c <= b || b + c <= a) {
	        System.out.println("Error: Los lados no forman un triangulo valido.");
	        System.out.println("La suma de dos lados debe ser mayor que el tercero.");
	        sc.close();
	        return;
	    }
	    
	    // Calcular el semiperimetro
	    double p = (a + b + c) / 2;
	    
	    // Calcular el area.
	    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	    
	    // Mostrar resultados
	    System.out.println("\nResultado:");
	    System.out.println("Semiperimetro (p): " + p);
	    System.out.println("Area del triangulo: " + area);
	    System.out.printf("Area del triangulo (formateado): %.2f\n", area);
	    
	}
	
	public void intercambiarValores() {
		System.out.print("Ingrese el primer valor A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo valor B: ");
        int b = sc.nextInt();
        
        System.out.println("---------------------------------");
        System.out.println("\nAntes del intercambio:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("---------------------------------");
        
        int temporal = a;   
        a = b;          
        b = temporal;   
        
        System.out.print("Valores intercambiados:\n ");    
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
	
	public void ejercicio20() {
		System.out.print("Ingrese la coordenada x0 del primer punto: ");
	    double x0 = sc.nextDouble();
	    System.out.print("Ingrese la coordenada y0 del primer punto; ");
	    double y0 = sc.nextDouble();
		System.out.print("Ingrese la coordenada x1 del primer punto: ");
	    double x1 = sc.nextDouble();
	    System.out.print("Ingrese la coordenada y1 del primer punto; ");
	    double y1 = sc.nextDouble();  
	    
	    if (x0 == x1) {
	        System.out.println("Error: Los puntos tienen la misma coordenada x");
	        System.out.println("La recta es vertical: x = " + x0);
	        return;
	    }
	    //Pendiente
	    double m = (y0 - y1) / (x0 - x1);
	    //intersepto
	    double b = y0 - m * x0;
	    
	    System.out.printf("y = %.2fx + %.2f", m, b);
	    
	}
	
    public void ejercicio21() {
        System.out.print("Ingrese un numero natural K: ");
        int k = sc.nextInt();
        
        if (k <= 0) {
            System.out.println("Error: Debe ingresar un numero natural (mayor que 0)");
            return;
        }
        
        int suma = 0;
        for (int i = 1; i < k; i++) {
            suma += i;
        }
        
        System.out.println("---------------------------------");
        System.out.println("La suma de todos los numeros naturales menores que " + k + " es: " + suma);
        System.out.println("---------------------------------");
    }
    
    public void ejercicio22() {
        System.out.print("¿Cuantos numeros positivos desea promediar? ");
        int cantidad = sc.nextInt();
        
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que 0");
            return;
        }
        
        double suma = 0;
        int contador = 0;
        
        System.out.println("Ingrese " + cantidad + " numeros positivos:");
        
        while (contador < cantidad) {
            System.out.print("Numero " + (contador + 1) + ": ");
            double numero = sc.nextDouble();
            
            if (numero < 0) {
                System.out.println("Error: Solo se permiten numeros positivos. Intente nuevamente.");
                continue;
            }
            
            suma += numero;
            contador++;
        }
        
        double promedio = suma / cantidad;
        
        System.out.println("---------------------------------");
        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de numeros: " + cantidad);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("---------------------------------");
    }
    
    public void ejercicio23() {
        System.out.println("Ingrese 10 numeros enteros:");
        
        int sumaTotal = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            int numero = sc.nextInt();
            
            sumaTotal += numero;
            
            if (numero % 2 == 0) {
                sumaPares += numero;
                contadorPares++;
            } else {
                sumaImpares += numero;
                contadorImpares++;
            }
        }
        
        System.out.println("=================================");
        System.out.println("RESULTADOS:");
        System.out.println("---------------------------------");
        System.out.println("Suma total de todos los numeros: " + sumaTotal);
        System.out.println("Cantidad de numeros pares: " + contadorPares);
        System.out.println("Cantidad de numeros impares: " + contadorImpares);
        System.out.println("Suma de numeros pares: " + sumaPares);
        System.out.println("Suma de numeros impares: " + sumaImpares);
        System.out.println("=================================");
    }
    
    public void ejercicio24() {
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
                contadorPares++;
            } else {
                sumaImpares += i;
                contadorImpares++;
            }
        }
        
        System.out.println("=================================");
        System.out.println("SUMA DE NUMEROS ENTRE 1 Y 200");
        System.out.println("---------------------------------");
        System.out.println("Cantidad de numeros pares: " + contadorPares);
        System.out.println("Cantidad de numeros impares: " + contadorImpares);
        System.out.println("Suma de numeros pares (1-200): " + sumaPares);
        System.out.println("Suma de numeros impares (1-200): " + sumaImpares);
        System.out.println("Suma total (1-200): " + (sumaPares + sumaImpares));
        System.out.println("=================================");
    }
    
    public void ejercicio25() {
        int sumaCuadrados = 0;  
        
        for (int i = 1; i <= 100; i++) {  
            int cuadrado = i * i;  
            
            sumaCuadrados += cuadrado;  
        }
        
        System.out.println("=================================");
        System.out.println("SUMA DE CUADRADOS (1-100)");
        System.out.println("---------------------------------");
        System.out.println("La suma de los cuadrados de los primeros 100 numeros naturales es: " + sumaCuadrados);
        System.out.println("=================================");
    }
    
    public void ejercicio26() {
        System.out.print("Ingrese un numero entero positivo N: ");
        int n = sc.nextInt();  
        
        if (n < 0) {  
            System.out.println("Error: El numero debe ser positivo");
            return;  
        }
        
        if (n == 0 || n == 1) {  
            System.out.println("=================================");
            System.out.println("\nFACTORIAL DE " + n);
            System.out.println("---------------------------------");
            System.out.println(n + "! = 1");  
            System.out.println("=================================");
            return;  
        }
        
        long factorial = 1;  
        
        System.out.print("Formula: " + n + "! = 1");
        
        for (int i = 2; i <= n; i++) { 
            factorial *= i;  
            System.out.print(" * " + i);  
        }
        
        System.out.println();  
        System.out.println("=================================");
        System.out.println("\nFACTORIAL DE " + n);
        System.out.println("---------------------------------");
        System.out.println(n + "! = " + factorial);
        System.out.println("=================================");
    }
    
    public void ejercicio27() {
        System.out.println("Ingrese 10 numeros para encontrar el valor maximo:");
        
        double maximo = Double.MIN_VALUE;  // Empieza con el valor más pequeño posible
        
        for (int i = 1; i <= 10; i++) {  
            System.out.print("Numero " + i + ": ");
            double numero = sc.nextDouble();  
            
            if (i == 1 || numero > maximo) {  
                maximo = numero; 
                System.out.println(" Nuevo maximo encontrado: " + maximo);
            }
        }
        
        System.out.println("=================================");
        System.out.println("\nVALOR MAXIMO");
        System.out.println("---------------------------------");
        System.out.println("El valor maximo de los 10 numeros es: " + maximo);
        System.out.println("=================================");
    }
    
}
