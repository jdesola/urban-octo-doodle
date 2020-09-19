package com.techelevator;

import java.util.Scanner;

import java.util.Random;

public class QuestionAsker {

	public static void main(String[] args) {
		Random questionSelector = new Random();
		Scanner in = new Scanner( System.in );
		
		int numberOfQuestions = 3;
		int score = 0;
		while (score < 3) {
			int int_random = questionSelector.nextInt(numberOfQuestions);
			if (int_random == 0) {
				System.out.println("Who is the second Spider-Man?");
				System.out.println("1: Peter Parker");
				System.out.println("2: Miles Morales");
				System.out.println("3: Bruce Wayne");
				System.out.println("4: Ben Riley");
				System.out.print("What is your answer?: ");
				String userAnswerIn = in.nextLine();
				int userAnswer = Integer.parseInt(userAnswerIn);
				int correctAnswer = 4;
				if (userAnswer == correctAnswer) {
					System.out.println("You got it right!");
					score++;
					System.out.print("Current Score: ");
					System.out.println(score);
				} else {
					System.out.println("Sorry, you're wrong!");
					System.out.print("Current Score: ");
					System.out.println(score);
				}
			} else if (int_random == 1) {
				System.out.println("What is the capital of Ohio?");
				System.out.println("1: Cincinnati");
				System.out.println("2: Columbus");
				System.out.println("3: Cleveland");
				System.out.println("4: Toledo");
				System.out.print("What is your answer?: ");
				String userAnswerIn = in.nextLine();
				int correctAnswer = 2;
				int userAnswer = Integer.parseInt(userAnswerIn);
				if (userAnswer == correctAnswer) {
					System.out.println("You got it right!");
					score++;
					System.out.print("Current Score: ");
					System.out.println(score);
				} else {
					System.out.println("Sorry, you're wrong!");
					System.out.print("Current Score: ");
					System.out.println(score);
				}
			} else if (int_random == 2) {
				System.out.println("Approximately how much does an elephant weigh in tons?");
				System.out.println("1: 10");
				System.out.println("2: 5");
				System.out.println("3: 2");
				System.out.println("4: 100");
				System.out.print("What is your answer?: ");
				String userAnswerIn = in.nextLine();
				int userAnswer = Integer.parseInt(userAnswerIn);
				int correctAnswer = 2;
				if (userAnswer == correctAnswer) {
					System.out.println("You got it right!");
					score++;
					System.out.print("Current Score: ");
					System.out.println(score);
				} else {
					System.out.println("Sorry, you're wrong!");
					System.out.print("Current Score: ");
					System.out.println(score);
				}
			}

		}
	}
}
