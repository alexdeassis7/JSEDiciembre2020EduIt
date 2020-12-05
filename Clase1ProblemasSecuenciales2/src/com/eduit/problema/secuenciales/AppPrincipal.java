package com.eduit.problema.secuenciales;

import java.util.Scanner;

/*Un maestro desea saber que porcentaje de hombre y que porcentaje de mujeres
 * hay en un grupo de estudiantes */

public class AppPrincipal {
	public static void main(String[] args) {
		//defino mis variables de trabajo 
		float numHombres ,numMujeres , totalAlumnos , porcentajeHombres ,porcentajeMujeres;
		Scanner teclado = new Scanner(System.in);
		//obtengo los datos de entrada 
		System.out.println("por favor ingrese el numero de mujeres");
		numMujeres = teclado.nextFloat();
		
		System.out.println("por favor ingrese el numero de hombres");
		numHombres = teclado.nextFloat();
		
		//procesamos la informacion
		totalAlumnos = numHombres + numMujeres;
		porcentajeHombres = numHombres * 100 / totalAlumnos;
		porcentajeMujeres = numMujeres * 100 / totalAlumnos;
		
		//mostramos los resultados obtenidos 
		System.out.println("el porcentaje de hombres es : " + porcentajeHombres);
		System.out.println("el porcentaje de mujeres es : " + porcentajeMujeres);
		
		
	}
}
