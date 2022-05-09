package juegoEstrategia;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoEstrategiaTest {

	@Test
	public void soldadosTest() {
		Soldado rambo = new Soldado(new Punto(1,1));
		Soldado conan = new Soldado(new Punto(1,1));
		rambo.atacar(conan);
		
		assertEquals(90, rambo.getEnergia());
		assertEquals(190, conan.getSalud());
		
		while(rambo.puedeAtacar(conan)) {
			rambo.atacar(conan);
		}
		
		assertEquals(100, conan.getSalud());
		assertEquals(0, rambo.getEnergia());
		
		assertTrue(conan.puedeAtacar(rambo));
		
		
	}

}
