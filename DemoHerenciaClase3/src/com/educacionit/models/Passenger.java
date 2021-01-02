package com.educacionit.models;

public class Passenger {
	// defino los atrinutos de la clase
	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalaPagar;
	private int totalEquipaje;

	// constructor 1 vacio
	public Passenger() {

	}

	// constructor 2 con un parametro : invoca al constructor privado
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0d);
		this.bolsos = bolsos;
		totalaPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	}

	// constructor 3 con dos parametros : este constructor llama al constructor 2
	// que a su vez
	// invoca al constructor privado.
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalaPagar = bolsos * tarifaXbolso;

	}

	private Passenger(double tarifaXbolso) {
		this.tarifaXbolso = tarifaXbolso;
	}

	public int getBolsosGratis() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

	public double getTotalaPagar() {
		return totalaPagar;
	}

	public static void mostrarListaPasajeros(Passenger listaPAsajeros[]) {
		for (Passenger p1 : listaPAsajeros) {
			System.out.println("****************************");
			System.out.println("Tarifa por bolso: " + p1.getTarifaXbolso());
			System.out.println("Total a pagar : " + p1.getTotalaPagar());
			System.out.println("Total De Equipaje: " + p1.getTotalEquipaje());
		}
	}

}
