package com.usa.practices.test;

import java.util.ArrayList;

public class AlamBhaiClass {
	    public static void main(String[] args) {
		int maxsalary = 5000;
		ArrayList<Integer> salary = new ArrayList<Integer>();
		
		salary.add(3000);
		salary.add(3000);
		salary.add(5000);
		System.out.println(salary.size());
		System.out.println(salary);
		
		for (int i = 0; i > salary.size(); i ++) {
			
	    System.out.println(salary.get(i));
		if (maxsalary == salary.get(i)) {
		System.out.println(salary.get(i));
		}}}}

	/*
			public static void main(String args[]) {
		// Reusable method 
		System.out.println(DuplicatesInArray.findDuplicateInArray(1,2,3,4,4,5,5));
		// Second solution : use HashSet data structure to find duplicates
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		System.out.println("Duplicate elements from array using HashSet data structure");
		Set<String> store = new HashSet<>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("found a duplicate element in array : " + name);
			}
		}

		int[] my_array = { 1, 2, 3, 5, 6, 6, 7, 0 };

		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j]) && (i != j)) {
					System.out.println("Duplicate Element : " + my_array[j]);
				}
			}
		}
	}
	
	
	public static Set<Integer> findDuplicateInArray(int... arr) {
	    Set<Integer> unique = new HashSet<>();
	    Set<Integer> duplicate = new HashSet<>();
	    for (int val : arr)
	        (unique.contains(val) ? duplicate : unique).add(val);
	    return duplicate;
	}

}	
			
	 */		
			
			
			

            
