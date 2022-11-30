package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operaciones obj = new Operaciones();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer número entero");
		obj.a = sc.nextDouble();
		System.out.println("Introduzca el segundo número entero");
		obj.b = sc.nextDouble();
		System.out.println(obj.suma());
		System.out.println(obj.resta());
		System.out.println(obj.multiplicacion());
		System.out.println(obj.division());

	}

}
