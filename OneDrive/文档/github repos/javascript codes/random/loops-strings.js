// ================== For Loop ==================
// Print 1 to 100
for (let i = 1; i <= 100; i++) {
    console.log("For Loop:", "heyprateek_", i);
}

// ================== While Loop ==================
// Runs until count reaches 0
let count = prompt("Enter while loop count...");
while (count-- > 0) {
    console.log("While Loop:", "hey");
}

// ================== Do...While Loop ==================
// Runs at least once
let num = 3;
do {
    console.log("Do...While Loop:", num);
    num--;
} while (num > 0);

// ================== For...of Loop ==================
// Best for arrays (iterates over values)
let arr = ["Prateek", "Muskan", "Tony"];
for (let val of arr) {
    console.log("For...of (Array value):", val);
}

// ================== For...in Loop ==================
// Best for objects (iterates over keys)
let student = { name: "Prateek", age: 26, id: 586 };
for (let key in student) {
    console.log("For...in (Object):", `${key} = ${student[key]}`);
}

// ================== Array of Objects ==================
let student1 = { name: "Prateek", id: 586 };
let student2 = { name: "Muskan", id: 590 };
let arrStudent = [student1, student2];

for (let obj of arrStudent) {
    for (let key in obj) {
        console.log("Array of Objects:", `${key} - ${obj[key]}`);
    }
}

// ================== Break & Continue ==================
// Break: exits loop immediately
for (let i = 1; i <= 5; i++) {
    if (i === 3) break; 
    console.log("Break Example:", i);
}

// Continue: skips current iteration
for (let i = 1; i <= 5; i++) {
    if (i === 3) continue; 
    console.log("Continue Example:", i);
}
