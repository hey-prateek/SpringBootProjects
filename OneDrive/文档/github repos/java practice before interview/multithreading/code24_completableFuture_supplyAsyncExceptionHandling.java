import java.util.concurrent.*;

public class code24_completableFuture_supplyAsyncExceptionHandling {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating...");
            return 10 / 0; // will throw exception
        }).thenApply(result -> result * 2)
                .handle((result, ex) -> {
                    if (ex != null) {
                        System.out.println("Handled Exception: " + ex.getMessage());
                        return 0;
                    }
                    return result;
                })
                .thenAccept(r -> System.out.println("Final Result: " + r));
    }

}
