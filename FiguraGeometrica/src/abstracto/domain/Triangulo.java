package abstracto.domain;

public class Triangulo extends FiguraGeometrica {

	public Triangulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		System.out.println("Aqui deberia imprimir un: "
				+ this.getClass().getSimpleName());
	}

}
