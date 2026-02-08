// === setAttribute Example ===
// Suppose HTML: <a id="link" href="https://google.com">Google</a>

let link = document.getElementById("link");

// Update existing attribute
link.setAttribute("href", "https://openai.com");

// Add new attribute
link.setAttribute("target", "_blank");

// Verify
console.log("Updated href:", link.getAttribute("href"));
console.log("Added target:", link.getAttribute("target"));
