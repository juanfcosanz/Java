package operaciones.test;

import operaciones.domain.Division;
import operaciones.domain.OperacionException;

public class DivisionTest {

	public static void main(String[] args) {

		try {
			Division d = new Division(10, 0);
			d.visualizarOperacion();
		} catch (OperacionException oe) {
			System.out.println("Ocurrio un error");
			// ahora la excepcion es de tipo OperacionExcepcion
			oe.printStackTrace();
		}

	}

}
