/*
1. **iqTest** Bob is preparing to pass an IQ test. The most frequent task in this test 
    is to find out which one of the given numbers differs from the others. Bob observed
    that one number usually differs from the others in evenness. Help Bob — to check his 
    answers, he needs a program that among the given numbers finds one that is different in 
    evenness, and return the position of this number. _Keep in mind that your task is to help 
    Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0)_

		iqTest("2 4 7 8 10") → 3 //third number is odd, while the rest are even
		iqTest("1 2 1 1") → 2 // second number is even, while the rest are odd
		iqTest("") → 0 // there are no numbers in the given set
        iqTest("2 2 4 6") → 0 // all numbers are even, therefore there is no position of an odd number
*/

function iqTest(numbers) {
    let countOdd = 0;
    let countEven = 0;
    let numberIndex;


    let numbersArray = numbers.split(" ");

    if (numbers.length == 0) {
        numberIndex = 0;
    }

    for (let i = 0; i < numbersArray.length; i++) {
        if (numbersArray[i] % 2 == 1) {
            countOdd++;
        }
        if (numbersArray[i] % 2 == 0) {
            countEven++;
        }
    }

    for (let i = 0; i < numbersArray.length; i++) {
        if (countEven > countOdd) {
            if (numbersArray[i] % 2 == 1) {
                numberIndex = i + 1;
            }
        }
        if (countOdd > countEven) {
            if (numbersArray[i] % 2 == 0) {
                numberIndex = i + 1;
            }
        }
        if ((countEven == numbersArray.length) || (countOdd == numbersArray.length)) {
            numberIndex = 0;
        }
    }
    return numberIndex;
}

/*
2. **titleCase** Write a function that will convert a string into title case, given an optional 
    list of exceptions (minor words). The list of minor words will be given as a string with each 
    word separated by a space. Your function should ignore the case of the minor words string -- 
    it should behave in the same way even if the case of the minor word string is changed.


* First argument (required): the original string to be converted.
* Second argument (optional): space-delimited list of minor words that must always be lowercase
except for the first word in the string. The JavaScript tests will pass undefined when this 
argument is unused.

		titleCase('a clash of KINGS', 'a an the of') // should return: 'A Clash of Kings'
		titleCase('THE WIND IN THE WILLOWS', 'The In') // should return: 'The Wind in the Willows'
        titleCase('the quick brown fox') // should return: 'The Quick Brown Fox'
*/

function titleCase(arg1, arg2) {
    let arg1Caps = "";
    if (arg2 == undefined) {
        arg1 = arg1.toLowerCase();
        let arg1Array = arg1.split(" ");
        for (let i = 0; i < arg1Array.length; i++) {
            let currentWord = arg1Array[i];
            currentWord = currentWord[0].toUpperCase() + currentWord.substr(1);
            if (i < arg1Array.length - 1) {
                arg1Caps += currentWord + " ";
            } else {
                arg1Caps += currentWord;
            }
        }

    } else {
        arg1 = arg1.toLowerCase();
        let arg1Array = arg1.split(" ");
        arg2 = arg2.toLowerCase();
        let arg2Array = arg2.split(" ");
        for (let i = 0; i < arg1Array.length; i++) {
            let currentWord = arg1Array[i];
            for (let j = 0; j < arg2Array.length; j++) {
                if ((currentWord.toLowerCase() == arg2Array[j]) && (i != 0)) {
                    currentWord = currentWord.toLowerCase();
                    break;
                } else {
                    currentWord = currentWord[0].toUpperCase() + currentWord.substr(1);
                }
                
            }
            if (i < arg1Array.length - 1) {
                arg1Caps += currentWord + " ";
            } else {
                arg1Caps += currentWord;
            }   
        }
        
    }
    return arg1Caps;
}