class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500); // pause 0.5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadImplementationUsingRunnableInterface {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();
    }
}
