import java.util.concurrent.*;

public class code16_futureMethods {
    public static void main(String[] args) throws Exception {
        // get(), get(timeout unit), isDone(), isCancelled(), cancel(true)

        ExecutorService es = Executors.newSingleThreadExecutor();

        Callable<String> c = () -> {
            System.out.println("inside callable run method...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            return "done";
        };

        Future f = es.submit(c);

        System.out.println("is done " + f.isDone());
        System.out.println("is cancelled " + f.isCancelled());
        try {
            System.out.println(f.get(1, TimeUnit.SECONDS));
        } catch (Exception e) {
            System.out.println("not done under 1 second, so cancelling");
        }

        f.cancel(true);
        System.out.println("is cancelled " + f.isCancelled());

        es.shutdown();

    }
}
