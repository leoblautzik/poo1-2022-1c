package geometria;

import java.util.Arrays;


public class DemoGeometria {

	public static void main(String[] args) {

		Punto p1 = new Punto(-2, 3);
		Punto p2 = new Punto(3, -1);
		Punto p3 = new Punto(5, 6);

		Figura unTriangulo = new Triangulo(p1, p2, p3);
		Figura unCirculo = new Circulo(new Punto(1, 1), 4);
		Figura unCuadrado = new Cuadrado(new Punto(3, -3), 2);
		Elipse unaElipse = new Elipse(p1, 2, 0.5);

		Figura figuras[] = new Figura[3];
		figuras[0] = unTriangulo;
		figuras[1] = unCirculo;
		figuras[2] = unCuadrado;
		System.out.println("Listar array--------------------------------------");

		for (Figura cu : figuras)
			System.out.println(cu.getArea());

		Arrays.sort(figuras);
		System.out.println("Listar array ordenado por área -------------------");

		for (Figura cu : figuras)
			System.out.println(cu.getArea());

	}

}
