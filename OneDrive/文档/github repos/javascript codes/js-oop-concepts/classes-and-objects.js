// classes_and_objects.js
// Demonstrates defining classes, creating objects, and using methods

// Example 1: Simple class
class Car {
  constructor(brand, model) {
    this.brand = brand;
    this.model = model;
  }
  start() {
    console.log(`${this.brand} ${this.model} started!`);
  }
}
const car1 = new Car("Tesla", "Model 3");
car1.start();

// Example 2: Class with default values
class Laptop {
  constructor(brand = "HP", ram = "8GB") {
    this.brand = brand;
    this.ram = ram;
  }
}
const laptop1 = new Laptop();
const laptop2 = new Laptop("Dell", "16GB");
console.log(laptop1, laptop2);

// Example 3: Object property access and modification
class Student {
  constructor(name, grade) {
    this.name = name;
    this.grade = grade;
  }
}
const s1 = new Student("Alice", "A");
console.log(s1.name);
s1.grade = "A+";
console.log(s1);
