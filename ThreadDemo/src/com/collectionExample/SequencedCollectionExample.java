package com.collectionExample;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionExample {

	public static void main(String[] args) {
		SequencedCollection<String> names = new ArrayList<>();
		
		// adding elements to the collection
		names.addLast("Alice");
		names.addLast("Bob");
		names.addFirst("Eve");
		System.out.println(names);
		
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		
		names.removeFirst();
		System.out.println(names.getFirst());
		
		names.removeLast();// removes bob
		System.out.println(names.getLast());
		
	}
}
