import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Guerrero.Guerrero;
import Guerrero.Sayayin;

public class TestSayayin {

	@Test
	public void esSayayin() {
		Guerrero goku = new Sayayin(0, 0);
		assertTrue(goku instanceof Guerrero);
	}
}
