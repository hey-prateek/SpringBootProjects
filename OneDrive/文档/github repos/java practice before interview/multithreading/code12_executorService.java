import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class code12_executorService {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int flag = i;
            es.submit(() -> System.out.println(flag + " " + Thread.currentThread().getName()));
        }
        es.shutdown();
    }
}
