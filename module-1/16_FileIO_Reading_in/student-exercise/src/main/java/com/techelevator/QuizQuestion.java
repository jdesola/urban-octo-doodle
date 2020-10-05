package com.techelevator;



public class QuizQuestion {
	private String question;
	private QuizAnswer answer1;
	private QuizAnswer answer2;
	private QuizAnswer answer3;
	private QuizAnswer answer4;
	
	public QuizQuestion(String question, QuizAnswer answer1, QuizAnswer answer2, QuizAnswer answer3, QuizAnswer answer4) {
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		}

	public String getQuestion() {
		return question;
	}

	public QuizAnswer getAnswer1() {
		return answer1;
	}

	public QuizAnswer getAnswer2() {
		return answer2;
	}

	public QuizAnswer getAnswer3() {
		return answer3;
	}

	public QuizAnswer getAnswer4() {
		return answer4;
	}
}
