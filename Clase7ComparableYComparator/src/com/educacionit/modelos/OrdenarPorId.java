package com.educacionit.modelos;

import java.util.Comparator;

//Un Comparador de elementos es una clase de apoyo que sera utilizada para los metodos de ordenamiento
//esto se logra implementando la interface java.util.Comparator

public class OrdenarPorId implements Comparator<Persona>{

//El metodo compare() retorna lo siquiente :
/* Condicion			valor que debe devolver
 * o1 < o2              un numero menor a cero   
 * o1 == o2             cero
 * o1 > o2              un numero mayor a cero 
 * */
	//ordeno de manera Descendente
//	@Override
//	public int compare(Persona o1, Persona o2) {
//		return o2.getIdPersona() - o1.getIdPersona();
//	}
	//ordeno de manera Ascendente
	@Override
	public int compare(Persona o1, Persona o2) {
		return o2.getIdPersona() - o2.getIdPersona();
	}

}
