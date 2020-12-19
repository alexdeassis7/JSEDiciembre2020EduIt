package com.eduit.clase2;

public class Test {

	public static void main(String[] args) {
		double numeroPI = Math.PI;
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		//cada objeto tiene su propia copia
		//de una variable de instancia
		ob1.x = 10 ;
		ob2.x = 12 ;
		
		System.out.println("Por supuesto, ob1.x y ob2.x son independientes");
		System.out.println("ob1.x :" + ob1.x);
		System.out.println("ob1.x :" + ob2.x);
		
		
		//Cada Objeto comparte una de una variable estatica
		System.out.println("La variable estatica 'y' es compartida");
		StaticDemo.y=100;
		System.out.println("Cambio de StaticDemo.y a 100");
		
		System.out.println("ob1.suma(): " + ob1.suma());
		System.out.println("ob2.suma(): " + ob2.suma());
		
		System.out.println("El valor es : " + StaticDemo.valor);
		System.out.println("StaticDemo.valDiv2(): " +StaticDemo.valDiv2());
		
		StaticDemo.valor=4;
		System.out.println("El valor es :" +StaticDemo.valor);
		System.out.println("StaticDemo.valDiv2(): " +StaticDemo.valDiv2());
		
		
		
		
		
		
	}

}
