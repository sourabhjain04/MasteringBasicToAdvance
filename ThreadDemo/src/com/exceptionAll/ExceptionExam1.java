package com.exceptionAll;

public class ExceptionExam1 {

	public static void main(String[] args) {
		
		System.out.println("this is before exception");
		try {
			// code that may raise exception
			int data= 100/0;
			
		}catch (ArithmeticException e) {
		System.out.println(e);
		}
		// rest of the code
		
		System.out.println("rest of the code");
	}
}
