package operaciones.test;

import operaciones.domain.Division;

public class DivisionTest {

	public static void main(String[] args) {
		try {
			Division d1 = new Division(10, 0);
			// esta linea ya no se ejecuta y pasa directamente al catch
			d1.visualizarOperacion();
		} catch (IllegalArgumentException iae) {
			System.out.println("Ocurrio un error!!!");
			// desplegamos la pila de errores que se han acomulado
			// opcionalmente podemos mostrar la pila de errores
			iae.printStackTrace();
		}
	}
}
