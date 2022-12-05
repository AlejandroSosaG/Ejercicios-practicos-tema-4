package ejercicio4;

public class Operaciones {
	 double a; // Esta variable es el primer número que pediremos al usuario y utilizaremos para realizar una operación.
	 double b; // Esta variable es el segundo número que pediremos al usuario y utilizaremos para realizar una operación.
	 /**
	  * Esta función devuelve la suma de la variable a y de la variable b.
	  * @return
	  */
	public int suma() {
		// Devolvemos el valor de la variable a más el valor de la variable b.
		return (int) (a+b);
	}
	/**
	 * Esta función devuelve la resta de la variable a menos la variable b.
	 * @return
	 */
	public int resta() {
		// Devolvemos el valor de la variable a menos el valor de la variable b.
		return (int) (a-b);
	}
	/**
	 * Esta función devuelve la multiplicación de la variable a y la variable b.
	 * @return
	 */
	public int multiplicacion() {
		// Devolvemos el valor de la variable a por el valor de la variable b.
		return (int) (a*b);
	}
	/**
	 * Esta función devuelve la división de la variable a entre la variable b.
	 * @return
	 */
	public double division() {
		// Devolvemos el valor de la variable a entre el valor de la variable b.
		return a/b;
	}
}
