package videoClub;

public class Serie extends Video {

	private int temporadas;
	private String creador; 
			
	public Serie(String titulo, int temporadas, Genero genero, String creador) {
		super(titulo, genero);
		setTemporadas(temporadas);
		setCreador(creador);
	}
	
	
	protected int getTemporadas() {
		return temporadas;
	}

	protected void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	protected String getCreador() {
		return creador;
	}

	protected void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public int compareTo(Video otraSerie) {
		Serie aux;
		if(otraSerie instanceof Serie) {
			aux = (Serie) otraSerie;
			return Integer.compare(this.temporadas, aux.temporadas);
		}
		else 
			throw new Error("Error de tipos");
	}

}
