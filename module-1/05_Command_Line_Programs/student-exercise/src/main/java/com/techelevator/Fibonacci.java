package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner in = new Scanner ( System.in );
		System.out.print("Please enter the Fibonacci number: ");
		
		String userEnteredIntegerIn = in.nextLine();
		int userEnteredInteger = Integer.parseInt(userEnteredIntegerIn);
		
		int fibValue1 = 0;
		
		int fibValue2 = 1;
		
		int fibValue3 = 0;
		
		System.out.printf("%d, ", fibValue1);
		System.out.printf("%d, ", fibValue2);
		
		for (int i = 0; i < userEnteredInteger; i = fibValue3) {
			fibValue3 = fibValue1 + fibValue2;
			int fibCheck = fibValue3 + fibValue2;
			if (fibCheck  <= userEnteredInteger) {
				System.out.printf("%d, ", fibValue3);
				fibValue1 = fibValue2;
				fibValue2 = fibValue3;
			} else if (fibValue3 <= userEnteredInteger) {
				System.out.println(fibValue3);
				break;
			}
			
		}
			
			
			
		}
	}
