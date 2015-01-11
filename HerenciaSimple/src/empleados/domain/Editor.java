package empleados.domain;

public class Editor extends Empleado {

	public Editor() {
	}

	public Editor(String nombre, String puesto, int nivel) {
		this.setNombre(nombre);
		this.setPuesto(puesto);
		this.setNivel(nivel);
	}

	public void desplegarInformacion() {
		System.out.println("Nombre del Empleado: " + this.getNombre());
		System.out.println("Puesto: " + this.getPuesto());
		System.out.println("Nivel: " + this.getNivel());

	}

}
