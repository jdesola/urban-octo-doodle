package com.techelevator.demo;

import com.techelevator.calculator.Calculator;
import com.techelevator.calculator.ScientificCalculator;
import com.techelevator.calculator.TrignometricCalculator;

public class CalculatorDemo {

	public static void main(String[] args) {
	
		Calculator calculator = new Calculator(0);
		
		ScientificCalculator sciCalc = new ScientificCalculator();
		
		TrignometricCalculator trigCalc = new TrignometricCalculator();

	
		
		ScientificCalculator trigAsSci = trigCalc;
		Calculator trigAsCalc = trigCalc;
		
		ScientificCalculator backToSci = (ScientificCalculator) trigAsCalc;
		
		if (backToSci instanceof TrignometricCalculator) {
			TrignometricCalculator backToTrig = (TrignometricCalculator) backToSci;
		}
		
		
		// Will cause a class cast exception
		//ScientificCalculator calcAsSci = (ScientificCalculator) calculator;
		
		boolean isCalculator = sciCalc instanceof Calculator;
		
		isCalculator = sciCalc instanceof TrignometricCalculator;
	
	}

}
