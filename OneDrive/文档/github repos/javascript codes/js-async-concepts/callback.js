// callback.js
// Demonstrates callback functions

function fetchData(callback) {
  console.log("Fetching data...");
  setTimeout(() => {
    const data = { id: 1, name: "Prateek" };
    console.log("Data fetched!");
    callback(data); // calling callback after fetching
  }, 1000);
}

function displayData(data) {
  console.log("Displaying data:", data);
}

// Pass function as a callback
fetchData(displayData);
