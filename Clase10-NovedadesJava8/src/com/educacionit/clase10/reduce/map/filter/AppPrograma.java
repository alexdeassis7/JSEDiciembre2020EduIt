package com.educacionit.clase10.reduce.map.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//novedad java 8
import java.util.stream.Stream;

public class AppPrograma {
//	https://www.adictosaltrabajo.com/2015/12/04/expresiones-lambda-con-java-8/
	public static void main(String[] args) {

		/** ######################## MAP ########################### */

		String[] myVector = new String[] { "bob", "alice", "paul", "ellie" };

		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}

		// comienzo comvirtien la matriz en un Stream
		Stream<String> myStream = Arrays.stream(myVector);

		// luego llama al metodo map , pasando una expresion Lambda , una que puede
		// comvertir una cadena
		// a mayusculas
		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());

		// volvemos a comvertir el stream (myNewStream) en un array
		String[] myNewArray = myNewStream.toArray(String[]::new);

//		String[]::new esto es como si realizamos lo siguiente
//		public String[] create(int size) {
//			return new String[size];
//		}
		for (int i = 0; i < myNewArray.length; i++) {
			System.out.println(myNewArray[i]);
		}

		/** ######################## FILTER ########################### */
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(44);
		listaNumeros.add(66);
		listaNumeros.add(55);
		listaNumeros.add(5);
		listaNumeros.add(5);
		listaNumeros.add(5);
		listaNumeros.add(5);
		listaNumeros.add(2);
		listaNumeros.add(2);
		listaNumeros.add(34);
		listaNumeros.add(5);

		Stream st = listaNumeros.stream();

		// contamos cuantas veces aparece el numero 5 en la lista de numeros
		System.out.println("cantida detectadas de numeros cinco");
		System.out.println(st.filter(Predicate.isEqual(5)).count());

		/** ######################## REDUCE ########################### */
		int myArray[] = { 1, 5, 8 };
		int sum = Arrays.stream(myArray).sum();

		System.out.println("La Suma es : " + sum);

		String[] myArray2 = { "soy" , "una" , "de" , "la" , "ultimas" , "lineas" , "de" , "codigo" , "del" , "profe" };

		for (String string : myArray2) {
			System.out.println(string);
		}

		String result = Arrays.stream(myArray2).reduce("", (a, b) -> a + b);
		
		System.out.println("RESULTADO DE REDUCE :" + result);

	}

}
