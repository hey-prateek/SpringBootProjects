// json_method.js
// Demonstrates the json() method for parsing API responses

fetch("https://jsonplaceholder.typicode.com/users/1")
  .then(response => {
    // response.json() returns a Promise
    return response.json();
  })
  .then(userData => {
    console.log("User Data:", userData);
    console.log("User Name:", userData.name);
  })
  .catch(error => console.error("Error parsing JSON:", error));

// Example 2: Using JSON.stringify() and JSON.parse()
const obj = { name: "Prateek", role: "Developer" };
const jsonStr = JSON.stringify(obj); // convert object to JSON string
console.log("JSON String:", jsonStr);

const backToObj = JSON.parse(jsonStr); // convert string back to object
console.log("Parsed Object:", backToObj);
