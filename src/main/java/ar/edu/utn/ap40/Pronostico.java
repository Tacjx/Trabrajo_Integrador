package ar.edu.utn.ap40;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pronostico {
	//Se rellena la informacion de los equipos con el archivo a leer en el main
	//El pronostico tambien, se ejecuta el metodo pasandole el partido verdadero como objeto
	//Resolviendo asi si acerto a no el pronostico
	
	Equipo ep1=new Equipo();
	Equipo ep2=new Equipo();
	private String ganoep1;
	private String ganoep2;
	
	
	public Pronostico() {
		
	}
	
	
	public int resultadoP(String pronostico1, String pronostico2, Partido partido) {
		int goles1=partido.getGolesEquipo1();
		int goles2=partido.getGolesEquipo2();
		
		int puntaje=0;
		String pronostico=null;
		
		if(pronostico1!=null && pronostico2==null) {
			pronostico="Gano el Equipo 1";
		}
		else if(pronostico1==null && pronostico2!=null) {
			
			pronostico="Gano el Equipo 2";
		}
		else if(pronostico1!=null && pronostico2!=null) {
			pronostico="Empate";
		}
		
		
		
		if(partido.resultado(goles1, goles2)==pronostico) {
			//Caso de Asertar el Pronostico
			puntaje++;
			
		}
		//Si no acierta se devuelve 0 puntos.
		return puntaje;
	}
	
	
	

}
