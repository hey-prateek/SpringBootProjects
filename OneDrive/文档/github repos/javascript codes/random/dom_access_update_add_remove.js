// === DOM Access / Update / Add / Remove Example ===

// ACCESS elements
let container = document.querySelector("#container");
console.log("Container:", container);

// UPDATE content
container.innerText = "Updated text inside container!";

// ADD new element
let newPara = document.createElement("p");
newPara.innerText = "This is a new paragraph added using JS.";
newPara.style.color = "green";
container.appendChild(newPara);

// REMOVE an element
let oldPara = document.querySelector(".remove-me"); // <p class="remove-me">...</p>
if (oldPara) {
    oldPara.remove();
    console.log("Old paragraph removed!");
}
