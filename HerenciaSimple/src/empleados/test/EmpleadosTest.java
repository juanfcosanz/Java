package empleados.test;

import empleados.domain.Diseñador;
import empleados.domain.Editor;
import empleados.domain.Escritor;
import empleados.domain.Gerente;

/**
 * Trabajando con Herencia
 * @author juanfcosanz
 *
 */
public class EmpleadosTest {

	public static void main(String[] args) {
		Editor editor = new Editor("Miriam Rosas", "Editor Jr", 1);
		Diseñador diseñador = new Diseñador("Alex Toscano", "Diseñador Sr", 0);
		Escritor escritor = new Escritor("Blanca Garrido", "Escritor Master", 0, 1);
		Gerente gerente = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);

		editor.desplegarInformacion();
		diseñador.desplegarInformacion();
		escritor.desplegarInformacion();
		gerente.desplegarInformacion();

	}
}
