package com.banco.domain;

public class Cuenta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean depositar(double cantidad) {
		saldo = saldo + cantidad;
		return true;
	}

	public boolean retirar(double cantidad) {
		boolean result = false;
		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			result = true;
		}

		return result;
	}

}
