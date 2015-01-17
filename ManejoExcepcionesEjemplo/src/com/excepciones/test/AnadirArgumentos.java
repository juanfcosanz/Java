package com.excepciones.test;

public class AnadirArgumentos {

	public static void main(String[] args) {
		try {
			int suma = 0;

			for (String arg : args) {
				suma += Integer.parseInt(arg);
			}
			System.out.println("La suma es: " + suma);
		} catch (NumberFormatException nfe) {
			System.err.println("Ocurrio un error, algun parametro incorrecto ");
		}
	}
}
