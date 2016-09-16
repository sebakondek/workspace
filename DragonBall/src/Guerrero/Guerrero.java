package Guerrero;

import java.io.Console;
import java.util.Random;

public class Guerrero {

	private int fuerza;
	private int vida;
	public boolean bloquea;

	public Guerrero(int fuerzaEjemplo, int vidaEjemplo) {
	
		fuerza = fuerzaEjemplo;
		vida = vidaEjemplo;
	}
	
	public boolean Bloquea() {
		
		float chancebloqueo = (float) Math.random();
		if(chancebloqueo <= 0.2){
			System.out.println(chancebloqueo);
			return true;
		}
		System.out.println(chancebloqueo);
		return false;
	}
	

	public int getFuerza() {
		return fuerza;
	}
	
	public int getVida() {
		return vida;
	}


	public boolean estaMuerto() {
		if(vida > 0)
			return false;
		return true;
	}


	public void setVida(int i) {
		vida = i;
	}

	
}
