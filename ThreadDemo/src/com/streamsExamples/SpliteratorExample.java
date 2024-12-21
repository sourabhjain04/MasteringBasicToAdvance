package com.streamsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
		// obtain a pliterator form the list
	
		Spliterator<String> spliterator = names.spliterator();
		
		//try to spilt the splitrator
		Spliterator<String> splitSpliterator = spliterator.trySplit();
		
		// process elements from one half:
		
		splitSpliterator.forEachRemaining(System.out::println); // output half of the list
		
		System.out.println("------");
		
		// process the elements from other half
		
		spliterator.forEachRemaining(System.out::println);// Output the other half
		
		
		
		
		
	}
}
