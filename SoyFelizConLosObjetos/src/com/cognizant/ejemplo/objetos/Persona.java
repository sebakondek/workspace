package com.cognizant.ejemplo.objetos;

public abstract class Persona {

	private String nombre;
	private int edad;
	
	public Persona(){
		System.out.println("Creando persona sin parametros");
	}
	
	public Persona(String nombre){
		
		System.out.println("Creando persona nombre");
		setNombre(nombre);
	}
	
	public Persona(String nombre, int edad) {
	
		System.out.println("Creando persona nombre y edad");
		setNombre(nombre);
		setEdad(edad);
	}
	
	public abstract void saludar();
	
	public void saludar (String textoExtra) {
		
		String texto = "Hola mi nombre es " + nombre + " y tengo " + edad + textoExtra;
		System.out.println(texto);
	}
	
	public String recuperarTextoSaludo() { 
		
		String texto = "Hola mi nombre es " + nombre + " y tengo " + edad;
		return texto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
