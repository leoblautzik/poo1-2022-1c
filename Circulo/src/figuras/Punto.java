package figuras;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public void desplazar(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	
	
	

}
