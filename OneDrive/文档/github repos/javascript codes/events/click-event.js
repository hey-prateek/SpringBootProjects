// CLICK EVENT
let btn = document.getElementById("clickBtn");

btn.onclick = function () {
  alert("Button clicked!");
  console.log("Button was clicked!");
};

// Alternate (using event listener)
btn.addEventListener("click", () => {
  console.log("Clicked via addEventListener");
});
