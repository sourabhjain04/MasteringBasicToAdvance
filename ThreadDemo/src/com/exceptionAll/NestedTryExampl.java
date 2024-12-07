package com.exceptionAll;

public class NestedTryExampl {

	public static void main(String[] args) {
		try {
			// outer try block
			System.out.println("Outer try block starts");
			try {
				// inner try block
				System.out.println("Inner try Block starts");
				int num = 10/0 ;// Arithmetic exception
				System.out.println("Inner try block ends");
			}catch(ArithmeticException e) {
				System.out.println("Inner catch : ArithmeticException handled");
			}
			String str = null;
			System.out.println(str.length());// null pointer Exception
			
			System.out.println("outer try block ends");
			
		}catch(NullPointerException e) {
			System.out.println("outer catch: Null pointer Exception handled");
		}finally {
			System.out.println("Finally block always Executed");
		}
		
		System.out.println("Remaining line of code");
	}
}
