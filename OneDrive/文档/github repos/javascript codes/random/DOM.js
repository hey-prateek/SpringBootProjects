// ================== DOM Object ==================
console.log(window.document.head); // Head section of the HTML
console.log(window.document.body); // Body section of the HTML

// ================== DOM Manipulation ==================
// Access and modify HTML elements dynamically

// ---------- Selecting by ID ----------
let heading = document.getElementById("main-heading");
console.log("By ID:", heading);
heading.style.color = "crimson";
heading.innerText = "DOM Manipulation in Action!";

// ---------- Selecting by Class ----------
let paragraph = document.getElementsByClassName("info")[0];
console.log("By Class:", paragraph);
paragraph.style.backgroundColor = "#d4f5d4";

// ---------- Selecting by Tag ----------
let buttons = document.getElementsByTagName("button");
console.log("By Tag:", buttons);
buttons[0].innerText = "Clicked via JS";

// ---------- Query Selector ----------
let box = document.querySelector(".box"); // selects first matching element
console.log("By Query Selector:", box);
box.style.borderColor = "purple";

// ---------- Query Selector All ----------
let allParagraphs = document.querySelectorAll("p");
console.log("By Query Selector All:", allParagraphs);
allParagraphs.forEach(p => p.style.fontWeight = "bold");

// ================== Element Properties ==================

// innerText → only text visible to user (ignores hidden tags)
console.log("innerText:", paragraph.innerText);

// innerHTML → includes HTML tags inside element
console.log("innerHTML:", paragraph.innerHTML);

// textContent → raw text including hidden elements
console.log("textContent:", paragraph.textContent);

// tagName → name of the HTML tag (like H1, P, DIV)
console.log("Tag Name of heading:", heading.tagName);

// Modify content dynamically
paragraph.innerHTML = "Updated <b>Paragraph</b> content using <i>innerHTML</i>";

// Add click event to button
buttons[0].addEventListener("click", () => {
  box.innerText = "Button clicked! DOM updated dynamically.";
  box.style.backgroundColor = "#cfe2ff";
});
