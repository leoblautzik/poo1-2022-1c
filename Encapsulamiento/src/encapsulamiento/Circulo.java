package encapsulamiento;

public class Circulo {

	private double radio;

	public Circulo(double radio) {
		if(radio <= 0)
			throw new Error("El radio no puede ser negativo ni cero");
		this.radio = radio;
	}


	public double obtenerPerimetro() {
		return this.radio * 2 * Math.PI;
	}

	public double obtenerArea() {
		return Math.PI * Math.pow(radio, 2);

	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}


}
