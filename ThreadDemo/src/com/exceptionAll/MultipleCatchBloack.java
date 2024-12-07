package com.exceptionAll;

public class MultipleCatchBloack {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6]=30/2;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfbounds Exception occurs");
		}
		
		catch(Exception e) {
			System.out.println("parent Exception occurs");
		}
		
		System.out.println("Rest of the code");
	}
}
