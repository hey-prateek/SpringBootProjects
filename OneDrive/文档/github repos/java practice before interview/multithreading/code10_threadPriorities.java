class task {
    void prints() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class code10_threadPriorities {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> (new task()).prints(), "min_priority");
        Thread t2 = new Thread(() -> (new task()).prints(), "norm_priority");
        Thread t3 = new Thread(() -> (new task()).prints(), "max_priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        // mostly max priority threads are executed

    }
}
