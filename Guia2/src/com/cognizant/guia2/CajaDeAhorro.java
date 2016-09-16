package com.cognizant.guia2;

public class CajaDeAhorro extends CuentaBancaria {

	@Override
	public String toString() {
		return "CajaDeAhorro [numero=" + getNumero() + ", saldo=" + getSaldo() + "]";
	}

	@Override
	public void extraer(double monto) {
		double saldoActual = getSaldo();
		if(saldoActual - monto >= 0) {
			saldoActual = saldoActual - monto;
			setSaldo(saldoActual);
		} else {
			System.out.println("No hay dinero....");
		}
	}
}
