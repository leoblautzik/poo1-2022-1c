package juegoEstrategia;

//Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo no se haya puesto
//rebelde. Infringe un daño de 50 puntos y comienza con 200 de salud. Un caballo se pone rebelde
//luego de 3 ataques, y puede calmarse si recibe una poción de agua.

public class Caballero extends Unidad {
	private Caballo c;
	private final int DANIO = 50;

	public Caballero(double salud, Punto posicion, Caballo c) {
		super(salud, posicion);
		this.c = c;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Unidad u) {
		if (this.puedeAtacar(u)) {
			u.recibirDanio(DANIO);
			//this.c.incrementarAtaques();
		}

	}

	protected int getDANIO() {
		return DANIO;
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && this.distancia(u) >= 1 && this.distancia(u) <= 2);
	}

	@Override
	public Integer getDanio() {
		// TODO Auto-generated method stub
		return null;
	}

}
