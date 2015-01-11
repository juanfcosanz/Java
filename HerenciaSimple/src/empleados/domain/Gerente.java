package empleados.domain;

public class Gerente extends Empleado {

	private String departamento;

	public Gerente() {
		super();
	}

	public Gerente(String nombre, String puesto, int nivel,
			String departamento, double sueldo) {
		/*
		 * super(); this.setNombre(nombre); this.setPuesto(puesto);
		 * this.setNivel(nivel); this.departamento = departamento;
		 */
		this.setNombre(nombre);
		this.puesto = puesto;
		this.nivel = nivel;
		this.departamento = departamento;
		this.sueldo = sueldo;

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

}
