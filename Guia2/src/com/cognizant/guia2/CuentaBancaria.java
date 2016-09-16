package com.cognizant.guia2;


public abstract class CuentaBancaria {

	private int numero;
	private double saldo;
	
	public abstract void extraer(double monto);
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

