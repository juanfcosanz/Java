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

	/**
	 * Constructor de la clase padre, para inicializar los atributos
	 * 
	 * @param nombre
	 * @param puesto
	 * @param nivel
	 * @param sueldo
	 */

	public Empleado(String nombre, String puesto, int nivel, double sueldo) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.nivel = nivel;
		this.sueldo = sueldo;
	}

	/**
	 * Sobrecargando el contructor, para poder crear el objeto Empleado de
	 * diferentes maneras
	 * 
	 * @param nombre
	 * @param puesto
	 */
	public Empleado(String nombre, String puesto) {
		this(nombre, puesto, 0, 0.0); // Mandamos a llamar el contructor
										// completo
	}

	public Empleado(String nombre) {
		this(nombre, null, 0, 0.0);
	}

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
		return "Empleado [nombre=" + nombre + ", puesto=" + puesto + ", nivel="
				+ nivel + ", sueldo=" + sueldo + "]";
	}

	@Override
	public String toString() {
		return "Datos Empleado [" + "Nombre="
				+ ((this.nombre != null) ? this.nombre : "null") + ", Puesto="
				+ ((this.puesto != null) ? this.puesto : "null") + ", Nivel="
				+ this.nivel + ", Sueldo=" + this.sueldo + "]";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nivel;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sueldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (nivel != other.nivel)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		if (Double.doubleToLongBits(sueldo) != Double
				.doubleToLongBits(other.sueldo))
			return false;
		return true;
	}

}
