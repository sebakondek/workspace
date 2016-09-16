import java.lang.reflect.Array;
import java.util.*;

public class Principal1 {

	public static void main(String[] args) {
		
/*		String[] nombres = new String[3];
		nombres[0] = "Juan";
		nombres[1] = "Maria";
		nombres[2] = "Lucas";
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		String[] nombres2 = {"Juan", "Maria", "Lucas"};
		for (String nombre : nombres2) {
			System.out.println(nombre);
		}
	
	*/

		LinkedList<String> nombres = new LinkedList<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Maria");
		
		for (String nombre : nombres) {
			System.out.println("Nombre: " + nombre);
		}
		
		System.out.println("**************");
		
		nombres.add(1, "Lucas");
		nombres.remove(2);
		String nombreRecuperado = nombres.get(0);
		boolean nombreEncontrado = nombres.contains("Juan");
		
		for (String nombre : nombres) {
			System.out.println("Nombre: " + nombre);
		}
		
		System.out.println(nombreRecuperado);
		System.out.println(nombreEncontrado);
		System.out.println("**************");
	}
}
