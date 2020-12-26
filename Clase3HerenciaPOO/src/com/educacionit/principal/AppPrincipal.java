package com.educacionit.principal;

import java.util.ArrayList;

import com.educacionit.herencia.Entrenador;
import com.educacionit.herencia.Futbolista;
import com.educacionit.herencia.Masajista;
import com.educacionit.herencia.SeleccionFutbol;
import com.educacionit.herencia.inter.IntegranteSeleccionFutbol;

public class AppPrincipal {
	// ArrayList de objetos SeleccionFutbol . Independientemente de la clase
	// a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		// No se peude instanciar un objeto de una clase abstracta
		// SeleccionFutbol sf = new SeleccionFutbol();

		Entrenador delBosque = new Entrenador(1, "vicente", "Del Bosque", 60, "28EEFF98");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 28, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 44, "Licenciado en Fisioterapia", 12);

		// agregamos todos los elementos al arrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// ejecutamos los metodos genewricos de la clase padre
		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion.(Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ");
			integrante.concentrarse();
		}

		System.out.println("************************************");

		// VIAJE
		System.out.println("Todos los integrantes viajan a jugar un partido.(Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ");
			integrante.viajar();
		}
		// ejecutamos los metodos propios de las clases hijas

//		// ENTRANAMIENTO
		System.out.println("ENTRANAMIENTO");
		System.out.println("Entrenamiento : Solamente el entrenador y el futbolista tienen metodos para entrenar");
//		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " ->");
//		delBosque.dirigirEntrenamiento();
//		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
//		iniesta.entrenar();
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.entrenar();
		}

		// MASAJE
		System.out.println("MASAJE");
		System.out.println("MAsaje : solo el masajista tiene el metodo para dar un masaje ");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " ->");
		raulMartinez.darMasaje();

		// PARTIDO DE FUTBOL
		System.out.println("PARTIDO DE FUTBOL");
		System.out.println(
				"Partido de Futbol: Solamente el entrenador y el futbolista tiene metodo para el partido de futbol");
//		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " ->");
//		delBosque.dirigirPartido();
//		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
//		iniesta.jugarPartido();
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.jugarPartido();
		}

		// POLIMORFISMO
		System.out.println("***************** ENTRENAMIENTO ****************");
		System.out.println("Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ");
			integrante.entrenamiento();
		}

		System.out.println("***************** PARTIDO DE FUTBOL ****************");
		System.out.println("Todos los integrantes tienen su funcion en un Partido (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ");
			integrante.partidoFutbol();
		}

		raulMartinez.entrenar();
//		raulMartinez.jugarPartido();

		raulMartinez.mostrarParametroDeLaInterface();
		iniesta.mostrarParametroDeLaInterface();
		delBosque.mostrarParametroDeLaInterface();
	}

}
