// ================== Strings and String Functions ==================

// String declaration
let name = "prateek";
console.log("String:", name);

// Length
console.log("Length:", name.length);

// Access character by index
console.log("Character at index 2:", name[2]);

// ================== Template Literals ==================
let templateLiteral = `Hey Prateek`;
console.log("Template Literal:", templateLiteral);

let Student = { name: "Prateek", id: 586, marks: 73 };
let studentLiteral = `Name=${Student.name}, ID=${Student.id}, Marks=${Student.marks}`;
console.log("Template Literal with Object:", studentLiteral);

// ================== Escape Characters ==================
// \n → new line, \t → tab
console.log("Escape Characters:\nHey\tPrateek Tiwari");

// ================== Common String Methods ==================
console.log("To UpperCase:", "hey".toUpperCase());      // Convert to upper
console.log("To LowerCase:", "PRATEEK".toLowerCase());  // Convert to lower

let stringToBeTrimmed = "   Hey Prateek Tiwari   ";
console.log("Trimmed:", stringToBeTrimmed.trim());      // Remove spaces

console.log("Slice(1,5):", "abcdefg".slice(1, 5));      // Extract substring (index 1-4)
console.log("Concat:", "hey".concat("prateek_"));       // Join strings
console.log("Replace:", "heyprateek_".replace("prateek", "muskan")); // Replace text
console.log("CharAt(1):", "heyprateek".charAt(1));      // Character at index
console.log("IndexOf('t'):", "prateek".indexOf("t"));   // First occurrence index
console.log("LastIndexOf('e'):", "prateekee".lastIndexOf("e")); // Last occurrence index

// ================== String Search & Check ==================
console.log("Includes 'pra':", name.includes("pra"));   // true if substring exists
console.log("StartsWith 'pra':", name.startsWith("pra"));
console.log("EndsWith 'tek':", name.endsWith("tek"));

// ================== Split & Join ==================
let sentence = "JavaScript is awesome";
let words = sentence.split(" ");  // split into array
console.log("Split by space:", words);
console.log("Join with - :", words.join("-")); // join array into string

// ================== Repeat & Substring ==================
console.log("Repeat:", "JS ".repeat(3));                // Repeat string
console.log("Substring(0,3):", "JavaScript".substring(0, 3)); // Similar to slice

// ================== Type Coercion with Strings ==================
console.log("'prateek' + 586:", "prateek" + 586);       // String + number → string
console.log("586 + 'prateek':", 586 + "prateek");       // Works same
console.log("'10' + 20:", "10" + 20);                   // → "1020"
console.log("'10' - 2:", "10" - 2);                     // → 8 (string → number auto)
console.log("'10' * 2:", "10" * 2);                     // → 20
