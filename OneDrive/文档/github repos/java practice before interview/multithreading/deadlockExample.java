import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class DeadlockExample {
    // Two shared resources (locks)
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    // First method tries to lock lock1 first, then lock2
    public void method1() {
        synchronized (lock1) { // Thread-1 acquires lock1
            System.out.println(Thread.currentThread().getName() + " locked lock1");

            // Sleep added to simulate delay and increase the chance of deadlock
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            // Now Thread-1 tries to acquire lock2 (which might be already held by Thread-2)
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " locked lock2");
            }
        }
    }

    // Second method tries to lock lock2 first, then lock1
    public void method2() {
        synchronized (lock2) { // Thread-2 acquires lock2
            System.out.println(Thread.currentThread().getName() + " locked lock2");

            // Sleep to allow Thread-1 to acquire lock1 first (causing potential deadlock)
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            // Now Thread-2 tries to acquire lock1 (which is already held by Thread-1)
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " locked lock1");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockExample obj = new DeadlockExample();

        // Create two threads with opposite locking order
        Thread t1 = new Thread(obj::method1, "Thread-1"); // locks lock1 → lock2
        Thread t2 = new Thread(obj::method2, "Thread-2"); // locks lock2 → lock1

        // Start both threads
        t1.start();
        t2.start();

        // Give both threads time to run and potentially get deadlocked
        try { Thread.sleep(500); } catch (InterruptedException e) {}

        // ******** DEADLOCK DETECTION LOGIC ********
        // The ThreadMXBean class provides methods to monitor and manage threads in the JVM
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        // findDeadlockedThreads() returns an array of thread IDs that are in deadlock
        long[] threadIds = bean.findDeadlockedThreads();

        if (threadIds != null) {
            // getThreadInfo() provides detailed information about each deadlocked thread
            ThreadInfo[] infos = bean.getThreadInfo(threadIds);

            // Loop through all threads involved in deadlock
            for (ThreadInfo info : infos) {
                // Print the name of each deadlocked thread
                System.out.println("Deadlock detected: " + info.getThreadName());
            }
        } else {
            // If no threads are found in deadlock
            System.out.println("No deadlock detected.");
        }
    }
}
