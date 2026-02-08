// iife.js
// Demonstrates IIFE (Immediately Invoked Function Expression)

// Basic IIFE
(function() {
  console.log("This runs immediately!");
})();

// IIFE with parameters
(function(name) {
  console.log(`Hello, ${name}!`);
})("Prateek");

// Async IIFE example
(async function() {
  const fetchData = () =>
    new Promise(resolve => setTimeout(() => resolve("Data loaded"), 1000));

  const data = await fetchData();
  console.log(data);
})();
