package com.educacionit;

public class DemoTryCatchAnidados {

	public static void main(String[] args) {
		// defino dos arrays
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// Capturamos la Exception de la sub clase
				System.out.println("no se encontro ningun elemento en los denominadores");
			} catch (Exception e) {
				// Capturamos la Exception de la super clase
				System.out.println("Alguna Exception Ocurrio");
				System.out.println("Mensaje obtenido del objeto Exception :" + e.getMessage());
//				e.getCause();
//				e.printStackTrace();
			}
		}
System.out.println("*****************Try catch anidados ****************************");
		// Try cath anidados
		try { // try externo
			for (int i = 0; i < nums.length; i++) {
				try {// try interno
					System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
				} catch (ArithmeticException e) {
					// capturo una ArithmeticException en el try interno
					System.out.println("no se puede dividir por cero en los numeros reales");
				}
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			// Capturo un ArrayIndexOutOfBoundsException en el try externo
			System.out.println("Errooooor programa finalizado");
		}

	}

}
