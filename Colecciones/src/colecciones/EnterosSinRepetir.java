package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EnterosSinRepetir {
/*
	Escribir un método que almacena en una lista de 100 números aleatorios entre 
	1 y 100, y escribir métodos que resuelvan los siguientes puntos:
	a)Mostrar en pantalla los elementos de la lista sin repetir.
	b)Mostrar en pantalla los elementos de la lista sin repetir y 
	en orden ascendente.
	c) ídem pero en órden descendente;

	(int) (aleatorio * 100) + 1;


*/
	ArrayList<Integer> enteros;
	
	public EnterosSinRepetir() {
		enteros = new ArrayList<Integer>();
		for(int i=0; i<100; i++)
			enteros.add((int) (Math.random() * (100 + 100)) - 100);
		
	}
	
	
	public Set<Integer> sinrepetir(){
		Set<Integer> conjunto = new HashSet<Integer>();
		for(Integer i : this.enteros)
			conjunto.add(i);
		return conjunto;
			
	}
	
	public Set<Integer> sinrepetirOrdenadoAscendente(){
		Set<Integer> conjunto = new TreeSet<Integer>();
		for(Integer i : this.enteros)
			conjunto.add(i);
		return conjunto;
			
	}
	public Set<Integer> sinrepetirOrdenadoDescendente(){
		Set<Integer> conjunto = new TreeSet<Integer>(Collections.reverseOrder());
		for(Integer i : this.enteros)
			conjunto.add(i);
		return conjunto;
			
	}
	
	public static Set<Integer> obtenerLosNmasPequeños(Set<Integer> s, int n){
		Set<Integer> c = new TreeSet<Integer>();
		int contador = 0;
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext() && contador < n) {
			c.add(itr.next());
			contador++;
		}
		
		return c;
	}
	
	
	public static void main(String[] args) {
	
		EnterosSinRepetir esr = new EnterosSinRepetir();
		Set<Integer> sinRepetir;
		sinRepetir = esr.sinrepetirOrdenadoDescendente();
		
		for(Integer enterito : sinRepetir) {
			System.out.println(enterito);
		}
		
		System.out.println(obtenerLosNmasPequeños(sinRepetir, 5));
				

	}
	
}
