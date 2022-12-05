package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num; // Esta es la primera variable que pediremos al usuario.
		double num2; // Esta es la base de la potencia que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número entero que desea utilizar.
		System.out.println("Introduzca un número entero");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		// Pedimos al usuario la base de la potencia a calcular.
		System.out.println("Introduzca la base de la potencia");
		// Asignamos a num2 el valor escrito por el usuario.
		num2 = sc.nextDouble();
		// Mostramos por pantalla el valor que devuelve al función sumatorio de la clase FuncionesRecursivas a la que le pasamos el valor de num.
		System.out.println(FuncionesRecursivas.sumatorio(num));
		// Mostramos por pantalla el valor que devuelve al función potencia de la clase FuncionesRecursivas a la que le pasamos el valor de num y num2.
		System.out.println(FuncionesRecursivas.potencia(num2, num));
		// Mostramos por pantalla el valor que devuelve al función serieFibionacci de la clase FuncionesRecursivas a la que le pasamos el valor de num.
		System.out.println(FuncionesRecursivas.serieFibionacci(num));
	}

}
