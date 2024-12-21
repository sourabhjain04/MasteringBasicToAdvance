package com.streamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(2,4,50,21,22,67);
		//list1.add(45);
		System.out.println(list1);
		
		List<Integer> evenNumbers = list1.stream().filter(number->number%2==0)
									.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		// Second way
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		System.out.println(list2);
		
		// third way
		List<Integer> list3 =Arrays.asList(23,567,12,677,24);
		System.out.println(list3);
		
		List<String> names = Arrays.asList("John","Jane","Jack","Doe");
		
		List<String>filteredNames = names.stream()
				.filter(name->name.startsWith("J"))
				.sorted()
				.toList();// collect results in to a list
		
		System.out.println(filteredNames);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sum = numbers.stream()
				.reduce(0,Integer::sum);
		System.out.println(sum);
		
		
	}
}
