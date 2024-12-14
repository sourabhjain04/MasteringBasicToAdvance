package com.collectionExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Apple");
		queue.add("Banana");
		queue.add("cherry");
		
		System.out.println(queue);
		System.out.println("removed " + queue.poll());
		System.out.println(queue);
		System.out.println("peek element " + queue.peek());
		System.out.println(queue);


		
		
	}
}
