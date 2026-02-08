// FORM SUBMIT EVENT
let form = document.getElementById("userForm");

form.addEventListener("submit", function (event) {
  event.preventDefault(); // prevent page reload
  let userName = document.getElementById("username").value;
  console.log("Form submitted! Name:", userName);
  alert(`Welcome, ${userName}!`);
});
