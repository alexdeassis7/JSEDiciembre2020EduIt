package com.eduit.clase2;
public class Auto {
	//Atributos de la clase Auto
	public String marca;
	public String modelo;
	public int anio;
	public float velocidadMaxima;	
	//Metodos : Definen el comportamiento de la clase
	public void acelerar(int kmXhs) {
		System.out.println("estoy acelerando mi " + modelo + " a " + kmXhs + " Km x Hs.");
	}
	
	public void frenar() {
		System.out.println("estoy frenando el " + marca);
	}
	
	public void cargarCombustible(int listroAcargar) {
		System.out.println("Estoy cargando " + listroAcargar + " Litros en la estacion de Combustible.");
	}

	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", velocidadMaxima=" + velocidadMaxima
				+ "]";
	}
	
}
