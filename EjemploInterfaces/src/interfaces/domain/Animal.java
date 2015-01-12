package interfaces.domain;

public abstract class Animal {

	private String nombre;

	public abstract void comer();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
