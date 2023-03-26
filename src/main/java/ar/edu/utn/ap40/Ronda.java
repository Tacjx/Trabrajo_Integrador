package ar.edu.utn.ap40;

import java.util.ArrayList;
import java.util.List;

public class Ronda {
	//clase ronda donde se indica que numero es, se debe cambiar el llamado de partido por una lista
	//tiene 2 contructores para poder llamar a la clase
	
    int numero;
	
	Partido partido= new Partido();
	
	
	
	
	public Ronda() {
		
	}
	public Ronda(int numero, Partido partido) {
		this.numero=numero;
		this.partido=partido;
		
	}
	

}
