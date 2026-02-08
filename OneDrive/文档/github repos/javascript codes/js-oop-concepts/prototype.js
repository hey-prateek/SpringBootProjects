// prototype.js
// Demonstrates prototype inheritance and adding methods dynamically

function Person(name, age) {
  this.name = name;
  this.age = age;
}

Person.prototype.greet = function() {
  console.log(`Hi, I'm ${this.name} and I'm ${this.age} years old.`);
};

const p1 = new Person("Prateek", 26);
p1.greet();

// Example 2: Extending prototype after object creation
Person.prototype.sayBye = function() {
  console.log(`${this.name} says goodbye!`);
};
p1.sayBye();

// Example 3: Built-in prototypes (like Array)
Array.prototype.sum = function() {
  return this.reduce((a, b) => a + b, 0);
};
console.log([1, 2, 3, 4].sum());
