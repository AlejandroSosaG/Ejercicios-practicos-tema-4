package ejercicio5;

public class FuncionesRecursivas {
	/**
	 * Esta función recursiva calcula la suma de los números existentes entre 1 y la variable que se pasa por parámetro.
	 * @param n
	 * @return
	 */
	public static int sumatorio(int n) {
		int suma = 0; // Esta variable es la suma de los números entre 1 y n.
		// Si el valor de n es 0 asignamos a la variable suma su valor actual más 0.
		if (n==0) suma+=0;
		// Si no ocurre lo  anterior,
        else {
        		// Asignamos a la variable suma el valor de n más el valor devuelto por la función sumatorio a la que le pasamos el valor de n menos 1.
                suma = n + sumatorio(n - 1);
        }
		// Devolvemos el valor de la variable suma.
		return suma;
	}
	/**
	 * Esta función se encarga de calcular la potencia de un número utilizando la dos variables que se le pasan por parámetro.
	 * @param a
	 * @param b
	 * @return
	 */
	public static double potencia(double a, int b) {
		double potencia = 1; // Esta variable es la potencia que vamos a calcular.
		// Si el valor de b es cero multiplicamos el valor actual de la variable potencia por uno.
		if (b==0) potencia*=1;
		// Si no ocurre lo anterior,
        else {
        		// Asignamos a la variable potencia el valor de a por el valor devuelto por la función potencia 
        		// a la que le pasamos los valores de a y de b menos uno.
                potencia = a * potencia(a, b - 1);
        }
		// Devolvemos el valor de la variable potencia.
		return potencia;
	}
	/**
	 * Esta función recursiva calcula el valor de la posición de fibionacci de la variable que se le pasa por parámetro.
	 * @param numero
	 * @return
	 */
	public static int serieFibionacci(int numero) {
		int sol = 0; // Esta variable es la posición de fibionacci que calcularemos.
		// Si el valor de la variable numero es cero sumamos al valor actual de sol uno.
		if(numero==0) sol+=1;
		// Si el valor de la variable numero no es cero pero si es uno sumamos al valor actual de sol uno.
		else if(numero==1) sol=1;
		// Si no ocurre nada de lo anterior,
		else {
			// Asignamos a sol el valor devuelto por la función serieFibionacci a la que le pasamos el valor 
			// de la variable numero menos uno más el valor devuelto por la función serieFibionacci a la que le pasamos el valor 
			// de la variable numero menos dos. 
			sol = serieFibionacci(numero - 1) + serieFibionacci(numero - 2);
		}
		// Devolvemos el valor de sol.
 		return sol;
	}
}
