package ar.edu.utn.ap40;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args)  {
		
		String ronda=new File("C:\\Users\\Usuario\\Desktop\\Git\\Ronda.csv").getAbsolutePath();
		
		Ronda ronda1=new Ronda();
		ronda1.numero=1;
		
		try {
			for(String linea:Files.readAllLines(Paths.get(ronda))) {
				
				String[] valores=linea.split(",");
				
				String equipo1=valores[0];
				String goles1=valores[1];
				String goles2=valores[2];
				String equipo2=valores[3];
				
				
				Partido partido=new Partido();
				partido.equipo1.setNombre(equipo1);
				partido.setGolesEquipo1(Integer.parseInt(goles1));
				partido.equipo2.setNombre(equipo2);
				partido.setGolesEquipo2(Integer.parseInt(goles2));
				
				ronda1.partido.add(partido);
				
				
				
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(ronda1.partido.get(0).resultado(ronda1.partido.get(0).getGolesEquipo1(), ronda1.partido.get(0).getGolesEquipo2()));
		
		String pronostico=new File("C:\\Users\\Usuario\\Desktop\\Git\\Pronosticos.csv").getAbsolutePath();
		
		try {
			for(String linea:Files.readAllLines(Paths.get(ronda))) {
				
				String[] valores=linea.split(",");
				
				String equipoP1=valores[0];
				String marcador1=valores[1];
				String marcador2=valores[2];
				String equipoP2=valores[3];
				
				Pronostico pro=new Pronostico();
				
				
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}