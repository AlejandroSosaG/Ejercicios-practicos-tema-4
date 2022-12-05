package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos un objeto de la clase Operaciones.
		Operaciones obj = new Operaciones();
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el primer número.
		System.out.println("Introduzca el primer número entero");
		// Asignamos a la variable a de la clase Operaciones el valor escrito por el usuario.
		obj.a = sc.nextDouble();
		// Pedimos al usuario el segundo número.
		System.out.println("Introduzca el segundo número entero");
		// Asignamos a la variable b de la clase Operaciones el valor escrito por el usuario.
		obj.b = sc.nextDouble();
		// Mostramos por pantalla el valor devuelto por la función suma de la clase Operaciones.
		System.out.println(obj.suma());
		// Mostramos por pantalla el valor devuelto por la función resta de la clase Operaciones.
		System.out.println(obj.resta());
		// Mostramos por pantalla el valor devuelto por la función multiplicacion de la clase Operaciones.
		System.out.println(obj.multiplicacion());
		// Mostramos por pantalla el valor devuelto por la función division de la clase Operaciones.
		System.out.println(obj.division());

	}

}
