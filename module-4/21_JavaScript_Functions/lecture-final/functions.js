function printTest() {
    console.log("test");
}

/*
    Spread Operator
*/
function multipleWithSpread(x, y, z) {
    return x * y * z;
}
function addLettersWithSpread(a, b, c) {
    return c + a + b;
}

function spreadOperatorExample() {
    const args = [1,2,3];
    console.log( multipleWithSpread( ...args ) );
    const args2 = [1,2,3, 4, 5, 6];
    console.log( multipleWithSpread( ...args2 ) );

    const str = "Test";
    console.log( addLettersWithSpread(...str) );
}

/*
    Scope
*/

function greeting(firstName) {
    console.log('Hello ' + firstName);
}
// Global Scope - available everywhere
let name = 'John';

greeting(name);

// Block Scope - available inside the block it is defined in
if (true) {
    let blockScopeLet = "Steve";
    greeting(blockScopeLet); // available here
}
//greeting(blockScopeLet); // not available here

// Function scope - available anywhere in the function
function functionScope() {
    let functionScopeVariable = "Matt";
    if (true) {
        let blockScopeVariable = "Rachelle";
        greeting(functionScopeVariable);
        greeting(blockScopeVariable);
    }
    greeting(functionScopeVariable);
    //greeting(blockScopeVariable); - not available here
}

/*
 Anonymous Functions
 */
const doubleValue = function (x,y) {
    return (x + y) * 2
}

console.log( doubleValue(2, 3) );

let xyz = doubleValue;
console.log ( xyz(4,6) );

const tripleValue = (x,y) => {
    return (x + y) * 3;
}

function doSomething(x, y, func) {
    return func(x, y);
}
console.log( doSomething( 2, 4, doubleValue ));
console.log( doSomething( 2, 4, tripleValue ));
console.log( doSomething( 2, 4, (x, y) => { return x * y;} ));

/*
 Array.forEach() 
 */
const arr = [1,2,3,4,5,6,7,8,9,10];
const stringArr = ['A', 'B', 'C', 'D', 'E'];

function forEachExample() {

    arr.forEach( (currentValue) => {
        let x = currentValue * 10;
        console.log( x );
    });

    arr.forEach( (currentValue, index, array) => {
        let x = currentValue * 10;
        console.log( `Original ${array[index]} = ${x}`);
    });

    // Can find the sum with a forEach, but reduce() would work better
    let sum = 0;
    arr.forEach( val => {
        sum += val;
    });
    console.log(`The sum is ${ sum }`);

}

/*
    Array.reduce()
*/
function reduceExample() {
    
    let sum = arr.reduce( (sum, value) => {
        return sum + value;
    });
    console.log(`The sum is ${ sum }`);

    // Same thing written without an array function
    // let sum2 = 0
    // for ( let i = 0; i < arr.length; i++) {
    //     let value2 = arr[i];
    //     sum2 = sum2 + value2;
    // }

    let newStr = stringArr.reduce( (stringWeAreBuilding, currentArrayValue) => {
        return stringWeAreBuilding + ', ' + currentArrayValue;
    } );
    console.log( newStr );


    const sumTimesTwo = (sum, val) => {
        return sum + (val * 2);
    }
    console.log( arr.reduce(sumTimesTwo) );

}

const words = [ 'car', 'boat', 'chicken', 'cow', 'horse', 'house', "am"];
/*
    Array.filter() 
*/
function filterExamples() {

    // Filter out numbers that are multiples of 3
    let filteredArray = arr.filter( (currentValue, index, array) => {
        return !(currentValue % 3 == 0);
    });
    console.log( filteredArray );

    // Filter out every even index
    filteredArray = arr.filter( (currentValue, index, array) => {
        return !(index % 2 == 0);
    });
    console.log( filteredArray );

    // Filter the array for words only 4+ letters
    let filteredWords = words.filter( word  => {
        return word.length >= 4;
    });
    console.log(filteredWords);

}

/*
    Array.map()
*/
function mapExamples() {

    // Map the arr of numbers so that every number if multiplied by 10
    let arrTimes10 = arr.map( currentValue => { 
        return currentValue * 10;
    });
    console.log( arrTimes10 );

    // Map the words in even indexes to all uppercase
    let upperCaseWords = words.map( (word, index) => {
        if (index % 2 == 0) {
            return word.toUpperCase();
        }
        return word;
    });
    console.log(upperCaseWords);

}

function fizzBuzzWithMap() {
    const fizzBuzzArr = [];
    for (let i = 0; i <= 100; i++) {
        fizzBuzzArr.push(i);
    }

    const fizzBuzzed = fizzBuzzArr.map( currentValue =>{

        if ( !(currentValue % 3) && !(currentValue % 5)) {  // can omit the == and take advantage of JavaScript truthy nature
            return 'FizzBuzz';
        } else if ( !(currentValue % 3) ) {
            return 'Fizz';
        } else if ( !(currentValue % 5) ) {
            return 'Buzz';
        } else {
            return currentValue;
        }
    });

    console.log(fizzBuzzed)
}

/*
    Chaining array methods
*/
function chainedMethods(filterFunc) {

    // For arr - filter out multiples of 3, 
    // multiple all remaining numbers by 10, then find the sum

    const output = arr.filter( filterFunc ).map( val => {
        return val * 10;
    }).reduce( (sum, val) => {
        return sum + val;
    });

    return output ;

}

console.log( chainedMethods( val => { return val % 3; } ) );
console.log( chainedMethods( val => { return val % 2; } ) );
console.log( chainedMethods( val => { return val % 3 || val % 5; } ) );