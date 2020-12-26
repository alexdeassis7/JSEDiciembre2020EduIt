package com.educacionit.herencia;

import com.educacionit.herencia.inter.IParametros;
import com.educacionit.herencia.inter.IntegranteSeleccionFutbol;

//Clase Padre abstracta o superclase que implementa la interfaz "IntegranteSeleccionFutbol"
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol , IParametros{
	
	// atributos de la clase
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public SeleccionFutbol() {
		
	}
	
	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	
	}
	
	public void mostrarParametroDeLaInterface() {
		System.out.println(ipServidorUno);
		System.out.println(ipServidorDos);
		System.out.println(ipServidorTres);
		System.out.println(ipServidorCuatro);
		System.out.println(ipBaseOracle);
	}
	@Override
	public void entrenar() {
		System.out.println("entrenar (Clase Padre)");
		
	}

	@Override
	public void jugarPartido() {
		System.out.println("asiste al partido de Futbol (Clase Padre)");
		
	}

	
	
	
	//IMPORTANTE -> METODO ABSTRACTO -> NO se implementa
	//en la clase abstracta pero si en las clases hijas 
	public abstract void entrenamiento();
	
	public void partidoFutbol() {
		System.out.println("Asiste al Partido de Futbol (Clase Padre - SeleccionFutbol)");
	}

	// metodos de la clase
	public void concentrarse() {
		System.out.println("estoy concentrando (SeleccionFutbol)");
	}

	public void viajar() {
		System.out.println("estoy viajando (SeleccionFutbol)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



}
