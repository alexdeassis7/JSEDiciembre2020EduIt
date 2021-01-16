package com.eduacionit.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoPracticaCollections {

	public static void main(String[] args) {

		String[] lista = { "hola", "adios", "que", "tal", "estas", "hola" };
		
		// Como hacemos para eliminar los elementos repetidos y ordenar 
		// la lista alfabeticamente para mostrarla por pantalla 		
		List<String> listaCadenas = Arrays.asList(lista);
		Set<String> conjunto = new TreeSet<String>(listaCadenas);
		
		for(String cadenaAux : conjunto) {
			System.out.println(cadenaAux);
		}
		
	}

}
