import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Cortazar {

	private TreeMap<String, Integer> palabras = new TreeMap<String, Integer>();

	public void agregarPalabra(String palabra) {
		if (palabras.containsKey(palabra)) {
			int contador = palabras.get(palabra) + 1;
			palabras.put(palabra, contador);
		} else
			palabras.put(palabra, 1);
	}

	public void leerArchivo(String archivo) {
		try {
			FileReader input = new FileReader(new File(archivo));
			BufferedReader bufInput = new BufferedReader(input);
			String line;

			line = bufInput.readLine();
			while (line != null) {
				String[] datos;
				datos = line.split(" ");
				for (String palabra : datos) {
					if (!palabra.equals(""))
						this.agregarPalabra(palabra);
				}

				line = bufInput.readLine();
			}
			bufInput.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void leerArchivo2(String archivo) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(archivo));
		
		while(sc.hasNext()) {
			String palabrita = sc.next();
			System.out.println(palabrita);
			this.agregarPalabra(palabrita);
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {

		Cortazar poema = new Cortazar();
		poema.leerArchivo2("/home/leoblau/cortazar.in");
		System.out.println(poema);

	}

	@Override
	public String toString() {
		return palabras.toString();
	}

}
