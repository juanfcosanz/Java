package empleados.test;

import empleados.domain.Empleado;
import empleados.domain.Gerente;

/**
 * Trabando con polimosfismo
 * @author juanfcosanz
 *
 */
public class EmpleadosTest3 {

	public static void main(String[] args) {
		Empleado empleado = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);
		System.out.println(empleado.obtenerDetalles());
	}

}
