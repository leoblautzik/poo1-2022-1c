package encapsulamiento;

public class Cubo {

	private int lado;

	public Cubo(int lado) {
		setLado(lado);
	}

	public int medirLongitudLado() {
		return this.lado;
	}
	
	/* pre: lado es un valor mayor a 0.
	* post: cambia la longitud de todos los lados del cubo
	*/
	public void cambiarLongitudLado(int lado) {
		setLado(lado);
		
	}

	private void setLado(int lado) {
		if(lado <= 0)
			throw new Error("No se pueden usar valores negativos");
		this.lado = lado;
	}
	
	/* post: devuelve la superficie ocupada por las caras del cubo
	*/
	public int medirSuperficieCara() {
		return this.lado * this.lado;
	}
	
	/* pre: superficieCara es un valor mayor a 0.
	* post: cambia la superficie de las caras del cubo
	*/
	public void cambiarSuperficieCara(int superficieCara) {
		if(superficieCara <= 0)
			throw new Error("La superficie no debe ser negativa ni cero");
		this.lado = (int)Math.sqrt(superficieCara);
		
	}
	
	/* post: devuelve el volumen que encierra el cubo
	*/
	public int medirVolumen() {
		return this.lado * this.lado * this.lado;
		
	}
	
	/* pre: volumen es un valor mayor a 0.
	* post: cambia el volumen del cubo
	*/
	public void cambiarVolumen(int volumen) {
		if (volumen <= 0)
			throw new Error("No se admiten volumnenes negativos o cero");
		this.lado = (int)Math.cbrt(volumen);
		
	}

}
