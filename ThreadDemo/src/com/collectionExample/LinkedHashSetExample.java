package com.collectionExample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		
	h.add("a");
	h.add("a");
	h.add("aaaaa");
	System.out.println(h);
	h.add("aaa");
	h.add("10");
	System.out.println(h);
	h.add(null);
	System.out.println(h);
		
	}

}
