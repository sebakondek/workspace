package com.cognizant.guia2;

public class Principal {

	public static void main(String[] args) {

		Banco banco = new Banco();
		CajaDeAhorro cuentaBancaria1 = banco.crearCajaDeAhorro(1234, 10000);
		banco.extraerDeCuenta(14000, cuentaBancaria1);
		
		CuentaCorriente cuentaBancaria2 = banco.crearCuentaCorriente(5678, 15000, 2000);

		banco.extraerDeCuenta(16000, cuentaBancaria2);
		
	}

}

