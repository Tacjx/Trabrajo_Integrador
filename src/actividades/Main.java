package actividades;

public class Main {
	public static void main(String[] args) {
		
	Pronostico pronostico1=new Pronostico();
	pronostico1.pronostico1="Gana el equipo 1";
	Ronda ronda1=new Ronda();
	ronda1.numero=1;
	ronda1.partido.equipo1.nombre="Argentina";
	ronda1.partido.equipo1.descripcion="equipo de Sudamerica";
	ronda1.partido.equipo2.nombre="Arabia Saudita";
	ronda1.partido.equipo2.descripcion="equipo de Medio Oriente";
	ronda1.partido.golesEquipo1=1;
	ronda1.partido.golesEquipo2=2;
	
	
	System.out.println("Pronostico primer partido:");
	if(pronostico1.pronostico1==resultado(ronda1.partido.golesEquipo1,ronda1.partido.golesEquipo2)) {
		System.out.println("Acerto el pronostico");
		
	} else {
		System.out.println("No acerto el resultado");
	}
	

	
	Pronostico pronostico2=new Pronostico();
	pronostico2.pronostico2="Empate";
	Ronda ronda2=new Ronda();
	ronda2.numero=2;
	ronda2.partido.equipo1.nombre="Polonia";
	ronda2.partido.equipo1.descripcion="equipo de Europa";
	ronda2.partido.equipo2.nombre="Mexico";
	ronda2.partido.equipo2.descripcion="equipo de America del Norte";
	ronda2.partido.golesEquipo1=0;
	ronda2.partido.golesEquipo2=0;
	
	
	System.out.println("Pronostico segunda partido");
	if(pronostico2.pronostico2==resultado(ronda2.partido.golesEquipo1,ronda2.partido.golesEquipo2)) {
		System.out.println("Acerto el pronostico");
		
	} else {
		System.out.println("No acerto el resultado");
	}
	
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
