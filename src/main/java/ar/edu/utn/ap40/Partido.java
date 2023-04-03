package ar.edu.utn.ap40;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Partido {
	//Clase partido donde se crean 2 clases equipo que jueguan, tiene tambien los goles que hace cada equipo
	
	Equipo equipo1=new Equipo();
	Equipo equipo2=new Equipo();

	
	private int golesEquipo1;
	private int golesEquipo2;
	
	
	
	
	public Partido() {
		
	}
	
	//Este metodo se usa para obtener cual equipo gano el partido o si hubo un empate
	public static String resultado(int goles1, int goles2) {
	String resultado=null;
	if(goles1<goles2) {
		resultado="Gano el Equipo 2";
	}
	else if(goles1>goles2) {
		resultado="Gano el Equipo 1";
	} else {
		resultado="Empate";
	}
	
	
	return resultado;
		
		
	}

}
