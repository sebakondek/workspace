package com.cognizant.ejemplo.objetos;

public class Saludador {

	public void hacerSaludar(Persona persona) {
		
		System.out.println(persona.getClass().getName());
		persona.saludar();
		
	}
}
