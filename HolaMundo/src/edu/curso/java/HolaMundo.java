package edu.curso.java;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola mundo java!.");
		
		String nombre = "Java es el mejor lenguaje del mundo.";
		int tamano = nombre.length();
		System.out.println("Tamano: " + tamano);
		String nombreEnUpper = nombre.toUpperCase();
		System.out.println("Upper Case: " + nombreEnUpper);
		String replace = nombre.replace(" ", "@");
		System.out.println("Replace: " + replace);
		String[] palabras = nombre.split(" ");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		int mejor = nombre.indexOf("mejor");
		System.out.println("Mejor: " + mejor);
		String subCadena = nombre.substring(10, 20);
		System.out.println("SubCadena: " + subCadena);
		boolean estaJava = nombre.startsWith("Java");
		System.out.println("Estajava: " + estaJava);
		if(nombre.equalsIgnoreCase("mandarina") == true){
			System.out.println("Es mandarina...");
		} else {
			System.out.println("No es mandarina...");
		}
	}

}
