package com.educacionit.pila;

//esta clase es una exception personalizada

public class PilaVaciaException extends Exception{
	//insertamos un constructor con un parametro string 
	public PilaVaciaException(String message) {
		super(message);
	}
}
