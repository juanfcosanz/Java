package empleados.test;

import empleados.domain.*;

public class EmpleadosTest4 {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);
		Editor editor = new Editor("Miriam Rosas", "Editor Jr", 1);
		Empleado empleado = new Empleado();

		imprimirDetalles(gerente);
		imprimirDetalles(editor);
		imprimirDetalles(empleado);
	}

	private static void imprimirDetalles(Empleado empleado) {
		System.out.println(empleado.obtenerDetalles());
	}

}
