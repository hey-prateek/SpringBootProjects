import java.util.concurrent.*;

// A task that implements Callable and returns an Integer result
class MyTask implements Callable<Integer> {
    public Integer call() {
        int sum = 0;
        // Simple computation: sum of numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum; // returns 15
    }
}

public class callableExample {
    public static void main(String[] args) throws Exception {
        // Create a thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a Callable task; it returns a Future holding the result
        Future<Integer> future = executor.submit(new MyTask());

        // future.get() blocks until the result is available
        System.out.println("Result: " + future.get());

        // Shutdown executor service after task completion
        executor.shutdown();
    }
}
