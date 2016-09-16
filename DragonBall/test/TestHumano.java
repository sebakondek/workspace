import static org.junit.Assert.*;

import org.junit.Test;

import Guerrero.Guerrero;
import Guerrero.Humano;
import Guerrero.Namekiano;
import Guerrero.Sayayin;

public class TestHumano {

	@Test
	public void esHumano() {
		Guerrero yamcha = new Humano(0, 0);
		assertTrue(yamcha instanceof Guerrero);
	}
	
}
