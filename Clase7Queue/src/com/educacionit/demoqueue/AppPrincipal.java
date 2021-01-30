package com.educacionit.demoqueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class AppPrincipal {

	public static void main(String[] args) {
		// Creamos una Cola Indicando el tipo de dato
		Queue<Integer> cola = new LinkedList();
		// al eliminar un elemento de la cola vacia se genera una Exception
		try {
			cola.remove();
		} catch (NoSuchElementException e) {
			System.out.println("No se puede extraer datos por que la cola esta vacia!");
		}

		// Insertamos datos
		cola.offer(3);
		cola.add(14);
		cola.offer(12);
		cola.add(7);
		cola.offer(10);
		// imprimimos la cola por consola
		System.out.println("Cola:  " + cola);

		// metod poll(Retorna null si la cola esta vacia )
		// y remove (gerena exception si la cola esta vacia) me sirve para desencolar
		System.out.println(cola.poll());
		System.out.println(cola.remove());

		// muestro el frente de la cola con metodo peek()
		System.out.println(cola.peek());
		while (cola.poll() != null) {// desencolamos y comparamos el valor con null
			System.out.println(cola.peek());
		}
		// muestra null debido a que la cola ya esta vacia
		System.out.println(cola.peek());

		System.out.println("----------------Cola de String---------------------");
		Queue queue = new LinkedList<>();
		// agregamos elementos a la cola si algo sale mal se lanzara una Exception
		queue.add("Item1");
		queue.add("Item2");
		// Usamos el metodo Offer para encolar, si algo sale mal retorna tru o false
		if (queue.offer("Item3")) {
			System.out.println("Se encolo el item 3");
		}
		System.out.println(queue);

		// validamos si un determinado elemento existe dentro de la cola
		System.out.println(queue.contains("Item2"));
		System.out.println(queue.contains("elementoInexistente"));
		// Observamos que elemento esta en el primer puesto de la cola (sin eliminarlo )
		// si la cola esta vacia lanza un NoSuchElementException
		System.out.println("Primer elemento es : " + queue.element());

	}

}
