package geometria;

import java.util.Objects;

public class Punto implements Comparable<Punto>, Movible{
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	private Double x;
	private Double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	

	public double getY() {
		return y;
	}

	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public Double distanciaAlOrigen() {
		return Math.hypot(x, y);
	}

	@Override
	public int compareTo(Punto o) {
		if(this.distanciaAlOrigen().equals(o.distanciaAlOrigen())) {
				if(this.x.equals(o.x)) {
					return this.y.compareTo(o.y);
				}
				else return this.x.compareTo(o.x);
		}
		else return this.distanciaAlOrigen().compareTo(o.distanciaAlOrigen()); 
			
		
	}

	@Override
	public void mover(double deltaX, double deltaY) {
		this.x += x;
		this.y += y;
		
	}

	
	
	

}
