import java.util.concurrent.atomic.AtomicInteger;

public class code26_atomicInteger {
    // private static volatile int a = 0;
    private static AtomicInteger a = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                a.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                a.incrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        // Thread.sleep(1000);
        System.out.println(a);

    }
}
