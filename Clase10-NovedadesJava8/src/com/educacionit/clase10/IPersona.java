package com.educacionit.clase10;

public interface IPersona {

	int numero = 100;
	
	void mensaje (String message);
	
	//NOVEDAD JAVA 8
	default void metodoImplementadoEnInterfaz() {
		System.out.println("soy un metodo por defecto de la interfaz");
	}
	
	default void otroMetodoImplementadoEnInterfaz() {
		System.out.println("soy un metodo por defecto de la interfaz");
	}
	
}
