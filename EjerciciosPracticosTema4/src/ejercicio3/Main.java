package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cant; // Esta variable es la cantidad de aleatorios que desea generar el usuario.
		int max; // Esta variable es el valor máximo que tendrán los aleatorios.
		int min; // Esta variable es el valor mínimo que tendrán los aleatorios.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario la cantidad de aleatorios que quiere generar.
		System.out.println("Introduzca la cantidad de aleatorios a generar");
		// Asignamos a cant el valor escrito por el usuario.
		cant = sc.nextInt();
		// Pedimos al usuario el tope de los números aleatorios.
		System.out.println("Introduzca el valor máximo de los aleatorios");
		// Asignamos a max el valor escrito por el usuario.
		max = sc.nextInt();
		// Pedimos al usuario el tope mínimo de los números aleatorios.
		System.out.println("Introduzca el valor mínimo de los aleatorios");
		// Asignamos a min el valor escrito por el usuario.
		min = sc.nextInt();
		// Mostamos por pantalla un mensaje con el tipo de aleatorios que se mostrarán.
		System.out.println("Números aleatorios entre 0 y 1");
		// Llamamos a la función numerosAleatorios de la clase NumerosAleatorios a la que le pasamos el valor de cant.
		NumerosAleatorios.numerosAleatorios(cant);
		// Llamamos a la función numerosAleatorios de la clase NumerosAleatorios a la que le pasamos el valor de cant y max.
		NumerosAleatorios.numerosAleatorios(cant, max);
		// Llamamos a la función numerosAleatorios de la clase NumerosAleatorios a la que le pasamos el valor de cant, min y max.
		NumerosAleatorios.numerosAleatorios(cant, min, max);
		// Cerramos el escaner.
		sc.close();
	}

}
