package empleados.test;

import empleados.domain.*;

public class EmpleadosTest6 {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);
		determinarTipoObjeto(gerente);
	}

	public static void determinarTipoObjeto(Empleado e) {
		if (e instanceof Gerente) {
			Gerente g = (Gerente) e;
			System.out.println("Departamento del Gerente: "
					+ g.getDepartamento());

		}
	}
}
