package primerParcialConList;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

	private ArrayList<Cancion> canciones;
	
	public Playlist(int maxCantidadDeCanciones) {
		
		this.canciones = new ArrayList<Cancion>(maxCantidadDeCanciones);

	}

	public int getCantidadDeCanciones() {
		return this.canciones.size();
	}

	public void agregarCancion(String interprete, String titulo, int duracion) {
		
		canciones.add(new Cancion(interprete, titulo, duracion));
	}

	public Cancion cancionEnLaPosicion(int posicion) {
		return this.canciones.get(posicion - 1);
	}

	public Cancion cancionDeMayorDuracion() {
		Cancion masLarga = canciones.get(0);
		for (Cancion cancion : canciones) {
			if(cancion.getDuracion() > masLarga.getDuracion())
				masLarga = cancion;
		}
		return masLarga;
	}

	public ArrayList<Cancion> cancionesDelInterprete(String interprete) {
		ArrayList<Cancion> listaInterprete = new ArrayList<Cancion>();

		for (Cancion cancion : canciones) {
			if (cancion.getInterprete().equals(interprete)) {
				listaInterprete.add(cancion);
			}
		}

		Collections.sort(listaInterprete, Collections.reverseOrder());

		return listaInterprete;

	}

	public String tiempoParaEscucharTodaLaPlaylist() {
		Integer tiempoTotal = 0;
		for (Cancion cancion : canciones) {
			tiempoTotal += cancion.getDuracion();
		}

		int minutos = tiempoTotal / 60;
		int segundos = tiempoTotal % 60;

		return minutos + ":" + segundos;

	}

}
