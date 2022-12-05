package ejercicio3;

public class NumerosAleatorios {
	/**
	 * Esta función se encarga de generar números aleatorios con valor entre 0 y 1.
	 * @param a
	 */
	public static void numerosAleatorios(int a) {
		double random; // Esta variable es la que utilizaremos para generar aleatorios.
		/*
		 * Recorremos el bucle mientras que i sea menor que a a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 0.
		 */
		for (int i = 0; i < a; i++) {
			// Asignamos a random un número aleatorio entre 0 y 1.
			random = Math.random();
			// Mostramos por pantalla el valor actual de random.
			System.out.println(random);
		}
	}
	/**
	 * Esta función se encarga de generar números aleatorios con valor entre 0 y la segunda variable pasada por parámetro.
	 * @param a
	 * @param b
	 */
	public static void numerosAleatorios(int a, int b) {
		int random; // Esta variable es la que utilizaremos para generar aleatorios.
		// Mostramos por pantalla un mensaje con el tipo de aleatorios que se mostrarán.
		System.out.println("Números aleatorios entre 0 y " + b);
		/*
		 * Recorremos el bucle mientras que i sea menor que a a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 0.
		 */
		for (int i = 0; i < a; i++) {
			// Asignamos a random un número aleatorio entre 0 y b.
			random = (int) (Math.random()*(b+1));
			// Mostramos por pantalla el valor actual de random.
			System.out.println(random);
		}
	}
	/**
	 * Esta función se encarga de generar números aleatorios con valor entre la segunda y la tercera variable pasadas por parámetro.
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void numerosAleatorios(int a, int b, int c) {
		int random; // Esta variable es la que utilizaremos para generar aleatorios.
		// Mostramos por pantalla un mensaje con el tipo de aleatorios que se mostrarán.
		System.out.println("Números aleatorios entre " + b + " y " + c);
		/*
		 * Recorremos el bucle mientras que i sea menor que a a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 0.
		 */
		for (int i = 0; i < a; i++) {
			// Asignamos a random un número aleatorio entre b y c.
			random=(int) (Math.random()*(c-b+1)+b);
			// Mostramos por pantalla el valor actual de random.
			System.out.println(random);
		}
	}
}
