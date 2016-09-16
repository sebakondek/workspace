import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Guerrero.Guerrero;
import Guerrero.Namekiano;

public class TestNamekiano {

	@Test
	public void esNamekiano() {
		Guerrero picollo = new Namekiano(0, 0);
		assertTrue(picollo instanceof Guerrero);
	}
}
