package interfaces.domain;

public class Cucu extends Reloj implements Hablador {

	@Override
	public void actoDeHablar() {
		System.out.println("El reloj hace Cucu!!");
	}

}
