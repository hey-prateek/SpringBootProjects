// ================== Basic Function ==================
function printMessage(msg) {
    console.log(msg);
}
printMessage("hey prateek...");

// ================== Function with Return ==================
function getToUpper(text) {
    // 'text' is a local variable (block scope)
    return text.toUpperCase();
}
let newString = getToUpper("prateek...");
console.log("Uppercase:", newString);

// ================== Arrow Function ==================
const sum = (a, b) => a + b; // shorter syntax
console.log("Sum:", sum(10, 20));

// ================== Default Parameters ==================
function greetUser(name = "Guest") {
    console.log(`Hello, ${name}!`);
}
greetUser();          // Hello, Guest!
greetUser("Prateek"); // Hello, Prateek!

// ================== Rest Parameters ==================
function totalSum(...numbers) {
    // 'numbers' is an array of all passed arguments
    return numbers.reduce((sum, num) => sum + num, 0);
}
console.log("Total Sum:", totalSum(10, 20, 30, 40));

// ================== Anonymous Function ==================
const multiply = function (a, b) {
    return a * b;
};
console.log("Multiply (Anonymous Function):", multiply(5, 4));

// ================== Immediately Invoked Function Expression (IIFE) ==================
(function () {
    console.log("IIFE executed immediately!");
})();

// ================== Nested Functions ==================
function outerFunction() {
    let outerVar = "Outer";
    function innerFunction() {
        console.log("Accessing from inner function:", outerVar);
    }
    innerFunction();
}
outerFunction();

// ================== Higher Order Function (HOF) ==================
// Functions that take other functions as arguments or return functions

function calculate(a, b, operation) {
    return operation(a, b);
}

function add(x, y) {
    return x + y;
}
function subtract(x, y) {
    return x - y;
}

console.log("HOF Add:", calculate(5, 3, add));
console.log("HOF Subtract:", calculate(5, 3, subtract));

// ================== Callback Example (Asynchronous Simulation) ==================
function fetchData(callback) {
    console.log("Fetching data...");
    setTimeout(() => {
        console.log("Data fetched!");
        callback();
    }, 1000);
}

fetchData(() => {
    console.log("Processing fetched data...");
});

// ================== Arrow Function: Count Vowels ==================
const getCountOfVowels = (value) => {
    let count = 0;
    const vowels = "aeiou";
    for (let char of value.toLowerCase()) {
        if (vowels.includes(char)) count++;
    }
    return count;
};
console.log("Vowels in 'muskan':", getCountOfVowels("muskan"));

// ================== Array forEach / map / filter / reduce ==================
let names = ["prateek", "muskan", "osman"];

names.forEach(printMessage); // callback demo

let updatedNames = names.map((val) => "hey " + val);
console.log("Mapped:", updatedNames);

let filterNames = names.filter((val) => val.length === 5);
console.log("Filtered (length==5):", filterNames);

let arr = [10, 20, 30];
let sumByReduce = arr.reduce((a, b) => a + b, 0);
console.log("Sum (reduce):", sumByReduce);

// ================== Function Returning Another Function ==================
function greet(timeOfDay) {
    return function (name) {
        return `Good ${timeOfDay}, ${name}!`;
    };
}

let morningGreet = greet("Morning");
console.log(morningGreet("Prateek"));

// ================== Arrow Function + Chaining ==================
let numbers = [1, 2, 3, 4, 5];
let result = numbers
    .filter((n) => n % 2 === 0) // keep even numbers
    .map((n) => n * 2)          // double them
    .reduce((a, b) => a + b);   // sum all
console.log("Chained Result:", result);

