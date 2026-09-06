import java.util.concurrent.*;

public class code22_completableFuture_allOf_anyOf {
    public static void main(String[] args) throws Exception {
        CompletableFuture cf1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture cf2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture cf3 = CompletableFuture.supplyAsync(() -> 30);

        CompletableFuture cf4 = CompletableFuture.allOf(cf1, cf2, cf3);

        cf4.join(); // waits for all tasks to finish

        System.out.println(cf1.get() + " " + cf2.get() + " " + cf3.get());

        // allOf() waits for all futures to complete.
        // anyOf() returns as soon as one future completes.

    }
}
