package empleados.test;

import empleados.domain.*;

/**
 * Aplicando el operador instanceof a nuestros objetos
 * 
 * @author juanfcosanz
 *
 */
public class EmpleadosTest5 {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Miguel Lopex", "Gerente", 2,
				"Mercadotecnia", 5894.564);
		Editor editor = new Editor("Miriam Rosas", "Editor Jr", 1);
		Empleado empleado = new Empleado();

		determinarTipoDeDato(gerente);
		determinarTipoDeDato(editor);
		determinarTipoDeDato(empleado);
		determinarTipoDeDato("Prueba");

	}

	private static void determinarTipoDeDato(Object e) {
		// iniciamos comparando nuestras clases con menor jerarquia
		if (e instanceof Gerente) {
			System.out.println("El argumento es una instancia de tipo Gerente");
		} else if (e instanceof Editor) {
			System.out.println("El argumento es una instancia de tipo Editor");
		} else if (e instanceof Empleado) {
			System.out
					.println("El argumento es una instancia de tipo Empleado");
		} else {
			System.out
					.println(" ** El argumento no es compatible con ningun tipo de dato especificado **");
		}

		// este es el caso de que regresa verdadero para un tipo compatible
		if (e instanceof Empleado) {
			System.out
					.println("-> El argumento es compatible con el tipo Empleado");
		}

	}
}
