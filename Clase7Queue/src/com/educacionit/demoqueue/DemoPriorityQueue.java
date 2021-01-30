package com.educacionit.demoqueue;

import java.util.PriorityQueue;

public class DemoPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> colaPrioritaria = new PriorityQueue<>();
		colaPrioritaria.add(70);
		colaPrioritaria.add(120);
		colaPrioritaria.add(6);
		colaPrioritaria.add(177);
		colaPrioritaria.add(788);
		colaPrioritaria.add(1958);
		colaPrioritaria.add(1992);
		
	
		System.out.println(colaPrioritaria);
		
		while (!colaPrioritaria.isEmpty()) {
			System.out.print(colaPrioritaria.poll() + " - ");
		}
	}
}
