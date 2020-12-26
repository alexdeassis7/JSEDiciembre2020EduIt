package com.educacionit.herencia;
//clase hija de Seleccion de futbol
public class Futbolista extends SeleccionFutbol{
	
	//atributos de la clase
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		// super sirve para llamar al constructor de la clase padre 
		super(id, nombre, apellido,edad);
		//super(); 
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}


	//implementamos el metodo abstracto de 
	//la clase padre
	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}
	//redefino un metodo de la clase padre 
	//polimorfismo con redefinicion
	@Override
	public void partidoFutbol() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}
	
	//metodos de la clase
	public void jugarPartido() {
		System.out.println("Juega un partido (Futbolista)");
	}
	public void entrenar() {
		System.out.println("Realiza un entrenamiento (Futbolista)");
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

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	
	

}
