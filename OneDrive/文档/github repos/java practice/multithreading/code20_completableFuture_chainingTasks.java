import java.util.concurrent.CompletableFuture;

public class code20_completableFuture_chainingTasks {
    public static void main(String[] args) {
        CompletableFuture cf = CompletableFuture.supplyAsync(() -> 586).thenApply((num) -> num * 10)
                .thenApply(result -> "result: " + result).thenAccept(System.out::println);

        // thenApply() transforms data,
        // thenAccept() consumes result,
        // thenRun() runs code without using the result.

    }
}
