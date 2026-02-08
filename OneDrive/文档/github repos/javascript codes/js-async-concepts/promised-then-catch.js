// promises_then_catch.js
// Demonstrates Promises with then() and catch()

function fetchUserData(success) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (success) resolve({ name: "Prateek", age: 27 });
      else reject("Failed to fetch user data");
    }, 1000);
  });
}

fetchUserData(true)
  .then(user => {
    console.log("User fetched:", user);
  })
  .catch(err => {
    console.error("Error:", err);
  });
