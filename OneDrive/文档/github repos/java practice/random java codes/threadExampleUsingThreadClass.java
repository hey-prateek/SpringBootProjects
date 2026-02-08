public class threadExampleUsingThreadClass {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("T1"); // Create thread with name
        MyThread t2 = new MyThread("T2"); // Create second thread
        t1.setPriority(1); // Set min priority
        t2.setPriority(10); // Set max priority
        System.out.println(t1.getName() + " priority: " + t1.getPriority() + ", state: " + t1.getState()); // Get name, priority, state
        t1.start(); // Start thread 1
        t2.start(); // Start thread 2
        System.out.println("Main thread: " + Thread.currentThread().getName()); // Get current thread name
        Thread.yield(); // Suggest yielding CPU
        System.out.println(t1.getName() + " alive: " + t1.isAlive()); // Check if thread 1 is alive
        t1.join(); // Wait for thread 1 to finish
        t2.interrupt(); // Interrupt thread 2
        t2.join(); // Wait for thread 2 to finish
        System.out.println("Main done.");
    }
}

class MyThread extends Thread {
    MyThread(String name) { super(name); } // Constructor sets thread name
    @Override
    public void run() { // Thread's main logic
        System.out.println(getName() + " runs, state: " + getState()); // Print running state
        try {
            Thread.sleep(500); // Pause for 500ms
            System.out.println(getName() + " done.");
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
    }
}