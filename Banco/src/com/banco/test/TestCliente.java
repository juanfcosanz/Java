package com.banco.test;

import com.banco.domain.Cliente;
import com.banco.domain.Cuenta;

public class TestCliente {

	public static void main(String args[]) {
		Cuenta cuenta = new Cuenta();
		cuenta.setSaldo(100.00);

		Cliente cliente = new Cliente("Juan", "Sanchez");
		cliente.setCuenta(cuenta);
		System.out.println("Nombre del Cliente: " + cliente.getNombre());
		System.out.println("Apellido del cliente: " + cliente.getApellido());
		System.out.println("Saldo del cliente: "+ cliente.getCuenta().getSaldo());

	}
}
