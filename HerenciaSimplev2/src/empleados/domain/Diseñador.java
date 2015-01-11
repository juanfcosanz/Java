package empleados.domain;

public class Diseñador extends Empleado {

	public Diseñador() {
		// podemos mandarle en valor de null, solo para llamar el contructor,
		// pero sin inicializarlo
		super(null);
	}

	public Diseñador(String nombre, String puesto, int nivel, double saldo) {
		super(nombre, puesto, nivel, saldo);
	}

	public void desplegarInformacion() {
		System.out.println("Nombre del Empleado: " + this.nombre);
		System.out.println("Puesto: " + this.puesto);
		System.out.println("Nivel: " + this.nivel);

	}

}
