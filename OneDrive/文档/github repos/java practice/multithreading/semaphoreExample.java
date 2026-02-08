import java.util.concurrent.Semaphore;

public class semaphoreExample {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // max 2 permits

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " got permit");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            } finally {
                System.out.println(Thread.currentThread().getName() + " releasing permit");
                semaphore.release();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

    }
}
