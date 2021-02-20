package com.eduit.streamsmejorados4;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ArchivosConJavaNIO {

	public static void main(String[] args) {

//		crearDirectorio();
//		System.out.println("Se creo el directorio ");
//		copiarArchivo();
//		System.out.println("se copio el archivo de propiedades");
//		moverArchivo();
//		System.out.println("se movio el archivo login-copia.properties a la carpeta datos ");
		borrarArchivo();
		System.out.println("Se borro el archivo login.properties");
		
		
	}

	public static void crearDirectorio() {

		Path path = Paths.get("datos");
		try {
			Path nuevoDirectorio = Files.createDirectory(path);
		} catch (FileAlreadyExistsException e) {
			System.out.println("ya existe un directorio con el nombre datos");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void copiarArchivo() {
		Path origenPath = Paths.get("login.properties");
		Path destino = Paths.get("login-copia.properties");

		try {

			Files.copy(origenPath, destino);

		} catch (FileAlreadyExistsException e) {
			System.out.println("ya existe un directorio con el nombre datos");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void moverArchivo() {
		Path origen = Paths.get("login-copia.properties");
		Path destino = Paths.get("datos/login-movido.properties");

		try {
			Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void borrarArchivo() {
		Path path = Paths.get("login.properties");
		
		try {
			Files.delete(path);
		}catch (IOException e) {
			System.out.println("Error , no se pudo borrar el archivo!");
		}
	}

}
