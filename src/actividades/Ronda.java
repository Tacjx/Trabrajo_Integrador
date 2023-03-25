package actividades;

import java.util.ArrayList;
import java.util.List;

public class Ronda {
	int numero;
	
	List<Partido> partido= new ArrayList<Partido>();
	
	
	
	
	public Ronda() {
		
	}
	public Ronda(int numero, Partido partido) {
		this.numero=numero;
		this.partido=(List<Partido>) partido;
		
	}
	

}
