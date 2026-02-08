// http_requests.js
// Demonstrates different types of HTTP requests using fetch()

// ---- GET Request ----
fetch("https://jsonplaceholder.typicode.com/posts")
  .then(res => res.json())
  .then(data => console.log("GET: Fetched posts", data.slice(0, 2)))
  .catch(err => console.error("GET Error:", err));

// ---- POST Request ----
fetch("https://jsonplaceholder.typicode.com/posts", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({ title: "New Post", body: "Post content", userId: 1 }),
})
  .then(res => res.json())
  .then(data => console.log("POST: Created new post", data))
  .catch(err => console.error("POST Error:", err));

// ---- PUT Request ----
fetch("https://jsonplaceholder.typicode.com/posts/1", {
  method: "PUT",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({ title: "Updated Title", body: "Updated body" }),
})
  .then(res => res.json())
  .then(data => console.log("PUT: Updated post", data))
  .catch(err => console.error("PUT Error:", err));

// ---- DELETE Request ----
fetch("https://jsonplaceholder.typicode.com/posts/1", { method: "DELETE" })
  .then(res => {
    if (res.ok) console.log("DELETE: Post deleted successfully");
    else throw new Error("Failed to delete post");
  })
  .catch(err => console.error("DELETE Error:", err));
