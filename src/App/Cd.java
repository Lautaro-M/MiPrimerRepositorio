package App;

public class Cd extends Elemento{

	private String cantante;
	private int numTemas;
	
	public Cd(String titulo, String idioma, int stock, float duracion ,String cantante, int numTemas) {
		
		setTitulo(titulo);
		setIdioma(idioma);
		setStock(stock);
		setDuracion(duracion);
		this.cantante = cantante;
		this.numTemas = numTemas;
	}
		
	public String getCantante() {
		return cantante;
	}
	
	public int getNumTemas() {
		return numTemas;
	}
	
}
