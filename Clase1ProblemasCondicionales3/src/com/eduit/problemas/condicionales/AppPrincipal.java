package com.eduit.problemas.condicionales;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		int numeroIngresado ;
		Scanner teclado =  new Scanner(System.in);
		
		System.out.println("ingrese un numero entre 1 y 7");
		numeroIngresado = teclado.nextInt();
		
		switch (numeroIngresado) {
		case 1:
			   System.out.println("Domingo");
			break;
		case 2:
			   System.out.println("Lunes");
			break;
		case 3:
			   System.out.println("Martes");
			break;
		case 4:
			   System.out.println("Miercoles");
			break;
		case 5:
			   System.out.println("Jueves");
			break;
		case 6:
			   System.out.println("Viernes");
			break;
		case 7:
			   System.out.println("Sabado");
			break;
		default:
			 System.out.println("El numero ingresado es Incorrecto!");
			break;
		}
		
		
		
	}

}
