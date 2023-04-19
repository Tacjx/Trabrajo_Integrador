package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ar.edu.utn.ap40.Equipo;
import ar.edu.utn.ap40.Partido;
import ar.edu.utn.ap40.Pronostico;
import ar.edu.utn.ap40.Ronda;

class Test_ejercicio {

	@Test
	public void test() {
		Ronda prueba=new Ronda();
		String numero="1";
		
		Equipo e1=new Equipo();
		Equipo e2=new Equipo();
		
		prueba.numero.add("1");
		
		Partido par1=new Partido();
		Partido par2=new Partido();
		
		prueba.partido.add(par1);
		prueba.partido.add(par2);
		
		prueba.partido.get(0).setEquipo1(e1);
		prueba.partido.get(0).setEquipo2(e2);
		prueba.partido.get(0).setGolesEquipo1(0);
		prueba.partido.get(0).setGolesEquipo2(5);
		
		String resul1=prueba.partido.get(0).resultado(prueba.partido.get(0).getGolesEquipo1(), prueba.partido.get(0).getGolesEquipo2());
		
		Assertions.assertEquals("Gano el Equipo 2", resul1);
		
		Pronostico pro=new Pronostico();
		pro.setNombre("Tomas");
		pro.setGanoep1("0");
		pro.setGanoep2("0");
		pro.setEmpate("X");
		
		int pganar=2;
		int pperder=0;
		int pempatar=1;
		
		int puntaje=pro.resultado(pro.getGanoep1(), pro.getGanoep2(), pro.getEmpate(), resul1,pganar,pperder,pempatar);
		
		Assertions.assertEquals(0, puntaje);
		
		
		
		
		
	}

}
