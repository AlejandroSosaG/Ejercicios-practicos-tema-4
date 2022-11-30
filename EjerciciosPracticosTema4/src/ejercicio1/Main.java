package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		num = sc.nextInt();
		Numeros objeto = new Numeros();
		System.out.println("Número primo: " + objeto.esPrimo(num));
		System.out.println("Número capicúa: " + objeto.esCapicua(num));
	}

}
