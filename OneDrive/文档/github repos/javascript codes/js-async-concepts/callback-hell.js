// callback_hell.js
// Demonstrates "callback hell" — nested callbacks

console.log("Starting process...");

setTimeout(() => {
  console.log("Step 1: Connected to DB");

  setTimeout(() => {
    console.log("Step 2: Fetched user");

    setTimeout(() => {
      console.log("Step 3: Validated user");

      setTimeout(() => {
        console.log("Step 4: Sent response");
      }, 1000);

    }, 1000);

  }, 1000);

}, 1000);

// Too many nested callbacks = callback hell!
