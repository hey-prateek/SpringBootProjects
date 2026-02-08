import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class future {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Create a thread pool with a single background thread
        ExecutorService ex = Executors.newSingleThreadExecutor();

        // Submit a task to run asynchronously (in the background)
        // The task sleeps for 2 seconds, prints a message, and returns 69
        Future<Integer> ft = ex.submit(() -> {
            Thread.sleep(2000); // simulate long-running task
            System.out.println("Inside future submit method...");
            return 69; // return value once done
        });

        // This prints immediately — task is running in a different thread
        System.out.println("Task submitted...");

        // ft.get() waits until the background task completes and returns the result
        System.out.println("Value from future: " + ft.get());

        // Shutdown the executor service to free resources
        ex.shutdown();
    }
}
