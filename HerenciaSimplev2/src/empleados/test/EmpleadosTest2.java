package empleados.test;

import empleados.domain.*;

public class EmpleadosTest2 {
	public static void main(String[] args) {

		Gerente gerente = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);

		System.out.println(gerente.toString());
	}
}
