package empleados.domain;

public class Diseñador extends Empleado {

	public Diseñador() {
	}

	public Diseñador(String nombre, String puesto, int nivel) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.nivel = nivel;
	}

	public void desplegarInformacion() {
		System.out.println("Nombre del Empleado: " + this.nombre);
		System.out.println("Puesto: " + this.puesto);
		System.out.println("Nivel: " + this.nivel);

	}

}
