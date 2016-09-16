import static org.junit.Assert.*;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.junit.Test;

import Guerrero.Guerrero;
import Guerrero.Humano;
import Guerrero.Sayayin;

public class TestGuerrero {
	
	private int fuerzaEjemplo = 50;
	private int vidaEjemplo = 500;

	@Test
	public void humanoTieneFuerza() {
		Guerrero krilin = new Humano(fuerzaEjemplo, vidaEjemplo);
		assertEquals(krilin.getFuerza(),50);
	}
	
	@Test
	public void sayayinTieneFuerza() {
		Guerrero napa = new Sayayin(fuerzaEjemplo, vidaEjemplo);
		assertEquals(napa.getFuerza(),50);
	}
	
	@Test
	public void humanoTieneVida() {
		Guerrero yamcha = new Sayayin(fuerzaEjemplo, vidaEjemplo);
		assertEquals(yamcha.getVida(), 500);
	}
	
	@Test
	public void sayayinTieneVida() {
		Guerrero goku = new Sayayin(fuerzaEjemplo, vidaEjemplo);
		assertEquals(goku.getVida(), 500);
	}
	
	@Test
	public void guerreroMuere(){
		Guerrero krilin = new Humano(fuerzaEjemplo, vidaEjemplo);
		krilin.setVida(0);
		assertTrue(krilin.estaMuerto());
	}
	
	@Test
	public void guerrerovive(){
		Guerrero krilin = new Humano(fuerzaEjemplo, vidaEjemplo);
		assertTrue(!krilin.estaMuerto());
	}
	
	@Test
	public void guerreroBloquea() {
		Guerrero goku = new Sayayin(fuerzaEjemplo, vidaEjemplo);
		
		assertTrue(goku.Bloquea());
		
	}
}
