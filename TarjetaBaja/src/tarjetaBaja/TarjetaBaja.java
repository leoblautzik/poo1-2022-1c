package tarjetaBaja;

public class TarjetaBaja {

	private double saldo;
	private int cantidadDeViajesEnColectivo = 0;
	private int cantidadDeViajesEnSubte = 0;
	private static final double VIAJE_EN_COLECTIVO = 1.25;
	private static final double VIAJE_EN_SUBTE = 2.5;
	

	/*
	 * post: saldo de la Tarjeta en saldoInicial.
	 */

	public TarjetaBaja(double saldoInicial) {
		if (saldoInicial <= 0)
			throw new Error("Valor inicial incorrecto");

		this.saldo = saldoInicial;
	}

	public double obtenerSaldo() {
		return this.saldo;
	}

	/*
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		if (monto <= 0)
			throw new Error("Valor de recarga incorrecto");
		this.saldo += monto;

	}

	/*
	 * pre : saldo suficiente. post: utiliza 1.25 del saldo para un viaje en
	 * colectivo.
	 */
	public boolean pagarViajeEnColectivo() {
		if (this.saldo < TarjetaBaja.VIAJE_EN_COLECTIVO)
			return false;
		else {
			this.saldo -= TarjetaBaja.VIAJE_EN_COLECTIVO;
			this.cantidadDeViajesEnColectivo ++;
			return true;
		}

	}
	/*
	 * pre : saldo suficiente.  
	 * post: utiliza 2.50 del saldo para un viaje en
	 * subte.
	 */
	public boolean pagarViajeEnSubte() {
		if (this.saldo < TarjetaBaja.VIAJE_EN_SUBTE)
			return false;
		else {
			this.saldo -= TarjetaBaja.VIAJE_EN_SUBTE;
			this.cantidadDeViajesEnSubte ++;
			return true;
		}
	}
	/*
	 * post: devuelve la cantidad de viajes realizados. public int contarViajes() /*
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		
		return this.cantidadDeViajesEnColectivo;
	}
	/*
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		
		return this.cantidadDeViajesEnSubte;
	}

}
