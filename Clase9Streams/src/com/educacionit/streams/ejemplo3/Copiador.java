package com.educacionit.streams.ejemplo3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copiador {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);

		int unCaracter;

		System.out.println("Estamos copiando el contenido del archivo fuente.txt al archivo destino.txt");

		while ((unCaracter = in.read()) != -1) {
			out.write((char) unCaracter);
		}

		in.close();
		out.close();
		System.out.println("ya se termino de copiar tusw archivos ");

	}

}
