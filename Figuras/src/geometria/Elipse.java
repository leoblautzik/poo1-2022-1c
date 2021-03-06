package geometria;

import java.util.Objects;


public class Elipse extends Figura {

	private double radioMayor;
	private double radioMenor;

	public Elipse(Punto centro, double radioMayor, double radioMenor) {
		super(centro);
		try {
			if (radioMayor <=0 || radioMenor <=0)
				throw new RadioInvalidoException("Radio inválido");
			else {
			this.radioMayor = radioMayor;
			this.radioMenor = radioMenor;
			}
		}
		
		catch (RadioInvalidoException rie) {
			System.err.println(rie.getMessage());
		}
		
		
		
	}

	@Override
	public Double getArea() {
		return this.radioMayor * this.radioMenor * Math.PI;
	}

	@Override
	public void mover(double deltaX, double deltaY) {
		super.getP().mover(deltaX, deltaY);	
	}

	@Override
	public String toString() {
		return "Elipse [radioMayor=" + radioMayor + ", radioMenor=" + radioMenor + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(radioMayor, radioMenor);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elipse other = (Elipse) obj;
		return Double.doubleToLongBits(this.radioMayor) == Double.doubleToLongBits(other.radioMayor)
				&& Double.doubleToLongBits(this.radioMenor) == Double.doubleToLongBits(other.radioMenor);
	}

}
