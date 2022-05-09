package spotofo;

import java.util.Arrays;

/** Implementar la clase ListaDeReproduccion tal que:
* +Se construya a partir de la cantidad máxima de canciones que puedan ser añadidas.
* +Se pueda consultar la cantidad de canciones agregadas. 
* +Se pueda agregr una canción al final, indicando su intérprete, titulo y su duración en minutos. 
* +Devuelva la canción a partir de la posición que se pasa por parámetro (entre 1 y la cant max de canciones).
* +Devuelva un arreglo con todas las canciones de un artista que se pasa por parámetro, 
*  ordenadas por duración de mas corta a más larga.  
* +Calcula el tiempo que llevará escuchar toda la lista.
* +Devuelva la canción mas larga de la lista.
*/

public class Playlist {
	
	private Cancion[] canciones;
	private int cantidadDeCanciones = 0;
	
	public Playlist(int maxCantCanciones) {
		this.canciones = new Cancion[maxCantCanciones];
	}
	
	public int getCantidadDeCanciones() {
		return this.cantidadDeCanciones;
	}

	public void agregarCancion(String interprete, String titulo, int duracion) {
		if(this.cantidadDeCanciones >= this.canciones.length) {
			throw new Error("Lista llena");
		}
		else
			canciones[cantidadDeCanciones] = new Cancion(interprete, titulo, duracion);
			cantidadDeCanciones ++;
		}
	public Cancion cancionEnLaPosicion(int pos) {
		if (pos <= 0 || pos >= this.canciones.length)
			throw new Error("Posición incorrecta");
		return this.canciones[pos-1];
	}
	
	public Cancion[] cancionesDelInterprete(String interprete) {
		int cantCancionesInterprete=0;
		for(int i = 0; i < cantidadDeCanciones; i++ ) {
			if(canciones[i].getInterprete().equals(interprete))
				cantCancionesInterprete ++;
		}
		
		Cancion[] aux = new Cancion[cantCancionesInterprete];
		int j = 0;
		for(int i = 0; i < cantidadDeCanciones; i++ )
			if(canciones[i].getInterprete().equals(interprete)) {
				aux[j] = canciones[i];
				j++;
			}
		Arrays.sort(aux);
		return aux;
	}	
	
	public int tiempoParaEscucharTodaLaPlaylist() {
		int tt = 0;
		for(Cancion cc : canciones)
			tt += cc.getDuracion();
		return tt;
	}
	
	public Cancion cancionMasLarga() {
		int posMax = 0;
		for(int i = 1; i < cantidadDeCanciones; i++) {
			if(canciones[i].getDuracion() > canciones[posMax].getDuracion())
				posMax = i;
		}
		return canciones[posMax];
	}
	
	
}
