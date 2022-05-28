package geometria;


public class Rectangulo extends Figura {

	private Punto superiorDerecho;

	public Rectangulo(Punto inferiorIzquierdo, Punto superiorDerecho) {
		super(inferiorIzquierdo);
		this.superiorDerecho = superiorDerecho;
	}

	public Rectangulo(Punto ii, double base, double altura) {
		super(ii);
		this.superiorDerecho = new Punto(ii.getX() + base, ii.getY() + altura);
	}

	@Override
	public String toString() {
		return "Rectangulo [superiorDerecho=" + superiorDerecho + "]";
	}

	@Override
	public Double getArea() {
		double base = Math.abs(super.getP().getX() - this.superiorDerecho.getX());
		double altura = Math.abs(super.getP().getY() - this.superiorDerecho.getY());
		return base * altura;
	}

	@Override
	public void mover(double deltaX, double deltaY) {
		super.getP().mover(deltaX, deltaY);
		this.superiorDerecho.mover(deltaX, deltaY);
		
	}

}
