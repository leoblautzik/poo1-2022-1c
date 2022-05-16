package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoConjuntos {
	
	public static void main(String[] args) {
		
		Set<Punto> conjunto = new HashSet<Punto>();
		
		conjunto.add(new Punto(-1,1));
		conjunto.add(new Punto(-1,-1));
		conjunto.add(new Punto(1,-1));
		conjunto.add(new Punto(1,1));
		conjunto.add(new Punto(1,1));
		
		System.out.println(conjunto);
		
	}

}
