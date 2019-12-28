package com.usa.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Interface_Test {
// Let's see a simple example of HashSet. Notice, the elements iterate in an unordered collection.
// Java HashSet class is used to create a collection that uses a hash table for storage. 
// It inherits the AbstractSet class and implements Set interface.

// The important points about Java HashSet class are:

// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.
// HashSet class is non synchronized.
// HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
// HashSet is the best approach for search operations.  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
   
   
   //Java HashSet example ignoring duplicate elements
   // In this example, we see that HashSet doesn't allow duplicate elements.
    //Creating HashSet and adding elements  
     HashSet<String> set1=new HashSet<String>();  
     set1.add("Ravi");  
     set1.add("Vijay");  
     set1.add("Ravi");  
     set1.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=set1.iterator();  
  while(itr.hasNext()){  
  System.out.println(itr.next());  
    
          //Removing specific element from HashSet  
           set1.remove("Ravi");  
           System.out.println("After invoking remove(object) method: "+set1);  
    
              HashSet<String> set2=new HashSet<String>();  
           set2.add("Ajay");  
           set2.add("Gaurav");  
           set1.addAll(set2);  
           System.out.println("Updated List: "+set2);  
           //Removing all the new elements from HashSet  
           set1.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set1);  
           //Removing elements on the basis of specified condition  
           set1.removeIf(str->str.contains("Vijay"));    
           System.out.println("After invoking removeIf() method: "+set1);  
           //Removing all the elements available in the set  
           set1.clear();  
           System.out.println("After invoking clear() method: "+set);  
  }  
 }  
}  
