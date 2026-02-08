// promise_chain.js
// Demonstrates chaining multiple promises sequentially

function step1() {
  return new Promise(resolve => {
    setTimeout(() => {
      console.log("Step 1: Connected to server");
      resolve();
    }, 1000);
  });
}

function step2() {
  return new Promise(resolve => {
    setTimeout(() => {
      console.log("Step 2: Retrieved data");
      resolve();
    }, 1000);
  });
}

function step3() {
  return new Promise(resolve => {
    setTimeout(() => {
      console.log("Step 3: Processed data");
      resolve("Done");
    }, 1000);
  });
}

step1()
  .then(step2)
  .then(step3)
  .then(result => console.log(result))
  .catch(err => console.error("Error:", err));
