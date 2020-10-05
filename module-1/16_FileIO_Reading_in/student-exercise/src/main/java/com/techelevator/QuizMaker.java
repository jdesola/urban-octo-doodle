package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		List<QuizQuestion> QuizQuestions = new ArrayList<QuizQuestion>();
		
		Scanner in = new Scanner( System.in );
		
		System.out.println("Where is the quiz file?");
		
		String pathToQuiz = in.nextLine();
		
		File quizFile = new File( pathToQuiz );
		
		try (Scanner fileScanner = new Scanner( quizFile ).useDelimiter("[|\n]") ) {
			while ( fileScanner.hasNextLine() ) {
			String parsedQuestion = fileScanner.next();
			QuizAnswer parsedAnswer1 = new QuizAnswer(fileScanner.next());
			QuizAnswer parsedAnswer2 = new QuizAnswer(fileScanner.next());
			QuizAnswer parsedAnswer3 = new QuizAnswer(fileScanner.next());
			QuizAnswer parsedAnswer4 = new QuizAnswer(fileScanner.next());
			
			QuizQuestions.add(new QuizQuestion(parsedQuestion, parsedAnswer1, parsedAnswer2, parsedAnswer3, parsedAnswer4));
			
			}
		} catch (FileNotFoundException e) {
			System.out.println("Quiz File Not Found");
		}
		
		String userAnswer = "";
		
		int score = 0;
		int questionsAsked = 0;
		
		while ( !(userAnswer.equals("exit")) ) {
			int questionSelector = (int) (Math.random() * (QuizQuestions.size() - 1) + 0);
			
			System.out.println(QuizQuestions.get(questionSelector).getQuestion());
			
			System.out.println("1. " + QuizQuestions.get(questionSelector).getAnswer1());
			System.out.println("2. " + QuizQuestions.get(questionSelector).getAnswer2());
			System.out.println("3. " + QuizQuestions.get(questionSelector).getAnswer3());
			System.out.println("4. " + QuizQuestions.get(questionSelector).getAnswer4());
			
			System.out.println();
			
			System.out.print("Your answer: ");
			userAnswer = in.nextLine().toLowerCase();
			System.out.println();
			
			if ( userAnswer.equals("1") ) {
				if (QuizQuestions.get(questionSelector).getAnswer1().isCorrect() ) {
					score++;
					questionsAsked++;
					System.out.println("Correct!");
					System.out.println();
					System.out.printf("You got %d answer(s) correct out of the total %d questions asked.\n", score, questionsAsked);
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				} else {
					questionsAsked++;
					System.out.println("Sorry that isn't correct!");
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				}
			}
			
			if ( userAnswer.equals("2") ) {
				if (QuizQuestions.get(questionSelector).getAnswer2().isCorrect() ) {
					score++;
					questionsAsked++;
					System.out.println("Correct!");
					System.out.println();
					System.out.printf("You got %d answer(s) correct out of the total %d questions asked.\n", score, questionsAsked);
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				} else {
					questionsAsked++;
					System.out.println("Sorry that isn't correct!");
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				}
			}
			
			if ( userAnswer.equals("3") ) {
				if (QuizQuestions.get(questionSelector).getAnswer3().isCorrect() ) {
					score++;
					questionsAsked++;
					System.out.println("Correct!");
					System.out.println();
					System.out.printf("You got %d answer(s) correct out of the total %d questions asked.\n", score, questionsAsked);
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				} else {
					questionsAsked++;
					System.out.println("Sorry that isn't correct!");
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				}
			}
			
			if ( userAnswer.equals("4") ) {
				if (QuizQuestions.get(questionSelector).getAnswer4().isCorrect() ) {
					score++;
					questionsAsked++;
					System.out.println("Correct!");
					System.out.println();
					System.out.printf("You got %d answer(s) correct out of the total %d questions asked.\n", score, questionsAsked);
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				} else {
					questionsAsked++;
					System.out.println("Sorry that isn't correct!");
					System.out.println();
					System.out.println("Enter \"exit\" to quit.");
					System.out.println();
				}
			}
			
		}

	}

}
