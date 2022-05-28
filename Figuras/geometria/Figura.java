package geometria;

import java.util.Objects;

public abstract class Figura implements Comparable<Figura>, Movible {

	private Punto p;

	public Punto getP() {
		return p;
	}

	public Figura(Punto p) {
		this.p = p;
	}

	abstract public Double getArea();

	@Override
	public int compareTo(Figura otra) {
//		if (this.getArea() < otra.getArea())
//			return -1;
//		else if (this.getArea() > otra.getArea())
//			return 1;
//		return 0;

		// return this.getArea().compareTo(otra.getArea());
		return Double.compare(this.getArea(), otra.getArea());
	}
//
//	@Override
//	public void mover(double deltaX, double deltaY) {
//		this.p.mover(deltaX, deltaY);
//	}

	@Override
	public int hashCode() {
		return Objects.hash(p);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return p.equals(other.p);
	}

}
