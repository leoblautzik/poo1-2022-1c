package obraEdificio;

public class ObraEdificio {
	
	private Integer supAcimentar;
	private Integer supCimentada;
	
	public ObraEdificio(Integer sup) {
		if (sup <= 0) throw new Error("Sup Inválida");
		this.supAcimentar = sup;
		this.supCimentada = 0;
	}
	
	public void cimentando(Integer supCimentando) {
		if(this.supCimentada + supCimentando > this.supAcimentar)
			System.err.println("Superficie mayor a la esperada");
		else
		this.supCimentada += supCimentando;
	}
	
	public Integer restaPorCimentar() {
		return this.supAcimentar - this.supCimentada;
	}
	
	public Boolean terminado() {
		return this.supCimentada.equals(this.supAcimentar);
	}

}
