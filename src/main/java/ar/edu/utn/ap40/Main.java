package ar.edu.utn.ap40;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)  {
		
		String ronda=new File("C:\\Users\\Usuario\\Desktop\\Git\\Ronda.csv").getAbsolutePath();
		
		Ronda ronda1=new Ronda();
		ronda1.numero=1;
		ronda1.maximo=2;
		
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
		
				
		String pronostico=new File("C:\\Users\\Usuario\\Desktop\\Git\\Pronosticos.csv").getAbsolutePath();
		ArrayList<Pronostico>pronosticos=new ArrayList<Pronostico>();
		
		
		try {
			for(String linea:Files.readAllLines(Paths.get(pronostico))) {
				
				String[] valores=linea.split(",");
				
				String equipoP1=valores[0];
				String marcador1=valores[1];
				String marcador2=valores[2];
				String equipoP2=valores[3];
				
				Pronostico pro=new Pronostico();
				
				pro.ep1.setNombre(equipoP1);
				pro.ep2.setNombre(equipoP2);
				pro.setGanoep1(marcador1);
				pro.setGanoep2(marcador2);
				
				pronosticos.add(pro);
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i=0;i<ronda1.maximo;i++) {
			System.out.println("El ganador del partido fue:");
			System.out.println(ronda1.partido.get(i).resultado(ronda1.partido.get(i).getGolesEquipo1(), ronda1.partido.get(i).getGolesEquipo2()));
			
			System.out.println("");
			System.out.println("El resultado del pronostico fue:");
			System.out.println(pronosticos.get(i).resultadoP(pronosticos.get(i).getGanoep1(), pronosticos.get(i).getGanoep2(), ronda1.partido.get(i)));
			
			System.out.println("");
		}
		
		
	}
}