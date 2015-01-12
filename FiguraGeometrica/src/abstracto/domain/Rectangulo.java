package abstracto.domain;

public class Rectangulo extends FiguraGeometrica {

	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		System.out.println("Aqui deberia imprimir un: "
				+ this.getClass().getSimpleName());
	}

}
