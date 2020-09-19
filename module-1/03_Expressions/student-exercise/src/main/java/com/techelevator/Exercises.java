package com.techelevator;

public class Exercises {

	/*
	 1. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on
	 vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 sleepIn(false, false) → true
	 sleepIn(true, false) → false
	 sleepIn(false, true) → true
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		boolean doesSleepIn = false;
		
		// sleepIn is TRUE if NOT weekday
		if (weekday == false) {
			doesSleepIn = true;
		}
		// sleepIn is TRUE if on Vacation
		 if (vacation == true) {
			 doesSleepIn = true;
		 }
		return doesSleepIn;
	}

	/*
	 2. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
	 are in trouble.
	 monkeyTrouble(true, true) → true
	 monkeyTrouble(false, false) → true
	 monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean inTrouble = false;
		
		//monkeyTrouble is True if BOTH Monkeys are Smiling
		if (aSmile == true && bSmile == true) {
			inTrouble = true;
		}
		//monkeyTrobule is True if NEITHER monkeys are Smiling
		if (aSmile == false && bSmile == false) {
			inTrouble = true;
		}
		return inTrouble;
	}

	/*
	 3. Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	 sumDouble(1, 2) → 3
	 sumDouble(3, 2) → 5
	 sumDouble(2, 2) → 8
	 */
	public int sumDouble(int a, int b) {
		int sum = 0;
		if (a != b) { //return SUM if a and b are NOT the same
			sum = a + b;
		} else { //return SUM * 2 if a and b ARE the same
			sum = 2 * (a + b);
		}
		return sum;
	}

	/*
	 4. Given an int n, return the absolute difference between n and 21, except return double the absolute
	 difference if n is over 21.
	 diff21(19) → 2
	 diff21(10) → 11
	 diff21(21) → 0
	 diff21(22) → 2
	 diff21(-10) → 31
	 */
	public int diff21(int n) {
		int diff = 0;
		
		if (n <= 21) { //if n <= 21, return the difference
			diff = Math.abs(21 - n);
		} else { //if n > 21, return double the difference
			diff = Math.abs(2 * (21 - n));
		}
		return diff;
	}

	/*
	 5. We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
	 We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if
	 we are in trouble.
	 parrotTrouble(true, 6) → true
	 parrotTrouble(true, 7) → false
	 parrotTrouble(false, 6) → false
	 */
	public boolean parrotTrouble(boolean talking, int hour) {
		boolean inTrouble = false;
		
		if ((hour < 7 || hour > 20) && talking == true) {//if the hour is < 7 or > 20 and the parrot is talking, trouble is true
			inTrouble = true;
		}
		return inTrouble;
	}

	/*
	 6. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
	 makes10(9, 10) → true
	 makes10(9, 9) → false
	 makes10(1, 9) → true
	 */
	public boolean makes10(int a, int b) {
		//return true if a and b = 10 or if a = 10 or b = 10
		boolean isOrMakes10 = false;
		
		if ((a == 10 || b == 10) || (a + b == 10)) {
			isOrMakes10 = true;
		}
		
		return isOrMakes10;
	}

	/*
	 7. Given 2 int values, return true if one is negative and one is positive. Except if the parameter
	 "negative" is true, then return true only if both are negative.
	 posNeg(1, -1, false) → true
	 posNeg(-1, 1, false) → true
	 posNeg(-4, -5, true) → true
	 */
	public boolean posNeg(int a, int b, boolean negative) {
		boolean isPosNeg = false;
		
		if (((a < 0 && b > 0) || (a > 0 && b < 0)) && negative == false) {// if a is negative and b is positive or if a is positive and b is negative and if negative is false return true
			isPosNeg = true;
		} else if ((a < 0 && b < 0) && negative == true) {// if a is negative and b is negative and if negative is true return true
			isPosNeg = true;
		}
		
		return isPosNeg;//I know I can combine the if and else if, however I want the code to be easier to read.
	}

	/*
	 8. Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 (Hint: Think "mod".)
	 or35(3) → true
	 or35(10) → true
	 or35(8) → false
	 */
	public boolean or35(int n) {
		boolean is3or5 = false;
		
		if (n > -1) {//first, check if number is non-negative
			if ((n % 3 == 0) || (n % 5 == 0)) {//then use modulus to check if number is evenly divisible by 3 or 5, remaineder should be 0, return true
				is3or5 = true; 
			}
		}
		return is3or5;
	}

	/*
	 9. Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	 icyHot(120, -1) → true
	 icyHot(-1, 120) → true
	 icyHot(2, 120) → false
	 */
	public boolean icyHot(int temp1, int temp2) {
		boolean isIcyHot = false;
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {//if temp1 < 0 and temp2 is > 100 or temp1 > 100 and temp2 < 0, return true
			isIcyHot = true;
		}
		return isIcyHot;
	}

	/*
	 10. Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 in1020(12, 99) → true
	 in1020(21, 12) → true
	 in1020(8, 99) → false
	 */
	public boolean in1020(int a, int b) {
		boolean isIn10to20 = false;
		if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {//if either number is 10 to 20, return true
			isIn10to20 = true;
		}
		return isIn10to20;
	}

	/*
	 11. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
	 return true if 1 or more of them are teen.
	 hasTeen(13, 20, 10) → true
	 hasTeen(20, 19, 10) → true
	 hasTeen(20, 10, 13) → true
	 */
	public boolean hasTeen(int a, int b, int c) { //similar problem to 10
		boolean isTeen = false;
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {//if either number is 10 to 20, return true
			isTeen = true;
		}
		return isTeen;
	}

	/*
	 12. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
	 return true if one or the other is teen, but not both.
	 loneTeen(13, 99) → true
	 loneTeen(21, 19) → true
	 loneTeen(13, 13) → false
	 */
	public boolean loneTeen(int a, int b) {
		boolean isLoneTeen = false;
		if ((a >=13 && a <=19) ^ (b >= 13 && b <= 19)) {
			isLoneTeen = true;
		}
		
		return isLoneTeen;
	}

	/*
	 13. Given three int values, a b c, return the largest.
	 intMax(1, 2, 3) → 3
	 intMax(1, 3, 2) → 3
	 intMax(3, 2, 1) → 3
	 */
	public int intMax(int a, int b, int c) {
		//This would be easier with a loop
		if ((a >= b) && (a >= c)) {
			return a;
		} else if ((b >= a) && (b >= c)) {
			return b;
		} else {
			return c;
		}
	}

	/*
	 14. Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both
	 in the range 40..50 inclusive.
	 in3050(30, 31) → true
	 in3050(30, 41) → false
	 in3050(40, 50) → true
	 */
	public boolean in3050(int a, int b) {
		//return true if the two input integers are both in the range of 30 to 40
		//return true if the two input integers are both in the range of 40 to 50
		boolean isIn3050 = false;
		
		if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || (a >= 40 && a <= 50) && (b >= 40 && b <=50)) {
			isIn3050 = true;
		}
		
		return isIn3050;
	}

	/*
	 15. Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
	 or return 0 if neither is in that range.
	 max1020(11, 19) → 19
	 max1020(19, 11) → 19
	 max1020(11, 9) → 11
	 */
	public int max1020(int a, int b) {
		//first check if values are positive
		if (a >= 0 && b >= 0) {
			if ((a >= 10 && a <= 20) || (b >=10 && b <= 20)) {//then check that they are in the range
				if ((a >= 10 && a <= 20) && (b >=10 && b <= 20)) { //check that both are in the range
					if (a > b) { //if a is greater than b, give a
						return a;
					} else { //if b is greater than b, give b
						return b;
					}
				} else if ((a >= 10 && a <= 20) && !(b >=10 && b <= 20)) { //if b is not in range, give a
					return a;
				} else if (!(a >= 10 && a <= 20) && (b >=10 && b <= 20)) { //if a is not in range, give b
					return b;
				}
			}
		}
		return 0; //if none of the parameters are met, return 0
	}

	/*
	 16. When squirrels get together for a party, they like to have cigars. A squirrel party is successful
	 when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
	 there is no upper bound on the number of cigars. Return true if the party with the given values is
	 successful, or false otherwise.
	 cigarParty(30, false) → false
	 cigarParty(50, false) → true
	 cigarParty(70, true) → true
	 */
	public boolean cigarParty(int cigars, boolean isWeekend) {
		boolean cigarPartySuccess = false;
		
		//first, check if it is the weekend
		if (isWeekend) {
			if (cigars >= 40) { //check if it there was more than 40 cigars
				cigarPartySuccess = true;
			}
		} else {
			if (cigars >= 40 && cigars <= 60) { //check if there was more than 40 cigars and less than 60 cigars
				cigarPartySuccess = true;
			}
			
		}
		
		return cigarPartySuccess;
	}

	/*
	 17. You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
	 of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
	 returned will be 0 if you did not get the table, 1 if you might get the table, and 2 if you did get
	 the table. If you or your date is very stylish (8 or more), then the result is 2 (yes). With the
	 exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the
	 result is 1 (maybe).
	 dateFashion(5, 10) → 2
	 dateFashion(5, 2) → 0
	 dateFashion(5, 5) → 1
	 */
	public int dateFashion(int you, int date) {
		//you or date is 8 or more, then 2 (yes)
		if ((you >= 8 && date > 2) || (you > 2 && date >= 8)) {
			return 2;
		} else if (date <= 2 || you <= 2) {//if you or date is 2 or less, then 0 (no)
			return 0;
		} else {
			return 1; //any other condition results in 1 (maybe)
		}
	}

	/*
	 18. The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature
	 is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given
	 an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 squirrelPlay(70, false) → true
	 squirrelPlay(95, false) → false
	 squirrelPlay(95, true) → true
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) {
		boolean areSquirrelsPlaying = false;
		//if summer, between 60 and 100, squirrels playing
		if (isSummer) {
			if (temp >= 60 && temp <= 100) {
				areSquirrelsPlaying = true;
			}
		} else {
			if (temp >= 60 && temp <= 90) {// if not summer, between 60 and 90, squirrels playing
				areSquirrelsPlaying = true;
			}
		}
		//could also use a var and ternary operator to set the upper limit
		
		return areSquirrelsPlaying;
		}

	/*
    19. Dessert Island Diner believes a meal isn't a meal without dessert. All meals come with
    a free dessert.

    There are three categories of free desserts: "standard", "special", and "ginormous".
    The meal amount determines the dessert category: <= $10 (standard), <= $15 (special),
    > $15 (ginormous). Unless it is your birthday -- on that day, an additional $5 is added
    when calculating the category to potentially bump you up to the next delicious category.

    For instance, if the amount of the meal was $7, and it is your birthday, $5 is added to
    $7 when determining the dessert category, which means you would qualify for a "special".

    yourCakeAndEatItToo(4.99, false) → "standard"
    yourCakeAndEatItToo(4.99, true) → "standard"
    yourCakeAndEatItToo(7.00, false) → "standard"
    yourCakeAndEatItToo(7.00, true) → "special"
    yourCakeAndEatItToo(10.00, false) → "standard"
    yourCakeAndEatItToo(10.00, true) → "special"
    yourCakeAndEatItToo(11.00, false) → "special"
    */
	public String yourCakeAndEatItToo(double mealAmount, boolean isBirthday) {
		//if it is the person's birthday, add $5 to meal amount
		String dessertCategory; 
		
		if (isBirthday) {
			mealAmount += 5.00;
		}
		
		//determine dessertCategory based on mealAmount
		if (mealAmount > 15.00) {
			dessertCategory = "ginormous";
		} else if (mealAmount > 10.00) {
			dessertCategory = "special";
		} else {
			dessertCategory = "standard";
		}
		return dessertCategory;
	}

	/*
	 20. Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
	 so in that case just return 20.
	 sortaSum(3, 4) → 7
	 sortaSum(9, 4) → 20
	 sortaSum(10, 11) → 21
	 */
	public int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum >= 10 && sum <= 19) {
			return sum = 20;
		}
		
		return sum;
	}

	/*
	 21. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
	 on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays,
	 the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then
	 on weekdays it should be "10:00" and weekends it should be "off".
	 alarmClock(1, false) → "7:00"
	 alarmClock(5, false) → "7:00"
	 alarmClock(0, false) → "10:00"
	 */
	public String alarmClock(int day, boolean vacation) {
		String alarmSetting = "off";
		//if vacation is true, 1-5 is 10:00 and 0 and 6 are off
		if (vacation) {
			if (day >= 1 && day <= 5) {
				alarmSetting = "10:00";
			} else {
				alarmSetting = "off";
			}
		}
		else {		//if vacation is false, 1-5 is 7:00 and 0 and 6 are 10:00
			if (day >= 1 && day <= 5) {
				alarmSetting = "7:00";
			} else {
				alarmSetting = "10:00";
			}
		}
		return alarmSetting;
	}

	/*
	 22. Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true,
	 in which case return true if the number is less or equal to 1, or greater or equal to 10.
	 in1To10(5, false) → true
	 in1To10(11, false) → false
	 in1To10(11, true) → true
	 */
	public boolean in1To10(int n, boolean outsideMode) {
		boolean isIn1To10 = false;
		//if outsideMode is true, 1-10 yields false and anything else yields true
		if (outsideMode) {
			if (n <= 1 || n >= 10) {
				isIn1To10 = true;
			}
		} else {
			if (n >= 1 && n <= 10) {
				isIn1To10 = true;
			}
		}
		//if outsideMode is false, 1-10 yields true and anything else yields false
		
		return isIn1To10;
	}

	/*
	 23. We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
	 Return true if the given non-negative number is special.
	 (Hint: Think "mod".)
	 specialEleven(22) → true
	 specialEleven(23) → true
	 specialEleven(24) → false
	 */
	public boolean specialEleven(int n) {
		boolean isSpecialEleven = false;
		// first check if number is non-negative
		if (n >= 0) {
			//check if number is modulus of 11 or one more than multiple
			if ((n % 11 == 0) || ((n - 1) % 11 == 0)) {
				isSpecialEleven = true;
			}
		}
		return isSpecialEleven;
	}

	/*
	 24. Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
	 (Hint: Think "mod".)
	 more20(20) → false
	 more20(21) → true
	 more20(22) → true
	 */
	public boolean more20(int n) {
		boolean isMore20 = false;
		
		//first check if the number is non-negative
		if (n >= 0) {
			if (((n - 1) % 20 == 0) || ((n - 2) % 20 == 0)) { //check if n less is a multiple of 20 or if n less 2 is a multiple of 20
				isMore20 = true;
			}
		}
		
		return isMore20;
	}

	/*
	 25. Return true if the given non-negative number is a multiple of 3 or 5, but not both.
	 (Hint: Think "mod".)
	 old35(3) → true
	 old35(10) → true
	 old35(15) → false
	 */
	public boolean old35(int n) {
		boolean isMultipleOf3Or5 = false;
		
		// first check if the given number is non-negative
		if (n >= 0) {
			if ((n % 5 == 0) ^ (n % 3 == 0)) {//use XOR to find if n is a multiple of one or the other
				isMultipleOf3Or5 = true;
			}
		}
		return isMultipleOf3Or5;
	}

	/*
	 26. Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
	 and 39 return true, but 40 returns false.
	 (Hint: Think "mod".)
	 less20(18) → true
	 less20(19) → true
	 less20(20) → false
	 */
	public boolean less20(int n) {
		boolean isLess20 = false;
		//first check if number is non-negative
		if (n >= 0) {
			if (((n + 1) % 20 == 0) || ((n + 2) % 20 == 0)) { //check if 1 more than n or 2 more than n are multiples of 20
				isLess20 = true;
			}
		}
		
		return isLess20;
	}

	/*
	 27. Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
	 is the remainder of dividing a by b, so (7 % 5) is 2.
	 nearTen(12) → true
	 nearTen(17) → false
	 nearTen(19) → true
	 */
	public boolean nearTen(int num) {
		System.out.println(19 % 10);
		boolean isNearMultipleOfTen = false;
		//first check that given number is non-negative
		if (num >= 0) {
			if (num % 10 <= 2 || 10 - num % 10 <= 2) {				
				isNearMultipleOfTen = true;
			}
		}
		return isNearMultipleOfTen;
	}
	/*
	 28. Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are
	 extra lucky. So if either value is a teen, just return 19.
	 teenSum(3, 4) → 7
	 teenSum(10, 13) → 19
	 teenSum(13, 2) → 19
	 */
	public int teenSum(int a, int b) {
		int theSum = 0;
		
		if ((a >= 13 && a <= 19) || (b >= 13 && b <=  19)) {
			theSum = 19;
		} else {
			theSum = a + b;
		}
		return theSum;
	}

	/*
	 29. Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning
	 you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
	 answerCell(false, false, false) → true
	 answerCell(false, false, true) → false
	 answerCell(true, false, false) → false
	 */
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		boolean shouldIAnswer = true;
		//normally true
		if (isMorning ==  true && isMom == false) {//if morning is true and mom is false, return false
			shouldIAnswer = false;
		} else if (isAsleep == true) { //if asleep is true, return false
			shouldIAnswer = false;
		}
		return shouldIAnswer;
	}

	/*
	 30. We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as
	 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if
	 either tea or candy is at least double the amount of the other one, the party is great (2). However,
	 in all cases, if either tea or candy is less than 5, the party is always bad (0).
	 teaParty(6, 8) → 1
	 teaParty(3, 8) → 0
	 teaParty(20, 6) → 2
	 */
	public int teaParty(int tea, int candy) {
		int teaPartyOutcome = 0;
		//return outcome of party
		if (tea < 5 || candy < 5) {//0 if tea or candy is less than 5
			teaPartyOutcome = 0;
		} else if (tea >= 5 && candy >= 5 && !((tea >= (2 * candy)) || (candy >= (tea * 2)))) {//1 if tea is at least 5 and candy is at least 5
			teaPartyOutcome = 1;
		} else if ((tea >= (2 * candy)) || (candy >= (tea * 2))) {//2 if tea is double candy or candy is double tea
			teaPartyOutcome = 2;
		}
		return teaPartyOutcome;
	}

	/*
	 31. Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
	 twoAsOne(1, 2, 3) → true
	 twoAsOne(3, 1, 2) → true
	 twoAsOne(3, 2, 2) → false
	 */
	public boolean twoAsOne(int a, int b, int c) {
		boolean canTwoBecomeOne = false;
		if (a + b == c) {
			canTwoBecomeOne = true;
		} else if (b + c == a) {
			canTwoBecomeOne = true;
		} else if (c + a == b) {
			canTwoBecomeOne = true;
		}
		return canTwoBecomeOne;
	}

	/*
	 32. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with
	 the exception that if "bOk" is true, b does not need to be greater than a.
	 inOrder(1, 2, 4, false) → true
	 inOrder(1, 2, 1, false) → false
	 inOrder(1, 1, 2, true) → true
	 */
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		boolean isInOrder = false;
		if (bOk) {
			if (c > b) {
				isInOrder = true;
			}
		} else {
			if (b > a && c > b){
				isInOrder = true;
			}
		}
		return isInOrder;
	}

	/*
	 33. Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11,
	 or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality
	 is allowed, such as 5 5 7 or 5 5 5.
	 inOrderEqual(2, 5, 11, false) → true
	 inOrderEqual(5, 7, 6, false) → false
	 inOrderEqual(5, 5, 7, true) → true
	 */
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		boolean isInOrderEqual = false;
		if (equalOk) {
			if ((a <= b) && (b <= c)) {
				isInOrderEqual = true;
			}
		} else {
			if ((a < b) && (b < c)) {
				isInOrderEqual = true;
			}
		}
		return isInOrderEqual;
	}

	/*
	 34. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another
	 of the values, it does not count towards the sum.
	 loneSum(1, 2, 3) → 6
	 loneSum(3, 2, 3) → 2
	 loneSum(3, 3, 3) → 0
	 */
	public int loneSum(int a, int b, int c) {
		int thisLonelySum = 0;
		if ((a != b) && (a != c) && (b != c)) {
			thisLonelySum = a + b + c;
		} else if (a == b && a != c) {
			thisLonelySum = c;
		} else if (a == c && b != c) {
			thisLonelySum = b;
		} else if (b == c && a != b) {
			thisLonelySum = a;
		} 
		return thisLonelySum;
	}

	/*
	 35. Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not
	 count towards the sum and values to its immediate right do not count. So for example, if b is 13, then both
	 b and c do not count.
	 luckySum(1, 2, 3) → 6
	 luckySum(1, 2, 13) → 3
	 luckySum(1, 13, 3) → 1
	 luckySum(13, 1, 3) → 3
	 luckySum(13, 13, 3) → 0
	 */
	public int luckySum(int a, int b, int c) {
		int oneUnluckySum = 0;
		if (a != 13 && b != 13 && c != 13) {
			oneUnluckySum = a + b + c;
		} else if (a == 13 && b != 13) {
			oneUnluckySum = c;
		} else if (a == 13 && b == 13) {
			oneUnluckySum = 0;
		} else if (b == 13) {
			oneUnluckySum = a;
		} else if (c == 13) {
			oneUnluckySum = a + b;
		}
		return oneUnluckySum;
	}

}
