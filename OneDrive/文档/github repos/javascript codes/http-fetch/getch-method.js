// fetch_method.js
// Demonstrates the fetch() method for making HTTP requests

// Example 1: Simple GET request
fetch("https://jsonplaceholder.typicode.com/posts/1")
  .then(response => {
    console.log("Response object:", response);
    return response.json(); // convert response to JSON
  })
  .then(data => {
    console.log("Fetched data:", data);
  })
  .catch(error => {
    console.error("Error fetching data:", error);
  });

// Example 2: Handling non-200 responses
fetch("https://jsonplaceholder.typicode.com/invalid-url")
  .then(response => {
    if (!response.ok) throw new Error(`HTTP Error: ${response.status}`);
    return response.json();
  })
  .then(data => console.log(data))
  .catch(err => console.error("Caught error:", err.message));
