// inheritance.js
// Demonstrates class inheritance

class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(`${this.name} makes a sound`);
  }
}

class Dog extends Animal {
  speak() {
    console.log(`${this.name} barks`);
  }
}

class Cat extends Animal {
  speak() {
    console.log(`${this.name} meows`);
  }
}

const d1 = new Dog("Tommy");
const c1 = new Cat("Kitty");
d1.speak();
c1.speak();

// Example 2: Multi-level inheritance
class Puppy extends Dog {
  play() {
    console.log(`${this.name} loves playing!`);
  }
}
const p1 = new Puppy("Bruno");
p1.speak();
p1.play();
