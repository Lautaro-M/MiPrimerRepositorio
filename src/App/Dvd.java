package App;

public class Dvd extends Elemento{

	private String director;
	
	public Dvd(String titulo, String idioma, int stock, float duracion, String director) {
		
		setTitulo(titulo);
		setIdioma(idioma);
		setStock(stock);
		setDuracion(duracion);
		this.director = director;
	}
	
	
	public String getDirector() {
		return director;
	}
	
}
