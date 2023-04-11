package ar.edu.utn.ap40;

import java.util.ArrayList;
import java.util.List;

public class Ronda {
	//clase ronda donde se indica que numero es
	//tiene 2 contructores para poder llamar a la clase
	
    
	
	public ArrayList<String> numero=new ArrayList<String>();
	
	public ArrayList<Partido>partido= new ArrayList<Partido>();
	
	
	
	
	public Ronda() {
		
	}
	public Ronda(ArrayList numero, ArrayList<Partido> partido) {
		this.numero=numero;
		this.partido=partido;
		
	}
	

}
