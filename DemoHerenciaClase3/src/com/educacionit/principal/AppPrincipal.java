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
		
		Passenger nico = new Passenger();
		Passenger martin = new Passenger();
		
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
