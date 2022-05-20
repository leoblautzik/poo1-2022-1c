package colecciones;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class PilaTest {
	
	Stack<Integer> pila = new Stack<Integer>();

	@Test
	public void test() {

		pila.push(5);
		pila.push(15);
		pila.push(52);
		pila.push(-5);
		pila.push(55);
		pila.push(2);

		assertEquals((Integer)2, pila.peek());
		assertFalse(pila.isEmpty());
		
		assertEquals((Integer)2, pila.pop());
		assertEquals((Integer)55, pila.pop());
		assertEquals((Integer)(-5), (pila.peek()));
	}

}
