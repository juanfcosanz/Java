package com.mitorix.modelo;

import com.mitorix.entity.Empleado;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Empleado original = new Empleado(1, "admin");
		Empleado copia = (Empleado) original.clone();
		
		System.out.println(original.getNomEmpleado());
		System.out.println(copia.getNomEmpleado());
	}

}
