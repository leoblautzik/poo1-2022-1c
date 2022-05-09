package spotofo;

import java.util.Objects;

//+Se pueda agregr una canción al final, indicando su intérprete, titulo y su duración en minutos. 

public class Cancion implements Comparable<Cancion>{
	private String interprete, titulo;
	private int duracion;
	
	public Cancion(String interprete, String titulo, int duracion) {
		this.interprete = interprete;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getInterprete() {
		return this.interprete;
	}

	@Override
	public int compareTo(Cancion o) {
		return Integer.compare(this.duracion, o.duracion);
	}

	public int getDuracion() {
		return this.duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, interprete, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return duracion == other.duracion && Objects.equals(interprete, other.interprete)
				&& Objects.equals(titulo, other.titulo);
	}
		

}
