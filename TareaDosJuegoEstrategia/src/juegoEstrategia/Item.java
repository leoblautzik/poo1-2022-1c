package juegoEstrategia;

public abstract class Item extends Unidad {
	
	protected Unidad unidad;
	
	public Item(Unidad unidad) {
		super(unidad.getSalud(), unidad.getPosicion());
		this.unidad = unidad;
	}

}
