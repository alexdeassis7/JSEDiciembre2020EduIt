package com.eduit.problemas.secuenciales;

import java.util.Scanner;

public class AppPrincipal {
	/*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber 
	 * cuanto debera pagar finalmente por su compra	 * 
	 * */
	public static void main(String[] args) {
		//defino las variables de trabajo 
		float totalCompra, descuento , total_a_pagar;
		
		Scanner teclado = new Scanner(System.in);
		
		//solicito ingreso de datos al usuario 
		System.out.println("por favor ingrese el total de su compra!");
		totalCompra = teclado.nextFloat();
		
		//procesamos la infomarcion 
		descuento = totalCompra * 0.15f;
		total_a_pagar = totalCompra - descuento;
		
		//mostramos los resultados por la pantalla 
		System.out.println("el total a pagar con el descuento es : " + total_a_pagar);
		
		teclado.close();
	}

}
