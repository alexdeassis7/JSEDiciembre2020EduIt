package com.educacionit;

public class AppPrincipal {
	public static final int LIMITE2  = 10;
	
	public static void main(String[] args) {
	 // Keyword final!
		final int LIMITE = 5 ;
	
		final double PI = 3.14159265;
		
		
		String a1 = new String ("Juan");
		String a2 = new String ("Pepe");
		
		short n1 = 5 , n2 = 45 ;
		
		if(n1 == n2) {
			System.out.println("los numeros son iguales !");
		}else {
			System.out.println("los numeros son diferentes");
		}
		
		if(a1.equals(a2)) {
			System.out.println("las palabras son iguales !");
		}else {
			System.out.println("las palabras son diferentes");
		}
		
		
		
	}

}
