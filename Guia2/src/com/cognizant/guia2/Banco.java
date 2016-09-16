package com.cognizant.guia2;

import java.util.*;

public class Banco {
	
	private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

	public void extraerDeCuenta(double monto, CuentaBancaria cuentaBancaria) {
		System.out.println("* Ejecutando extraer en banco *");
		System.out.println(cuentaBancaria);
		cuentaBancaria.extraer(monto);
		System.out.println(cuentaBancaria);
	}
	
	public CuentaBancaria buscarCuentaPorNumero(int numero){
		
		CuentaBancaria cuentaBancaria = null;
		for (CuentaBancaria c : cuentas) {
			if(c.getNumero() == numero){
				return c;
			}
		}
		return null;
	}
	
	public CajaDeAhorro crearCajaDeAhorro(int numero, double saldo) {
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();
		cajaDeAhorro.setNumero(numero);
		cajaDeAhorro.setSaldo(saldo);
		cuentas.add(cajaDeAhorro);
		return cajaDeAhorro;
	}

	public CuentaCorriente crearCuentaCorriente(int numero, double saldo, double limiteExtra) {
		CuentaCorriente cuentaCorriente = new CuentaCorriente();
		cuentaCorriente.setNumero(numero);
		cuentaCorriente.setSaldo(saldo);
		cuentaCorriente.setLimiteExtra(limiteExtra);
		cuentas.add(cuentaCorriente);
		return cuentaCorriente;
	}
	
	

}
