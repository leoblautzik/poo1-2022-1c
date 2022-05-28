package geometria.parcialConSet;

public class DemoFigura {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(4);
		System.out.println(c.getArea());

		Figura tri = new Triangulo(4, 5);
		System.out.println(tri.getArea());
	}

}
