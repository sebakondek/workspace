import java.util.HashSet;
import java.util.TreeSet;

public class Principal2 {

	public static void main(String[] args) {

		TreeSet<String> nombres = new TreeSet<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Maria");
		nombres.add("Juan");
		
		for (String nombre : nombres) {
			System.out.println("Nombre: " + nombre);
		}
	}

}
