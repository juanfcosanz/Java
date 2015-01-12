package abstracto.domain;

public abstract class FiguraGeometrica {

	protected String tipoFigura;

	public FiguraGeometrica(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract void dibujar();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [Tipo de Figura: " + tipoFigura + "]";
	}

}
