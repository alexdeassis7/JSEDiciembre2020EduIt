package com.educacionit.pila;
//dentro de la clase Pila tenemos tres metodos 

import java.util.Scanner;
import java.util.Stack;
//import java.util.*;

public class Pila {
	// definimos los atributo de la clase
	public static int i = 0;
	public static int num; // elemeto a ingresar por teclado para agregar a la pila
	public static int[] a = new int[3];
	public static Stack<Integer> p = new Stack<>();

	public static void inserta() throws DesbordeDePilaException {
		Scanner s = new Scanner(System.in);
		if (i == a.length) {
			throw new DesbordeDePilaException("\n La pila esta llena , DESBORDAMIENTO");
		} else {
			System.out.println("Teclea el dato a  ingresar en la Pila :");
			num = s.nextInt(); // leo el dato ingresado por teclado
			a[i] = p.push(num); // pusheo el elemento
			i++;
		}
	}

	public static void extraer() throws PilaVaciaException {
		// empty me retorna true o false dependiendo si la pila esta vacia o no
		if (p.empty()) {
			// si la pila esta vacia lanzo mi propia exception
			throw new PilaVaciaException("La pila esta vacia , ya no hay elementos pasa extraer!");
		} else {
			p.pop(); // extraigo un elemento de la pila
			i--;
		}
	}

	public static void main(String[] args) {// throws PilaVaciaException , DesbordeDePilaException{

		try {
			Scanner t = new Scanner(System.in);
			int opc;

			do {
				System.out.println("Menu \n 1.Insertar\n 2 Extraer \n 3 Mostrar Pila");
				System.out.println("Teclea la opcion :");
				opc = t.nextInt();

				switch (opc) {
				case 1:
					inserta();
					break;
				case 2:
					extraer();
					break;
				case 3:
					System.out.println("PILA =  " + p);
					break;

				default:
					System.out.println("Opcion no valida");
					break;
				}
			} while (opc == 1 || opc == 2 || opc == 3);
		} catch (DesbordeDePilaException | PilaVaciaException e) {
			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
		} finally {
			System.out.println("\n Programa de Creacion de Exceptions Personalizadas con pilas ");
		}
	}

}
