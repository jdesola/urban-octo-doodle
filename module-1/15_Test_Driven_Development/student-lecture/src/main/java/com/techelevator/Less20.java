package com.techelevator;


/*
	Return true if the given number is 1 or 2 less than a multiple of 20. 
	So for example 38 and 39 return true, but 40 returns false.
	less20(18) → true
	less20(19) → true
	less20(20) → false
*/
public class Less20 {
	
	public boolean isLessThanMultipleOf20(int n)	{
		if ( n % 20 == 19 || n % 20 == 18 ) {
			return true;
		}
		return false;
	}

}
