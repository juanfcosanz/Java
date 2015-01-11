package empleados.domain;

/**
 * Clase padre
 * 
 * @author juanfcosanz
 *
 */
public class Empleado {

	protected String nombre;
	protected String puesto;
	protected int nivel;
	protected double sueldo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String obtenerDetalles() {
		return "Clase Padre Empleado ["
				+ "Nombre=" + nombre + 
				", Puesto=" + puesto + 
				", Nivel=" + nivel + "]";
	}

}
