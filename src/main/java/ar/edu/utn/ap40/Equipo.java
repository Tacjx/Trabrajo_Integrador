package ar.edu.utn.ap40;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Equipo {
	
	//Clase equipo donde se cargan los equipos que juegan en el partido.
	//Se pone nombre y descripcion de los mismos, tiene un costructor para poder llamarlo
		
	private String nombre;
	private String descripcion;
	
	public Equipo() {
		
	}

}
