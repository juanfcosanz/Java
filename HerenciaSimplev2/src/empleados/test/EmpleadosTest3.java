package empleados.test;

import empleados.domain.*;

public class EmpleadosTest3 {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);

		Gerente gerente2 = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);

		boolean igualdad = gerente1.equals(gerente2);
		System.out.println("Gerente 1 y Gerente 2 son iguales(contenido) ? "
				+ igualdad);
		boolean mismaReferencia = (gerente1 == gerente2) ? true : false;
		System.out.println("Gerente 1 y Gerente 2 apunta al mismo objeto ? "
				+ mismaReferencia);

		System.out.println("HashCode Gerente1: " + gerente1.hashCode());
		System.out.println("HashCode Gerente2: " + gerente2.hashCode());

	}

}
