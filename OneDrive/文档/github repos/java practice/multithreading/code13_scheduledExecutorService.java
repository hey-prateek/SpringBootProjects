import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class code13_scheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
        Runnable r = () -> System.out.println("inside run method...");
        ses.scheduleAtFixedRate(r, 1, 2, TimeUnit.SECONDS);
        ses.shutdown();
    }
}
