package videoClub;

public class Pelicula extends Video {
		
	private int anio;
	private String director;
	
	public Pelicula(String titulo, int anio, Genero genero, String director) {
		super(titulo,genero);
		setAnio(anio);
		setDirector(director);
	}
	
	public Pelicula(String titulo, String director) {
		this(titulo, 0, Genero.No_Definido, director);
	}
	
	public Pelicula(String titulo) {
		this(titulo, 0, Genero.No_Definido, "");
	}
	
	public Pelicula() {
		this("");
	}
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + super.getTitulo() + 
				", anio=" + anio + ", entregado=" + super.isEntregado() + 
				", genero=" + super.getGenero()
				+ ", director=" + director + "]";
	}

	protected int getAnio() {
		return anio;
	}

	protected void setAnio(int anio) {
		//if(anio <= 1895)
			//throw new Error("Película anterior a la invención del cinematógrafo");
		this.anio = anio;
	}

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	@Override
	public int compareTo(Video otraPeli) {
		Pelicula aux;
		if(otraPeli instanceof Pelicula) {
			aux = (Pelicula) otraPeli;
			//return Integer.compare(this.anio, aux.anio);
			return Integer.compare(this.anio, aux.anio);
		}
		else 
			throw new Error("Error de tipos");
	}

	
	
	
	
	
	
	
	

}
