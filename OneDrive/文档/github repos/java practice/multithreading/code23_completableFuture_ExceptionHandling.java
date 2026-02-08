import java.util.concurrent.CompletableFuture;

public class code23_completableFuture_ExceptionHandling {
    public static void main(String[] args) {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println("inside supply async method...");
            if (true) {
                throw new RuntimeException("exception caught...");
            }
            return 586;
        }).exceptionally((ex) -> { // exception creates while running asynchronously
            System.out.println(ex.getMessage());
            return 0; // fallback value
        });

        System.out.println(cf.join());
    }
}
