package com.educacionit.principal;

import com.educacionit.models.Passenger;
import com.educacionit.models.Vuelo;
import com.educacionit.models.VueloCarga;

public class AppPrincipal {

	public static void main(String[] args) {
		
		VueloCarga vc = new VueloCarga();
		vc.agregarPaquete(1, 12, 11);
		vc.agregarPaquete(1, 12, 11);
		vc.agregarPaquete(8, 12, 11);
		//me creo 3 objetos de tipo Passenger
		Passenger nico = new Passenger(1);
		Passenger martin = new Passenger(5);
		Passenger ezequiel = new Passenger(5,1);
		//me creo un array y agrego los 3 pasajeros
		Passenger[] pasajeros = new Passenger[3];
		pasajeros[0] = nico;
		pasajeros[1] = martin;
		pasajeros[2] = ezequiel;
		
		Passenger.mostrarListaPasajeros(pasajeros);
		
		
		
		Vuelo[] flota = new Vuelo[4];
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();
		
		Vuelo f2 = new Vuelo();
		System.out.println(f2.getAsientos());
		
		Vuelo f3 = new VueloCarga();
		System.out.println(f3.getAsientos());
		
		//ESTO NO SE PUEDE 
		// VueloCarga p =  new Vuelo();
		
		Vuelo v = new VueloCarga();
		Object p = new Vuelo();
			
		for (int i = 0 ; i < 160 ; i ++) {
			System.out.print(i);
			v.agregarPasajero(new Passenger());
		}
		
		
		
		
		
		
		
	}

}
