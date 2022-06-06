package generics;

import java.util.LinkedList;

public class PilaGLL<T> implements Pila<T>{
	
	private LinkedList<T> pila;
	
	public PilaGLL() {
		this.pila = new LinkedList<T>();
	}
	
	
	@Override
	public void push(T dato) {
		pila.addFirst(dato);
	}


	@Override
	public T pop() {
		try {
			if(!this.isEmpty()) {
				return this.pila.removeFirst();
			}
			else
				throw new PilaVaciaException();
		}
		catch (PilaVaciaException pve) {
			System.err.println(pve.getMessage());
		}
		return null;
	}

	@Override
	public T peek() {
		try {
			if(!this.isEmpty()) {
				return this.pila.getFirst();
			}
			else
				throw new PilaVaciaException();
		}
		catch (PilaVaciaException pve) {
			System.err.println(pve.getMessage());
			
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return pila.isEmpty();
	}


	@Override
	public String toString() {
		return "[" + pila + "]";
	}
	
	

}
