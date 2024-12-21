package com.streamsExamples;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Sequential Stream
		System.out.println("Sequential Stream");
	numbers.stream()
			.filter(n->n%2==0)
			.forEach(System.out::println);
		
	System.out.println("parallel Stream");
	numbers.parallelStream()
			.filter(n->n%2==0)
			.forEach(System.out::println);
	}

}