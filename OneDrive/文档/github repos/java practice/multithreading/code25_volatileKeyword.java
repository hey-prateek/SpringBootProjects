import java.time.Duration;
import java.time.LocalTime;

public class code25_volatileKeyword {
    volatile static boolean flag = true; // volatile makes it visible then and there at exact point when its changed

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            flag = false;
        });

        Thread t2 = new Thread(() -> {
            LocalTime lt1 = LocalTime.now();
            while (flag) {
                System.out.println("thread 2 running...");
            }
            LocalTime lt2 = LocalTime.now();
            System.out.println("thread 2 ran for seconds: " + Duration.between(lt1, lt2).getSeconds());
        });

        t1.start();
        t2.start();
    }
}
