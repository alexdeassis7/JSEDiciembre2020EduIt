package com.educacionit.clase8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
///Bolsa NO GENERICA!
public class Bolsa implements Iterable {

	private ArrayList lista = new ArrayList();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(Object objeto) {
		if (lista.size() <= tope) {
			lista.add(objeto);
			System.out.println("se agrego el elemento a la bolsa");
		} else {
			throw new RuntimeException("No Caben Mas elementos");
		}
	}

	@Override
	public Iterator iterator() {		
		return lista.iterator();
	}

}
