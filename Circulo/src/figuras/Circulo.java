package figuras;

public class Circulo {

	private double radio;
	private Punto centro;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio, Punto c) {
		this.radio = radio;
		this.centro = c;
	}

	public double obtenerPerimetro() {
		return this.radio * 2 * Math.PI;
	}

	public double obtenerArea() {
		return Math.PI * Math.pow(radio, 2);

	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + "]";
	}

	public void desplazar(int i, int j) {
		this.centro.desplazar(i, j);

	}

	public boolean seIntersectaCon(Circulo c) {

		if (this.centro.distancia(c.centro) < this.radio + c.radio)
			return (Math.abs(this.radio - c.radio) <= this.centro.distancia(c.centro));

		return (this.radio + c.radio) >= this.centro.distancia(c.centro);

	}

}
