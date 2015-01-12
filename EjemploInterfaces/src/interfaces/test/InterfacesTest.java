package interfaces.test;

import interfaces.domain.Cucu;
import interfaces.domain.Gato;
import interfaces.domain.Hablador;

public class InterfacesTest {

	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.comer(); // metodo abstracto
		hazHablar(gato); // metodo de la interfaz

		Cucu cucu = new Cucu();
		hazHablar(cucu); // inyectamos la referencia
	}

	private static void hazHablar(Hablador hablador) {
		hablador.actoDeHablar();
	}

}
