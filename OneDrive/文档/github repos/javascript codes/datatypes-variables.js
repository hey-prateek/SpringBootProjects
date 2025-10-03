// console.log("hey prateek...");

// Variables
let name = "Tony Stark";
console.log("Name:", name);

let x = null;
let y = undefined;
console.log("x (null):", x);
console.log("y (undefined):", y);

let isFollowing = true;
console.log("isFollowing:", isFollowing);

// JavaScript is dynamically typed: no need to declare type

// var → global/function scope
// let → block scope {}
// const → block scope {} (must be initialized, cannot be reassigned)

// let example
let fullName = "Prateek Tiwari";
console.log("Full Name:", fullName);

// Re-assigning (allowed with let)
fullName = "Muskan Singh";
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

// Data Types in JS: Number, String, Boolean, Undefined, Null, BigInt, Symbol

let bigi = BigInt("12345");
console.log("BigInt:", bigi);

let sym = Symbol("hello!");
console.log("Symbol:", sym);

// Object Example
const Student = {
    name: "Prateek",
    id: 586
};

// Updating object field
Student.id = Student.id + 1;
console.log("Updated Student ID:", Student.id);

// Checking type
console.log("Type of Student.id:", typeof Student.id);
