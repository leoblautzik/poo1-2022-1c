package juegoEstrategia;

public class Soldado extends Unidad implements Bebedor{

	private int energia;
	private static final int DANIO = 10;

	
	public Soldado(Punto posicion) {
		super(200, posicion);
		this.energia = 100;
	}

	@Override
	public void atacar(Unidad u) {
		if (this.puedeAtacar(u)) {
			this.energia -= DANIO;
			this.infringirDanio(u);
		}
	}

	public void infringirDanio(Unidad u) {
		u.recibirDanio(DANIO);
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && u.distancia(u) == 0 && this.energia >= 10);
	}

	public int getEnergia() {
		return energia;
	}

	@Override
	public void beberAgua() {
		this.energia = 100;
		
	}
	
	
	

}
