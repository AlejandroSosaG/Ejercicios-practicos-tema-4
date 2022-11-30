package ejercicio5;

public class FuncionesRecursivas {
	public static int sumatorio(int n) {
		int suma = 0;
		if (n==0) suma+=0;
        else {
                suma = n + sumatorio(n - 1);
        }
		return suma;
	}
	public static double potencia(double a, int b) {
		double potencia = 1;
	        if (b==0) potencia*=1;
	        else {
	                potencia = a * potencia(a, b - 1);
	        }
		return potencia;
	}
	public static int serieFibionacci(int numero) {
		int sol = 0;
		if(numero==0) sol=0;
		else if(numero==1) sol=1;
		else {
			sol = serieFibionacci(numero - 1) + serieFibionacci(numero - 2);
		}
 		return sol;
	}
}
