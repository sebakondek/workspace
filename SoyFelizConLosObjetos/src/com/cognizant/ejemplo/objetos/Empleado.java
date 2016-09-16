package com.cognizant.ejemplo.objetos;

public class Empleado extends Persona {

	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		
		super(nombre, edad);
		setSueldo(sueldo);
	}
	
	public Empleado(double sueldo) {
		
		setSueldo(sueldo);
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public void saludar() {
		
		System.out.println("Hola mi nombre es " + super.getNombre());
	}
}
