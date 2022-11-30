package ejercicio2;

public class Esfera {	
	static int radio;
	public static double superficie(int radio) {
		double sol;
		sol = (double) 4*Math.PI*radio*radio;
		return sol;
	}
	public static double volumen(int radio) {
		double vol;
		vol = (double) (4*Math.PI/3)*radio*radio;
		return vol;
	}
}
