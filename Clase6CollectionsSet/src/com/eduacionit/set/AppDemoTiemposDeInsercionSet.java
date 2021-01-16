package com.eduacionit.set;

import java.util.*;

public class AppDemoTiemposDeInsercionSet {

	public static void main(String[] args) {
		// ********** Implementacion HASH SET	**********  
		final Set hashSet = new HashSet(1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();

		// agregamos un millon de elemento enteros al HashSet
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("tiempo de insercion del Hash Set = " + (endHashSetTime - startHashSetTime));

		//********** Implementacion TREE SET  **********		
		final Set treeSet = new TreeSet();
		final Long startTreeSetTime = System.currentTimeMillis();

		// agregamos un millon de elemento enteros al HashSet
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("tiempo de insercion del Tree Set = " + (endTreeSetTime - startTreeSetTime));
		
		//********** Implementacion LINKED HASH SET   **********
		final Set linkedHashSet = new LinkedHashSet(1_000_000);
		final Long startLinkedHashSetTime = System.currentTimeMillis();

		// agregamos un millon de elemento enteros al HashSet
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("tiempo de insercion del Linked Hash Set = " + (endLinkedHashSetTime - startLinkedHashSetTime));

		
		//Como dotamos de sincronizacion a un Set para garantizar el estado si dos o mas hilos
		//acceden de forma concurrente ?????
		Set set = Collections.synchronizedSet(new HashSet());
		Set treeset = Collections.synchronizedSet(new TreeSet());
		Set linkedset = Collections.synchronizedSet(new LinkedHashSet());
		
		
		
	}

}
