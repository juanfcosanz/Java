package empleados.domain;

public class Editor extends Empleado {

	public Editor() {
		super(null);
	}

	public Editor(String nombre, String puesto, int nivel, double saldo) {
		super(nombre, puesto, nivel, saldo);
	}

	public void desplegarInformacion() {
		System.out.println("Nombre del Empleado: " + this.getNombre());
		System.out.println("Puesto: " + this.getPuesto());
		System.out.println("Nivel: " + this.getNivel());

	}

}
