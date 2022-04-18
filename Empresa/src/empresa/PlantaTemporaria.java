package empresa;

public class PlantaTemporaria extends Empleado {
	private static final double VALOR_HORA = 200;
	
	
	public PlantaTemporaria(boolean estaCasado, int hijos, int horasTrabajadas) {
		super(estaCasado, hijos, horasTrabajadas);
	}

	
	@Override
	public double obtenerSueldo() {
		return super.horasTrabajadas * VALOR_HORA 
				+ super.obtenerSalarioFamiliar();
	}
}
