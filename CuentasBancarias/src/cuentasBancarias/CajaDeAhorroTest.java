package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void depositarTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Leo");
		assertEquals(0, ca.getSaldo(), 0);
		ca.depositar(1000);
		assertEquals(1000, ca.getSaldo(), 0);
		assertEquals("Leo", ca.getTitular());

	}

	@Test
	public void extraerMenosDelSaldoTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Leo");
		ca.depositar(2000);
		assertEquals(2000, ca.getSaldo(), 0);
		ca.extraer(500);
		assertEquals(1500, ca.getSaldo(), 0);

	}

	@Test
	public void extraerMasDelSaldoTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Leo");
		ca.depositar(2000);
		assertEquals(2000, ca.getSaldo(), 0);
		ca.extraer(5000);
		assertEquals(2000, ca.getSaldo(), 0);

	}

	@Test
	public void extraerJustitoTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Leo");
		ca.depositar(20010.78);
		assertEquals(20010.78, ca.getSaldo(), 0);
		ca.extraer(20010.78);
		assertEquals(0, ca.getSaldo(), 0);

	}
	
	@Test
	public void transferirSaldoSuficienteTest() {
		CajaDeAhorro origen = new CajaDeAhorro("Leo");
		CajaDeAhorro destino = new CajaDeAhorro("Pepe");
		origen.depositar(10000);
		origen.transferir(destino, 6000);
		assertEquals(4000, origen.getSaldo(), 0);
		assertEquals(6000, destino.getSaldo(), 0);
		
	}
	
	@Test
	public void transferirSaldoINSuficienteTest() {
		CajaDeAhorro origen = new CajaDeAhorro("Leo");
		CajaDeAhorro destino = new CajaDeAhorro("Pepe");
		origen.depositar(20010.78);
		origen.transferir(destino, 20010.78);
		assertEquals(0, origen.getSaldo(), 0);
		assertEquals(20010.78, destino.getSaldo(), 0);
		
	}
	
	@Test
	public void transferirSaldoJustoTest() {
		CajaDeAhorro origen = new CajaDeAhorro("Leo");
		CajaDeAhorro destino = new CajaDeAhorro("Pepe");
		origen.depositar(1000);
		origen.transferir(destino, 6000);
		assertEquals(1000, origen.getSaldo(), 0);
		assertEquals(0, destino.getSaldo(), 0);
		
	}

}
