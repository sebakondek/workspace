import static org.junit.Assert.*;

import org.junit.Test;

public class TESTcalculadora {

	@Test
	public void testSumar() {
		Calculadora calculadora = new Calculadora();
		int total = calculadora.Sumar(1, 1);
		assertEquals("1 + 1 tiene que ser = 2", 2, total);
	}

	@Test
	public void testRestar() {
		Calculadora calculadora = new Calculadora();
		int total = calculadora.Restar(1, 1);
		assertEquals("1 - 1 tiene que ser = 0", 0, total);
	}

}
