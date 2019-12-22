package com.usa.collections;

import java.util.Arrays;

public class ArrayTest {

	// Array is fixed
	// Array using length method
	public static void main(String[] args) {
		// How to declare value in array 1st way
		
		// This is a single damnation
		String[] obj = new String[5];
		obj[0] = "Java";
		obj[1] = "Ruby";
		obj[2] = "Python";
		obj[3] = "PHP";
		obj[4] = null;
	

		// if this open for execute then given ArrayIndexOutOfBoundsException
		// obj [5]= "JavaScriptes";

		// This line for print out all value
		System.out.println(Arrays.toString(obj));

		// This line for specific value
		System.out.println(obj[3]);

		// This line call for loop
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);

		}
		// This is call Advance for loop
		for (String a : obj) {
			System.out.println(a);
		}

		// How to declare value in array 2nd way
		int[] num = { 100, 200, 300, 400, 500 };
		System.out.println(Arrays.toString(num));
		System.out.println(num[3]);

		// This is a multi damnation
		String[][] name = { { "java", "roby", "python", "php", "perl" },
				{ "Javascript", "selenium", "Cucumber", "TestNG", "Jira" }};		
	
		}
	}
