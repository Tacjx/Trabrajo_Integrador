package actividades;

public class Partido {
	Equipo equipo1=new Equipo();
	Equipo equipo2=new Equipo();

	
	int golesEquipo1;
	int golesEquipo2;
	
	
	public Partido() {
		
	}
	
	
	public static String resultado(int goles1, int goles2) {
	String resultado;
	if(goles1<goles2) {
		resultado="Gano el Equipo 2";
	}
	if(goles1>goles2) {
		resultado="Gano el Equipo 1";
	} else {
		resultado="Empate";
	}
	
	
	return resultado;
		
		
	}

}
