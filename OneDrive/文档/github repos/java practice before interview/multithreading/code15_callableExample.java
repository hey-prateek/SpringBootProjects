import java.util.concurrent.*;

public class code15_callableExample {
    public static void main(String[] args) throws Exception {
        Callable<Integer> c = () -> {
            System.out.println("inside callable run method...");
            return 586;
        };

        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<Integer> f = ex.submit(c);
        System.out.println(f.get());

        // runnable converted to callable
        Runnable r = () -> {
            System.out.println("inside runnable run method...");
        };
        Callable<Object> c1 = Executors.callable(r);
        Future<Object> f1 = ex.submit(c1);
        System.out.println(f1.get());

        ex.shutdown();
    }
}
