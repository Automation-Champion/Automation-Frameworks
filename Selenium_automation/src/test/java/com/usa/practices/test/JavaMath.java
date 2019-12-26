package com.usa.practices.test;


import java.util.stream.IntStream;


public class JavaMath {

	public static void main(String[] args) {

		IntStream.range(0, 100)
				.forEach(i-> {
					System.out.println(i);	
				});
				
				// This is a int data
		int a = 1234;
		String str = Integer.toString(a);
		System.out.println("I am convert int to String  = " + str);

		// This is a String data
		String number = "10";
		int result = Integer.parseInt(number);
		System.out.println("I am convert String to int  = " + result);

		String string1 = new String("smarttech");
		string1 = "Alam";
		//String string2 = new String("Practice");
	

		// Comparing for String 1 != String 2
		//System.out.println("Comparing " + string1 + " and " + string2 + " : " + string1.equals(string2));
		System.out.println("Comparing " + string1 + " and " + string1 + " : " + string1.equals(string1));


	}

}
