package com.collectionExample;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue(15,new MyComparator());
		
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		
		while(!q.isEmpty()) {
		System.out.println(q.poll());
		}
	}
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String s1 = (String)obj1;
		
		String s2 = obj2.toString();
		
		
		return s2.compareTo(s1);
		
	}
	
}