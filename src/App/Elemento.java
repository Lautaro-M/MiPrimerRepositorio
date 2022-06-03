package App;

public class Elemento {

	// ATRIBUTOS
	
	private String titulo;
	private String idioma;
	private float duracion;
	private int stock;

	// CONSTRUCTOR
	
	public Elemento(){
		
		titulo = " ";
		idioma = " ";
		duracion = 0;
		stock = 0;
	}
	
	// GET
	
	public String getTitulo() {
		return titulo;
	}
	
	public float getDuracion() {
		return duracion;
	}
		
	public int getStock() {
		return stock;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	// SET
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
