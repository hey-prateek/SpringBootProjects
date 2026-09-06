import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CompletableFutureExample {
    // Helper method to simulate a delay (e.g., for async operations like API calls)
    private static void simulateDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    // Simulate an async task that returns a value (using supplyAsync for a supplier that produces a result)
    private static CompletableFuture<String> fetchUserNameAsync() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(500); // Simulate work/delay
            if (Math.random() > 0.7) { // 30% chance to complete exceptionally (error handling demo)
                throw new RuntimeException("Failed to fetch user name");
            }
            return "Alice"; // Normal completion with value
        });
    }

    // Simulate an async void task (using runAsync for a runnable that doesn't return a value)
    private static CompletableFuture<Void> logAsyncStart() {
        return CompletableFuture.runAsync(() -> {
            simulateDelay(200);
            System.out.println("Async operation started"); // Side-effect example
        });
    }

    // Simulate another async task for posts (to demo combining)
    private static CompletableFuture<List<String>> fetchUserPostsAsync(String userName) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(700);
            return Arrays.asList("Post 1", "Post 2"); // Depends on userName in real scenarios
        });
    }

    public static void main(String[] args) {
        // Feature 1: Start with runAsync for void tasks (e.g., logging)
        CompletableFuture<Void> logFuture = logAsyncStart();

        // Feature 2: Start with supplyAsync for value-producing tasks
        CompletableFuture<String> userFuture = fetchUserNameAsync();

        // Feature 3: thenApply - Transform the result (e.g., uppercase the name)
        CompletableFuture<String> upperNameFuture = userFuture
            .thenApply(name -> name.toUpperCase());

        // Feature 4: thenCompose - Chain another async operation (flattens nested futures)
        // Here, use the transformed name to fetch posts (in reality, pass data to next supplyAsync)
        CompletableFuture<List<String>> postsFuture = upperNameFuture
            .thenCompose(name -> fetchUserPostsAsync(name.toLowerCase())); // Convert back for demo

        // Feature 5: thenCombine - Combine two independent futures into one
        // Combine user name and posts to create a summary
        CompletableFuture<String> summaryFuture = upperNameFuture
            .thenCombine(postsFuture, (name, posts) -> 
                String.format("%s has %d posts: %s", name, posts.size(), String.join(", ", posts)));

        // Feature 6: allOf - Wait for all futures to complete (returns a future of void)
        // Demo: Wait for log, user, and posts to finish before proceeding
        CompletableFuture<Void> allComplete = CompletableFuture.allOf(
            logFuture, userFuture, postsFuture);

        // Feature 7: exceptionally - Handle errors with a fallback value
        CompletableFuture<String> resilientSummary = summaryFuture
            .exceptionally(ex -> {
                System.err.println("Error in summary: " + ex.getMessage());
                return "Default summary due to error"; // Fallback result
            });

        // Feature 8: handle - General handler for both success and failure (returns a value)
        // Unlike exceptionally, this always produces a result (success or fallback)
        CompletableFuture<String> handledSummary = resilientSummary
            .handle((result, ex) -> {
                if (ex != null) {
                    return "Handled error: " + ex.getMessage();
                }
                return "Success: " + result;
            });

        // Feature 9: orTimeout - Add a timeout to prevent indefinite waiting
        CompletableFuture<String> timedSummary = handledSummary
            .orTimeout(2, TimeUnit.SECONDS) // Timeout after 2 seconds
            .exceptionally(ex -> {
                if (ex instanceof TimeoutException) {
                    return "Timed out after 2 seconds";
                }
                return "Other error: " + ex.getMessage();
            });

        // Feature 10: thenAccept - Consume the final result asynchronously (void consumer)
        timedSummary.thenAccept(result -> {
            System.out.println("Final result: " + result);
        });

        // Optional: join() - Block and get the result (use sparingly, e.g., in main; blocks current thread)
        // String blockedResult = timedSummary.join(); // Uncomment to demo blocking
        // System.out.println("Blocked result: " + blockedResult);

        // Demo complete exceptionally (manually trigger an error on a future)
        CompletableFuture<String> manualErrorFuture = new CompletableFuture<>();
        manualErrorFuture.completeExceptionally(new RuntimeException("Manual error demo"));
        manualErrorFuture.exceptionally(ex -> "Recovered from manual error").thenAccept(System.out::println);

        // Keep main thread alive to observe async completions
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread completed.");
    }
}