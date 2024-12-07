package com.collectionExample;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Bhaskar");
		l.add(30);
		l.add(null);
		l.add("Bhaskar");
		l.add("Vedika");
		
		System.out.println(l);
		l.set(0, "Software");
		System.out.println(l);
		l.set(0, "venky");
		System.out.println(l);
		l.removeLast();
	}
}
