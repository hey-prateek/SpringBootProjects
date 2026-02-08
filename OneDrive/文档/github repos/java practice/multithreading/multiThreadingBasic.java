class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multiThreadingBasic {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start();
        t2.start();
    }
}
