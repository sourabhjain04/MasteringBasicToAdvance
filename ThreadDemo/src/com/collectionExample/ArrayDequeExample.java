package com.collectionExample;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		ArrayDeque<String> deque = new ArrayDeque<>();
		
		// Queue Operations
		deque.offer("Apple");
		deque.offer("Banana");
		deque.offer("cheery");
		
		System.out.println("ArrayDeque as Queue: " + deque);
		System.out.println("Removed: "+ deque.poll());// Removes the head (FIFO)

	
		//Stack Operations
		deque.push("Mango");
		System.out.println("ArrayDeque as Stack: "+ deque);
	}
}
