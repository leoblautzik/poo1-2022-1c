package juegoEstrategia;

public class Punial extends Item {

	public Punial(Unidad unidad) {
		super(unidad);
	}

	@Override
	public void atacar(Unidad u) {
		this.unidad.atacar(u);
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return this.unidad.puedeAtacar(u);
	}
	
	@Override
	public void recibirDanio(double danio) {
		this.unidad.setSalud(this.unidad.getSalud()- danio - 3);
	}
	
	@Override
	public void infringirDanio(Unidad u) {
		u.recibirDanio(this.getDanio() + 3);
	}
	
	@Override
	public String toString() {
		return "Escudo [ " + unidad.toString() + " ] "; 
	}

	@Override
	public Integer getDanio() {
		// TODO Auto-generated method stub
		return null;
	}

}
