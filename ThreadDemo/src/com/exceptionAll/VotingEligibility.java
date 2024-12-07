package com.exceptionAll;

import java.util.Scanner;

public class VotingEligibility {

	public static void checkEligibilty(int age) {
		if (age<18) {
			throw new IllegalArgumentException("Age must be 18 or above to vote");
		}
		System.out.println("You are Eligible to vote");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		try {
			checkEligibilty(age);
		}catch(IllegalArgumentException e) {
			System.out.println("caught an exception: " + e.getMessage());
		}
		System.out.println("Remaining Line of code");
	}
}
