package com.usa.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ArrayListTest {

	// How to add tow list value
	public static void addtwolist() {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("test");
		ar1.add("selenium");
		ar1.add("QTP");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("dev");
		ar2.add("java");
		ar2.add("javaScript");

		ar1.addAll(ar2); // this is addAll() method connect between first value and sceand value

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
	}

	// How to remove duplicate value from list
	public static void removeDuplicate() {
		List<String> list = new ArrayList<>();
		list.add("Selenium");
		list.add("Java");
		list.add("Maven");
		list.add("TestNG");
		list.add("Cucumber");
		list.add("Cucumber");
		list.add(null);
		// This line call for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// How to remove duplicate value
		list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");
	}

	// How to find max and min value from list
	public static void findMaxAndMin() {
		int array[] = { 10, 20, 25, 63, 96, 57 };
		int size = array.length;
		Arrays.sort(array);
		System.out.println("sorted Array ::" + Arrays.toString(array));
		int res = array[size - 2];
		System.out.println("2nd largest element is ::" + res);
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");

		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");
	}

	// How to use each for loop
	public static void eachforloop() {

		List<String> arraylist = new ArrayList<>();
		arraylist.add("Java");
		arraylist.add("Selenium");
		arraylist.add("TestNG");
		arraylist.add("Maven");
		arraylist.add("Cucumber");
		arraylist.add("Jenkins");
		arraylist.add("Git-Hub");
		arraylist.add("DataBase");
		arraylist.forEach(item -> {
			System.out.println(item);

		});
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");
	}

	// How to find duplicate value from array
	public static void findduplicates() {
		// Second solution : use HashSet data structure to find duplicates
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		System.out.println("Duplicate elements from array using HashSet data structure");
		Set<String> store = new HashSet<>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("found a duplicate element in array : " + name);
			}
		}
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");
	}

	// How to find second highest number 1st way
	public static void secoundNum() {
		int array[] = { 10, 20, 25, 63, 96, 57 };
		int size = array.length;
		Arrays.sort(array);
		System.out.println("sorted Array ::" + Arrays.toString(array));
		int res = array[size - 2];
		System.out.println("2nd largest element is ::" + res);
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");
	}

	// How to find second highest number 2nd way
	public static void sortedtest() {
		int[] randomIntegers = { 1, 5, 4, 2, 8, 1, 8, 9, 9 };
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i : randomIntegers) {
			set.add(i);
		}
		// Remove the maximum value; print the largest remaining item
		set.remove(set.last());
		System.out.println(set.last());
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");
	}

	// How to handle duplicate value and set interface
	public static void setinterface() {
		Set<String> arraylist = new HashSet<>();
		arraylist.add("Java");
		arraylist.add("Selenium");
		arraylist.add("TestNG");
		arraylist.add("Maven");
		arraylist.add("Cucumber");
		arraylist.add("Jenkins");
		arraylist.add("Git-Hub");
		arraylist.add("DataBase");
		arraylist.add("DataBase");
		arraylist.add("DataBase");
		arraylist.forEach(item -> {
			System.out.println(item);

		});
		System.out.println("<<<<<<<<<<End>>>>>>>>>>>>");
	}
	
	// how to use hashmap
	public static void HashMaps() {
		HashMap<Integer, String> hr = new HashMap<Integer, String>();
		
		System.out.println("<<<<<<<<<<start>>>>>>>>>>>>");
		hr.put(1, "Selenium");
		hr.put(2, "QTP");
		hr.put(3, "TestComplet");
		hr.put(4, "RFT");
		hr.put(null, "ALM");
		hr.put(4, null);
		hr.put(4, null);
		hr.put(4, null);

		// spesipic value
		System.out.println(hr.get(1));
		System.out.println(hr.get(4));

		// Loop for all velues
		for (Entry m : hr.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());
		}
		System.out.println(hr);
		hr.remove(3);
		System.out.println(hr);
		 System.out.println("***************end*****************");

	}

	public static void main(String[] args) {
		removeDuplicate();
		findMaxAndMin();
		eachforloop();
		findduplicates();
		secoundNum();
		setinterface();
		sortedtest();
		addtwolist();
		HashMaps();
	}
}