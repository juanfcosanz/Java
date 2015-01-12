package interfaces.domain;

public class Gato extends Animal implements Hablador {

	@Override
	public void actoDeHablar() {
		System.out.println("El gato hace miau!!");
	}

	@Override
	public void comer() {
		System.out.println("El gato come whiskas");
	}

}
