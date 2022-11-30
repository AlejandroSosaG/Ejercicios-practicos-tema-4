package ejercicio1;

public class Numeros {
	/**
	 * Esta función se encarga de decir si el número que se le pasa por parámetro es primo o no.
	 * @param numero
	 * @return
	 */
	public boolean esPrimo(int numero) {
		boolean primo = true; // Esta variable es la que nos dirá si el número introducido por el usuario es primo o no, y la inicializamos con valor true.
		/*
		 * Recorremos el bucle mientras que i sea menor a num más uno entre dos a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 2.
		 */
		for (int i = 2; i < numero + 1 / 2; i++) {
			 // Si el resto de dividir num entre i es igual a cero asignamos a la variable primo el valor false.
			 if (numero % i == 0) {
				 primo = false;
			 }			
		}
		// Devolvemos el valor de la variable primo.
		return primo;
	}
	public boolean esCapicua(int numero) {
				int cifra1;
				int cifra2;
				int cifra3;
				int cifra4;
				boolean capicua=false; // Esta es la variable que validará si el número es capicúa o no.
				
				// Si el numero tiene una cifra es capicúa.
				if(numero<10) {
					capicua=true;
				}else {
					// Si el numero tiene 2 cifras sacamos el valor de cada una.
					if(numero<100){
						cifra1= (int) numero/10;
						cifra2=numero%10;
						// Si las cifras son iguales el número es capicúa.
						if(cifra1==cifra2) {
							capicua=true;
						}
							
					}else {
						// Si el número tiene 3 cifras conseguimos el valor de la primera y la última.
						if(numero<1000) {
							cifra1= (int) numero/100;
							cifra3=numero%10;
							// Si el valor de la primera cifra y la tercera son iguales el número es capicúa.
							if(cifra1==cifra3) capicua = true;
						// Si el número tiene 4 cifras sacamos el valor de cada cifra.
						}else {
							cifra1= (int) numero/1000;
							cifra2=(int)(numero/100)%10;
							cifra3=(int)(numero/10)%10;
							cifra4= (int)(numero%10);
							// Si el valor de la primera y cuarta cifra y el de la segunda y cuarta son iguales el número es capicúa.
							if(cifra1==cifra4 && cifra2==cifra3) capicua=true;
						}
					}
				}
				return capicua;
	}
}
