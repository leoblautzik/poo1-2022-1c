package playlista;

import java.util.Arrays;

public class Playlist {

	//private ArrayList<Cancion> canciones;
	private Cancion[] canciones;
	private int cantCanciones = 0;
	private Cancion masLarga = null;

	public Playlist(int maxCantidadDeCanciones) {

		this.canciones = new Cancion[maxCantidadDeCanciones];

	}

	public int getCantidadDeCanciones() {
		return this.cantCanciones;
	}

	public void agregarCancion(String interprete, String titulo, int duracion) {
		if (cantCanciones >= this.canciones.length)
			throw new Error("Lista llena");

		canciones[cantCanciones] = new Cancion(interprete, titulo, duracion);
		if (cantCanciones == 0)
			this.masLarga = canciones[0];
		else if (duracion > masLarga.getDuracion())
			masLarga = canciones[cantCanciones];
		cantCanciones++;

	}

	public Cancion cancionEnLaPosicion(int posicion) {
		return this.canciones[posicion - 1];
	}

	public Cancion cancionDeMayorDuracion() {

		/*Cancion masLarga = this.canciones[0];
		for (int i = 0; i < cantCanciones; i++) {
			if (canciones[i].getDuracion() > masLarga.getDuracion())
				masLarga = canciones[i];
		}
		*/

		return masLarga;
	}

	public Cancion[] cancionesDelInterprete(String interprete) {
		int cantidadDeCancionesDelinterprete = 0;
		for (int i = 0; i < cantCanciones; i++)
			if (canciones[i].getInterprete().equals(interprete))
				cantidadDeCancionesDelinterprete++;

		Cancion[] aux = new Cancion[cantidadDeCancionesDelinterprete];
		int j = 0;
		for (int i = 0; i < cantCanciones; i++)
			if (canciones[i].getInterprete().equals(interprete)) {
				aux[j] = canciones[i];
				j++;
			}
		
		Arrays.sort(aux);

		return aux;

	}

	public String tiempoParaEscucharTodaLaPlaylist(){
		Integer tiempoTotal = 0;
		for (int i = 0; i < cantCanciones; i++)
			tiempoTotal += canciones[i].getDuracion();
		
		int minutos = tiempoTotal / 60;
		int segundos = tiempoTotal % 60;
		
		return minutos + ":" + segundos;
	
	}
	
}
