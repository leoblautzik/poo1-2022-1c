package empresa;

public class PlantaPermanente extends Empleado {
	
	private static final double VALOR_ANIO_ANTIGUEDAD = 100;
	private static final double VALOR_HORA = 300;
	protected int antiguedad;
	
	public PlantaPermanente(boolean estaCasado, int hijos, int horasTrabajadas, int antiguedad) {
		super(estaCasado, hijos, horasTrabajadas);
		this.antiguedad = antiguedad;
	}

	
	@Override
	public Double obtenerSueldo() {
		return super.horasTrabajadas * PlantaPermanente.VALOR_HORA 
				+ this.antiguedad * PlantaPermanente.VALOR_ANIO_ANTIGUEDAD 
				+ super.obtenerSalarioFamiliar();
	}
}
