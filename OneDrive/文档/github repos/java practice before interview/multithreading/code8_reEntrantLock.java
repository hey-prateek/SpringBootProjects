import java.util.concurrent.locks.ReentrantLock;

class task {
    private final ReentrantLock r = new ReentrantLock();

    void prints() {
        try {
            r.lock(); // locks execution from here
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + (i));
            }
        } finally {
            r.unlock(); // unlocks here
        }
    }
}

public class code8_reEntrantLock {
    public static void main(String[] args) {
        task t = new task();
        Thread t1 = new Thread(() -> t.prints(), "thread-1");
        t1.start();
        Thread t2 = new Thread(() -> t.prints(), "thread-2");
        t2.start();
    }
}
