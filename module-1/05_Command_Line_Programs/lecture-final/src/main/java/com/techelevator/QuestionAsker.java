package com.techelevator;

import java.util.Scanner;

public class QuestionAsker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		String question = "What color do you like best?";
		String[] answers = { "Red", "Green", "Yellow", "Blue" };
		int rightAnswer = 2;
		
		System.out.println(question);
		
		for (int i = 0; i < answers.length; i++) {
			System.out.println("(" + (i+1) + ") " + answers[i] );
		}
		
		int userChoice = input.nextInt();
		input.nextLine();

		int choiceIndex = userChoice - 1;
		
		if (choiceIndex == rightAnswer) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
			System.out.println("The corrrect answer was " + answers[rightAnswer]);
		}
	}

}
