package operaciones.domain;

public class Division {
	// atributos de la clae

	private int numerador;
	private int denominador;

	public Division(int numerador, int denominador) throws OperacionException {
		super();

		if (denominador == 0) {
			// se requiere agregar este tipo de excepcion ala firma del metodo
			// o try/cacth
			throw new OperacionException("Denominador igual a cero");
		}

		this.numerador = numerador;
		this.denominador = denominador;

		/*
		 * if (denominador == 0) {
		 * System.out.println("No se puede realizar una division ");
		 * System.out.println("Usando el valor por default 1"); this.denominador
		 * = 1; }
		 */
	}

	public void visualizarOperacion() {
		System.out.println("El resultado es: " + numerador / denominador);
	}

}
