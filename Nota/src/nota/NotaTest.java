package nota;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class NotaTest {

	@Test
	public void constructorTest(){
		Nota notita = new Nota();
		Assert.assertNotNull(notita);
	}
	@Test
	public void valorTest() {
		Nota notita = new Nota(4);
		int esperado = 4;
		int obtenido = notita.obtenerValor();
		Assert.assertEquals(esperado, obtenido);
	}
	@Test
	public void aprobadoTest() {
		Nota notita = new Nota(4);
		Assert.assertTrue(notita.aprobado());
	}
	@Test
	public void noAprobadoTest() {
		Nota notita = new Nota(3);
		Assert.assertFalse(notita.aprobado());
	}
	
	@Test
	public void desaprobadoTest() {
		Nota notita = new Nota(3);
		Assert.assertTrue(notita.desaprobado());
	}
	
	@Test
	public void saca11yNoApruebaTest() {
		Nota notita = new Nota(11);
		Assert.assertFalse(notita.aprobado());
	}
	
	
	@Test
	public void sacaCeroTest() {
		Nota notita = new Nota(0);
		Assert.assertTrue(notita.desaprobado());
	}
	
	@Test
	public void promocionaCon7Test() {
		Nota notita = new Nota(7);
		Assert.assertTrue(notita.promocion());
	}
	
	@Test
	public void promocionaCon10Test() {
		Nota notita = new Nota(10);
		Assert.assertTrue(notita.promocion());
	}
	
	@Test
	public void recuperaYpromocionaTest() {
		Nota notita = new Nota(2);
		notita.recuperar(9);
		Assert.assertTrue(notita.promocion());
	}

}
