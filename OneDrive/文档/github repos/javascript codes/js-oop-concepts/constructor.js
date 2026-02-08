// constructors.js
// Constructors initialize object properties

class Employee {
  constructor(name, role, salary = 50000) {
    this.name = name;
    this.role = role;
    this.salary = salary;
  }
  info() {
    console.log(`${this.name} works as a ${this.role}, earning ₹${this.salary}`);
  }
}

const e1 = new Employee("Prateek", "Java Developer", 75000);
const e2 = new Employee("Ravi", "Tester");
e1.info();
e2.info();

// Example 2: Function constructor
function Book(title, author) {
  this.title = title;
  this.author = author;
}
const b1 = new Book("JS Mastery", "Kyle Simpson");
console.log(b1);
