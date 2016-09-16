import java.util.HashMap;

public class Principal3 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> nombres = new HashMap<Integer, String>();
		
		nombres.put(1234, "Juan Perez");
		nombres.put(5423, "Maria Lopez");
		nombres.put(7644, "Lucas Orlando");
		
		for(java.util.Map.Entry<Integer, String> row : nombres.entrySet()){
			System.out.println(row.getKey() + " - " + row.getValue());
		}
		
		String nombreRecuperado = nombres.get(5423);
		System.out.println(nombreRecuperado);
	}
	

}