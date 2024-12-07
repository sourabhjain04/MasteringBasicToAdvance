package com.exceptionAll;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		// calling the constructor of parent exception
		super(str);
	}
}



public class TestCustomException {
	
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18) {
			throw new InvalidAgeException("Age is not valid to vote");
		}else {
			System.out.println("Welcome to voting");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// calling the method
			validate(13);
			
		}catch(InvalidAgeException ex) {
			System.out.println("caught the exception");
			//printing the message from InvalidAgeException Object
			
		System.out.println("Exception occured :" + ex);
		}
		System.out.println("rest of the code");
	}

}
