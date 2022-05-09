package spotofo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpotofoTest {

	@Test
	public void nuevaCancionTest() {
		Cancion c1 = new Cancion("Maluma", "Hawai", 3);
		assertNotNull(c1);
	}
	
	@Test
	public void nuevaPlayListTest() {
		Playlist p1 = new Playlist(5);
		assertNotNull(p1);
		assertEquals(0, p1.getCantidadDeCanciones());
	}
	
	@Test
	public void agregarCancionTest() {
		Playlist p1 = new Playlist(5);
		p1.agregarCancion("Maluma", "Hawai", 190);
		p1.agregarCancion("Bruno Mars", "Put on a smile", 255);
		p1.agregarCancion("Maluma", "Aloha", 241);
		Cancion esperado = new Cancion("Maluma", "Hawai", 190);
		Cancion obtenido = p1.cancionEnLaPosicion(1);
		assertEquals(esperado, obtenido);
	}
	@Test
	public void cancionesDeMalumaTest() {
		Playlist p1 = new Playlist(5);
		p1.agregarCancion("Maluma", "Aloha", 241);
		p1.agregarCancion("Maluma", "Hawai", 190);
		p1.agregarCancion("Bruno Mars", "Put on a smile", 255);
		Cancion [] esperado = {new Cancion("Maluma", "Hawai", 190), 
						       new Cancion("Maluma", "Aloha", 241)
						      };
		assertArrayEquals(esperado, p1.cancionesDelInterprete("Maluma"));
	}
	@Test
	public void cancionMasLargaTest() {
		Playlist p1 = new Playlist(5);
		p1.agregarCancion("Maluma", "Aloha", 241);
		p1.agregarCancion("Maluma", "Hawai", 190);
		p1.agregarCancion("Bruno Mars", "Put on a smile", 255);
		assertEquals(new Cancion("Bruno Mars", "Put on a smile", 255), p1.cancionMasLarga());
		
	}
	
	@Test(expected=Error.class)
	public void agregarCancionDeMasTest() {
		Playlist p1 = new Playlist(2);
		p1.agregarCancion("Maluma", "Aloha", 241);
		p1.agregarCancion("Maluma", "Hawai", 190);
		p1.agregarCancion("Bruno Mars", "Put on a smile", 255);
	}
	

}
