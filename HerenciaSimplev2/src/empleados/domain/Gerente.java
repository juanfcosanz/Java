package empleados.domain;

public class Gerente extends Empleado {

	private String departamento;

	// Como no tenemos contructores vacios en la clase padre, estamos obligados
	// en todas las sublases a mandar llamar un contructor que sea dif. del
	// vacio
	public Gerente() {
		super("Jorge Hernandez");
	}

	public Gerente(String nombre, String puesto, int nivel,
			String departamento, double sueldo) {
		// se inicializan primero los atributos de la clase padre y se heredan
		super(nombre, puesto, nivel, sueldo);
		// se inicializa el atributo particular ala clase Gerente
		this.departamento = departamento;
	}

	public void desplegarInformacion() {
		System.out.println("Nombre del Empleado: " + this.nombre);
		System.out.println("Puesto: " + this.puesto);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Departamento: " + this.departamento);

	}

	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", Departamento=" + this.departamento
				+ "]";
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return super.toString() + ", Departamento="
				+ ((this.departamento != null) ? this.departamento : "null")
				+ "]";
	}

}
