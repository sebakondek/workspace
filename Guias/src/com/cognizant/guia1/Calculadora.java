package com.cognizant.guia1;

public class Calculadora {

	float result;
	
	public void Suma(float num1, float num2) {
		
		result = num1 + num2;
		System.out.println("La suma es " + result);	
	}
	
	public void Resta(float num1, float num2) {
		
		result = num1 - num2;
		System.out.println("La resta es " + result);
	}
	
	public void Multiplicacion(float num1, float num2) {
		
		result = num1 * num2;
		System.out.println("La multiplicacion es " + result);	
	}
	
	public void Division(float num1, float num2) {
		
		if(num2 != 0){
			
			result = num1 / num2;
			System.out.println("La division es " + result);	
		} else {
			System.out.println("No se puede dividir por 0");
		}
	}
		
}
