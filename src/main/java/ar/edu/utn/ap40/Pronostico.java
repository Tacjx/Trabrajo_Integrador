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
	
	private String nombre;
	Equipo ep1=new Equipo();
	Equipo ep2=new Equipo();
	private String ganoep1;
	private String empate;
	private String ganoep2;
	
	
	//Se utiliza el constructor vacio para poder crear objetos de la clase sin pasarle parametros en el momento
	//Y poder rellenarlo despues con loombok que crea los getters y setters
	//Si no utilizo el constructor el programa no funciona.
	
	
	public Pronostico() {
		
	}
	
	
	
	
	
	public int resultado(String marca1, String marca2, String marcaempate, String resultado, int pGanar, int pPerder, int pEmpatar) {
		String prediccion="";
		int puntaje=pPerder;
		
		if(marca1.equals("X")) {
			prediccion="Gano el Equipo 1";
			if(resultado==prediccion) {
				puntaje=pGanar;
			}
		}
		else if(marca2.equals("X")) {
			prediccion="Gano el Equipo 2";
			if(resultado==prediccion) {
				puntaje=pGanar;
			}
		}
		else if(marcaempate.equals("X")) {
			prediccion="Empate";
			if(resultado==prediccion) {
				puntaje=pEmpatar;
			}
		}
		
		
		
		return puntaje;
	}
	
	
	

}
