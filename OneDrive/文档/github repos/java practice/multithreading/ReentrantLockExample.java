import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final Lock lock = new ReentrantLock(true); // fair lock (first-come-first-serve)

    public void useResource(String threadName) {
        System.out.println(threadName + " is trying to acquire the lock...");

        if (lock.tryLock()) { // try to acquire lock without blocking forever
            try {
                System.out.println(threadName + " acquired the lock.");
                Thread.sleep(1000); // simulate work
                System.out.println(threadName + " finished work.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(threadName + " released the lock.");
            }
        } else {
            System.out.println(threadName + " could not acquire the lock (will try later).");
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 2; i++) {
                resource.useResource(threadName);
                try {
                    Thread.sleep(500); // wait before retrying
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
