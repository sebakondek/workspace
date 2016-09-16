package com.cognizant.principal;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import com.cognizant.bo.Persona;
import com.cognizant.dao.GestorDePersonas;

public class Principal {

	public static void main(String[] args) {
	
/*		Persona persona = new Persona(); 
		persona.setIdPersona(1);
		persona.setNombre("Juancito");
		persona.setApellido("Carreo");
		persona.setEdad(28);
	*/	
		GestorDePersonas gestorDePersonas = new GestorDePersonas();
	//	gestorDePersonas.altaDePersona(persona);
		
		
	//	gestorDePersonas.recuperarPersonas();
	//	System.out.println(gestorDePersonas.recuperarPersonas());
		
		File file = new File("Personas.csv");
		FileWriter fw = null;
		ArrayList<Persona> personas = new ArrayList<>();
		
		try {
			fw = new FileWriter(file);
			fw.write("Id,Nombre,Apellido,Edad\n");
			personas = gestorDePersonas.recuperarPersonas();
			
		for (Persona sad : personas) {
				fw.write(sad.getIdPersona() + ", ");
				fw.write(sad.getNombre() + ", ");
				fw.write(sad.getApellido() + ", ");
				fw.write(sad.getEdad() + "\n");
				fw.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
