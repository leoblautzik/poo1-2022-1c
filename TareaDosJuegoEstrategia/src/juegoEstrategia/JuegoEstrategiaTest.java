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
		assertEquals(190, conan.getSalud(),0);
		
		while(rambo.puedeAtacar(conan)) {
			rambo.atacar(conan);
		}
		
		assertEquals(100, conan.getSalud(),0);
		assertEquals(0, rambo.getEnergia());
		
		assertTrue(conan.puedeAtacar(rambo));
				
	}
	
	@Test
	public void soldadoConEscudoTest() {
		Unidad rambo = new Soldado(new Punto(1,1));
		Unidad conan = new Soldado(new Punto(1,1));
		System.out.println(rambo);	
		assertEquals(200, rambo.getSalud(), 0);
		assertTrue(conan.puedeAtacar(rambo));
		conan.atacar(rambo);
		conan.atacar(rambo);
		rambo = new Escudo(rambo);
		conan.atacar(rambo);
		System.out.println(rambo);
		rambo = new Escudo(rambo);
		conan.atacar(rambo);
		System.out.println(rambo);
				
	}

}
