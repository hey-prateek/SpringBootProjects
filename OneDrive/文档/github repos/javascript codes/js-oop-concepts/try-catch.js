// try_catch.js
// Demonstrates try-catch-finally for error handling

function divide(a, b) {
  try {
    if (b === 0) throw new Error("Division by zero not allowed");
    console.log(`Result: ${a / b}`);
  } catch (err) {
    console.error("Error:", err.message);
  } finally {
    console.log("Operation completed.\n");
  }
}

divide(10, 2);
divide(5, 0);

// Example 2: Nested try-catch
try {
  try {
    throw new Error("Inner error");
  } catch (err) {
    console.warn("Caught inner error:", err.message);
    throw new Error("Outer error");
  }
} catch (err) {
  console.error("Caught outer error:", err.message);
}

// Example 3: try...catch with async/await
async function fetchData() {
  try {
    throw new Error("Failed to fetch data");
  } catch (err) {
    console.log("Caught async error:", err.message);
  }
}
fetchData();
