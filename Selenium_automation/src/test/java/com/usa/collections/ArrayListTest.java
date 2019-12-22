package com.usa.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayListTest {
	
	
public static void main(String[] args) {
	
	ArrayList old = new ArrayList();	
	old.add(10);
	old.add(20);
	old.add(30);
	old.add(40);

	
	ArrayList <Integer> alam = new ArrayList<>();	
	alam.add(10);
	alam.add(20);
	alam.add(30);
	alam.add(40);
	//alam.add("dffd"); 
	// we can't declare the value as a string in Integer reappear class
	
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

	// How to remove duplicate value	
	list = list.stream().distinct().collect(Collectors.toList());	
    System.out.println(list);
	}

	
	
}	
	
}


