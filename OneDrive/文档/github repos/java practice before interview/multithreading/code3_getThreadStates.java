class task1 {
    synchronized void prints() {
        System.out.println("inside prints method..." + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
            System.out.println("after sleep called on thread..." + Thread.currentThread().getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class task implements Runnable {
    public void run() {
        System.out.println("inside run method...");
    }
}

public class code3_getThreadStates {
    public static void main(String[] args) {
        Thread t1 = new Thread(new task(), "thread-1");
        System.out.println(t1.getState()); // prints NEW

        t1.start();
        System.out.println(t1.getState()); // prints RUNNABLE

        task1 t2 = new task1();
        Runnable r = t2::prints;
        Thread t3 = new Thread(r, "thread-2");
        t3.start();
        Thread t4 = new Thread(r, "thread-3");
        t4.start();
        System.out.println(t3.getState()); // prints RUNNABLE OR BLOCKED
        System.out.println(t4.getState()); // prints RUNNABLE OR BLOCKED

    }
}
