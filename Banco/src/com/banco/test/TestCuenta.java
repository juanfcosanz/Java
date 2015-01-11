package com.banco.test;

import com.banco.domain.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		c.setSaldo(100.00);
		c.depositar(47.00);
		c.retirar(150.00);
		System.out.println("Saldo actual: " + c.getSaldo());
	}

}
