package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor del radio.
		System.out.println("Introduzca el radio de la esfera");
		// Asignamos a la variable radio de la clase Esfera el valor escrito por el usuario.
		Esfera.radio = sc.nextInt();
		// Mostramos por pantalla el valor devuelto por la función superficie de la clase Esfera a la que le pasamos el valor de radio.
		System.out.println(Esfera.superficie(Esfera.radio));
		// Mostramos por pantalla el valor devuelto por la función volumen de la clase Esfera a la que le pasamos el valor de radio.
		System.out.println(Esfera.volumen(Esfera.radio));
	}

}
