package com.educacionit.herencia;
//clase hija de Seleccion de futbol
public class Entrenador extends SeleccionFutbol{
		//atributos de la clase
		private String idFederacion;
		
		public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
			// super sirve para llamar al constructor de la clase padre 
			super(id, nombre, apellido,edad);
			this.idFederacion = idFederacion;
		}
		@Override
		public void entrenar() {
		 System.out.println("Dirige un entrenamiento (Clase Entrenador)");
			
		}

		@Override
		public void jugarPartido() {
			System.out.println("Dirige un Partido(Clase Entrenador)");
			
		}
		//implementamos el metodo abstracto de 
		//la clase padre
		@Override
		public void entrenamiento() {
			System.out.println("Realiza un entrenamiento (Clase Entrenador)");
		}
		//redefino un metodo de la clase padre 
		//polimorfismo con redefinicion
		@Override
		public void partidoFutbol() {
			System.out.println("Dirige un Partido (Clase Entrenador)");
		}
		
		
		//metodos de la clase		
		public void dirigirPartido() {
			System.out.println("estoy dirigiendo partido (Entrenador)");
		}
		
		public void dirigirEntrenamiento() {
			System.out.println("estoy dirigiendo entranamiento (Entrenador)");
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

		public String getIdFederacion() {
			return idFederacion;
		}

		public void setIdFederacion(String idFederacion) {
			this.idFederacion = idFederacion;
		}

	
		
		
}
