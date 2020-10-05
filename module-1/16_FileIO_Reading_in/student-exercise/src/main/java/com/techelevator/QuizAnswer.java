package com.techelevator;

public class QuizAnswer {
	private String answerText;
	private boolean isCorrect = false;
	
	public QuizAnswer(String answerText) {
		this.answerText = answerText;
		if ( answerText.contains("*") ) {
			this.isCorrect = true;
		}
	}
	
	public String toString() {
		if ( this.answerText.contains("*") ) {
			answerText = answerText.substring(0, this.answerText.length() - 1);
		}
		return this.answerText;
	}

	public String getAnswerText() {
		return answerText;
	}

	public boolean isCorrect() {
		return isCorrect;
	}
}
