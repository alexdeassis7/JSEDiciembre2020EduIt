package com.educacionit.programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.modelos.OrdenarPorId;
import com.educacionit.modelos.Persona;

public class AppPrincipal {
	public static void main(String[] args) {

		Set<Persona> personas = new TreeSet<>();

		personas.add(new Persona(1, "Alejandro"));
		personas.add(new Persona(99, "Esteban"));
		personas.add(new Persona(4, "Juan"));
		personas.add(new Persona(5, "Lucas"));
		personas.add(new Persona(6, "Ranji"));
		personas.add(new Persona(3, "Ezequiel"));

		System.out.println("Conjunto de personas Ordenados por nombres : ");
		System.out.println(personas);

		
		List<Persona> otrasPersonas = Arrays.asList(new Persona(4, "Juana"), new Persona(2, "Fernando"),
				new Persona(1, "Mariana"), new Persona(33, "Omar"), new Persona(66, "Sergio"));

		Collections.sort(otrasPersonas, new OrdenarPorId());
		
		System.out.println("Conjunto de Personas Ordenados por id :");
		System.out.println(otrasPersonas);

	}
}
