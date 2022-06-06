package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DemoEntrenadores {

	public static void main(String[] args) {

		HashMap<String, List<String>> entrada = new HashMap<String, List<String>>();
		List<String> bielsa = new ArrayList<String>();
		bielsa.add("juan");
		bielsa.add("alberto");
		List<String> alvarez = new ArrayList<String>();
		alvarez.add("tom");
		alvarez.add("alberto");
		alvarez.add("vero");

		entrada.put("bielsa", bielsa);
		entrada.put("alvarez", alvarez);

		TreeMap<String, List<String>> salida = new TreeMap<String, List<String>>();

		for (Entry<String, List<String>> ce : entrada.entrySet()) {
			String entrenador = ce.getKey();
			List<String> listaSocios = ce.getValue();
			for (String cadaSocio : listaSocios) {
				if (salida.containsKey(cadaSocio)) {
					List<String> listaEntrenadores = salida.get(cadaSocio);
					listaEntrenadores.add(entrenador);
				} else {
					List<String> aux = new ArrayList<String>();
					aux.add(entrenador);
					salida.put(cadaSocio, aux);
				}
			}
		}

		System.out.println(salida);

	}

}
