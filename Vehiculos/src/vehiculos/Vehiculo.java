package vehiculos;

public abstract class Vehiculo {
	
	private int kmRecorridos = 0;
	private Persona chofer;
	
	public abstract boolean cambiarChofer(Persona nuevoChofer);

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public boolean asignarChofer(Persona chofer) {
		if(this.chofer != null)
			return false;
		this.chofer = chofer;
		return true;
	}

	protected void setChofer(Persona chofer) {
		this.chofer = chofer;
	}

}
