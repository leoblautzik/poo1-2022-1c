package juegoEstrategia;

public abstract class Unidad {
	
	private Double salud;
	private Punto posicion;
	
	
	public Unidad(double salud, Punto posicion) {
		this.salud = salud;
		this.posicion = posicion;
		
	}
	
	protected Punto getPosicion() {
		return posicion;
	}

	public abstract void atacar(Unidad u);
	
	public abstract boolean puedeAtacar(Unidad u);
	
	public boolean estaMuerta() {
		return this.salud == 0;
	}
	
	public double distancia(Unidad u) {
		return this.posicion.distancia(u.posicion);
	}
	
	public void recibirDanio(double danio) {
		this.salud -= danio;
	}
	
	public abstract Integer getDanio(); 
	
	public Double getSalud() {
		return salud;
	}
	
	

//	protected void setSalud(double saludAtacada) {
//		this.salud = saludAtacada;
//	}

	@Override
	public String toString() {
		return "Unidad [salud=" + salud + ", posicion=" + posicion + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() +"]";
	}
	

		

}
