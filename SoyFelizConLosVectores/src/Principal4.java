import java.util.HashSet;

public class Principal4 {

	public static void main(String[] args) {
		
		HashSet<Persona> personas = new HashSet<Persona>();
		personas.add(new Persona(4507, "Juan"));
		personas.add(new Persona(4508, "Maria"));
		personas.add(new Persona(4507, "Juan"));
		
	}

}
