package com.educacionit.streams.ejemplo2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Escritor {

	public static void main(String[] args) throws IOException {
		
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");
		
		FileWriter out = new FileWriter(outputFile);
		
		String infoApersistir = JOptionPane.showInputDialog("Ingrese el texto a persistir en el destino.txt");
	
		for(int i = 0 ; i < infoApersistir.length() ; i++) {
			out.write(infoApersistir.charAt(i));
		}
		
		out.close();
		

	}

}
