package figuras;

public class PrueboCirculo {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(0,0);
		System.out.println(p1);
		p1.desplazar(-2, 5);
		System.out.println(p1);

		
		Punto centroDeCirculito = new Punto(0,0);
		Punto centroDeCirculon = new Punto(2,7);
		
		
		Circulo circulito = new Circulo(2, centroDeCirculito);
		System.out.println(circulito);
		circulito.desplazar(3,4);
		System.out.println("Circulito desplazado: " + circulito);
		
		
		
		System.out.println("Area = " + circulito.obtenerArea());
		System.out.println("Perimetro = " + circulito.obtenerPerimetro());
	
		Circulo circulon = new Circulo(10,centroDeCirculon );
		System.out.println(circulon);
		
		System.out.println("Area = " + circulon.obtenerArea());
		System.out.println("Perimetro = " + circulon.obtenerPerimetro());
	
	}

}
