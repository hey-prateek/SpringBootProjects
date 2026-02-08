// ================== VARIABLES & TYPES ==================

// console.log("hey prateek...");

// String variable
let name = "Tony Stark";
console.log("Name:", name);

// null vs undefined
let x = null;
let y = undefined;
console.log("x (null):", x);           // null → intentional empty value
console.log("y (undefined):", y);      // undefined → not assigned

// Boolean
let isFollowing = true;
console.log("isFollowing:", isFollowing);

// JavaScript is dynamically typed → type decided at runtime

// ================== VAR, LET, CONST ==================
// var → function/global scope, can be re-declared & updated
// let → block scope {}, can be updated, cannot be re-declared in same scope
// const → block scope {}, must be initialized, cannot be reassigned

// let example
let fullName = "Prateek Tiwari";
console.log("Full Name:", fullName);

fullName = "Muskan Singh"; // ✅ allowed
console.log("Updated Full Name:", fullName);

// const example
const height = 5.7;
console.log("Height:", height);
// height = 10; // ❌ Error: Assignment to constant variable

// Block scope example
{
    let age = 26;
    console.log("Age in block 1:", age);
}
{
    let age = 27;
    console.log("Age in block 2:", age);
}

// ================== DATA TYPES ==================
// Primitive: Number, String, Boolean, Undefined, Null, BigInt, Symbol

let bigi = BigInt("12345");
console.log("BigInt:", bigi);

let sym = Symbol("hello!");
console.log("Symbol:", sym);

// ================== OBJECTS ==================
const Student = {
    name: "Prateek",
    id: 586
};

// Access object values
console.log("Student Name:", Student.name);
console.log("Student ID:", Student["id"]);

// Update object value
Student.id = Student.id + 1;
console.log("Updated Student ID:", Student.id);

// Checking type
console.log("Type of Student.id:", typeof Student.id); // number
console.log("Type of Student:", typeof Student);       // object
