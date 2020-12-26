package com.educacionit.models;
//Calse Padre
public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// inicializador de bloque : detro ponemos el codigo que queremos que se ejecute
	// EN TODOS LOS CONSTRUCTORES
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
		}
	}

	public Vuelo() {

	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;

	}
	
	public int getAsientos() {
		return getAsiento();
	}
	
	public int getAsiento() {
		return 150;
	}
	
	public void agregarPasajero(Passenger p1) {
		if(asientoDisponible()) {
			pasajeros += 1;
			System.out.println("se agrego un pasajero ");
		}else {
			faltaAsiento();
		}	
		
	}
	
	private void faltaAsiento() {
		System.out.println("Ya no quedan asiento , busque otra aerolinea");
	}

	private boolean asientoDisponible() {
		//valido que el numero de pasajeros sean menor al numero de asientos
		return pasajeros < getAsiento();
	}

}
