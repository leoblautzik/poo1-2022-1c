package cola2p;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cola2PTest {

	@Test
	public void test() {
		ColaConDosPilas<Character> cola2p = new ColaConDosPilas<Character>();
		cola2p.enqueue('A');
		cola2p.enqueue('R');
		cola2p.enqueue('X');
		cola2p.enqueue('Y');
		Character esperado = 'A';
		assertEquals(esperado, cola2p.dequeue());
		esperado = 'R';
		assertEquals(esperado, cola2p.dequeue());
		esperado = 'X';
		assertEquals(esperado, cola2p.dequeue());
		cola2p.enqueue('B');
		esperado = 'Y';
		assertEquals(esperado, cola2p.dequeue());
		esperado = 'B';
		assertEquals(esperado, cola2p.dequeue());

	
	}

}
