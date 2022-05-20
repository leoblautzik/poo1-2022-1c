package colecciones;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListaEnOtraListaTest {
	
	List<Integer> l1 = new ArrayList<Integer>();
	List<Integer> l2 = new ArrayList<Integer>();
	
	List<String> l3 = new ArrayList<String>();
	List<String> l4 = new ArrayList<String>();

	@Test
	public void noEsSublistaTest() {
		Integer [] v1 = {22, 14, 6}; 
		Integer [] v2 = {39, 22, 12, 14, 6, 39, 41, 17, 3, 11, 73, 81};
		l1.addAll(Arrays.asList(v1));
		l2.addAll(Arrays.asList(v2));
		assertFalse(ListaEnOtraLista.esSublista(l2, l1));
		//containsAll no nos sirve para resolver éste problema
		assertTrue(l2.containsAll(l1));
	}	
		
	@Test
	public void sublistaAlPrincipioTest() {
		Integer [] v1 = {22, 14, 6}; 
		Integer [] v2 = {22, 14, 6, 39, 41, 17, 3, 11, 73, 81};
		l1.addAll(Arrays.asList(v1));
		l2.addAll(Arrays.asList(v2));
		assertTrue(ListaEnOtraLista.esSublista(l2, l1));
	}
	
	@Test
	public void sublistaAlFinalTest() {
		Integer [] v1 = {22, 14, 6}; 
		Integer [] v2 = {39, 41, 17, 3, 11, 73, 81, 22, 14, 6};
		l1.addAll(Arrays.asList(v1));
		l2.addAll(Arrays.asList(v2));
		assertTrue(ListaEnOtraLista.esSublista(l2, l1));
	}
	
	@Test
	public void listasIgualesTest() {
		Integer [] v1 = {22, 14, 6}; 
		Integer [] v2 = {39, 41, 17, 3, 11, 73, 81, 22, 14, 6};
		l1.addAll(Arrays.asList(v1));
		l2.addAll(Arrays.asList(v2));
		assertTrue(ListaEnOtraLista.esSublista(l1, l1));
		assertTrue(ListaEnOtraLista.esSublista(l2, l2));
	}
	
	@Test
	public void listasDeStringTest() {
		String [] v3 = {"Hola", "como", "estas"}; 
		String [] v4 = {"Algo", "Hola", "como", "estas", "algo mas"};
		l3.addAll(Arrays.asList(v3));
		l4.addAll(Arrays.asList(v4));
		assertTrue(ListaEnOtraLista.esSublista(l4, l3));
	}
	
}
