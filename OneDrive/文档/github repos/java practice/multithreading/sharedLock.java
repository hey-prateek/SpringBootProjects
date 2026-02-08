// Use a common lock object (shared between both threads), or make the run logic synchronized on a static lock

class myThread extends Thread {
    static final Object lock = new Object(); // shared lock

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

public class sharedLock {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start();
        t2.start();
    }
}
