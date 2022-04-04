package cuentasBancarias;

public class CajaDeAhorro {

	private double saldo = 0;
	private String titular;

	public CajaDeAhorro(String titular) {
		this.setTitular(titular);
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void depositar(double monto) {
		if (esMontoValido(monto))
			setSaldo(this.getSaldo() + monto);
	}

	public double extraer(double monto) {
		if (esMontoValido(monto) && haySaldoSuficiente(monto)) {
			this.saldo -= monto;
			return monto;
		} else
			return 0;

	}
	
	public void transferir(CajaDeAhorro cuentaDestino, double monto) {
		if (esMontoValido(monto) && haySaldoSuficiente(monto)) 
			cuentaDestino.depositar(this.extraer(monto));
	}

	private void setSaldo(double saldo) {
		if (esMontoValido(saldo))
			this.saldo = saldo;
	}

	private boolean esMontoValido(double monto) {
		return monto > 0;
	}

	private boolean haySaldoSuficiente(double monto) {
		return this.getSaldo() >= monto;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

}
