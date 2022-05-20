package colecciones;

import java.util.List;

public class ListaEnOtraLista {

	/*
	 * Escriba un método que devuelva true si una lista de enteros es sublista de
	 * otra. Por ejemplo: si tenemos las listas L1 = [22, 14, 6] y L2 = [39, 41, 17,
	 * 22, 14, 6, 3, 11, 73, 81] entonces el método devolverá true porque L1 es una
	 * sublista de L2. Pero si tenemos otra lista L3 = [39, 41, 22, 17, 14, 3, 11,
	 * 73, 6, 81], vemos que L1 no es sublista de L3 por lo que el método llamado
	 * con L1 y L3 debe devolver false.
	 */

	public static <T> boolean esSublista(List<T> lista, List<T> listita) {
		if (listita.size() > lista.size())
			return false;

		for (int i = 0; i < (lista.size() - listita.size() + 1); i++) {
			//System.out.println(lista.subList(i, i + listita.size()));
			if (lista.subList(i, i + listita.size()).equals(listita))
				return true;
		}
		return false;
		
		
	}

}
