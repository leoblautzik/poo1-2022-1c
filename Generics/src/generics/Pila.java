package generics;

public interface Pila<T> {
	
	public void push(T dato);
	public T pop();
	public T peek();
	public boolean isEmpty();

}
