package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio de la esfera");
		Esfera.radio = sc.nextInt();
		System.out.println(Esfera.superficie(Esfera.radio));
		System.out.println(Esfera.volumen(Esfera.radio));
	}

}
