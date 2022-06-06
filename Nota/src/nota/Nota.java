package nota;

class Nota {

	private Integer valor;

	/*
	 * pre : valorInicial está comprendido entre 0 y 10. post: inicializa la Nota
	 * con el valor indicado.
	 */

	public Nota(int valorInicial) {
		try {
			if (valorInicial < 0) {
				throw new NotaInvalidaException("Nota inválida");
			}
			else
				this.valor = valorInicial;
		}
		catch (NotaInvalidaException nie){
			System.err.println(nie.getMessage());
		}
		
	}

	public Nota() {
-

	}

	/*
	 * post: devuelve el valor numérico de la Nota,
	 *
	 * comprendido entre 0 y 10.
	 */
	int obtenerValor() {

		return this.valor;
	}

	/*
	 * post: indica si la Nota permite o no la aprobación.
	 */
	boolean aprobado() {

		return (this.valor >= 4 && valor <= 10);
			
	}
	/*
	 * post: indica si la Nota implica la desaprobación.
	 */
	boolean desaprobado() {
		
	//	return (this.valor >= 0 && this.valor < 4);
		return !this.aprobado();
		
	}
	
	//Agregar a la clase Nota el método:
		/* pre : nuevoValor está comprendido entre 0 y 10.
		* post: modifica el valor numérico de la Nota, cambiándolo
		*
		por nuevoValor, si nuevoValor es superior al
		*
		valor numérico actual de la Nota.
		*/
		void recuperar(int nuevoValor) {
			
			if(nuevoValor > this.valor)
				this.valor = nuevoValor;
			
		}
		
		public boolean promocion() {
			return (this.valor >= 7 && this.valor <= 10);
		}
	
	

}


//	
