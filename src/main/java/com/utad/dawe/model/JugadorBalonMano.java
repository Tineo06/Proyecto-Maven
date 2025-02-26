package com.utad.dawe.model;

public class JugadorBalonMano {

	private String Nombre;
	private int dorsal;
	private int anotacion;
	private int bloqueo;
	private int TiempoJugado; //en segundos
	
	
	public JugadorBalonMano(String nombre, int dorsal) {
		Nombre = nombre;
		this.dorsal = dorsal;
	}


	public void setAnotacion(int anotacion) {
		this.anotacion = anotacion;
	}


	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}


	public void setTiempoJugado(int tiempoJugado) {
		TiempoJugado = tiempoJugado;
	}


	@Override
	public String toString() {
		return "JugadorBalonMano [Nombre=" + Nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo="
				+ bloqueo + ", TiempoJugado=" + TiempoJugado + "]";
	}
}
