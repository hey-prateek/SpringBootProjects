// super_keyword.js
// Used to call parent constructors or methods

class Vehicle {
  constructor(type) {
    this.type = type;
  }
  start() {
    console.log(`${this.type} is starting...`);
  }
}

class Car extends Vehicle {
  constructor(type, brand) {
    super(type); // call parent constructor
    this.brand = brand;
  }
  start() {
    super.start(); // call parent method
    console.log(`${this.brand} is now running!`);
  }
}

const c1 = new Car("Four-wheeler", "BMW");
c1.start();

// Example 2: Method overriding with super
class ElectricCar extends Car {
  start() {
    super.start();
    console.log(`${this.brand} is running silently on electricity.`);
  }
}

const ec1 = new ElectricCar("EV", "Tesla");
ec1.start();
