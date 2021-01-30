package com.educacionit.modelos;

import java.util.ArrayList;

public class Banco {
	public ArrayList<Persona> fila = new ArrayList();

	public int cuantasPersonaHay() {
		return fila.size();
	}

	public void agregarPersona(Persona persona) {
		if (!fila.contains(persona)) {
			fila.add(persona); // en caso de no existir la persona en la collections la agrego
		} else {
			System.out.println("La persona con DNI : " + persona.getDni() + " Ya se encuentra en la fila del Banco");
		}
	}

	public void eliminarPersonaDeFila(Persona persona) {
		if (fila.contains(persona)) {
			fila.remove(persona);
			System.out.println("Se quito de la fila a " + persona.getNombre());
		} else {
			System.out.println(persona.getNombre() + " No se encuentra en la fila del banco");
		}
	}

	public void mostrarLaFila() {
		for (Persona personaAux : fila) {
			System.out.println("Nombre: " + personaAux.getNombre() + " ,DNI : " + personaAux.getDni());
		}
	}

}
