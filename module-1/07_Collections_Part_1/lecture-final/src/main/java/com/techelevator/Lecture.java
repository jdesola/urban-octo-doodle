package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> instructors = new ArrayList<String>();
		instructors.add("John");
		instructors.add("Steve");
		instructors.add("Matt");
		instructors.add("Matty");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for ( int i = 0; i < instructors.size(); i++) {
			String name = instructors.get(i);
			System.out.println( name );
		}
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		instructors.add("John");
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		instructors.add(2, "Rachelle");
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		instructors.remove( 3 );
		instructors.remove("John");
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean isInList = instructors.contains( "steve");
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] instructorsArray = instructors.toArray( new String[instructors.size()] ); 
		
		// Can change an Array into a List
		List<String> instructorList = Arrays.asList( instructorsArray );
		
		
		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");


		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		Integer employees = new Integer(25);
		Integer piecesOfCake = new Integer("24");
		
		if (employees > piecesOfCake) {
			System.out.println("Not enough cake");
		}
		
		Integer objX = 10;
		int y = 20;
		y = objX + 5;
		objX = y + 10;
		
//		Double balance = null;
//		double newBalance = balance + 100;
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		int twenty = 20;
		
		numbers.add( 10 );
		numbers.add( twenty );
		numbers.add( 20 + 10 );
		numbers.add( new Integer(40) );
		numbers.add( new Integer("50") );
		

		Double dbl = new Double("3.14");
		
		List<Double> listOfDoubles = new ArrayList<Double>();
		listOfDoubles.add(new Double("2.75"));

		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for ( String name : instructors ) {
			
			if (name.equals("Matty")) {
				continue;
			}
			
			System.out.println( name );
		}
		
		double[] doubleArray = { 1.25, 7.65, 11.17, 1225.6 };
		
		for ( double num : doubleArray ) {
			System.out.println(num);
		}
		
		
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		
		
		Queue<String> tasks = new LinkedList<String>();
		
		tasks.offer("Clean dishes");
		tasks.offer("Brush couch");
		tasks.offer("wipe counters");
		tasks.offer("scrub ceiling");
		
		

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////

		while ( !tasks.isEmpty() ) {
			
			String nextTask = tasks.poll();
			System.out.println("Next Task: " + nextTask);
			
			System.out.println("The next task will be: " +  tasks.peek() );
			
			
		}
		
		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		Stack<String> history = new Stack<String>();
		
		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		history.push("http://google.com");
		history.push("http://msdn.com");
		history.push("http://stackoverflow.com");
		history.push("https://dashboard.techelevator.com");
		
		
		
		////////////////////
		// POPPING THE STACK
		////////////////////
		
		while ( !history.isEmpty() ) {
			String previousPage = history.pop();
			System.out.println( previousPage );
		}
		
		
		// Can use a Stack to reverse another collection or array
		int[] nums = { 10, 20, 30, 40, 50 };
		
		Stack<Integer> numStack = new Stack<Integer>();
		
		for ( int n : nums ) {
			numStack.push( n );
		}
		
		List<Integer> numList = new ArrayList<Integer>();
		
		while ( !numStack.isEmpty() ) {
			numList.add( numStack.pop() );
		}

	}
}
