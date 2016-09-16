import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		File file = new File("datos.csv");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write("id, nombre, apellido, edad\n");
			fw.write("1,Juan,Perez,43\n");
			fw.write("2,Maria,Lopez,31\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
