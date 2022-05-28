package geometria.parcial;

public abstract class Figura implements Comparable<Figura>{

	private Double area;
	
	public Figura(double area) {
		this.area = area;
	}

	public final Double getArea() {
		return this.area;
	}

	protected void setArea(Double area) {
		this.area = area;
	}

	@Override
	public int compareTo(Figura otra) {
		return Double.compare(this.getArea(), otra.getArea());
	}
}
