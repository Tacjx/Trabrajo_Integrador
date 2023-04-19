package ar.edu.utn.ap40;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		//El programa utiliza el siguiente formato de archvios para trabajar:
		//RONDA:Numero,Pais,puntaje,puntaje,Pais. Como en el cuadro de la entega 2
		//PRONOSTICOS:Nombre,Pais,marca,marca, marca, Pais. Como en el cuadro de la entrega 2
		//Ejemplo tomas,argentina,X,0,0,polia
		//Si no tiene una X, no va nada: ",,"
		//La X representa que equipo se piensa que va a ganar o empatar
		//El 0 solo rellena el espacio para hacerlo mas facil de leer
		//El programa no indica ninguna error por el momento, corre bien.
		
				
		
		Scanner leer=new Scanner(System.in);
		
		String rondas=new File("C:\\Users\\Usuario\\Desktop\\Git\\resultados.csv").getAbsolutePath();
		
		Ronda ronda=new Ronda();
		
		try {
			for(String linea:Files.readAllLines(Paths.get(rondas))) {
				
				String[] valores=linea.split(",");
				
				String numronda=valores[0];
				String equipo1=valores[1];
				String goles1=valores[2];
				String goles2=valores[3];
				String equipo2=valores[4];
				
				
				Partido partido=new Partido();
				partido.equipo1.setNombre(equipo1);
				partido.setGolesEquipo1(Integer.parseInt(goles1));
				partido.equipo2.setNombre(equipo2);
				partido.setGolesEquipo2(Integer.parseInt(goles2));
				
				ronda.numero.add(numronda);
				
				ronda.partido.add(partido);
				
								
				
				
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		String pronostico=new File("C:\\Users\\Usuario\\Desktop\\Git\\pronosticosvarios.csv").getAbsolutePath();
		ArrayList<Pronostico>pronosticos=new ArrayList<Pronostico>();
		
		System.out.println("Indicar los puntos a otorgar por cada caso de pronostico:");
		
		System.out.println("Caso Ganar:");
		int Pganar=leer.nextInt();
		
		System.out.println("Caso Perder:");
		int Pperder=leer.nextInt();
		
		System.out.println("Caso Empatar");
		int Pempatar=leer.nextInt();
		
		
		
		try {
			for(String linea:Files.readAllLines(Paths.get(pronostico))) {
				
				String[] valores=linea.split(",");
				
				String nombre=valores[0];
				String equipoP1=valores[1];
				String marcador1=valores[2];
				String empate=valores[3];
				String marcador2=valores[4];
				String equipoP2=valores[5];
				
				Pronostico pro=new Pronostico();
				
				pro.setNombre(nombre);
				pro.ep1.setNombre(equipoP1);
				pro.ep2.setNombre(equipoP2);
				pro.setGanoep1(marcador1);
				pro.setEmpate(empate);
				pro.setGanoep2(marcador2);
				
				pronosticos.add(pro);
				
			
			
			
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int puntaje=0;
		int punt=0;
		int rondalograda=0;
		int rondaL=0;
		
		
		int totalronda=0;
		
		System.out.println("Partidos Jugados en la Ronda:");
		for(int i=0;i<ronda.numero.size();i++) {
		
			
				System.out.println("La ronda es:"+ronda.numero.get(i));
				System.out.println("Jugo: "+ronda.partido.get(i).equipo1.getNombre()+", Contra: "+ronda.partido.get(i).equipo2.getNombre());
				ronda.partido.get(i);
				System.out.println("El ganador del partido fue: "+Partido.resultado(ronda.partido.get(i).getGolesEquipo1(), ronda.partido.get(i).getGolesEquipo2()));
				System.out.println("");
				
				String resul=Partido.resultado(ronda.partido.get(i).getGolesEquipo1(), ronda.partido.get(i).getGolesEquipo2());
				
				//Se establece el total de puntaje que se obtendria en caso de acertar a todos los pronosticos
				if(resul=="Gano el Equipo 1" || resul=="Gano el Equipo 2") {
					totalronda+=Pganar;
					
				}else {
					totalronda+=Pempatar;
				}
				
				
				//Se imprimen  las personas del pronostico
				
				String resultado=Partido.resultado(ronda.partido.get(i).getGolesEquipo1(), ronda.partido.get(i).getGolesEquipo2());
				String p1=pronosticos.get(i).getGanoep1();
				String p2=pronosticos.get(i).getGanoep2();
				String p3=pronosticos.get(i).getEmpate();
								
				
				
				System.out.println("Nombre de la persona: "+pronosticos.get(i).getNombre());
				pronosticos.get(i);
				System.out.println("Obtuvo en pronostico: "+pronosticos.get(i).resultado(p1, p2, p3, resultado,Pganar,Pperder,Pempatar));
				int p=pronosticos.get(i).resultado(p1, p2, p3, resultado,Pganar,Pperder,Pempatar);
				puntaje+=p;
				System.out.println("El puntaje acumulado es "+puntaje);
				System.out.println("");
				
				//Se comprueba si se acerto totalmente en la ronda y se suman puntos extra
				if(puntaje==totalronda) {
					puntaje+=5;
					System.out.println("Obtuvo puntos extra por acertar en toda la ronda, sus puntos son: "+puntaje);
					rondalograda+=1;
				}
				
				//Si el numero de rondas acertadas es igual al total de rondas se suman mas puntos
				if(rondalograda==ronda.numero.size()) {
					puntaje+=10;
					System.out.println("Logro completar toda la fase, obtuvo "+puntaje+" puntos");
					
				}
				
				
				//Si existe mas de una persona que da pronosticos de los 4 partidos
				//Se verifica y se ejecuta la muestra
				
				if(pronosticos.size()>4) {
					int auxiliar=pronosticos.size()/4;
					int aux=auxiliar*4-4;
					
					String f1=pronosticos.get(i+aux).getGanoep1();
					String f2=pronosticos.get(i+aux).getGanoep2();
					String f3=pronosticos.get(i+aux).getEmpate();
					
					System.out.println("Nombre de la persona: "+pronosticos.get(i+aux).getNombre());
					pronosticos.get(i+aux);
					System.out.println("Obtuvo en pronostico: "+pronosticos.get(i+aux).resultado(f1, f2, f3, resultado, Pganar, Pperder, Pempatar));
					
					punt=punt+pronosticos.get(i+aux).resultado(f1, f2, f3, resultado,Pganar,Pperder,Pempatar);
					System.out.println("El puntaje acumulado es "+punt);
					System.out.println("");
					
					if(punt==totalronda) {
						punt+=5;
						System.out.println("Obtuvo puntos extra por acertar en toda la ronda, sus puntos son: "+punt);
						rondaL+=1;
					}
					
					
				}
				
				if(rondaL==ronda.numero.size()) {
					punt+=10;
					System.out.println("Logro completar toda la fase, obtuvo "+punt+" puntos");
				}
				
				leer.close();
				
		}
		
		//al final hacer la conexcion con mysql
		
		
	}
}