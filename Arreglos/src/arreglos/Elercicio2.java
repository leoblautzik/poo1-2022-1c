package arreglos;

import java.util.Arrays;

public class Elercicio2 {

	public static void main(String[] args) {
		
		String [] palabras = {"hola", "como", "estas", "te saludo"};
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
			
		}
		
		Arrays.sort(palabras);
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
			
		}
		
		
		
		
	}

}
