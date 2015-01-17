package operaciones.test;

import operaciones.domain.Division;

public class DivisionArgsTest {

	public static void main(String[] args) {

		try {
			// Recuperamos los argumentos
			int op1 = Integer.parseInt(args[0]);
			int op2 = Integer.parseInt(args[1]);

			Division d = new Division(op1, op2);
			d.visualizarOperacion();

		} catch (ArrayIndexOutOfBoundsException aibe) {
			System.out
					.println("Hubo un error al acceder un elemento fuera de rango");
			// opcionalmente podemos mostrar la pila de errores
			aibe.printStackTrace();
		} catch (NumberFormatException nfe) {
			// podemos anidar diferente excepciones en el mismo bloque try
			System.out.print("Ocurrio una excepcion: ");
			System.out.println("Uno de los argumentos no es un num. entero");
		} catch (IllegalArgumentException iae) {
			System.out.print("Ocurrio una excepcion: ");
			System.out.println("Se trato de realizar una operacion");

		} finally {
			// este bloque nos ayuda para libera recursos o tarea en especifico
			System.out.println("Se terminaron de revisar las excepciones");
		}

	}
}
