package ejercicio2;

public class Esfera {	
	// Creamos una variable estática que utilizaremos tanto en el Main como en la clase Esfera.
	static int radio;
	/**
	 * Esta función calcula la superficie de una esfera utilizando la variable que se le pasa por parámetro.
	 * @param radio
	 * @return
	 */
	public static double superficie(int radio) {
		double sol; // Esta variable es la superficie de la esfera con el radio que se pasa.
		// Asignamos a sol el valor del cálculo 4 por pi por radio al cuadrado.
		sol = (double) 4*Math.PI*radio*radio;
		// Devolvemos el valor de sol.
		return sol;
	}
	/**
	 * Esta función se encarga de calcular el volumen de una esfera utilizando la variable que se le pasa por parámetro.
	 * @param radio
	 * @return
	 */
	public static double volumen(int radio) {
		double vol; // Esta variable es el volumen de la esfera con radio igual al que se pasa.
		// Asignamos a vol el valor del cálculo 4 por pi dividido entre 3 y todo esto por radio al cuadrado.
		vol = (double) (4*Math.PI/3)*radio*radio;
		// Devolvemos el valor de vol.
		return vol;
	}
}
