// ================== Alert ==================
// Simple popup message (no return value)
alert("Welcome to JavaScript!");

// ================== Prompt ==================
// Asks user for input (returns string or null if cancelled)
let name = prompt("Enter your name:");
console.log("Prompt result (name):", name);

// ================== Confirm ==================
// Asks Yes/No (returns true for OK, false for Cancel)
let isConfirmed = confirm("Do you really want to continue?");
console.log("Confirm result:", isConfirmed);
