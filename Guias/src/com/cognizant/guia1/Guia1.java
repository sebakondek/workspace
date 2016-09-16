package com.cognizant.guia1;

import java.util.Scanner;

public class Guia1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Calculadora operacion = new Calculadora();
		
		int op;
		float num1, num2;
		
		System.out.println("Ingrese el primer numero que desea operar.\n");
		num1 = in.nextFloat();
		
		System.out.println("\nIngrese el segundo numero que desea operar.\n");
		num2 = in.nextFloat();
		
		System.out.println("\n¿Que operacion desea hacer?\n");
		System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
		op = in.nextInt();
		
		switch (op) {
		case 1:
			operacion.Suma(num1, num2);;
				break;

		case 2: 
			operacion.Resta(num1, num2);;
				break;
				
		case 3:
			operacion.Multiplicacion(num1, num2);;
				break;
				
		case 4:
			operacion.Division(num1, num2);
				break;
				
		default:
			System.out.println("Opcion invalida, ingrese otra.");
			break;
		}
	}
}
