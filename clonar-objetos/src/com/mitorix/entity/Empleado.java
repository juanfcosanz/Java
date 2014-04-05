package com.mitorix.entity;

public class Empleado implements Cloneable {

	private int idEmpleado;
	private String nomEmpleado;

	public Empleado(int id, String nombre) {
		super();
		this.idEmpleado = id;
		this.nomEmpleado = nombre;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNomEmpleado() {
		return nomEmpleado;
	}

	public void setNomEmpleado(String nomEmpleado) {
		this.nomEmpleado = nomEmpleado;
	}

}
