package tarjetaBaja;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarjetaBajaTest {

	@Test
	public void constructorTest() {
		TarjetaBaja tb = new TarjetaBaja(5.0);
		assertNotNull(tb);
		double esperado = 5.0;
		double obtenido = tb.obtenerSaldo();
		assertEquals(esperado, obtenido,0.01);
		
	}
	
	@Test
	public void cargarTest() {
		TarjetaBaja tb = new TarjetaBaja(5.0);
		tb.cargar(10);
		assertEquals(15.0, tb.obtenerSaldo(), 0.01);
		
	}
	
	@Test
	public void pagarViajeEnColectivoMeSobraTest() {
		TarjetaBaja tb = new TarjetaBaja(5.0);
		tb.pagarViajeEnColectivo();
		assertEquals(3.75, tb.obtenerSaldo(), 0.01);
			
	}
	@Test
	public void pagarViajeEnColectivoMeAlcanzaJustoTest() {
		TarjetaBaja tb = new TarjetaBaja(1.25);
		tb.pagarViajeEnColectivo();
		assertEquals(0, tb.obtenerSaldo(), 0.01);
		assertEquals(1,tb.contarViajesEnColectivo());
			
	}
	
	@Test
	public void pagarViajeEnColectivoNoMeAlcanzaTest() {
		TarjetaBaja tb = new TarjetaBaja(1.25);
		tb.pagarViajeEnColectivo();
		tb.pagarViajeEnColectivo();
		assertFalse(tb.pagarViajeEnColectivo());
			
	}
	
	@Test
	public void pagarViajeEnSubteMeSobraTest() {
		TarjetaBaja tb = new TarjetaBaja(5.0);
		tb.pagarViajeEnSubte();
		assertEquals(2.5, tb.obtenerSaldo(), 0.01);
			
	}
	
	@Test
	public void pagarViajeEnSubteMeAlcanzaJustoTest() {
		TarjetaBaja tb = new TarjetaBaja(5.0);
		tb.pagarViajeEnSubte();
		tb.pagarViajeEnSubte();
		assertEquals(0, tb.obtenerSaldo(), 0.01);
		assertEquals(2, tb.contarViajesEnSubte());
			
	}

}
