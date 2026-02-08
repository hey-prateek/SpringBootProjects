import java.util.concurrent.ConcurrentHashMap;

public class code28_concurrentHashmap {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, Integer> chmap = new ConcurrentHashMap<>();

        Runnable r = () -> {
            for (int i = 1; i < 6; i++) {
                chmap.put(Thread.currentThread().getName(), i);
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        chmap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}