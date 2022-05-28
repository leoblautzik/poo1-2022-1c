package geometria;

public class Triangulo extends Figura {

	private Punto v2, v3;
	
	public Triangulo(Punto v1, Punto v2, Punto v3) {
		super(v1);
		this.v2 = v2;
		this.v3 = v3;
	}

	@Override
	public Double getArea() {
		// La manera de calcular el area de un triángulo
		// definido por sus tres vertices sería así(investigar):
		return Math.abs((super.getP().getY() + v2.getX() * v3.getY() + v3.getX() * super.getP().getY())
				- (super.getP().getX() * v3.getY() + v3.getX() * v2.getY() + v2.getX() * super.getP().getY())) / 2;

	}

	@Override
	public void mover(double deltaX, double deltaY) {
		super.getP().mover(deltaX, deltaY);
		this.v2.mover(deltaX, deltaY);
		this.v3.mover(deltaX, deltaY);
	}

	@Override
	public String toString() {
		return "Triangulo [v2=" + v2 + ", v3=" + v3 + "]";
	}

}
