package com.eduit.streamsmejorados3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Properties;

public class StreamRemote {

	public static void main(String[] args) {
		/*
		 * esto lo utilizarian en caso de tener un proxy en su pc / server Properties
		 * systemSettings = System.getProperties(); systemSettings.put("proxySet",
		 * "true"); systemSettings.put("http.proxyHost","192.168.0.1") ;
		 * systemSettings.put("http.proxyPort", "80") ;
		 */
		try {
			URL url = new URL(
					"https://raw.githubusercontent.com/alexdeassis7/JSEDiciembre2020EduIt/main/miPrimerPRoyectoWeb/WebContent/formPersona.html");

			BufferedReader elBuffer = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

			boolean eof = false;
			String unaLinea;

			while (!eof) {
				unaLinea = elBuffer.readLine();

				if (unaLinea != null) {
					System.out.println(unaLinea);
				} else {
					eof = true;
				}
			}

		} catch (MalformedURLException e) {
			System.out.println("La url es invalida");
		} catch (IOException e) {
			System.out.println("No pudimos hacer el stream de Internet");
		}
	}

}
