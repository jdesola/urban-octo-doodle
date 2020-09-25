package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	//Constructor
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	//Getters and Setters
	public int getEarnedMarks() {
		return earnedMarks;
	}

	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	//Derived Properties
	public String getLetterGrade() {
		double percentage = (double) this.earnedMarks / (double) this.possibleMarks;
		String letterGrade = "";
		if ( percentage < .60 ) {
			letterGrade = "F";
		} else if ( percentage >= .60 && percentage < .70 ) {
			letterGrade = "D";
		} else if ( percentage >= .70 && percentage < .80 ) {
			letterGrade = "C";
		} else if ( percentage >= .80 && percentage < .90 ) {
			letterGrade = "B";
		} else if ( percentage >= .90 ){
			letterGrade = "A";
		}
		
		return letterGrade;
	}
	
	
}
