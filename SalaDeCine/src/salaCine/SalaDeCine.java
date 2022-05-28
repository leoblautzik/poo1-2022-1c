package salaCine;

public class SalaDeCine {

	private boolean[][] sala;

	public SalaDeCine(int butacas, int filas) {
		this.sala = new boolean[filas][butacas / filas];
	}

	public boolean estaOcupada(int fila, int asiento) {
		return this.sala[fila][asiento];
	}

	public void ocuparButaca(int fila, int asiento) {
		if (!sala[fila][asiento])
			sala[fila][asiento] = true;
		else
			System.err.print("La butaca está ocupada");
	}

	public int cantidadDeButacasOcupadas() {
		int cantidad = 0;
		for (int i = 0; i < sala.length; i++)
			for (int j = 0; j < sala[i].length; j++)
				if (sala[i][j] == true)
					cantidad++;
		return cantidad;
	}

	public boolean hayEspacioPara(int cantidadDePersonas) {
		int fila = 0;
		boolean hayLugares = false;
		
		while (!hayLugares && fila < sala.length) {
			hayLugares = hayNlugaresContiguosLibresEnLaFila(fila, cantidadDePersonas);
			fila++;
		}
		return hayLugares;
	}

	public boolean hayNlugaresContiguosLibresEnLaFila(int fila, int cantidadDePersonas) {
		int contadorLugaresLibres = 0;
		int j = 0;
		while (contadorLugaresLibres < cantidadDePersonas && j < sala[fila].length) {
			
			if (sala[fila][j]) {
				contadorLugaresLibres = 0;
			} else {
				contadorLugaresLibres++;
			}
			j++;
		}
		return (contadorLugaresLibres >= cantidadDePersonas);
	}

	
}
