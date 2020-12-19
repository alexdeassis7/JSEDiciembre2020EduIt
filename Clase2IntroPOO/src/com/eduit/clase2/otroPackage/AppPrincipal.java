package com.eduit.clase2.otroPackage;

import com.eduit.clase2.Auto;
import com.eduit.clase2.Persona;

public class AppPrincipal {
	// punto de inicio de la app
	public static void main(String[] args) {
		// Instancio tres objetos de la clase Persona
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona("Lucas", "Barreto",-8);
		Persona persona5 = new Persona("Alejandro" ,"Viedma");
		
		// muestro el estado de los atributos del objeto persona1
		System.out.println(persona1.toString());
		// modifico el estado de los atributos del objeto
		//utilizamos sus Setters!
		
		persona1.setNombre("Pepe");
		persona1.setApellido("Martinez");
		persona1.setEdad(54);

		persona2.setNombre("Alex");
		persona2.setApellido("assis");
		persona2.setEdad(-50);
		
		persona3.setNombre("Mirta");
		persona3.setApellido("Stauk");
		persona3.setEdad(-9);

		// muestro el estado modificado de los atributos del objeto persona1 y persona2
		System.out.println("********Objeto persona 1********");
		System.out.println(persona1.toString());	

		System.out.println("********Objeto persona 2********");
		System.out.println(persona2.toString());
			
		System.out.println("********Objeto persona 3********");
		System.out.println(persona3.toString());
		
		System.out.println("********Objeto persona 4********");
		System.out.println(persona4.toString());
	
		System.out.println("********Objeto persona 5********");
		System.out.println(persona5.toString());
	
		//creamos o instanciamos 3 objetos de tipo Auto
		Auto a1 = new Auto();
		a1.marca = "bmw";
		a1.modelo = "320";
		a1.anio = 2015;
		a1.velocidadMaxima = 220;
		System.out.println(a1.toString());
		//invocamos o ejecutamos los metodos de la clase Auto
		a1.acelerar(50);
		a1.frenar();
		a1.cargarCombustible(43);
		
		Auto a2 = new Auto();
		a2.marca = "Mercedez";
		a2.modelo = "C250";
		a2.anio = 2013;
		a2.velocidadMaxima = 250;
		System.out.println(a2.toString());
		a2.acelerar(80);
		a2.frenar();
		a2.cargarCombustible(55);
		
		
		Auto a3 = new Auto();
		a3.marca = "Audi";
		a3.modelo = "Q5";
		a3.anio = 2011;
		a3.velocidadMaxima = 280;
		System.out.println(a3.toString());
		a3.acelerar(100);
		a3.frenar();
		a3.cargarCombustible(60);
		
	

	}

}
