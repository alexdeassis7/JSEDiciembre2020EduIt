package com.eduit.streamsmejorados2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) throws IOException {
		File outputFile = new File(
				"archivosES" + File.separator + "salida" + File.separator + "destino.txt");

		String linea1 = "Hola, soy la primer linea";
		String linea2 = "Hola, soy la segunda linea";
		String linea3 = "Hola, soy la tercera linea";

		BufferedWriter writerMejorado = new BufferedWriter(new FileWriter(outputFile));

		writerMejorado.write(linea1, 0, linea1.length());
		writerMejorado.newLine();
		writerMejorado.write(linea2, 0, linea2.length());
		writerMejorado.newLine();
		writerMejorado.write(linea3, 0, linea3.length());
		writerMejorado.newLine();
		System.out.println("se termino deescribir en el archivo de destino");
		
		writerMejorado.close();

	}

}
