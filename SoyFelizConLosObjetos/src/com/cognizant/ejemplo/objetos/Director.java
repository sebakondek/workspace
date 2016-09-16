package com.cognizant.ejemplo.objetos;

public class Director extends Persona {

	private String area;
	
	public Director(String nombre, int edad, String area){
		
		super(nombre, edad);
		setArea(area);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public void saludar() {

		System.out.println("Soy director y no saludo");		
	}
}
