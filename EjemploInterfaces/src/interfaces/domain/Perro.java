package interfaces.domain;

public class Perro extends Animal implements Hablador {

	// Caracteristicas
	@Override
	public void comer() {
		System.out.println("El perro come croquetas");

	}

	// Comportamiento
	@Override
	public void actoDeHablar() {
		System.out.println("El perro hace guau!!");

	}

}
