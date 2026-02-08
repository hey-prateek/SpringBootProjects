// ================== Arrays and Their Methods ==================

// Array Declaration
let heroes = ["Iron Man", "Thor", "Hulk"];
console.log("Heroes Array:", heroes);
console.log("Type:", typeof heroes); // object
console.log("Length:", heroes.length);

// Access Elements
console.log("First Hero:", heroes[0]);

// ================== Traversing Array ==================
for (let hero of heroes) {
    console.log("Hero:", hero);
}

// ================== Adding and Removing Elements ==================

// push() → add element at end
heroes.push("Captain America");
console.log("After push:", heroes);

// pop() → remove last element
heroes.pop();
console.log("After pop:", heroes);

// unshift() → add element at start
heroes.unshift("Spider-Man");
console.log("After unshift:", heroes);

// shift() → remove element from start
heroes.shift();
console.log("After shift:", heroes);

// ================== Conversion and Merging ==================

// toString() → converts array to comma-separated string
console.log("To String:", heroes.toString());

// concat() → merge two arrays
let moreHeroes = ["Black Panther", "Doctor Strange", "Ant-Man"];
let allHeroes = heroes.concat(moreHeroes);
console.log("After concat:", allHeroes);

// ================== Slicing and Splicing ==================

// slice(start, end) → returns a portion (non-destructive)
console.log("Slice(0,2):", heroes.slice(0, 2));

// splice(start, deleteCount, ...items) → add/remove elements (modifies array)
heroes.splice(1, 0, "Hawkeye"); // insert at index 1
console.log("After splice (insert):", heroes);
heroes.splice(2, 1); // remove 1 element at index 2
console.log("After splice (remove):", heroes);

// ================== Searching and Sorting ==================
console.log("IndexOf 'Hulk':", heroes.indexOf("Hulk")); // index or -1
console.log("Includes 'Thor':", heroes.includes("Thor")); // true/false

allHeroes.sort(); // sorts alphabetically
console.log("Sorted allHeroes:", allHeroes);

allHeroes.reverse();
console.log("Reversed allHeroes:", allHeroes);

// ================== Higher-Order Array Methods ==================

// map() → create a new array (convert names to uppercase)
let upperHeroes = heroes.map(h => h.toUpperCase());
console.log("Uppercase (map):", upperHeroes);

// filter() → filter heroes with name length > 5
let longNamedHeroes = heroes.filter(h => h.length > 5);
console.log("Filtered (length > 5):", longNamedHeroes);

// reduce() → combine hero names into a single string
let combined = heroes.reduce((acc, h) => acc + ", " + h);
console.log("Combined (reduce):", combined);
