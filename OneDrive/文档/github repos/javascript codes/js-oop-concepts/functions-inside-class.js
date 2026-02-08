// functions_inside_class.js
// Methods can perform logic, return values, or access class properties

class Calculator {
  add(a, b) { return a + b; }
  subtract(a, b) { return a - b; }
  multiply(a, b) { return a * b; }
  divide(a, b) { return b !== 0 ? a / b : "Cannot divide by zero"; }
}

const calc = new Calculator();
console.log(calc.add(5, 3));
console.log(calc.divide(10, 0));

// Example 2: Using class methods to modify properties
class BankAccount {
  constructor(balance = 0) {
    this.balance = balance;
  }
  deposit(amount) { this.balance += amount; }
  withdraw(amount) { this.balance -= amount; }
  showBalance() { console.log(`Balance: ₹${this.balance}`); }
}

const acc = new BankAccount(1000);
acc.deposit(500);
acc.withdraw(200);
acc.showBalance();
