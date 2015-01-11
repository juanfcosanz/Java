package empleados.test;

import empleados.domain.*;

/**
 * Trabajando con Sobreescritura de metodos
 * @author juanfcosanz
 *
 */
public class EmpleadosTest2 {

	public static void main(String[] args) {
		Editor editor = new Editor("Miriam Rosas", "Editor Jr", 1);
		Diseñador diseñador = new Diseñador("Alex Toscano", "Diseñador Sr", 0);
		Escritor escritor = new Escritor("Blanca Garrido", "Escritor Master",
				0, 1);
		Gerente gerente = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);

		System.out.println(editor.obtenerDetalles());
		System.out.println(diseñador.obtenerDetalles());
		System.out.println(escritor.obtenerDetalles());
		System.out.println(gerente.obtenerDetalles());
	}

}
