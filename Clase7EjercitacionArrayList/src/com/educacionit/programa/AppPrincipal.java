package com.educacionit.programa;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.modelos.Banco;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {

		Persona p = new Persona("Ezequiel", "Aliotta", "455435");
		Persona p1 = new Persona("Esteban", "Anfuso", "346589");
		Persona p2 = new Persona("Alejandro", "Viedma", "487302");
		Persona p3 = new Persona("Juan", "Aguilar", "439685");
		Persona p4 = new Persona("Lucas", "Barreto", "96147");
		Persona p5 = new Persona("Ranji", "Hoshino", "238639");
		// Persona p6 = new Persona("Alex", "De Assis", "455435");

		Banco b1 = new Banco();
		b1.agregarPersona(p);
		b1.agregarPersona(p1);
		b1.agregarPersona(p2);
		b1.agregarPersona(p3);
		b1.agregarPersona(p4);
		b1.agregarPersona(p5);
		// b1.agregarPersona(p6);
		System.out.println("Cantidad de persona en la fila : " + b1.cuantasPersonaHay());

		b1.mostrarLaFila();
		b1.eliminarPersonaDeFila(p1);
		b1.eliminarPersonaDeFila(p1);

		System.out.println("Cantidad de persona en la fila : " + b1.cuantasPersonaHay());

		/*************************************************************************/
		System.out.println("***************************************************************");

		ArrayList<String> nombreArrayList = new ArrayList<>();
		nombreArrayList.add("Elemento");
		nombreArrayList.add("Elemento2");
		nombreArrayList.add("Elemento3");

		System.out.println("cantidad de elementos  = " + nombreArrayList.size());

		System.out.println("Elemento de la posicion 2 " + nombreArrayList.get(2));

		System.out.println("Contiene a 'Elemento' ???" + nombreArrayList.contains("Elemento"));

		System.out.println(nombreArrayList);
		// borramos todos los elementos del arrayList
		// nombreArrayList.clear();
		// System.out.println(nombreArrayList);

		// Comvertimos un arrayList a un array
		Object[] array = nombreArrayList.toArray();

		ArrayList<String> miArray = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			miArray.add("Elemento" + i);
		}

		System.out.println(miArray);
		miArray.add(2, "Elemento 3"); //agrego elemeto en la posicion 2
		System.out.println(miArray);
		
		//Declaramos un Iterador e imprimimos los elementos del ArraysList
		Iterator<String> nombreIterator = miArray.iterator();
		System.out.println(miArray);
		
		
		while(nombreIterator.hasNext()) {
			String elemento = nombreIterator.next();
			if(elemento.equals("Elemento 3")) {
				nombreIterator.remove();
			}
		}

		System.out.println(miArray);
	}
}
