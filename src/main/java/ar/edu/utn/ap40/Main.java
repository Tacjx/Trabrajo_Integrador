package ar.edu.utn.ap40;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//clase main donde se trabaja
		//primero se dice un pronostico de como va resultar el partido
		//se rellena los datos del partido y como termino
		// se ejecuta el metodo resultado para comparar con el pronostico y saber y hacerto
		//se devuelve un mensaje indicando el resultado
		
		
		//deberiamos cambiarlo para que sea un bucle
		//pidiendo indicar que ronda es, completando los datos del partido
		//pidiendo un pronostico, completando el como resulto el partido
		//devilviendo el un mensaje y repitiendo el bucle
		//piendo indicar los paises nuevamente hasta terminar la ronda
		//despues poder pasar a la siguiente ronda o salir del programa.
		
		
		Scanner leer=new Scanner(System.in);
		
		Pronostico pronostico1=new Pronostico();
		System.out.println("Indique su pronostico del partido");
		pronostico1.pronostico1=leer.next();//Gana el equipo 1
		
		System.out.println("Indique la Ronda del partido");
		Ronda ronda1=new Ronda();
		ronda1.numero=leer.nextInt();//1
		
		System.out.println("Nombre al Equipo numero 1, ");
		ronda1.partido.equipo1.setNombre(leer.next());//Argentina
		
		System.out.println("Describalo");
	    ronda1.partido.equipo1.setDescripcion(leer.next());//Equipo de Sudamerica
	    
	    System.out.println("Nombre al Equipo numero 2");
		ronda1.partido.equipo2.setNombre(leer.next());//Arabia Saudita
		
		System.out.println("Describalo");
		ronda1.partido.equipo2.setDescripcion(leer.next());//Equipo de Medio Oriente
		
		
		System.out.println("Indique los goles del Equipo 1");
		ronda1.partido.setGolesEquipo1(leer.nextInt());//1
		
		System.out.println("Indique los goles del Equipo 2");
		ronda1.partido.setGolesEquipo2(leer.nextInt());//2
		
		
		System.out.println("Lograste:");
		if(pronostico1.pronostico1==resultado(ronda1.partido.getGolesEquipo1(),ronda1.partido.getGolesEquipo2())) {
			System.out.println("Acertertar en el pronostico");
			
		} else {
			System.out.println("No acertar en el pronostico");
		}
		
		
		
		
		Pronostico pronostico2=new Pronostico();
		System.out.println("Indique su pronostico del partido");
		pronostico1.pronostico1=leer.next();//Empate
		
		System.out.println("Indique la Ronda del partido");
		Ronda ronda2=new Ronda();
		ronda2.numero=leer.nextInt();//2
		
		System.out.println("Nombre al Equipo numero 1, ");
		ronda2.partido.equipo1.setNombre(leer.next());//Polonia
		
		System.out.println("Describalo");
	    ronda2.partido.equipo1.setDescripcion(leer.next());//Equipo de Europa
	    
	    System.out.println("Nombre al Equipo numero 2");
		ronda2.partido.equipo2.setNombre(leer.next());//Mexico
		
		System.out.println("Describalo");
		ronda2.partido.equipo2.setDescripcion(leer.next());//Equipo de America del Norte
		
		
		System.out.println("Indique los goles del Equipo 1");
		ronda2.partido.setGolesEquipo1(leer.nextInt());//0
		
		System.out.println("Indique los goles del Equipo 2");
		ronda2.partido.setGolesEquipo2(leer.nextInt());//0
		
		
		
		System.out.println("Pronostico segunda partido");
		if(pronostico2.pronostico2==resultado(ronda2.partido.getGolesEquipo1(),ronda2.partido.getGolesEquipo2())) {
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
