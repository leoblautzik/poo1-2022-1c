package vehiculos;

public class Motocicleta extends Vehiculo {

	private Persona acompaniante;

	@Override
	public boolean cambiarChofer(Persona nuevoChofer) {
		if (this.acompaniante != null)
			return false;
		this.setChofer(nuevoChofer);
		return true;
	}

	public boolean agregarAcompaniante(Persona acompaniante) {
		if (this.acompaniante != null)
			return false;
		this.acompaniante = acompaniante;
		return true;
	}
	
	public void bajarAcompaniante() {
		this.acompaniante = null;
	}

}
