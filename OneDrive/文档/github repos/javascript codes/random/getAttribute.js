// === getAttribute Example ===
// Suppose HTML: <img id="hero" src="ironman.jpg" alt="Iron Man">

let img = document.getElementById("hero");

// Access the value of attributes
console.log("Image Source:", img.getAttribute("src"));
console.log("Alt Text:", img.getAttribute("alt"));
