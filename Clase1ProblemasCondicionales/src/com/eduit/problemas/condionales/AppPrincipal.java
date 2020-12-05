package com.eduit.problemas.condionales;

import java.util.Scanner;

/*3)	Determinar la cantidad de dinero que recibirá un trabajador por 
 * concepto de las horas extras trabajadas en una empresa, sabiendo que cuando
 *  las horas de trabajo exceden de 40, el resto se consideran horas extras y 
 *  que estas se pagan al doble de una hora normal cuando no exceden de 8 ; si 
 *  las horas extras exceden de 8 se pagan las primeras 8 al doble de lo que se 
 *  pagan las horas normales y el resto al triple*/
public class AppPrincipal {
	public static void main(String[] args) {
		int hsTrabajadas, valorHs, total_a_pagar, hsExtras, cobraExtras, pagaDoble, pagaTriple;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por Favor Ingrese la hs trabajadas");
		hsTrabajadas = teclado.nextInt();

		System.out.println("Por Favor Ingrese el valor de la hs ");
		valorHs = teclado.nextInt();

		if (hsTrabajadas <= 40) {
			total_a_pagar = hsTrabajadas * valorHs;
		} else {
			hsExtras = hsTrabajadas - 40;
			if (hsExtras <= 8) {
				cobraExtras = hsExtras * valorHs * 2;
			} else {
				pagaDoble = 8 * valorHs * 2;
				pagaTriple = (hsExtras - 8) * valorHs * 3;
				cobraExtras = pagaDoble + pagaTriple;
			}
			total_a_pagar = 40 * valorHs +cobraExtras;
		}
		System.out.println("el total a pagar es : " + total_a_pagar);
	}

}
