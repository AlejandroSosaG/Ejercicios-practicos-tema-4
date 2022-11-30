package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		double num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		num = sc.nextInt();
		System.out.println("Introduzca la base de la potencia");
		num2 = sc.nextDouble();
		System.out.println(FuncionesRecursivas.sumatorio(num));
		System.out.println(FuncionesRecursivas.potencia(num2, num));
		System.out.println(FuncionesRecursivas.serieFibionacci(num));
	}

}
