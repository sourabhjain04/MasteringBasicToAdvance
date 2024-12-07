package com.autoandun;

public class AutoBoxingExample {

	
	public static void main(String[] args) {
		Integer obj =100; // Autoboxing : int to Integer
		
		System.out.println("Wrapper object "+ obj);
		
		// adding a primitive in to a liat of Integer
		java.util.List<Integer> list = new java.util.ArrayList<>();
		
		list.add(25); // Autoboxing : int to Integer
		System.out.println("List : "+ list);
 	}
}
