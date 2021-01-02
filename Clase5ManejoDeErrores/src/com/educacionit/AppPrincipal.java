package com.educacionit;

public class AppPrincipal {
	public static int numerador = 10;
	public static Integer denominador = null;
	public static float division;

	public static void main(String[] args) {
		System.out.println("ANTES DE HACER LA DIVISION");
		try {
			int[] array = new int[5];
			array[55] = 45;
			// instrucciones propensas a lanzar una Exeption
			division = numerador / denominador;
		} // otra forma de capturar multiples exceptions
//		catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException  e) {
//			
//		}catch (Exception e) {

		catch (ArithmeticException e) {
			// instrucciones a ejecutar cuando se produzca una Exepction
			// si hay una Exception doy valor '0' al atributo 'division'
			division = 0;
			String descripcionMensajeError = e.getMessage();
			System.out.println("el error sucedio por : " + descripcionMensajeError);
		} catch (NullPointerException e) {
			division = 1;
			System.out.println("EL error sucedio por : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			division = 2;
			System.out.println("EL error sucedio por : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Capture una Exception Generica");
		} finally {
			// instrucciones a ejecutar ,tanto si hay como sino hay Exceptiones
			System.out.println("Division: " + division);
			System.out.println("DEPUES DE HACER LA DIVISION");
		}

	}
}
