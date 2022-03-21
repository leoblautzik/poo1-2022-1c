package arreglos;

public class Ejercicio1 {

	private int[] v;

	public Ejercicio1(int[] v) {
		this.v = v;
	}

	public String mostrarArreglo() {
		String s = "";
		for (int i = 0; i < v.length; i++) {
			s = s + v[i] + " ";
		}

		return s;
	}
	
	public String mostrarArregloInvertido() {
		String s = "";
		for (int i = v.length - 1; i >=0; i--) {
			s = s + v[i] + " ";
		}
		return s;
	}

	public static void main(String[] args) {

		int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		Ejercicio1 e1 = new Ejercicio1(v);
		System.out.println(e1.mostrarArreglo());
		System.out.println(e1.mostrarArregloInvertido());
		
		
		int [] a = {12, 56, -1, 5};
		
		Ejercicio1 e2 = new Ejercicio1(a);
		System.out.println(e2.mostrarArreglo());
		System.out.println(e2.mostrarArregloInvertido());
		
		

	}

}
