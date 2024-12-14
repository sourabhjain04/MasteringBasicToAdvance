package com.collectionExample;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// create a hash map
	
		HashSet<String> h = new HashSet();
		//h.add(20);
		h.add("a");
		h.add("a");
		
		System.out.println(h);
		h.add("aaaa");
		h.add("aaa");
		System.out.println(h);
		h.add(null);
		System.out.println(h);
		//h.add(10);
		System.out.println(h);
		
		
		

		
	}
}
