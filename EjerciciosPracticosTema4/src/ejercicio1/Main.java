package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario un númro entero.
		System.out.println("Introduzca un número entero");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		// Creamos un objeto de la clase Numeros.
		Numeros objeto = new Numeros();
		// Mostramos por pantalla un mensaje con el valor que devuelve la funcion esPrimo de la clase Numeros.
		System.out.println("Número primo: " + objeto.esPrimo(num));
		// Mostramos por pantalla un mensaje con el valor que devuelve la funcion esCapicua de la clase Numeros.
		System.out.println("Número capicúa: " + objeto.esCapicua(num));
	}

}
