package com.exceptionAll;

public class NPException {

	public static void main(String[] args) {
		String str = null;
		try {
			int length = str.length();
			System.out.println("length of the String "+length);
		}catch(NullPointerException e) {
			System.out.println("error: Null  reference encountered");
			
		}
		System.out.println("Remaining code");
	}
}
