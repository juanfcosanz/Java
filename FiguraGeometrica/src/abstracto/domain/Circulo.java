package abstracto.domain;

public class Circulo extends FiguraGeometrica {

	public Circulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		System.out.println("Aqui deberia dibujar un: "
				+ this.getClass().getSimpleName());

	}

}
