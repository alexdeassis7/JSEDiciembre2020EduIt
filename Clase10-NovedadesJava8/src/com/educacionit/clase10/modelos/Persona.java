package com.educacionit.clase10.modelos;

import com.educacionit.clase10.IPersona;
//Nueva API de Java 1.8 que contiene una serie de interfaces funcionales de uso comun ,
//las interfaces de este package esta anotadas con @FuctionalInteface
//cabe destacar que dicha anotacion, @FuctionalInterface , podemos utilizarla en 
//una interfaz que queramos declararla como funcional , estas interfaces funcionales 
//se caracterizan porque pueden ser instanciadas por lambdas.
import java.util.function.*;
import java.util.stream.*;
//Clase LocalTime  12:30:59 , LocalDate 2021-03-31 ,LocalDateTime fecha + hora
import java.time.*;


public class Persona implements IPersona{

	@Override
	public void mensaje(String message) {
		System.out.println("el mensaje es " + message);
		
	}

}
