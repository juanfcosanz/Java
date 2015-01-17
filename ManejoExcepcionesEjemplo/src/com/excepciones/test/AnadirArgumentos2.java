package com.excepciones.test;

public class AnadirArgumentos2 {

	public static void main(String[] args) {

		// podemos envolcer ciertas lineas que pueden causar errores en tiempo
		// de compilacion o ejecucion
		int suma = 0;
		for (String arg : args) {
			try {
				// de esta manera omitimos los valores erroneos podemos seguir
				// procesando los argumentos y almacenarlos
				suma += Integer.parseInt(arg);
			} catch (NumberFormatException nfe) {
				System.err
						.println("Ocurrio un error, algun parametro incorrecto: "
								+ arg);
			}
		}
		System.out.println("La suma es: " + suma);

	}

}
