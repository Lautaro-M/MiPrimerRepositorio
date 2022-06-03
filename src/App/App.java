package App;

public class App {
	
	private Cd arregloCds[];
	private int cantidadCds;
	private Dvd arregloDvd[];
	private int cantidadDvd;
	
	public App() {
		
		arregloCds = new Cd[100];
		cantidadCds = 0;
		arregloDvd = new Dvd[100];
		cantidadDvd = 0;
	}

	public void agregaCd(Cd cd) {
		
		arregloCds[cantidadCds] = cd;
		cantidadCds++;
	}
	
	public void agregaDvd(Dvd dvd) {
		
		arregloDvd[cantidadDvd] = dvd;
		cantidadDvd++;
	}
	
	public Cd[] getArregloCds() {
		return arregloCds;
	}
	
	public int getCantidadCds() {
		return cantidadCds;
	}
	
	public int busquedaCds(String nombre) {
		
		int cant = 0;
		
		for(int i = 0; i < cantidadCds; i++) {
			
			if(arregloCds[i].getCantante().equalsIgnoreCase(nombre)) {
				
				cant++;
			}
			
		}
		return cant;
	}
	
}
