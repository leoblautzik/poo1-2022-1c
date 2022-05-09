package playlista;

public class Cancion implements Comparable<Cancion> {
	private String interprete;
	private String titulo;
	private Integer duracion;

	public Cancion(String interprete, String titulo, int duracion) {
		this.interprete = interprete;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public Integer getDuracion() {
		return this.duracion;
	}

	public String getInterprete() {
		return this.interprete;
	}

	@Override
	public int compareTo(Cancion o) {
		return Integer.compare(this.duracion, o.duracion);
	}

	@Override

	public boolean equals(Object o) {

		Cancion aux = (Cancion) o;

		return (this.interprete.equals(aux.interprete) && this.titulo.equals(aux.titulo)
				&& this.duracion.equals(aux.duracion));

	}

}