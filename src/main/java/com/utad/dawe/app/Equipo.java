package com.utad.dawe.app;

import com.utad.dawe.model.JugadorBalonMano;

public class Equipo {

	public static void main(String[] args) {
		
		JugadorBalonMano jugador1= new JugadorBalonMano("Pepe Pérez", 13);
		
		JugadorBalonMano jugador2=new JugadorBalonMano("Juan Pérez", 10);
		
		for(int i=1;i<=10;i++) {
			jugador1.setAnotacion((int)(Math.random()*5));
			jugador1.setBloqueo((int)(Math.random()*3));
			jugador1.setTiempoJugado((int)(Math.random()*60));
			
			jugador2.setAnotacion((int)(Math.random()*5));
			jugador2.setBloqueo((int)(Math.random()*3));
			jugador2.setTiempoJugado((int)(Math.random()*60));
			
			System.out.println("Jornada" + i);
			System.out.println(jugador1);
			System.out.println(jugador2);
			
			
			if(i==5 || i==10) {
				System.out.println("Estadisticas de la jornada " + i);
				System.out.println(jugador1);
				System.out.println(jugador2);
			}
		}

	}

}
