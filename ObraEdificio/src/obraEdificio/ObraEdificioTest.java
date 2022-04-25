package obraEdificio;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObraEdificioTest {

	@Test
	public void constructorTest() {
		ObraEdificio oe = new ObraEdificio(100);
		assertNotNull(oe);
		Integer esperado = 100;
		Integer obtenido = oe.restaPorCimentar();
		assertEquals(esperado, obtenido);
	}
	
	@Test(expected = Error.class)
	public void constructorNegativoTest() {
		ObraEdificio oe = new ObraEdificio(-100);
		
	}
	
	@Test(expected = Error.class)
	public void constructorCeroTest() {
		ObraEdificio oe = new ObraEdificio(0);
		
	}
	
	@Test
	public void cimentandoMenosTest() {
		ObraEdificio oe = new ObraEdificio(100);
		oe.cimentando(60);
		assertEquals((Integer)40, oe.restaPorCimentar());
		
	}
	
	@Test
	public void cimentandoJustoTest() {
		ObraEdificio oe = new ObraEdificio(100);
		oe.cimentando(100);
		assertEquals((Integer)0, oe.restaPorCimentar());
		
	}
	
	@Test
	public void cimentandoJustoEnTresEtapasTest() {
		ObraEdificio oe = new ObraEdificio(100);
		oe.cimentando(30);
		assertEquals((Integer)70, oe.restaPorCimentar());
		oe.cimentando(30);
		assertEquals((Integer)40, oe.restaPorCimentar());
		oe.cimentando(40);
		assertEquals((Integer)0, oe.restaPorCimentar());
	}
	
	@Test
	public void cimentandoDeMasTest() {
		ObraEdificio oe = new ObraEdificio(100);
		oe.cimentando(30);
		assertEquals((Integer)70, oe.restaPorCimentar());
		oe.cimentando(80);
		assertEquals((Integer)70, oe.restaPorCimentar());
	}
	
	@Test
	public void cimentandoTerminadoEnTresEtapasTest() {
		ObraEdificio oe = new ObraEdificio(100);
		oe.cimentando(30);
		assertEquals((Integer)70, oe.restaPorCimentar());
		oe.cimentando(30);
		assertEquals((Integer)40, oe.restaPorCimentar());
		oe.cimentando(40);
		assertEquals((Integer)0, oe.restaPorCimentar());
		assertTrue(oe.terminado());
	}

}
