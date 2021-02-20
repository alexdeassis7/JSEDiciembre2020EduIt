package com.educacionit.clase10.programa;

import com.educacionit.clase10.interfacesfuncionales.ICalculadoraLambda;
import com.educacionit.clase10.interfacesfuncionales.MiValParam;
import com.educacionit.clase10.interfacesfuncionales.MiValor;
import com.educacionit.clase10.interfacesfuncionales.PruebaString;

public class AppPrincipal {

	public static void main(String[] args) {

		MiValor miVal;

		miVal = () -> 28.6;
		// comvinamos los dos paso anteriores en una
		// sola declaracion
		MiValor miVal2 = () -> 3.8;

		// llama a getValor(), que se implementa mediante la expresion
		// lambsa asignada previamente
		System.out.println("Un valor constante " + miVal.getValor());
		System.out.println("Un valor constante " + miVal2.getValor());

		// Otro ejemplo

		MiValParam miValor = (n) -> 1.0 / n;
		System.out.println("El reciproco de 4.0 es : " + miValor.getValor(4.0));

		// aqui n se especifica como double ,por lo gral no es necesario
		// especificar explicitamente el tipo ya que se puede inferir de manera
		// implicita
		MiValParam miValor2 = (double n) -> 1.0 / n;
		System.out.println("El reciproco de 4.0 es: " + miValor2.getValor(4.0));

		// Esta expresion Lambda determina si un string es parte de otro

		PruebaString esParte = (a, b) -> a.indexOf(b) != -1;

		String str = "Esto es una prueba de LambdaExpresion";

		System.out.println("Probando String : " + str);

		if (esParte.prueba(str, "es una")) {
			System.out.println("'es una'  fue encontrado dentro de la cadena de caracteres");
		} else {
			System.out.println("'es una' NOOOO fue encontrado dentro de la cadena de caracteres");
		}

		if (esParte.prueba(str, "xyz")) {
			System.out.println("'xyz' fue encontrado dentro de la cadena");
		}else {
			System.out.println("'xyz' nooooo fue encontrado dentro de la cadena ");
		}
		//Otro ejemplo mas 
		ICalculadoraLambda iSuma = (x ,y) -> x + y ;
		ICalculadoraLambda iMultiplicacion = (x ,y) -> x * y ;
		
		System.out.println(iSuma.operacion(4, 5));
		
		System.out.println(iMultiplicacion.operacion(4, 5));
		

	}

}
