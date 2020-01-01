package com.usa.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Map_Interface_Test {

	// Hash map is an implements map interface
	// Extends Abstract Map
	// It contains only unique elements
	// Store the values key value pair
	// It may have one null key and multiple null values
	// It maintains no order
	// Hash is non-synchronized – not thread safe
	// Concurrent modification exception – fail – fast condition

	@Test
	public void HashMaps() {
		HashMap<Integer, String> hr = new HashMap<Integer, String>();
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
		// System.out.println("***************done*****************");

	}
	
	
	 @Test
     public void Hashmaps() {

	   HashSet<String>  myHashset= new HashSet<String>();
	   myHashset.add("XP");
	   myHashset.add("WIN7");
	   myHashset.add("WIN8");
	   myHashset.add("SAFARI");
	   myHashset.add("XP");
	
	   Iterator<String> it = myHashset.iterator();
	   while(it.hasNext()) {
	   System.out.println(it.next());
	   
	   
		System.out.println(myHashset);
		myHashset.remove(0);
		System.out.println(myHashset);
		
		
		Iterator iterator = myHashset.iterator();
		while (iterator.hasNext()) {
		System.out.println("value: "+iterator.next() + " ");
		}
		
	   }
	   
	 } 
	 }
