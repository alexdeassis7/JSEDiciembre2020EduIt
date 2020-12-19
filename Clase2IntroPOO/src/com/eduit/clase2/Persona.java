package com.eduit.clase2;

//defino la clase para utilizarla como un template 
//y poder luego instanciar objetos 
public class Persona {
	// Atributos De La Clase Persona
	// definen las caracteristicas de la clase
	private String nombre;
	private String apellido;
	private int edad;
	// private int cantidadDeOjos = 2;

	// Metodo Constructor VACIO!
	public Persona() {

	}
	
	//Metodo Constructor Con todos los parametros!
	public Persona(String nombre , String apellido , int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
	}
	//Metodo Constructor Con dos  parametros!
	public Persona(String nombre , String apellido ){
		this.nombre = nombre;
		this.apellido = apellido;
			
	}

	// funcion Getters : obtener el estado de un atributo
	public String getNombre() {
		return nombre;
	}

	// procedimiento Setters : sirve para modificar el estado de un atributo
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
		if (edad > 0) {
			this.edad = edad;
		} else {
			System.out.println("ERROR:No podes Setear una Edad Menor a Cero a " + nombre);
		}
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
