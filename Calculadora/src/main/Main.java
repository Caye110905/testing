package main;
import java.util.Scanner;

public class Main {
	// Atributos
	
	// Constructoras
	
	/**
	 * Metodo main
	 * @param args
	 */
	public static void main (String[] args) {
		// Paso 1: Declarar variables para almacenar los números ingresados y el resultado. 
		double num1, num2, resultado;
		// Paso2: Importar la clase Scanner para obtener entrada del usuario.
		Scanner scanner = new Scanner(System.in);
		
		// Paso 3: Pedir al usuario que ingrese el primer número.
		System.out.print("Ingresa el primer número: ");
		num1 = scanner.nextDouble();
		
		// Paso 4: Pedir al usuario que ingrese el segundo número.
		System.out.print("Ingresa el segundo número: ");
		num2 = scanner.nextDouble();
		
		// Paso 5: Calcular la suma de los dos números.
		resultado = num1 + num2;
		
		// Paso 6: Mostrar el resultado.
		System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + resultado);
		
		// Paso 7: Cerrar el scanner.
		scanner.close ();
		
		
	}

}
