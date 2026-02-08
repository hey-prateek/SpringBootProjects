import java.util.concurrent.*;

public class code19_completableFuture_runAsync_supplyAsync {
    public static void main(String[] args) throws Exception {
        CompletableFuture cf = CompletableFuture.runAsync(() -> {
            System.out.println("inside CompletableFuture method...");
        });
        cf.get(); // waits for CompletableFuture to complete

        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("inside CompletableFuture supply method...");
            return 586;
        });
        System.out.println(cf1.get()); // CompletableFuture returns integer

    }
}
