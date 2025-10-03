let a = 10;
let b = 2;

// ================== Arithmetic Operators ==================
console.log("Addition:", a + b);
console.log("Subtraction:", a - b);
console.log("Multiplication:", a * b);
console.log("Division:", a / b);
console.log("Modulus:", a % b);
console.log("Exponentiation:", a ** b);

// ================== Unary Operators ==================
console.log("Pre-Increment:", ++a); 
console.log("Pre-Decrement:", --a);

// ================== Assignment Operators ==================
let c = 10;
c += a;   // (other forms: -=, *=, /=, %=, **=)
console.log("c after += a:", c);

// ================== Comparison Operators ==================
console.log("a == b:", a == b);   // equality (value only)
console.log("a != b:", a != b);   // not equal
console.log("a === b:", a === b); // strict equality (value + type)
console.log("a === 'prateek':", a === "prateek"); // false, different type

// Loose vs Strict Equality
let num1 = 5;
let string1 = "5";
console.log("num1 == string1:", num1 == string1);   // true
console.log("num1 === string1:", num1 === string1); // false

// ================== Logical Operators ==================
let x = true;
let y = false;
console.log("x && y:", x && y);   // AND → false
console.log("x || y:", x || y);   // OR → true
console.log("!x:", !x);           // NOT → false
console.log("!y:", !y);           // NOT → true

// ================== Conditional Statements ==================
let cond = 20;
if (cond < 20) {
    console.log("Condition:", "less than 20");
} else if (cond == 20) {
    console.log("Condition:", "equals 20");
} else {
    console.log("Condition:", "more than 20");
}

// Ternary Operator
let res = (cond == 20) ? "if true" : "if false";
console.log("Ternary Result:", res);

// ================== Switch Case ==================
let day = 2;
switch (day) {
    case 1:
        console.log("Day:", "Monday");
        break;
    case 2:
        console.log("Day:", "Tuesday");
        break;
    default:
        console.log("Day:", "Other day");
}
