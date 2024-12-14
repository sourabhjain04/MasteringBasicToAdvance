package com.collectionExample;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> obj =new LinkedHashMap<>();
		
		// Adding elements to linked hash map
		obj.put(1,"One");
		obj.put(2,"Two");
		obj.put(3,"Three");
		obj.put(4,"Four");
		obj.put(5,"Five");
		
		System.out.println(obj);
		System.out.println(obj.get(3));
		
		obj.put(6, "Six");
		
		System.out.println(obj);
		
		LinkedHashMap<Integer,String> accessOrderMap = new LinkedHashMap<>(16,075f,true);
		// Adding the elements
		accessOrderMap.put(1, "A");
		accessOrderMap.put(2, "B");
		accessOrderMap.put(3, "C");
		
		// Access some elements:
		accessOrderMap.get(2);
		accessOrderMap.get(1);
		
		System.out.println(accessOrderMap);
		
		
		
	}

}
