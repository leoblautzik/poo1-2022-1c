package juegoEstrategia;

public class Caballo implements Bebedor {

	private boolean rebelde = false;
	private int cantAtaques = 0;
	
	@Override
	public void beberAgua() {
		this.rebelde = false;
		this.cantAtaques = 0;
		
	}
	
	public void incrementarAtaque() {
		this.cantAtaques ++;
	}
	
	public boolean isRebelde() {
		return this.rebelde;
	}
	
	
}
