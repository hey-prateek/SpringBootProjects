// KEYBOARD EVENTS
let inputField = document.getElementById("keyInput");

inputField.addEventListener("keydown", (event) => {
  console.log("Key pressed:", event.key);
});

inputField.addEventListener("keyup", (event) => {
  console.log("Key released:", event.key);
});

inputField.addEventListener("keypress", (event) => {
  console.log("Key typing:", event.key);
});
