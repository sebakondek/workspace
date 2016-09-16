package com.cognizant.ejemplo.main;

import com.cognizant.ejemplo.objetos.Director;
import com.cognizant.ejemplo.objetos.Empleado;
import com.cognizant.ejemplo.objetos.Saludador;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Juan", 34, 100000);
		empleado1.saludar();
		
		Director director1 = new Director("Maria", 43, "RRHH");
		director1.saludar();
		
		Saludador saludador1 = new Saludador();
		saludador1.hacerSaludar(empleado1);
		saludador1.hacerSaludar(director1);
	}

}
