package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		/* Object Instantiation */
		String myString = new String("Hello");
		//String myString2 = "Hello";
		
		int[] myArray = new int[5];
		
		Scanner in = new Scanner( System.in );
		
		House houseAt443WinstonStreet = new House(1800, "443 Winston St", "Cornflower Blue");
		House houseAt123SomeStreet = new House(2000, "123 Some St", "Orange");
		
		
		houseAt443WinstonStreet.setColor("Red");
		
		houseAt123SomeStreet.setNumberOfFloors(3);
		
		
		
		/* Value Type */
		int x = 10;
		int y = x;
		x = 20;
		
		/* Reference Type */
		int[] numbers = { 10, 20, 30 , 40 };

		int[] nums2 = numbers;
		
		numbers[1] = 22;
		nums2[3] = 444;
		
	
		
		String firstName = "joe";
		firstName.toUpperCase();

		
		String greetings = "Hello, ";
		greetings = greetings + "Rachelle";
		
		String farewell = "Goodbye, ";
		String farewellDoug = farewell + "Doug";
		
		String one = new String("One");
		String oneA = new String("One");
		
		if (one == oneA) {
			System.out.println("Have the same reference");
		}
		
		if (one.equals(oneA)) {
			System.out.println("Have the same value");
		}
		
		String two = one;
		
		if ( one == two ) {
			System.out.println("One and Two are equal");
		}
		
		
		
		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");
		
		/* The String class gets special treatment in the Java language.  One 
		 * example of this is that there is a literal representation of a 
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */
		
		String greeting = "Hello, World!";  // creates a new instance of String using a literal
		System.out.println("greeting : "+greeting);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
		/* Below are examples of calling various String methods */
		
		System.out.println("***** charAt *****");
		
		String name = "Tech Elevator";
		char first = name.charAt(0);   // 'T'
		char fourth = name.charAt(3);  // 'h'
		System.out.println(name);
		System.out.println(first);
		System.out.println(fourth);
		
		/* length */
		int nameLength = name.length();
		System.out.println("The length of the String "  + name + " is " + nameLength);
		
		// Loop through each char in the string
		for (int i = 0; i < name.length(); i++) {
			System.out.println( name.charAt(i) );
		}
		
		
		/* SubString */
		String s = "Tech Elevator";
		String subStringOfs = s.substring(2, 7);
		System.out.println(subStringOfs);
		
		String subStringToEnd = s.substring(10);
		System.out.println(subStringToEnd);
		
		/* Contains */
		System.out.println("***** contains *****");
		String hello = "Hello World!";
		System.out.println("hello : "+hello);
		boolean containsHello = hello.contains("Hello");
		System.out.println("containsHello : "+containsHello);
		boolean containsBogus = hello.contains("bogus");
		System.out.println("containsBogus : "+containsBogus);
		
		boolean startsWithHello = hello.startsWith("Hel");
		
		int indexOfLetter = hello.indexOf('o');
		
		String newHello = hello.replace("World", "Something");
		
		String[] splitArray = hello.split(" ");
		
		
		/* Other commonly used methods:
		 * 
		 * endsWith()
		 * startsWith()
		 * indexOf()
		 * lastIndexOf()
		 * replace()
		 * toLowerCase()
		 * toUpperCase()
		 * equals and equalsIgnoreCase()
		 * split()
		 * trim()
		 * String.join()  <-- available only on the String class and not the string object
		 */

		String.valueOf( true );
		
		String countDown = String.join("-->", "Five", "Four", "Three", "Two", "One");
		
		System.out.println(countDown);
		
		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		
		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if(hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
		String hello3 = hello1;
		if(hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}
		
		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		
		if(hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
	}
}
