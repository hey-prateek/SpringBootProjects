// ================== Number Guessing Game ==================

let correctValue = 586;
let attempts = 0;

do {
  let trying = Number(prompt("Guess a number..."));
  attempts++;

  if (trying === correctValue) {
    console.log("🎉 You guessed it right in", attempts, "attempt(s)!");
    break;
  } else if (trying > correctValue) {
    console.log("Too high! Try again...");
  } else {
    console.log("Too low! Try again...");
  }
} while (true);
