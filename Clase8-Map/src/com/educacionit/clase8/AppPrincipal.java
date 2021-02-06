package com.educacionit.clase8;

import java.time.temporal.JulianFields;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.educacionit.modelo.SeleccionFutbol;

public class AppPrincipal {

	public static void main(String[] args) {
		/* MAP : Principales Metodos para trabajar */

		// Declaramos un Map (un HAshMap) con clave "Integer" y Valor "String"
		// Las claves pueden ser de cualquier tipo de objeto!,CUIDADO! no pueden ser
		// datos atomicos
		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		System.out.println("num de elementos del map : " + nombreMap.size());
		System.out.println("el map testa vacio ? " + nombreMap.isEmpty());
		System.out.println("agregamos dos elementos al map :");
		nombreMap.put(10, "Diego Maradona");
		nombreMap.put(9, "Messi");
		System.out.println("el elemento con clave 10 es :" + nombreMap.get(10));

		System.out.println("removemos un elemento en particular del map ");
		nombreMap.remove(10);

		System.out.println("existe la clave 9 en el map ?" + nombreMap.containsKey(9));

		System.out.println("existe el valor messi en el map ?" + nombreMap.containsValue("Messi"));

		System.out.println("borramos todos los componentes del map");
		nombreMap.clear();

		// devuelve una "Collection" con los valores del Map
		nombreMap.values();

		// Otro elemento util a la hora de trabajar con los MAps con los Iterator.
		// estos nos permites reccorrer los map , solo tienen 3 metodos :
		// 1) hasNext() :para comprobar que siguen quedando elementos en el iterator
		// 2) next(): para que nos retorne el siguiente elemento del iterator
		// 3) remove() : sirve para eliminar un elemento del iterator

		// HASH MAP
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");
		map.put(3, "Pique");
		map.put(11, "Capdevila");
		map.put(16, "Busquest");
		map.put(18, "Pedrito");
		map.put(7, "Villa");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xabi Alonso");
		map.put(8, "Xabi Hernandez");
		map.put(6, "Iniesta");

		// imprimimos en map con un iterador
		Iterator it = map.keySet().iterator();
		System.out.println("********HASH MAP : no tiene ningun orden logico!*******");
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave : " + key + " -> Valor: " + map.get(key));
		}

		// TREE MAP
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Casillas");
		treeMap.put(3, "Pique");
		treeMap.put(11, "Capdevila");
		treeMap.put(16, "Busquest");
		treeMap.put(18, "Pedrito");
		treeMap.put(7, "Villa");
		treeMap.put(15, "Ramos");
		treeMap.put(5, "Puyol");
		treeMap.put(14, "Xabi Alonso");
		treeMap.put(8, "Xabi Hernandez");
		treeMap.put(6, "Iniesta");

		// imprimimos en map con un iterador
		Iterator itTreeMap = treeMap.keySet().iterator();
		System.out.println("********TREE MAP : ordena los elementos por clave en orden natural *******");
		while (itTreeMap.hasNext()) {
			Integer key = (Integer) itTreeMap.next();
			System.out.println("Clave : " + key + " -> Valor: " + treeMap.get(key));
		}

		// LINKED HASH MAP
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(3, "Pique");
		linkedHashMap.put(11, "Capdevila");
		linkedHashMap.put(16, "Busquest");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(7, "Villa");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(14, "Xabi Alonso");
		linkedHashMap.put(8, "Xabi Hernandez");
		linkedHashMap.put(6, "Iniesta");

		// imprimimos en map con un iterador
		Iterator itlinkedHashMap = linkedHashMap.keySet().iterator();
		System.out.println("********linked Hash Map : ordena los objetos tal y como los hemos ido introduciendo******");
		while (itlinkedHashMap.hasNext()) {
			Integer key = (Integer) itlinkedHashMap.next();
			System.out.println("Clave : " + key + " -> Valor: " + linkedHashMap.get(key));
		}

		System.out.println("******Trabajamos con los metodos del Map******");
		System.out.println("numero de elementos que tiene el map :" + treeMap.size());
		System.out.println("vemos si el map esta vacio : " + treeMap.isEmpty());
		System.out.println("obtenemos el elemento con clave 6 :" + treeMap.get(6));
		System.out.println("borramos el elemento 18 del map :" + treeMap.remove(18));
		System.out.println("vemos que pasa al obtener el elemento 18 que ya no existe :" + treeMap.get(18));
		System.out.println("vemos si existe la clave 1 :" + treeMap.containsKey(1));
		System.out.println("vemos si existe el valor 'Villa'" + treeMap.containsValue("Villa"));
		System.out.println("booramos todos los elementos del map");
		treeMap.clear();
		System.out.println("comprobamos si esta vacio :" + treeMap.isEmpty());

		System.out.println("ForEach : Forma alternativa para recorre los Map mostrando la clave y el valor ");

		for (Entry<Integer, String> jugador : linkedHashMap.entrySet()) {
			Integer clave = jugador.getKey();
			String valor = jugador.getValue();
			System.out.println(clave + "->" + valor);
		}

		System.out.println("trabajamos con Clase Jugador Seleccion");
		System.out.println("**********Tree Map con objetos y como clave String***************");
		Map<String, SeleccionFutbol> jugadores = new TreeMap<String, SeleccionFutbol>();

		jugadores.put("Casillas", new SeleccionFutbol(1, "Casillas", "Portero"));
		jugadores.put("Ramos", new SeleccionFutbol(15, "Ramos", "Lateral Derecho"));
		jugadores.put("Pique", new SeleccionFutbol(13, "Pique", "Central"));
		jugadores.put("Puyol", new SeleccionFutbol(5, "Puyol", "Central"));
		jugadores.put("Capdevilla", new SeleccionFutbol(11, "Capdevilla", "Lateral Izquierdo"));
		jugadores.put("Xabi", new SeleccionFutbol(14, "Xabi Alonso", "Medio Centro"));
		jugadores.put("Busquets", new SeleccionFutbol(7, "Busquets", "Medio Centro"));
		jugadores.put("Xavi", new SeleccionFutbol(16, "Xabi Hernandez", "Medio Campista"));
		jugadores.put("Pedrito", new SeleccionFutbol(8, "Pedrito", "Interior Izquierdo"));
		jugadores.put("Iniesta", new SeleccionFutbol(18, "Iniesta", "Interior Derecho"));
		jugadores.put("Villa", new SeleccionFutbol(6, "Villa", "Delantero"));
		System.out.println("objeto ordenados por orden alfabetico ");
		for (Entry<String, SeleccionFutbol> jugador : jugadores.entrySet()) {
			String clave = jugador.getKey();
			SeleccionFutbol valor = jugador.getValue();
			System.out.println(clave + " -> " + valor.toString());
		}

	}

}
