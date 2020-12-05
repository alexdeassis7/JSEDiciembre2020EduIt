package com.eduit.problemas.repetitivos;

import java.util.Scanner;

public class AppPrincipal {
	/*
	 * 4) Leer 20 números e imprimir cuantos son positivos , cuantos negativos y
	 * cuantos neutros
	 */
	public static void main(String[] args) {
		int numeroIngresado, cantidadNegativos = 0, cantidadPositivos = 0, cantidadNeutros = 0;
		Scanner teclado = new Scanner(System.in);

//		for (int i = 1; i <= 20; i++) {
//			System.out.println("Ingrese el numero " + i);
//			numeroIngresado = teclado.nextInt();
//			if (numeroIngresado > 0) {
//				cantidadPositivos++;
//			} else if (numeroIngresado < 0) {
//				cantidadNegativos++;
//			} else {
//				cantidadNeutros++;
//			}
//		}

//		int contador = 1;
//		while (contador <= 20) {
//			System.out.println("Ingrese el numero " + contador);
//			numeroIngresado = teclado.nextInt();
//			if (numeroIngresado > 0) {
//				cantidadPositivos++;
//			} else if (numeroIngresado < 0) {
//				cantidadNegativos++;
//			} else {
//				cantidadNeutros++;
//			}
//
//			contador++;
//		}
		int contador = 1;
		do {
			System.out.println("Ingrese el numero " + contador);
			numeroIngresado = teclado.nextInt();
			if (numeroIngresado > 0) {
				cantidadPositivos++;
			} else if (numeroIngresado < 0) {
				cantidadNegativos++;
			} else {
				cantidadNeutros++;
			}
			contador++;
		} while (contador <= 20);

		System.out.println("Cantidad de positivos : " + cantidadPositivos);
		System.out.println("Cantidad de neutros :" + cantidadNeutros);
		System.out.println("Cantidad de negativos : " + cantidadNegativos);

	}

}
