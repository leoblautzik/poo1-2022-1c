package juegoEstrategia;

public abstract class Unidad {
	
	private int salud;
	private Punto posicion;
	
	public abstract void atacar(Unidad u);
	
	public abstract boolean puedeAtacar(Unidad u);
	
	public boolean estaMuerta() {
		return this.salud == 0;
	}
	
	public double distancia(Unidad u) {
		return this.posicion.distancia(u.posicion);
	}
	
	public void recibirDanio(int danio) {
		this.salud -= danio;
	}
	

	public Unidad(int salud, Punto posicion) {
		this.salud = salud;
		this.posicion = posicion;
		
	}

	public int getSalud() {
		return salud;
	}

	
	
	
	

}
