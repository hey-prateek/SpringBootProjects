import java.util.concurrent.*;

public class code21_completableFuture_thenCombine {
    public static void main(String[] args) throws Exception
    {
        CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->20);
        CompletableFuture<Integer> cf3=cf1.thenCombine(cf2, (a, b)->(a+b)); //combines 2 completableFuture tasks
        System.out.println(cf3.get());
    }
}
