package com.exceptionAll;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FielReaderExample {

	public static void readFile(String filePath) throws IOException 
	{
		FileReader reader = new FileReader(filePath);
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String line;
		while((line = bufferedReader.readLine()) !=null) {
			System.out.println(line);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			readFile("Example.txt");
		}catch(IOException e) {
			System.out.println("Exception caught : "+ e.getMessage());
		}
	}

}
