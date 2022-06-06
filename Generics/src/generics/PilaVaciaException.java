package generics;

public class PilaVaciaException extends Exception {

	private static final long serialVersionUID = 1L;

	public PilaVaciaException() {
		super("La pila está vacía");
	}
}
