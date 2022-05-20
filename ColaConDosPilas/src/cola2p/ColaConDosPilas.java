package cola2p;

import java.util.Stack;

public class ColaConDosPilas<T> implements QueueInterface<T> {

	private Stack<T> pilaA = new Stack<T>();
	private Stack<T> pilaB = new Stack<T>();
		
	@Override
	public boolean isEmpty() {
		return this.pilaA.isEmpty() && this.pilaB.isEmpty();
	}

	@Override
	public void enqueue(T newItem) {
		this.pilaA.push(newItem);
	}

	@Override
	/*
	 * cada vez que se desencola una elemento se lo extrae del tope de la pila B, si
	 * la pila B está vacía entonces se desapilan todos los elementos de la pila A y
	 * se los apila en B
	 */
	public T dequeue() {
		if (this.isEmpty())
			throw new Error("Cola vacía");

		if (pilaB.isEmpty())
			pasarDeAaB();
		return pilaB.pop();
	}

	private void pasarDeAaB() {
		while (!pilaA.isEmpty())
			pilaB.push(pilaA.pop());
	}

	@Override
	public T peek() {
		if (this.isEmpty())
			throw new Error("Cola vacía");
		
		if (pilaB.isEmpty())
			pasarDeAaB();
		return pilaB.peek();
		
	}
	
	

}
