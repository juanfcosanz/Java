package abstracto.test;

import abstracto.domain.FiguraGeometrica;
import abstracto.domain.Rectangulo;

public class FiguraGeometricaTest {
	public static void main(String[] args) {
		FiguraGeometrica rectangulo = new Rectangulo("Poligono Rectangulo");
		System.out.println(rectangulo);
		rectangulo.dibujar();
	}
}
