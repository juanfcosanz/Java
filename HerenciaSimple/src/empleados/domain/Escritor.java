package empleados.domain;

public class Escritor extends Empleado {

	private int tipoDeEscritura = 2;

	public Escritor() {
	}

	public Escritor(String nombre, String puesto, int nivel) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.nivel = nivel;
	}

	/**
	 * Tambien podemos recibir el tipo de escritura
	 * 
	 * @param nombre
	 * @param puesto
	 * @param nivel
	 * @param tipoDeEscritura
	 */

	public Escritor(String nombre, String puesto, int nivel, int tipoDeEscritura) {
		this.setNombre(nombre);
		this.setPuesto(puesto);
		this.setNivel(nivel);
		this.tipoDeEscritura = tipoDeEscritura;
	}

	public int getTipoDeEscritura() {
		return tipoDeEscritura;
	}

	public void setTipoDeEscritura(int tipoDeEscritura) {
		this.tipoDeEscritura = tipoDeEscritura;
	}

	public String getTipoDeEscrituraEnTexto() {
		if (this.tipoDeEscritura == 1) {
			return "Escritura a Mano";
		} else if (this.tipoDeEscritura == 2) {
			return "Escritura a Computadora";
		} else {
			return "Metodo de Escritura no definido";
		}
	}

	public void desplegarInformacion() {
		System.out.println("Nombre del Empleado: " + this.nombre);
		System.out.println("Puesto: " + this.puesto);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Tipo de Escritura: " + this.tipoDeEscritura);

	}

	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", Tipo de Escritura="
				+ tipoDeEscritura + "]";
	}

}
