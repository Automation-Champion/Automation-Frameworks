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


	static final String name = "Mohammed Alam";
	static final String road = "In my car";
	static final String redLight = "Red Light";
	static final String greenLight = "Green Light";
	static final String parking = "Parking";
	static final String office = "In the office & i am giving Interview";

	public static void main(String[] args) {

		while (true) {

			String[] names = { name, road, redLight, greenLight, parking, office };
			for (String name : names) {
				if (name.contains(name)) {
					System.out.println("My Name is : " + name);
					break;
				}
			}

			for (String name : names) {
				if (name.contains(road)) {
					System.out.println("I am On the Way : " + name);
					break;
				}
			}

			for (String name : names) {
				if (name.contains(redLight)) {
					System.out.println("I am stoping on the : " + name);
					break;
				}
			}

			for (String name : names) {
				if (name.contains(greenLight)) {
					System.out.println("Now I am Moving my car on the : " + name);
					break;
				}
			}

			for (String name : names) {
				if (name.contains(parking)) {
					System.out.println("I am in Destination & doing : " + name);
					break;
				}
			}

			for (String name : names) {
				if (name.contains(office)) {
					System.out.println("Now i am : " + name);
					break;
				}
			}
			break;
		}
	}
}
	
			 int[] randomIntegers = { 1, 5, 4, 2, 8, 1, 8, 9,9 };
	        SortedSet<Integer> set = new TreeSet<Integer>();
	        for (int i: randomIntegers) {
	            set.add(i);
	        }
	        // Remove the maximum value; print the largest remaining item
	        set.remove(set.last());
	        System.out.println(set.last());
		
	}
}
	 */		
			
			
			

            
