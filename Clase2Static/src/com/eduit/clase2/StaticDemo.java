package com.eduit.clase2;
//Ejemplo de variables estatica

public class StaticDemo {

	int x; //variable de instancia normal
	static int y ; // variable estatica
	
	static int valor=1024; 
	
	
	//metodo que retorna la suma de la variable de intancia 'x'
	//y la variable estatica 'y'
	int suma() {
		return x + y;
	}
	
	//declaro un metodo estatico
	/*Restricciones metodos estatico
	 * 1)Pueden llamar solo a otros metodos estaticos de su clase
	 * 2) puede acceder solo a variables estaticas de su clase
	 * 3) no pueden utilizar una referencia .this*/
	static int valDiv2() {
		//x =12; no puedo por que 'x' no es static
		//suma();  no puedo por que 'suma()' no es static
		return valor / 2;
		
	}
	
	
}


