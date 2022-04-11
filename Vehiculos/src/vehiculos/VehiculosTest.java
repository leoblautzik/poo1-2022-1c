package vehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehiculosTest {

	@Test
	public void motoAsignarChoferTest() {
		Motocicleta moto = new Motocicleta();
		Persona cacho = new Persona();
		assertTrue(moto.asignarChofer(cacho));
		assertFalse(moto.asignarChofer(new Persona()));

	}
	
	@Test
	public void motoSubirAcompanianteTest() {
		Motocicleta moto = new Motocicleta();
		Persona cacho = new Persona();
		Persona lala = new Persona();
		assertTrue(moto.asignarChofer(new Persona()));
		assertTrue(moto.agregarAcompaniante(lala));
	}
	
	@Test
	public void motoNoPuedeCambiarChoferTest() {
		Motocicleta moto = new Motocicleta();
		Persona cacho = new Persona();
		Persona lala = new Persona();
		Persona pepe = new Persona();
		assertTrue(moto.asignarChofer(new Persona()));
		assertTrue(moto.agregarAcompaniante(lala));
		assertFalse(moto.cambiarChofer(pepe));
		
		
	}
	
	@Test
	public void motoPuedeCambiarChoferTest() {
		Motocicleta moto = new Motocicleta();
		Persona cacho = new Persona();
		Persona lala = new Persona();
		Persona pepe = new Persona();
		assertTrue(moto.asignarChofer(new Persona()));
		assertTrue(moto.agregarAcompaniante(lala));
		assertFalse(moto.cambiarChofer(pepe));
		moto.bajarAcompaniante();
		assertTrue(moto.cambiarChofer(pepe));
		
		
	}

}
