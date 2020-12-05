package com.eduit.problemas.condicionales;

import java.util.Scanner;

/*3) Un obrero necesita calcular su salario semanal, el cual se obtiene
 *  de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por cada hora.
Si trabaja más de 40 horas  se le paga $16 por cada una de las primeras 40 
horas y $20 por cada hora extra
*/
public class AppPrincipal {
	public static void main(String[] args) {
		//defino mis variables de trabajo
		int hsTrabajadas , salarioSemanal,hsExtras ;
		Scanner teclado = new Scanner(System.in);
		
		//solicito datos de entrada
		System.out.println("Ingresa las horas que trabajo esta semana");
		hsTrabajadas = teclado.nextInt();
		
		//procesamos la informacion 
		if(hsTrabajadas > 40) {
			hsExtras = hsTrabajadas - 40;
			salarioSemanal = hsExtras * 20 + 40 * 16;
		}else {
			salarioSemanal = hsTrabajadas * 16;
		}		
		//mostramos la salida por pantalla 
		System.out.println("su salario semanala sera de " + salarioSemanal );
	}

}
