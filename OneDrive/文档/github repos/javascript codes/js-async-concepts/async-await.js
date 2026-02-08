// async_await.js
// Demonstrates async/await (modern replacement for .then() chains)

function simulateTask(task, time) {
  return new Promise(resolve => {
    setTimeout(() => {
      console.log(`Task: ${task} completed`);
      resolve();
    }, time);
  });
}

async function runTasks() {
  try {
    await simulateTask("Connecting to DB", 1000);
    await simulateTask("Fetching user", 1000);
    await simulateTask("Processing data", 1000);
    console.log("All tasks done successfully!");
  } catch (err) {
    console.error("Error occurred:", err);
  }
}

runTasks();
