package nota;

public class PrueboNota {

	public static void main(String[] args) {
		
		Nota notita = new Nota(4);
		System.out.println(notita.obtenerValor());
		System.out.println(notita.aprobado());
		System.out.println(notita.desaprobado());
		notita.recuperar(3);
		
		System.out.println(notita.obtenerValor());
		System.out.println(notita.aprobado());
		System.out.println(notita.desaprobado());
		
	}

}
