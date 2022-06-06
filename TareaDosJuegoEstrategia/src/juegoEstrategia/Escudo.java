package juegoEstrategia;

public class Escudo extends Item {

	public Escudo(Unidad unidad) {
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
		this.unidad.recibirDanio(danio * 0.4);
	}

	@Override
	public String toString() {
		return "Escudo [ " + unidad.toString() + " ] "; 
	}

}
