package operaciones.domain;

public class Division {
	// atributos de la clae

	private int numerador;
	private int denominador;

	public Division(int numerador, int denominador) {
		super();

		if (denominador == 0) {
			// esta excepcion extiende de la clas RuntimeException
			// ṕor ello no es nec. procesarla y definirla en la firma del
			// metodo, ni try/cath
			// ESTA ES UNA MANERA DE INFORMAR ERRORES
			throw new IllegalArgumentException("Denominador igual a cero");
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
