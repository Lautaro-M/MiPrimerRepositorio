package App;

public class Main {

	public static void main(String[] args) {

		Elemento nuevo = new Elemento();
		App app = new App();
		
		Cd tema = new Cd("Benoffi", "Español", 10, 1.40f, "Lautaro", 23);
		app.agregaCd(tema);

				
		for(int i = 0; i < app.getCantidadCds(); i++) {
			
			System.out.println(app.getArregloCds()[i].getTitulo());
			System.out.println(app.getArregloCds()[i].getCantante());
			System.out.println(app.getArregloCds()[i].getIdioma());
			System.out.println(app.getArregloCds()[i].getNumTemas());
			System.out.println(app.getArregloCds()[i].getStock());
		}
		
		
		/*
	
		Dvd peli = new Dvd("Lautaro");
		peli.nuevo(peli, "Cars", "Ingles", 20, 1.30f);
		
		peli.agregaDvd(peli);
		
		System.out.println("----- CD -----");
		System.out.println("Titulo: " + tema.getTitulo());
		System.out.println("Cantante: " + tema.getCantante());
		System.out.println("Idioma: " + tema.getIdioma());
		System.out.println("Duracion: " + tema.getDuracion());
		System.out.println("Temas: " + tema.getNumTemas());
		System.out.println("Stock: " + tema.getStock());

		System.out.println("----- DVD -----");
		System.out.println("Titulo: " + peli.getTitulo());
		System.out.println("Director: " + peli.getDirector());
		System.out.println("Idioma: " + peli.getIdioma());
		System.out.println("Duracion: " + peli.getDuracion());
		System.out.println("Stock: " + peli.getStock());
		*/
	}

}
