package com.educacionit.pila;

// creamos una exception personalizada
public class DesbordeDePilaException extends Exception {

	public DesbordeDePilaException(String message) {
		super(message);
	}
}
