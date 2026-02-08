// EVENT LISTENER DEMO
let heading = document.getElementById("heading");

function onMouseOver() {
  heading.style.color = "crimson";
  heading.innerText = "Mouse is over the heading!";
}

function onMouseOut() {
  heading.style.color = "black";
  heading.innerText = "Event Handling Demo";
}

// Add event listeners
heading.addEventListener("mouseover", onMouseOver);
heading.addEventListener("mouseout", onMouseOut);

// Remove listener example (after 5 seconds)
setTimeout(() => {
  heading.removeEventListener("mouseout", onMouseOut);
  console.log("Removed mouseout listener after 5 seconds");
}, 5000);
