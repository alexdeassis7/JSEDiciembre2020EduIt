package com.educacionit.herencia;

//clase hija de seleccion de futbol
public class Masajista extends SeleccionFutbol {

	// atributos de la clase
	private String titulacion;
	private int aniosExperiencia;

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		// super sirve para llamar al constructor de la clase padre
		super(id, nombre, apellido, edad);
//		super();
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
		
	}


	// implementamos el metodo abstracto de
	// la clase padre
	@Override
	public void entrenamiento() {
		System.out.println("el masajista Realiza un entrenamiento (Clase Masajista)");
	}

	// metodos de la clase
	public void darMasaje() {
		System.out.println("estoy dando un masaje (Masajista)");
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

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public void entrenar() {
		System.out.println("Da asisitencia en el entrenamiento (Clase Masajista)");
		
	}



}
