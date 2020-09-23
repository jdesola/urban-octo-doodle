package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lecture {

	public static void main(String[] args) {

		System.out.println();		
		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		/* DECLARE AND INSTANTIATE A SET */
		
		// HashSet does not maintain Order
		//Set<Integer> setOfNumbers = new HashSet<Integer>();
		
		// LinkedHash Set maitains Order of Insertion
		//Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		
		// TreeSet maintains Natural Order of the Data Type
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		
		/* ADD ITEMS TO THE SET */
		setOfNumbers.add( 1 );
		setOfNumbers.add( 10 );
		setOfNumbers.add( 30 );
		setOfNumbers.add( 301 );
		setOfNumbers.add( 301 );  // Duplicates are ignored
		setOfNumbers.add( 10 );   // Duplicates do not cause an error or warning
		setOfNumbers.add( 42 );
		setOfNumbers.add( 5708 );
		
		
		/* LOOP OVER A SET */
		for ( Integer num : setOfNumbers) {
			System.out.println( num );
		}

		System.out.println();
		
		/*USE CASE:  USE A SET TO REMOVE DUPLICATES AND ORDER THE ARRAY */
		String[] instructorWorkLog = {"Rachelle", "John", "Matt", "Matty", "Rachelle", "Steve", "John", "Rachelle" };
		
		Set<String> instructorSet = new TreeSet<String>();
		
		for (String name : instructorWorkLog) {
			instructorSet.add( name );
		}
		
		for (String instructor : instructorSet) {
			System.out.println( instructor );
		}
		
		System.out.println();
		
		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();
		
		/* DECLARING AND INSTANTIATING A MAP */
		Map<String, String> animalNoises = new HashMap<String, String>();
		
		/* ADDING ITEMS TO A MAP */
		animalNoises.put("Cow", "Moo");
		animalNoises.put("Chicken", "Cluck");
		animalNoises.put("Dog", "Bark");
		animalNoises.put("Cat", "Meow");
		
		// Keys must be unique, but the values do not
		animalNoises.put("Lion", "Roar");
		animalNoises.put("Duck", "Roar");
		
		/* RETRIEVING AN ITEM FROM A MAP */
		System.out.println("The Cow says " + animalNoises.get("Cow") );
		
		String catSound = animalNoises.get("Cat");
		
		// If get a key that doesn't exist returns null
		String foxSound = animalNoises.get("Fox");
		
		/* UPDATING AN ITEM IN A MAP */

		String duckSound = animalNoises.get("Duck");
		
		// If put using a key that does exist, the value is updated to the new value
		animalNoises.put("Duck", "Quack");
		
		duckSound = animalNoises.get("Duck");


			
		/* REMOVING AN ITEM FROM A MAP */
		// Remove removes the key/value pair and returns the value
		String lionSound = animalNoises.remove("Lion");
		
		// If the key does not exists, the null returned
		lionSound = animalNoises.remove("Lion");
		
		
		/* CHECK IF AN ITEM EXISTS */
		// containsKey(key) returns TRUE if the KEY exists in the Map
		
		boolean catExists = animalNoises.containsKey("Cat");
		boolean foxExists = animalNoises.containsKey("Fox");
		
		// containsValue(value) returns TRUE if the VALUE exists in the Map
		boolean meowExists = animalNoises.containsValue("Meow");
		boolean oinkExists = animalNoises.containsValue("Oink");
		
		System.out.println();
		
		
		/* LOOPING OVER A MAP */
		// Loop through a map by looping through the Keys
		
		for ( String key : animalNoises.keySet() ) {
			
			// Then using the keys to get the value
			System.out.println( "The " + key + " says " + animalNoises.get(key));
			
		}
		
		
		// Can also loop through a map using the entrySet
		for ( Entry<String, String> nextEntry : animalNoises.entrySet() ) {
			
			// Get the key using the getKey() method on the entry object
			String key = nextEntry.getKey();
			
			// Get the value using the getValue() method on the entry object
			String value = nextEntry.getValue();
			
			System.out.println( "The " + key + " says " + value);
			
		}
		


		System.out.println();
		
		/* THE MAP KEY AND VALUE DATA TYPES */
		// Key and Value do not need to be the same type, but both must be Reference Types
		Map<Integer, Double> accounts = new HashMap<Integer, Double>();
		accounts.put(12345, 100d);
		accounts.put(56789, 200d);
		
		// Transfer half of Map 12345's money to account 56789
		double halfOfAccount12345 = accounts.get(12345) / 2.0;

		accounts.put(12345, halfOfAccount12345);
		//accounts.put(12345, accounts.get(12345) - halfOfAccount12345 );
		accounts.put(56789,  accounts.get(56789) + halfOfAccount12345);
		
		// When working with integers, do division once and then add/subtract the result to get 
		// the final values
		
//		int whole = 5;
//		
//		int half = whole / 2;  // 2
//		int halfOfWhole = whole - half;   // 5 - 2 = 3
//		
//		whole - halfOfWhole // 5 - 3 = 2
//		whole  - whole / 2 // 5 - 2 = 3
		
		
		
		System.out.println();
		System.out.println("####################");
		System.out.println("      MAP ORDER     ");
		System.out.println("####################");
		System.out.println();
	
		/*
		 * The Order that a Map stores the keys is dependent on the Implementation class used.
		 * 
		 * HashMap - does not retain order
		 * LinkedHashMap - retains the order of insertion
		 * TreeMap - maintains Natural Order for the Data Type of the key
		 */
		
		System.out.println("The values where inserted in the following order: 2, 10, 25, 1");
		
		System.out.println();
		System.out.println("  HASHMAP");
		System.out.println("Does not retain any order.  Instead it uses it's own internal ordering");
		
		Map<Integer, String> hashMapNumbersToWords = new HashMap<Integer, String>();
		
		hashMapNumbersToWords.put(2,  "Two");
		hashMapNumbersToWords.put(10, "Ten");
		hashMapNumbersToWords.put(25, "Twenty-Five");
		hashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : hashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + hashMapNumbersToWords.get(number));
		}		
		
		
		System.out.println();
		System.out.println("  LINKED HASHMAP");
		System.out.println("Retains the Order of Insertion");

		Map<Integer, String> linkedHashMapNumbersToWords = new LinkedHashMap<Integer, String>();
		
		linkedHashMapNumbersToWords.put(2,  "Two");
		linkedHashMapNumbersToWords.put(10, "Ten");
		linkedHashMapNumbersToWords.put(25, "Twenty-Five");
		linkedHashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : linkedHashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + linkedHashMapNumbersToWords.get(number));
		}	
		
		
		System.out.println();
		System.out.println("  TREEMAP");
		System.out.println("Maintains the Natural Order of the Data Type");
		System.out.println();
		System.out.println("Natural Order when numbers are Integer");
		
		Map<Integer, String> treeMapNumbersToWords = new TreeMap<Integer, String>();
		
		treeMapNumbersToWords.put(2,  "Two");
		treeMapNumbersToWords.put(10, "Ten");
		treeMapNumbersToWords.put(25, "Twenty-Five");
		treeMapNumbersToWords.put(1,  "One");
		
		for (Integer number : treeMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + treeMapNumbersToWords.get(number));
		}	


		System.out.println();
		System.out.println("TreeMap Natural Order when numbers are String");

		Map<String, String> treeMapNumbersAsStrings = new TreeMap<String, String>();
		
		treeMapNumbersAsStrings.put("2",  "Two");
		treeMapNumbersAsStrings.put("10", "Ten");
		treeMapNumbersAsStrings.put("25", "Twenty-Five");
		treeMapNumbersAsStrings.put("1",  "One");
		
		for (String number : treeMapNumbersAsStrings.keySet()) {
			System.out.println(number + " is " + treeMapNumbersAsStrings.get(number));
		}	

	
		


		

	}

}
