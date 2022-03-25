package figuras;

public class PrueboCirculo {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(5, new Punto(0,0));
		Circulo c2 = new Circulo(5, new Punto(4,0));
		System.out.println("Tiene que dar true -> " + c1.seIntersectaCon(c2));
		
		c1 = new Circulo(5, new Punto(0,0));
		c2 = new Circulo(5, new Punto(10,0));
		System.out.println("Tiene que dar true -> " + c1.seIntersectaCon(c2));
		
		
		c1 = new Circulo(5, new Punto(0,0));
		c2 = new Circulo(4, new Punto(10,0));
		System.out.println("Tiene que dar false -> " + c1.seIntersectaCon(c2));
		
		c1 = new Circulo(5, new Punto(0,0));
		c2 = new Circulo(1, new Punto(-2,0));
		System.out.println("Tiene que dar false -> " + c1.seIntersectaCon(c2));
		
		c1 = new Circulo(5, new Punto(0,0));
		c2 = new Circulo(1, new Punto(4,0));
		System.out.println("Tiene que dar true -> " + c1.seIntersectaCon(c2));
		
		c1 = new Circulo(5, new Punto(0,0));
		c2 = new Circulo(1, new Punto(4.5,0));
		System.out.println("Tiene que dar true -> " + c1.seIntersectaCon(c2));
		
//		Punto p1 = new Punto(0,0);
//		System.out.println(p1);
//		p1.desplazar(-2, 5);
//		System.out.println(p1);
//
//		
//		Punto centroDeCirculito = new Punto(0,0);
//		Punto centroDeCirculon = new Punto(2,7);
//		
//		
//		Circulo circulito = new Circulo(2, centroDeCirculito);
//		System.out.println(circulito);
//		circulito.desplazar(3,4);
//		System.out.println("Circulito desplazado: " + circulito);
//		
//		
//		
//		System.out.println("Area = " + circulito.obtenerArea());
//		System.out.println("Perimetro = " + circulito.obtenerPerimetro());
//	
//		Circulo circulon = new Circulo(10,centroDeCirculon );
//		System.out.println(circulon);
//		
//		System.out.println("Area = " + circulon.obtenerArea());
//		System.out.println("Perimetro = " + circulon.obtenerPerimetro());
//	
	}

}
