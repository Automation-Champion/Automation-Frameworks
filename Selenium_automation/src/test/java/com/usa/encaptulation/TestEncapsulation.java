package com.usa.encaptulation;

public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
          
        // setting values of the variables  
        obj.setName("Smarttech"); 
        obj.setAge(1); 
        obj.setRoll(51); 
          
        // Displaying values of the variables 
        System.out.println("School's name: " + obj.getName()); 
        System.out.println("School's age: " + obj.getAge()); 
        System.out.println("roll: " + obj.getRoll()); 
          
        // Direct access of geekRoll is not possible 
        // due to encapsulation 
        // System.out.println("Geek's roll: " + obj.geekName);         
    } 
} 
/*
public class defaultConstructor {
	/**
	 * Rules for creating Java constructor There are two rules defined for the
	 * constructor.
	 * 
	 * Constructor name must be the same as its class name 
	 * A Constructor must have no explicit return type 
	 * A Java constructor cannot be abstract, static, final,
	 * and synchronized Types of Java constructors
	 * 
	 * 
	 * There are two types of constructors in Java:
	 * 
	 * Default constructor (no-arg constructor) Parameterized constructor
	 * 
	 * 
	 * Difference between constructor and method in Java There are many differences
	 * between constructors and methods. They are given below.
	 * 
	 * Java Constructor                                                    Java Method 
	 * A constructor is used to initialize the state of an object.         A method is used to expose the behavior of an object. A
	 * constructor must not have a return type.                            A method must have a return type.
	 * The constructor is invoked implicitly.                              The method is invoked explicitly. 
	 * The Java compiler provides a default constructor if you don't
	 *  have any constructor in a class.                                   The method is not provided by the compiler in any case. 
	 * The constructor name must be same as the class name.                The method name may or may not be same as the class name.
	 */

	// Java Program to create and call a default constructor
	// creating a default constructor
/*	defaultConstructor() {
		System.out.println("Bike is created");
	}

	// main method
	public static void main(String args[]) {
		// calling a default constructor
		defaultConstructor b = new defaultConstructor();
	}
}

//Let us see another example of default constructor  
//which displays the default values  
class defaultConstructorvalue {
	int id;
	String name;

//method to display the value of id and name  
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
//creating objects  
		defaultConstructorvalue s1 = new defaultConstructorvalue();
		defaultConstructorvalue s2 = new defaultConstructorvalue();
//displaying values of the object  
		s1.display();
		s2.display();
	}
}

//Java Program to demonstrate the use of the parameterized constructor.  
class parameterizedconstructor {
	int id;
	String name;

	// creating a parameterized constructor
	parameterizedconstructor(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		parameterizedconstructor s1 = new parameterizedconstructor(111, "Karan");
		parameterizedconstructor s2 = new parameterizedconstructor(222, "Aryan");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}

//Java program to overload constructors  
class overloadconstructors {
	int id;
	String name;
	int age;

	// creating two arg constructor
	overloadconstructors(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	overloadconstructors(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void displayValue() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		overloadconstructors s1 = new overloadconstructors(111, "Karan");
		overloadconstructors s2 = new overloadconstructors(222, "Aryan", 25);
		s1.displayValue();
		s2.displayValue();
	}
}
*/

