// PRINT EVENT
let printBtn = document.getElementById("printBtn");

printBtn.addEventListener("click", () => {
  console.log("Preparing to print...");
  window.print();
});

window.addEventListener("beforeprint", () => {
  console.log("Before printing (Triggered before print dialog).");
});

window.addEventListener("afterprint", () => {
  console.log("After printing (Triggered after print completes).");
});
